package entidade;

public class cadastro {
	private String nome;
	private double nota;

	//construtor.
	public cadastro(String nome, double nota) {

		this.nome = nome;
		this.nota = nota;
	}
   //encapsulamento.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// converção de todos os atributos em String.
	public String toString() {
		return "Nome: "
	           + nome
	           + ", "
	           + "nota: "
	           + nota;
	}
}
