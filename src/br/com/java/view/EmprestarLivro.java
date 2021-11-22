package br.com.java.view;

import java.util.Date;

import br.com.java.dao.ClienteDao;
import br.com.java.dao.LivroDao;
import br.com.java.modelo.Cliente;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class EmprestarLivro {

    private static Date mesAtual;
    private static Date mesDevolucao;

    public static void carregar() {

        for(Cliente clienteCadastrado : ClienteDao.retornarClientes()) {

            System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-" + clienteCadastrado.getNome()); 

            int codigoCliente =  Console.readInt("\nDigite o Código do Cliente \n");

            if (codigoCliente == clienteCadastrado.getCodigo()) {
                
                try {
                    if (mesAtual.getMonth() > mesDevolucao.getMonth()) {
                        clienteCadastrado.setMulta(true);
                    }
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("\n");
                }

                if (clienteCadastrado.isMulta() == false) {
                    for(Livro livroCadastrado : LivroDao.retornarLivros()) {
                        System.out.println(livroCadastrado.getCodLivro() + "-" + livroCadastrado.getTitulo());
                    }

                    int emprestar =  Console.readInt("Digite o código do livro que deseja emprestar");
                    for(Livro livroCadastrado : LivroDao.retornarLivros()) {
                        if (emprestar == livroCadastrado.getCodLivro()) {
                            if (!livroCadastrado.isEmprestado()) {
                                livroCadastrado.setEmprestado(true);
                                mesAtual = new Date();
                                mesDevolucao = new Date();
                                mesDevolucao.setMonth(mesAtual.getMonth() + 30);

                                System.out.println("A devolução deverá ser feita até: /n" + mesDevolucao.getMonth());

                            } else {
                                System.out.println("Livro indisponível!");
                            }

                        } else {
                            System.out.println("Livro não encontrado!");
                        }
                    }

                } else {
                    System.out.println("Você não pode realizar empréstimo pois possui multas pendentes!");
                }
            }
        }
    }
    
}
