package tictactoe_oo;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char sinal;
		int linha = 0, coluna = 0;
		
		JogoDaVelha jogoVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		
		while (!ganhou) {
			if (jogoVelha.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna: ");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna: ");
				sinal = 'O';
			}
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			jogoVelha.validarJogada(linha, coluna, sinal);
			jogoVelha.imprimirTabuleiro();
			
			if (jogoVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Jogador 1 ganhou");
			} if (jogoVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Jogador 2 ganhou");
            } else if (jogoVelha.jogadas > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
			
		}
		
		}

	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValido = false;
		while (!valorValido) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValido = true;

			} else {
				System.out.println("Entrada inválida!");
			}
		}
		valor--;
		return valor;
		}

}
