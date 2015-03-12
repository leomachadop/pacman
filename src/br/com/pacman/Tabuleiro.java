package br.com.pacman;

public class Tabuleiro {
	private char tabuleiro[][];
	
	public Tabuleiro() {
		this.tabuleiro = new char[17][17];
		for(int i = 0; i < 17; i++) {
                    for (int j = 0; j < 17; j++) {
                        if (i == 0 || j == 0) {
                            tabuleiro[i][j] = '#';
                        }
                        else if (i == 16 || j == 16) {
                            tabuleiro[i][j] = '#';
                        }
                        else {
                            tabuleiro[i][j] = '*';
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
		for (int i = 0; i < 17; i++) {
			for(int j = 0; j < 17; j++) {
				System.out.print(this.tabuleiro[i][j]);
			}
			System.out.print("\n");
		}
	}
}
