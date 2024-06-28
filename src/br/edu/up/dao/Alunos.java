package br.edu.up.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.up.models.Aluno;

public class Alunos {
  public ArrayList<Aluno> getAlunos(String caminho) {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    File arquivo = new File(caminho);

    try (Scanner leitor = new Scanner(arquivo)) {

      if (leitor.hasNextLine()) {
        String header = leitor.nextLine();
      }
      
      while (leitor.hasNextLine()) {
        String linha = leitor.nextLine();
        String[] dados = linha.split(";");

        String matricula = dados[0];
        String nome = dados[1];
        String notaStr = dados[2].replace(',', '.');
        double nota = Float.parseFloat(notaStr);

        Aluno aluno = new Aluno(matricula, nome, nota);

        listaAlunos.add(aluno);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }

    return listaAlunos;
  }
}
