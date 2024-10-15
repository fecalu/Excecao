package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws Exception  {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno("João", 11, 9);
		
		aluno1.setIdade(101);
		
		CadastroAluno lista = new CadastroAluno();
		lista.addAluno(aluno1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	
		
	}
}
