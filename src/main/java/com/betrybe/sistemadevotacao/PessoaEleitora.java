package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
  * Construtor de Pessoa Eleitora.
  *
  * @param cpf CPF da pessoa candidata.
  */
  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  // Getters
  public String getCpf() {
    return cpf;
  }

  // Setters
  public void SetCpf(String cpf) {
    this.cpf = cpf;
  }

}
