package br.com.padroes.strategy;

public class Revolver implements Arma{
	
	private Integer qtdBalas = 8;
	
	@Override
	public void acionarArma(){
		if(qtdBalas > 0){
			qtdBalas--;
			System.out.println("1 tiro calibre 38 foi disparado, você possue "+ qtdBalas +"balas.");
		}else{
			System.out.println("A arma está sem balas");
		}
	}
	
	@Override
	public void consultarArma() {
		System.out.println("Você está de posse de um revolver calibre 38");
	}
	

}
