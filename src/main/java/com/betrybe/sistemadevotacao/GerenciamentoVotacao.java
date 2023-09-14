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
    // 
  }

  @Override
  public void mostrarResultado() {
    // 
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numeroCandidato) {
    //
  }

  @Override
  public void votar(String cpfEleitor, int numeroCandidato) {
    // 
  }
}
