package br.com.java.modelo;

public class Cliente extends Pessoa{
    
    private String endereco;
    private String telefone;
    private boolean multa;

    public Cliente() {
        this.multa = false;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return boolean return the multa
     */
    public boolean isMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(boolean multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + getCodigo() + 
				"\nNome: " + getNome() + 
				"\nSexo: " + getSexo() +
				"\nIdade: " + getIdade() +
				"\nCPF: " + getCpf() +
				"\nEndereço: " + getEndereco() +
				"\nTelefone: " + getTelefone();
    }

    
}
