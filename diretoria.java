package Projeto;

public class diretoria extends escola {
	
	private String feedbackProfessor;
	
	public diretoria()//Construtor vazio 
	{
								
	}

	public diretoria(String nome, String tipo, String turma, int idade, int senha, int id)
	{		
       super(nome,tipo,turma,idade,senha,id);
		
	}
	@Override	
	
	public void feedbackProfessor (){
		
		System.out.println("feedback do professor: ");
	}
	@Override
	public void feedbackAluno ()
	{
		
	}
		
	public String getFeedbackProfessor() {
		return feedbackProfessor;
	}
	public void setFeedbackProfessor(String feedbackProfessor) {
		this.feedbackProfessor = feedbackProfessor;
	}
		
}