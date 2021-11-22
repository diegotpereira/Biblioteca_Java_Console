package br.com.java.view;

import br.com.java.modelo.Cliente;

public class CadastrarCliente {

    private static Cliente cliente = new Cliente();

    public static void carregar() {

        cliente = new Cliente();

        System.out.println("\n -- Cadastrar Cliente -- \n");
    }
    
}
