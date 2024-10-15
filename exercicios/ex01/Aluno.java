package ex01;

public class Aluno {
	
	private String nome;
	private int idade;
	private double nota;
	

	
	public Aluno(String nome, int idade, double nota) throws Exception {  // Throws ta dizendo que quando criar esse objeto, pode lançar as excecoes a baixo
		if (idade < 0 || idade > 100) {
            throw new Exception("Idade inválida! A idade deve estar entre 0 e 100.");
        }
        if (nota < 0.0 || nota > 10.0) {
            throw new Exception("Nota inválida! A nota deve estar entre 0.0 e 10.0.");
        }

		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
