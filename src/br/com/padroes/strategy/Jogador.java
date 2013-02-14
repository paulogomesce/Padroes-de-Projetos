package br.com.padroes.strategy;

public abstract class Jogador {
	
	private Arma arma;
	private Integer qtdVidas;
	
	public void trocarArma(Arma arma){
		this.arma = arma;
	}	

}
