package br.com.java.modelo;

public class Livro {
    
    private int codLivro;
	private String titulo;
	private String editora;
	private String autor;
	private String assunto;
	private String idioma;
	private boolean emprestado;

    /**
     * @return int return the codLivro
     */
    public int getCodLivro() {
        return codLivro;
    }

    /**
     * @param codLivro the codLivro to set
     */
    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return String return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return boolean return the emprestado
     */
    public boolean isEmprestado() {
        return emprestado;
    }

    /**
     * @param emprestado the emprestado to set
     */
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Código do livro: " + getCodLivro() +
				"\nTítulo: " + getTitulo() + 
				"\nEditora: " + getEditora() +
				"\nAutor: " + getAutor() +
				"\nAssunto " + getAssunto() +
				"\nIdioma " + getIdioma() +
				"\nOcupado? " + isEmprestado();
    }

    
}
