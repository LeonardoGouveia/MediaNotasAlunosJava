package testavariaveis;

import java.util.Scanner;

public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("Calculadora de Média");
		
		Scanner leitura = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;		
				
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = leitura.nextFloat();
		
		System.out.println("Informe a segunda nota do aluno: ");
		nota2 = leitura.nextFloat();
		
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = leitura.nextFloat();
		
		System.out.println("Informe a quarta nota do aluno: ");		
		nota4 = leitura.nextFloat();
		
		float notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		if (notaFinal >= 7) {
			System.out.println("Parabéns, você está aprovado com média final: " + notaFinal);
		}
		else {
			System.out.println("Infelizmente você está reprovado com média final: " + notaFinal);
		}
	}
}
