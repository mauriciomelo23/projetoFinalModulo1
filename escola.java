package projeto1;

public abstract class escola {
	
	private String nome;
	private String tipo; //Preenche com professor, aluno, diretoria ou pais
	private int idade;
	private int senha;
	private int id;
	
	public escola() {
		
	}
	
	public escola(String tipo, int id, int senha) {
		this.tipo = tipo;
		this.senha = senha;
		this.id = id;
	}
	
	public escola(String nome, String tipo, int idade, int senha, int id) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.senha = senha;
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
