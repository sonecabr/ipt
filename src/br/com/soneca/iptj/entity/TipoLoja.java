package br.com.soneca.iptj.entity;

public enum TipoLoja {
	
	V("Virtual"), 
	F("Fisica");
	
	String tipo;
	
	private TipoLoja(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
