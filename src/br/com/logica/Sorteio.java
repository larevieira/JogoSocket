package br.com.logica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
	
	private int sorteio;
	private Palavra palavraSorteada;

	public Sorteio(){
		this.palavraSorteada=new Palavra();
	}
	
	
	public int getNumeroSorteado(ArrayList<Palavra> palavras){
		Random r=new Random();
		this.setSorteio(r.nextInt(palavras.size()));
		return sorteio;
	}
	
	public String getPalavraSorteada(ArrayList<Palavra> palavras){
		this.setPalavraSorteada(palavras.get(this.getSorteio()));
		return this.palavraSorteada.getPalavra();
		
	}

	public int getSorteio() {
		return sorteio;
	}

	public void setSorteio(int sorteio) {
		this.sorteio = sorteio;
	}
	

	public void setPalavraSorteada(Palavra palavraSorteada) {
		this.palavraSorteada = palavraSorteada;
	}



	
	

}
