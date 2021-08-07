package app.testando.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner scan = new Scanner(System.in);

	public static float soma(float a, float b) {
		return a + b;
	}

	public static float subtracao(float a, float b) {
		return a - b;
	}

	public static float multiplicacao(float a, float b) {
		return a * b;
	}

	public static float divisao(float a, float b) {
		return a / b;
	}

	public static void main(String args[]) {
		float a, b;

		System.out.print("Digite o primeiro valor: ");
		a = scan.nextFloat();
		System.out.print("Digite o segundo valor: ");
		b = scan.nextFloat();

		float soma = soma(a, b);
		float subtracao = subtracao(a, b);
		float multiplicacao = multiplicacao(a, b);
		float divisao = divisao(a, b);

		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}

}
