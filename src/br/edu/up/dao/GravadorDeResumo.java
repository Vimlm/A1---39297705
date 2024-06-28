package br.edu.up.dao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.edu.up.models.Resumo;

public class GravadorDeResumo {
    public static void gravarResumo(String caminhoArquivo, Resumo resumo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(caminhoArquivo))) {
            pw.println("Quantidade de alunos," + resumo.getQuantidade());
            pw.println("Aprovados," + resumo.getAprovados());
            pw.println("Reprovados," + resumo.getReprovados());
            pw.println("Menor nota," + resumo.getMenorNota());
            pw.println("Maior nota," + resumo.getMaiorNota());
            pw.println("Média geral," + resumo.getMedia());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
