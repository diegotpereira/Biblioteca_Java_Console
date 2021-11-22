package br.com.java.modelo;

public class Funcionario extends Pessoa{
    public Funcionario() {
	}
	
	
	@Override
	public String toString() {
		return  "\nCodigo: " + getCodigo() +
				"\nNome: " + getNome() + 
				"\nSexo: " + getSexo() +
				"\nIdade: " + getIdade() +
				"\nCPF: " + getCpf();
		}
}
