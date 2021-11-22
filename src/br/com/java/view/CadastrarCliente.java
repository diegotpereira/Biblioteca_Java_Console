package br.com.java.view;

import br.com.java.controller.ClienteControle;
import br.com.java.modelo.Cliente;
import br.com.java.utils.Console;

public class CadastrarCliente {

    private static Cliente cliente = new Cliente();

    public static void carregar() {

        cliente = new Cliente();

        System.out.println("\n -- Cadastrar Cliente -- \n");

        cliente.setCodigo(Console.readInt("Código: "));
        cliente.setNome(Console.readString("Nome: "));
        cliente.setSexo(Console.readString("Sexo: "));
        cliente.setIdade(Console.readInt("Idade: "));
        cliente.setCpf(Console.readString("Cpf: "));
        cliente.setEndereco(Console.readString("Endereço: "));
        cliente.setTelefone(Console.readString("Telefone: "));

        if (ClienteControle.cadastrar(cliente) == 1) {
            System.out.println("\nCliente Cadastrado!\n");

        } else if (ClienteControle.cadastrar(cliente) == 2) {
            System.out.println("\nCliente Já Cadastrado\n");

        } else if (ClienteControle.cadastrar(cliente) == 3) {
            System.out.println("\nCPF Inválido!");
        }
    }
    
}
