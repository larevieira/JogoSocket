package br.com.logica;

import java.util.Random;

public class JogoApp {

	public static void main(String[] args) {
		Palavra um =  new Palavra("Amor");
		
		
		Palavra dois = new Palavra ("SORRISO");
		
		Palavra tres = new Palavra ("transporTe");
		
		Palavra quatro = new Palavra("Escola");
		Palavra cinco = new Palavra ("Motorista");
		Palavra seis = new Palavra ("Computador");
		Palavra sete = new Palavra ("Maratona");
		
	
		
		
		RepositorioPalavra bb = new RepositorioPalavra();
		
		bb.getPalavras().add(um);
		bb.getPalavras().add(dois);
		bb.getPalavras().add(tres);
		bb.getPalavras().add(quatro);
		bb.getPalavras().add(cinco);
		bb.getPalavras().add(seis);
		bb.getPalavras().add(sete);
		
	
		
		System.out.println(bb.getPalavras());
		System.out.println(bb.getPalavras().size());
		
		Random r = new Random();
		int sorteio = r.nextInt(bb.getPalavras().size());
		
		System.out.println("Numero Sorteado= "+ sorteio);
		
		Palavra sorteada=bb.getPalavras().get(sorteio);
		
		System.out.println(sorteada);
		
		sorteada.setPalavra(sorteada.getPalavra().toLowerCase());
		
		System.out.println(sorteada);
		
		
		char letra= 'o';
		int cont = 0;
		
		for(int i=0; i<sorteada.getPalavra().length(); i++){
			if(sorteada.getPalavra().charAt(i) == letra){
				cont++;
			}
		}
			
		System.out.println(cont);
		
		
		int contLetras = sorteada.getPalavra().length();
		
		for(int i=0; i<contLetras; i++){
			System.out.print("-");
		}
		System.out.println();
		
		
		for(int i=0; i<sorteada.getPalavra().length(); i++){
			if(sorteada.getPalavra().charAt(i) == letra){
				System.out.print(letra);
			}
			else{
				System.out.print("-");
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
