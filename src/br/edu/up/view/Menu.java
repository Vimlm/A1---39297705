package br.edu.up.view;

import br.edu.up.models.Console;

public class Menu {
  public static int exibirMenuPrincipal() {
    System.out.println("\n**********Sistema Gerenciador de Alunos**********");
    System.out.println("\n1 - Listar alunos");
    System.out.println("2 - Gerar Resumo");
    System.out.println("0 - Sair");

    return Console.readInt("Informe uma opção: ");
  }
}
