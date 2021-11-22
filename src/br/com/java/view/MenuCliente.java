package br.com.java.view;

import java.util.Scanner;

import br.com.java.dao.LivroDao;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class MenuCliente {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void carregar() {

        int opcao;

        do {
            System.out.println("----------MENU PRINCIPAL----------");
            System.out.println("1 - Acervo");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Pesquisar Livro");
            System.out.println("4 - Comprar Livro");
            System.out.println("5 - Vender Livro");
            System.out.println("0 - Voltar para o menu principal");

            opcao = lerInteiro("\nDigite uma opção");

            switch (opcao) {
                case 1:
                    Acervo.carregar();
                    break;

                case 2:
                    EmprestarLivro.carregar();
                    break;

                case 3:
                    String pesquisar = Console.readString("Pesquisar Livro por Título: \n");

                    for(Livro livroCadastrado : LivroDao.retornarLivros()) {
                        if (pesquisar.equals(livroCadastrado.getTitulo())) {
                            System.out.println("\nLivro encontrado!");
                            System.out.println(livroCadastrado);

                        } else {
                            System.out.println("\nLivro não encontrado!");
                        }
                    }
                    break;

                case 4:
                    ComprarLivros.carregar();
                    break;

                case 5:
                    VenderLivros.carregar();
                    break;

                case 0:
                    System.out.println("\nRetornando ao menu principal");
                    break;
            
                default:
                    System.out.println("\n -- Opção Inválida! --\n");
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
