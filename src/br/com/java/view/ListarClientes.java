package br.com.java.view;

import br.com.java.controller.ClienteControle;

public class ListarClientes {
    
    public static void carregar() {
        System.out.println("\n -- Listar Clientes -- \n");

        ClienteControle.listar();
    }
}
