package br.com.java.view;

import br.com.java.dao.LivroDao;
import br.com.java.modelo.Livro;
import br.com.java.utils.Console;

public class CadastrarLivro {

    private static Livro livro = new Livro();

    public static void carregar() {

        livro = new Livro();

        System.out.println("\n -- Cadastrar Livro --\n");

        livro.setCodLivro(Console.readInt("Código: "));
        livro.setTitulo(Console.readString("Título: "));
        livro.setEditora(Console.readString("Editora: "));
        livro.setAutor(Console.readString("Autor: "));
        livro.setAssunto(Console.readString("Assunto: "));
        livro.setIdioma(Console.readString("Idioma: "));
        livro.setEmprestado(false);

        if (LivroDao.cadastrarLivro(livro)) {
            System.out.println("\n -- Livro Cadastrado -- \n");

        } else {
            System.out.println("\n -- O Livro já Existe -- \n");
        }
    }
    
}
