package application;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		int contagem = parametroDois - parametroUm;
		if (contagem <= 0) {
			throw new ParametrosInvalidosException("Valores Inválidos");
		}
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
