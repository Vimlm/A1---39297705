package br.edu.up;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.dao.Alunos;
import br.edu.up.dao.GravadorDeResumo;
import br.edu.up.models.Aluno;
import br.edu.up.models.Resumo;
import br.edu.up.view.Aviso;
import br.edu.up.view.Menu;
import br.edu.up.view.ResumoView;

public class App {
  public static Alunos alunosArquivo = new Alunos();
  public static String caminhoArquivoAlunos = "/Users/Victor Martins/Library/Mobile Documents/com~apple~CloudDocs/faculdade/01-2024/desenvolvimento-software/A1_39297705/src/br/edu/up/data/alunos.csv";
  public static String caminhoArquivoResumo = "/Users/Victor Martins/Library/Mobile Documents/com~apple~CloudDocs/faculdade/01-2024/desenvolvimento-software/A1_39297705/src/br/edu/up/data/resumo.csv";

  public static void main(String[] args) throws Exception {
    int opcao = 0;

    do {
      opcao = Menu.exibirMenuPrincipal();

      switch (opcao) {
        case 1:
          ArrayList<Aluno> listaAlunos = alunosArquivo.getAlunos(caminhoArquivoAlunos);

          alunosArquivo.getAlunos(caminhoArquivoAlunos);

          for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.toString());
          }
          break;

        case 2:
          List<Aluno> listaDeAlunos = alunosArquivo.getAlunos(caminhoArquivoAlunos);

          Resumo resumo = Resumo.processar(listaDeAlunos);

          GravadorDeResumo.gravarResumo(caminhoArquivoResumo, resumo);

          ResumoView.mostrarResumo(resumo);
          break;

        case 0:
          Aviso.sair();
          break;

        default:
          Aviso.opcaoInvalida();
          break;
      }
    } while (opcao != 0);
  }
}