package br.edu.up.view;

import br.edu.up.models.Resumo;

public class ResumoView {
  public static void mostrarResumo(Resumo resumo) {
    System.out.println("\n**********Resumo Gerado**********");
    System.out.println("Quantidade de alunos: " + resumo.getQuantidade());
    System.out.println("Aprovados: " + resumo.getAprovados());
    System.out.println("Reprovados: " + resumo.getReprovados());
    System.out.println("Menor nota: " + resumo.getMenorNota());
    System.out.println("Maior nota: " + resumo.getMaiorNota());
    System.out.println("Média geral: " + resumo.getMedia());
  }
}
