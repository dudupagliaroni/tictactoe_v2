package tictactoe_oo;

public class JogoDaVelha {

	char[][] jogoDaVelha = new char[3][3];
	int jogadas = 1;

	boolean validarJogada(int linha, int coluna, char sinal) {
		if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
			System.out.println("Posição já usada");
			return false;
		} else {
			jogoDaVelha[linha][coluna] = sinal;
			jogadas++;
			return true;
		}
	}

	void imprimirTabuleiro() {
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j] + " | ");
			}
			System.out.println();
		}

	}

	boolean verificarGanhador(char sinal) {
		if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) || // linha 1
				(jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) || // linha 2
				(jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) || // linha 3
				(jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) || // coluna 1
				(jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) || // coluna 2
				(jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) || // coluna 3
				(jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) || // diagonal 1
				(jogoDaVelha[2][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[0][2] == sinal)) { // diagonal 2
			return true;
		} else {
			return false;
		}
	}
	
	boolean vezJogador1() {
		if (jogadas % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
