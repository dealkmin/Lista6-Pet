package br.com.modelo;

public class DataHora {
	private String anterior;
	private String atual;
			
	public DataHora(String anterior, String atual) {
		this.anterior = anterior;
		this.atual = atual;
	}

	public String getDataAnterior() {
		return anterior;
	}

	public void setDataAnterior(String anterior) {
		this.anterior = anterior;
	}

	public String getDataAtual() {
		return atual;
	}

	public void setDataAtual(String atual) {
		this.atual = atual;
	}
	
	
} // FIM
