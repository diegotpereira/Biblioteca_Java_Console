package br.com.java.view;

import br.com.java.dao.ClienteDao;
import br.com.java.dao.LivroDao;
import br.com.java.modelo.Cliente;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class ComprarLivros {
    
    public static void carregar() {

        for(Cliente clienteCadastrado : ClienteDao.retornarClientes()) {
            System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-" + clienteCadastrado.getNome());

            int codigoCliente = Console.readInt("Digite o Código do Cliente: ");

            if (codigoCliente == clienteCadastrado.getCodigo()) {
                for(Livro livroCadastrado : LivroDao.retornarLivros()) {
                    System.out.println(livroCadastrado.getCodLivro() +  "-" + livroCadastrado.getTitulo());
                }

                int codigo = Console.readInt("Digite o Código do Livro que Deseja Comprar: ");

                System.out.println("Total:  + R$ 00,00\n");

                int numeroCartao = Console.readInt("Informe o Número do Cartão\n");
                int codigoSeguranca = Console.readInt("Informe o Código de Segurança\n");

                System.out.println("Pagamento Realizado com Sucesso!");

            } else {
                System.out.println("Cliente Não Encontrado!");
            }
        }
    }
}
