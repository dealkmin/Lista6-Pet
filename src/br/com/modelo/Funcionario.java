package br.com.modelo;

public class Funcionario extends Pessoa{
	public String cod_identifica;
	
	public String getCod_identifica() {
		return cod_identifica;
	}

	public void setCod_identifica(String cod_identifica) {
		this.cod_identifica = cod_identifica;
	}

	public void imprimir() {
		System.out.println("N� CADASTRO: " + this.cod_identifica);
	}
}
