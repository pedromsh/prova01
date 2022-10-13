package prova01;

public class Main {

	public static void main(String[] args) {
		Gol[][] gol = new Gol[8][16];
		
		for (int i = 0; i < 8; i++) {
			for(int j = 0; j < 16; j++) {
				gol[i][j] = new Gol();
				gol[i][j].setPosicaoX(i);
				gol[i][j].setPosicaoY(j);
				gol[i][j].setDivisao(i, j);
				gol[i][j].setQuadrante(i, j);
			}
		}

	}

}
