package br.com.java.view;

import br.com.java.controller.FuncionarioController;

public class ListarFuncionarios {
    
    public static void carregar() {

        System.out.println("\n -- Listar Funcionários --\n");
        FuncionarioController.listar();
    }
}
