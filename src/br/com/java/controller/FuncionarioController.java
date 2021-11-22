package br.com.java.controller;

import br.com.java.dao.FuncionarioDao;
import br.com.java.modelo.Funcionario;
import br.com.java.utils.Validacao;

public class FuncionarioController {
    
    public static int cadastrar(Funcionario funcionario) {
        if (Validacao.validarCpf(funcionario.getCpf()) == true) {
            if (FuncionarioDao.cadastrarFuncionario(funcionario) == true) {
                
                return 1;

            } else if (FuncionarioDao.cadastrarFuncionario(funcionario) == false) {
                
                return 2;
            }
        }

        return 3;
    }

    public static void listar() {
        for(Funcionario funcionarioCadastrado : FuncionarioDao.retornarFuncionarios()) {

            System.out.println(funcionarioCadastrado);
        }
    }
}
