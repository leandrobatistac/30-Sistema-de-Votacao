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
    for (PessoaEleitora pessoaEleitora: pessoasEleitoras) {
      if (this.pessoasEleitoras.contains(cpf)) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
      PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novoEleitor);
    }
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numeroCandidato) {
    for (PessoaCandidata pessoaCandidata: pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroCandidato) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
      PessoaCandidata novoCandidato = new PessoaCandidata(nome, numeroCandidato);
      pessoasCandidatas.add(novoCandidato);
    }
  }

  @Override
  public void mostrarResultado() {
    // 
  }

  @Override
  public void votar(String cpfEleitor, int numeroCandidato) {
    // 
  }
}
