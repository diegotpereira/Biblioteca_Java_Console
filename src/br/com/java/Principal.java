package br.com.java;

import java.util.Scanner;

import br.com.java.view.MenuCliente;
import br.com.java.view.MenuFuncionario;

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
			
			opcao = lerInteiro("\nDigite uma Opção");
			
			switch (opcao) {
			case 1:
				MenuCliente.carregar();
				break;
            case 2:
				MenuFuncionario.carregar();
				break;
            case 0:
				System.out.println("\nSaindo...");
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
				System.out.println(msg);
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
