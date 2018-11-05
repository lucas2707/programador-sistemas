package model;

public class Aluno extends Usuario {

	public String nome;
	public String turno;
	public String turma;
	public int matriculaAluno;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int getMatricula() {
		return matriculaAluno;
	}

	public void setMatricula(int matricula) {
		this.matriculaAluno = matricula;
	}

	@Override
	public void mostrar() {
		System.out.println("Informações do aluno: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *******");

		System.out.println("Matrícula: " + matriculaAluno);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: " + turno);
		System.out.println("Turma: " + turma);
	}

	public Aluno() {
		super();
	}

	public Aluno(String login, String senha, int tipo, String nome, String turno, String turma, int matriculaAluno) {
		super(login, senha, tipo);
		this.nome = nome;
		this.turma = turno;
		this.turno = turma;
		this.matriculaAluno = matriculaAluno;

	}
}
