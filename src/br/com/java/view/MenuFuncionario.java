package br.com.java.view;

import java.util.Scanner;

public class MenuFuncionario {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void carregar() {

        int opcao;

        do {
            System.out.println("----------MENU FUNCIONÁRIO----------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Cadastrar Livro");
            System.out.println("6 - Devolver Livro");
            System.out.println("7 - Acervo");
            System.out.println("0 - Voltar para o menu principal");

            opcao = lerInteiro("\nDigite uma opção");

            switch (opcao) {
                case 1:
                    CadastrarCliente.carregar();
                    break;

                case 2:
                    ListarClientes.carregar();
                    break;

                case 3:
                    CadastrarFuncionario.carregar();
                    break;

                case 4:
                    ListarFuncionarios.carregar();
                    break;

                case 5:
                    CadastrarLivro.carregar();
                    break;

                case 7:
                    Acervo.carregar();
                    break;

                case 0:
                    
                    break;
            
                default:
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
