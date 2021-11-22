package br.com.java;

import java.util.Scanner;

public class Principal {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		do {
			
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("----------MENU PRINCIPAL----------");
			System.out.println("1 - Menu Cliente\n"
					         + "2 - Menu Funcionário\n"
					         + "0 - Sair");
			
			opcao = lerInteiro("\nDigite uma opção");
			
			switch (opcao) {
			case 1:
				
				break;
            case 2:
				
				break;
            case 0:
				
				break;

			default:
				System.out.println("\n -- Opção Inválida!! --\n");
				break;
			}
			
		} while (opcao != 0);
	}
	public static int lerInteiro(String msg) {
		boolean opcaoCorreta = false;
		int valor = 0;
		
		do {
			
			try {
				System.out.println("msg");
				valor = Integer.parseInt(teclado.next());
				opcaoCorreta = true;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("\nDigite apenas números");
			}
			
		} while (!opcaoCorreta);
		
		return valor;
	}
}
