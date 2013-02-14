package br.com.padroes.strategy;

import java.util.Scanner;

public class Inicio {

	private static final int SAIR = 0;
	private static final int TROCAR_ARMA = 1;
	private static final int TROCAR_JOGADOR = 2;
	private static final int ACIONAR_ARMA = 3;
	private static final int CONSULTAR_ARMA = 4;
	
	private static final int POLICIAL = 1;
	private static final int BANDIDO = 2;
	private static final int SOLDADO = 3;
	
	private static final int FACA = 1;
	private static final int REVOLVER = 2;
	private static final int PISTOLA = 3;

	private static Jogador jogador;
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner scannerMenuPrincipal = new Scanner(System.in);
		
		menuSistema();
		
		do{
			opcao = scannerMenuPrincipal.nextInt();
			
			switch(opcao){
				case SAIR:
					System.out.println("--- Saindo do Jogo. ---");
					break;
				case TROCAR_ARMA:
					menuArmas();
					
					break;
				case TROCAR_JOGADOR:
					menuJogadores();
					break;
				case ACIONAR_ARMA:
					System.out.println("--- Arma acionada ---");
					break;
				case CONSULTAR_ARMA:
					System.out.println("--- Veja os detalhes da arma ---");
					break;
				default:
					System.out.println("--- Opção inválida ---");
					break;
			}			
		}while(opcao != 0);		
	}
	
	public static void menuSistema(){
		System.out.println("*** MENU PRINCIPAL - Escolha uma opção: ***");
		System.out.println("Sair...........: " + SAIR);
		System.out.println("Trocar Arma....: " + TROCAR_ARMA);
		System.out.println("Trocar Jogador.: " + TROCAR_JOGADOR);
		System.out.println("Acionar Arma...: " + ACIONAR_ARMA);
		System.out.println("Consultar Arma.: " + CONSULTAR_ARMA);		
	}
	
	public static void menuJogadores(){
		System.out.println("*** MENU JOGADORES - Escolha um jogador: ***");
		System.out.println("Policial.: " + POLICIAL);
		System.out.println("Bandido..: " + BANDIDO);
		System.out.println("Soldado..: " + SOLDADO);				
	}
	
	public static void menuArmas(){
		System.out.println("*** MENU ARMAS - Escolha uma arma: ***");
		System.out.println("Faca.....: " + FACA);
		System.out.println("Revolver.: " + REVOLVER);
		System.out.println("Pistola..: " + PISTOLA);				
	}
	
	public static void trocarArma(){
		Scanner scannerMenuArma = new Scanner(System.in);
	}

	public static void trocarJogador(){
		Scanner scannerMenuJogador = new Scanner(System.in);
		int jogador;
		
	}
	
	public static Jogador getJogador(int jogador){
		if (jogador == 1)
			return new Policial();
		if (jogador == 2)
			return new Bandido();
		if (jogador == 3)
			return new Soldado();
		else
			return null;
	}
}
