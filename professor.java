package Projeto;

import java.util.Scanner;

public class professor extends escola {
	
	private String feedbackAluno;

	
	public professor()
	{
		
	}
	
	public professor(String nome, String tipo, String turma, int idade, int senha, int id)
	{
		
		this.feedbackAluno = feedbackAluno;
	}
	
	public void adicionarNota() {
		System.out.println("Escreva a nota");
		Scanner nota = new Scanner(System.in);
		int x=nota.nextInt();
		setnota(x);
	}

	@Override
	public void feedbackAluno() {
		System.out.println("feedback do Aluno: ");
	}
	
	@Override
	public void feedbackProfessor()
	{
		
	}

	public String getFeedbackAluno() {
		return feedbackAluno;
	}

	public void setFeedbackAluno(String feedbackAluno) {
		this.feedbackAluno = feedbackAluno;
	}

		
	}
	
	
	
	


