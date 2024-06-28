package br.edu.up.models;

import java.util.List;

public class Resumo {
	private int quantidade;
	private int aprovados;
	private int reprovados;
	private double menorNota;
	private double maiorNota;
	private double media;

	public Resumo(int quantidade, int aprovados, int reprovados, double menorNota, double maiorNota, double media) {
		this.quantidade = quantidade;
		this.aprovados = aprovados;
		this.reprovados = reprovados;
		this.menorNota = menorNota;
		this.maiorNota = maiorNota;
		this.media = media;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getAprovados() {
		return aprovados;
	}

	public int getReprovados() {
		return reprovados;
	}

	public double getMenorNota() {
		return menorNota;
	}

	public double getMaiorNota() {
		return maiorNota;
	}

	public double getMedia() {
		return media;
	}

	public static Resumo processar(List<Aluno> listaDeAlunos) {
		int quantidade = listaDeAlunos.size();
		int aprovados = 0;
		int reprovados = 0;
		double menorNota = Double.MAX_VALUE;
		double maiorNota = Double.MIN_VALUE;
		double somaNotas = 0.0;

		for (Aluno aluno : listaDeAlunos) {
			double nota = aluno.getNota();
			if (nota >= 6.0) {
				aprovados++;
			} else {
				reprovados++;
			}
			if (nota < menorNota) {
				menorNota = nota;
			}
			if (nota > maiorNota) {
				maiorNota = nota;
			}
			somaNotas += nota;
		}
		double media = somaNotas / quantidade;
		return new Resumo(quantidade, aprovados, reprovados, menorNota, maiorNota, media);
	}
}
