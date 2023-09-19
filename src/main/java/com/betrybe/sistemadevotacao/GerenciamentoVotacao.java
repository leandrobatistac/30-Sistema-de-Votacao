package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * Construtor.
   */

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.cpfsComputados = new ArrayList<String>();
  }
  
  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numeroCandidato) {
    for (PessoaCandidata pessoaCandidata: pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroCandidato) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    pessoasCandidatas.add(new PessoaCandidata(nome, numeroCandidato));
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }

    for (int index = 0; index < pessoasCandidatas.size(); index++) {
      PessoaCandidata candidato = pessoasCandidatas.get(index);
      System.out.println("Nome: " + candidato.getNome()
          + " - " + candidato.getVotos() + " votos ( "
          + (candidato.getVotos() * 100 / cpfsComputados.size()) + "% )"
              + "Total de votos: " + cpfsComputados.size());
    }
  }

  @Override
  public void votar(String cpfEleitor, int numeroCandidato) {
    if (this.cpfsComputados.contains(cpfEleitor)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroCandidato) {
        pessoaCandidata.receberVoto();
        cpfsComputados.add(cpfEleitor);
        return;
      }
    }
  }
}
