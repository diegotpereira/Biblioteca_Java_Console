package br.com.java.view;

import br.com.java.controller.FuncionarioController;
import br.com.java.modelo.Funcionario;
import br.com.java.utils.Console;

public class CadastrarFuncionario {
    
    // private static Funcionario funcionario = new Funcionario();

    public static void carregar() {

        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(Console.readInt("Código: "));
        funcionario.setNome(Console.readString("Nome: "));
        funcionario.setSexo(Console.readString("Sexo: "));
        funcionario.setIdade(Console.readInt("Idade: "));
        funcionario.setCpf(Console.readString("Cpf: "));

        if (FuncionarioController.cadastrar(funcionario) ==  1) {
            System.out.println("\nFuncionário Cadastrado!\n");

        } else if (FuncionarioController.cadastrar(funcionario) == 2) {
            System.out.println("Funcionário já existente!");

        } else if (FuncionarioController.cadastrar(funcionario) == 3) {
            System.out.println("\n O CPF informado é inválido!");
        }
    }
}
