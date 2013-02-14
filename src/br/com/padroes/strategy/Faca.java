package br.com.padroes.strategy;

public class Faca implements Arma{
	
	@Override
	public void acionarArma(){
		System.out.println("Deferindo golpes de faça.");
	}

	@Override
	public void consultarArma() {
		System.out.println("Você está de posse de uma faca");
	}
	
	

}
