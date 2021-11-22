package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.modelo.Funcionario;

public class FuncionarioDao {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static Funcionario buscarFuncionarioPorCpf(String cpf) {
        for(Funcionario funcionarioCadastrado : funcionarios) {
            if (funcionarioCadastrado.getCpf().equals(cpf)) {
                
                return funcionarioCadastrado;
            }
        }
        return null;
    }

    public static boolean cadastrarFuncionario(Funcionario funcionario) {
        if (buscarFuncionarioPorCpf(funcionario.getCpf()) == null) {
            funcionarios.add(funcionario);

            return true;
        }

        return false;
    }

    public static ArrayList<Funcionario> retornarFuncionarios() {

        return funcionarios;
    }
}
