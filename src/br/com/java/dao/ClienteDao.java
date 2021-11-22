package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.modelo.Cliente;

public class ClienteDao {
    
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static Cliente buscarClientePorCpf(String cpf) {
        for(Cliente clienteCadastrado : clientes) {
            if (clienteCadastrado.getCpf().equals(cpf)) {
                
                return clienteCadastrado;
            }
        }
        return null;
    }

    public static boolean cadastrarCliente(Cliente cliente) {
        if (buscarClientePorCpf(cliente.getCpf()) == null) {
            clientes.add(cliente);

            return true;
        }

        return false;
    }

    public static ArrayList<Cliente> retornarClientes() {
        return clientes;
    }
}
