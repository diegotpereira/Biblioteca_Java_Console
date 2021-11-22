package br.com.java.view;

import br.com.java.dao.ClienteDao;
import br.com.java.dao.LivroDao;
import br.com.java.modelo.Cliente;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class VenderLivros {
    
    private static Livro livro;

    public static void carregar() {
        
        for(Cliente clienteCadastrado : ClienteDao.retornarClientes()) {
            System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-" + clienteCadastrado.getNome());

            int codigoCliente = Console.readInt("Digite o Código do Cliente: \n");

            if (codigoCliente == clienteCadastrado.getCodigo()) {
                
                System.out.println("\n -- Cadastrar Livro --\n");
                livro = new Livro();
                livro.setCodLivro(Console.readInt("Informe o Código do Livro: \n"));
                livro.setTitulo(Console.readString("Informe o Título do Livro: \n"));
                livro.setEditora(Console.readString("Informe a Editora do Livro: \n"));
                livro.setAutor(Console.readString("Informe o Autor do Livro: \n"));
                livro.setAssunto(Console.readString("Informe o Assunto do Livro: \n"));
                livro.setIdioma(Console.readString("Informe o Idioma do Livro: \n"));
                livro.setEmprestado(false);

                int codigoSeguranca = Console.readInt("Informe o Número da Agência\n");
                int numeroCartao = Console.readInt("Informe o Número da Conta\n");

                if (LivroDao.cadastrarLivro(livro)) {
                    System.out.println("\n -- Livro Vendido por R$ 00,00 -- \n");

                } else {
                    System.out.println("\n -- Livro Já Existe! --\n");
                }

                System.out.println("Pagamento Realizado com Sucesso!");

            } else {
                System.out.println("Cliente Não Encontrado!");
            }
        }
    }
}
