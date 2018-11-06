package model;

public class Professor extends Usuario implements IUsuario {

	private String matriculaProfessor;
	private String nome;
	private int especialidade;

	public String getMatricula() {
		return matriculaProfessor;
	}

	public void setMatricula(String matricula) {
		this.matriculaProfessor = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public void mostrar() {

		System.out.println("Informação do professor: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: ");

		System.out.println("Matriícula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
	}

	public Professor() {
		super();
	}

	public Professor(String login, String senha, int tipo, String matriculaProfessor, String nome, int especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	@Override
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login) && getSenha().equals(senha)) {
			return true;
		}
		return false;

	}
}
