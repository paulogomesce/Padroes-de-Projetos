package br.com.padroes.strategy;

public class Pistola implements Arma {
	private Integer qtdBalas = 12;
	
	@Override
	public void acionarArma(){
		if(qtdBalas > 0){
			qtdBalas--;
			System.out.println("1 tiro calibre 40 foi disparado, você possue "+ qtdBalas +"balas.");
		}else{
			System.out.println("A arma está sem balas");
		}
	}
	
	@Override
	public void consultarArma() {
		System.out.println("Você está de posse de uma pista ponto 40");
	}

}
