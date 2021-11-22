package br.com.java.controller;

import br.com.java.dao.ClienteDao;
import br.com.java.modelo.Cliente;
import br.com.java.utils.Validacao;

public class ClienteControle {
    
    public static int cadastrar(Cliente cliente) {
        
        if (Validacao.validarCpf(cliente.getCpf())) {
            if (ClienteDao.cadastrarCliente(cliente)) {
                return 1;

            } else {
                return 2;   
            }
        }
        return 3;
    }

    public static void listar() {
        for(Cliente clienteCadastrado : ClienteDao.retornarClientes()) {
            System.out.println(clienteCadastrado);
        }
    }
}
