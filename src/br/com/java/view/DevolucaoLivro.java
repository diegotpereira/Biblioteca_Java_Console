package br.com.java.view;

import br.com.java.dao.LivroDao;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class DevolucaoLivro {
    
    public static void carregar() {
        int opcao;

        do {
            
            System.out.println("\n -- Menu de Devolução --\n");
            for(Livro livroCadastrado : LivroDao.retornarEmprestados()) {
                System.out.println("--------");
                System.out.println(livroCadastrado);
            }

            opcao = Console.readInt("\nDigite o Código do Livro que Você Deseja Devolver: \n");
            System.out.println("0 - Sair");

            switch (opcao) {
                case 0:
                    MenuFuncionario.carregar();
                    break;
                
                default:

                    int resultado = LivroDao.devolverLivro(opcao);

                    if (resultado == 1) {
                        System.out.println("\n -- Livro Devolvido com Sucesso --\n");

                    } else if (resultado == 2) {
                        System.out.println("Há uma(s) multa(s), por Favor Faça o Pagamento");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
