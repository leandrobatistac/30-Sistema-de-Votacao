package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  Integer numero;
  Integer votos;

  /**
  * Construtor de Pessoa Candidata.
  *
  * @param nome Nome da pessoa candidata.
  * @param numero Número da pessoa candidata.
  */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  // Getters
  public int getNumero() {
    return numero;
  }
  
  public int getVotos() {
    return votos;
  }

  // Setters
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  // Métodos
  public void receberVoto() {
    this.votos++;
  }

}
