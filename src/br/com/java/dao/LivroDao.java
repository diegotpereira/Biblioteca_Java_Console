package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.modelo.Livro;

public class LivroDao {
    
    private static ArrayList<Livro> livros = new ArrayList<Livro>();

    public static Livro buscarLivroPorTitulo(String titulo) {

        for(Livro livroCadastrado : livros) {
            if (livroCadastrado.getTitulo().equals(titulo)) {
                
                return livroCadastrado;
            }
        }

        return null;
    }

    public static int devolverLivro(int cod) {

        return 0;
    }

    public static boolean cadastrarLivro(Livro livro) {

        if (buscarLivroPorTitulo(livro.getTitulo()) == null) {
            livros.add(livro);

            return true;
        }

        return false;
    }

    public static ArrayList<Livro> retornarLivros() {
        return livros;
    }

    public static ArrayList<Livro> retornarEmprestados() {

        ArrayList<Livro> livrosEmprestados = new ArrayList<>();
        return livrosEmprestados;
    }
}
