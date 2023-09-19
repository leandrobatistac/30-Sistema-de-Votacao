package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {
  /**
   * Javadoc.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    int op1 = 0;
    int op2 = 0;
    int op3 = 0;
    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      op1 = scanner.nextInt();
      if (op1 == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeDigitado = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroDigitado = scanner.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nomeDigitado, numeroDigitado);
      }
    } while (op1 != 2);

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      op2 = scanner.nextInt();
      if (op2 == 1) {
        System.out.println("Entre com o nome da pessoa eleitora: ");
        String nomeDigitado = scanner.next();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.next();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nomeDigitado, cpf);
      }
    } while (op2 != 2);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      op3 = scanner.nextInt();
      if (op3 == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroDigitado = scanner.nextInt();
        gerenciamentoVotacao.votar(cpf, numeroDigitado);
      } else if (op3 == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }
    } while (op3 != 3);
    gerenciamentoVotacao.mostrarResultado();
    scanner.close();

  }

}
