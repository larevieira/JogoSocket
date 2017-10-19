package br.com.logica;


public class Palavra {
	
	private String palavra;
	
	
	public Palavra(){
		
	}
	
	
	public Palavra(String palavra){
		this.setPalavra(palavra);
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	@Override
	public String toString(){
		return this.getPalavra();
	}
	
}