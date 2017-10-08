package br.com.logica;

import java.util.ArrayList;

public class RepositorioPalavra {

	private  ArrayList<Palavra> palavras;
	
	public RepositorioPalavra(){
		this.setPalavras(new ArrayList<Palavra>());
	}

	public ArrayList<Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(ArrayList<Palavra> palavras) {
		this.palavras = palavras;
	}

	
}
