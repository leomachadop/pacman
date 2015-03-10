package br.com.pacman;

public class Tabuleiro {
	private char tabuleiro[][];
	
	public Tabuleiro() {
		this.tabuleiro = new char[23][22];
		for (int i = 0; i < 23; i++) {
			for(int j = 0; j < 22; j++) {
				if((i ==1) && (j >= 2) && (j <= 19)) {
					this.tabuleiro[i][j] = ' ';
					this.tabuleiro[i][8] = 'P';
					this.tabuleiro[i][9] = 'A';
					this.tabuleiro[i][10] = 'C';
					this.tabuleiro[i][11] = 'M';
					this.tabuleiro[i][12] = 'A';
					this.tabuleiro[i][13] = 'N';
				}
				else if((i >= 4) && (i <= 18) && (j >= 1) && (j <= 20)) {
					this.tabuleiro[i][j] = ' ';
					if((i >= 11) && (i <= 14) && (j >= 5) && (j <= 16)) {
						this.tabuleiro[i][j] = '*';
					}
				}
				else {
					this.tabuleiro[i][j] = '*';
				}
			}
		}
	}
	
	public void setTabuleiro (char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public char[][] getTabuleiro() {
		return this.tabuleiro;
	}
	
	public void teste() {
		for (int i = 0; i < 23; i++) {
			for(int j = 0; j < 22; j++) {
				System.out.print(this.tabuleiro[i][j]);
			}
			System.out.print("\n");
		}
	}
}
