package br.com.java.view;

import br.com.java.dao.LivroDao;
import br.com.java.modelo.Livro;

public class Acervo {
    public static void carregar() {
        System.out.println("\n -- ACERVO -- \n");
        for(Livro livroCadastrado : LivroDao.retornarLivros()) {
            System.out.println("----------------------------");
            System.out.println(livroCadastrado);
        }
    }
}
