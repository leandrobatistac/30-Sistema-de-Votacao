package com.betrybe.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public String setNome(String nome) {
    return this.nome = nome;
  }
}
