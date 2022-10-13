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
		
		Chute c1 = new Chute(1, 2, 1, 4, 7);
		Chute c2 = new Chute(2, 6, 1, 3, 6);
		Chute c3 = new Chute(3, 9, 2, 4, 15);
		Chute c4 = new Chute(4, 5, 4, 6, 11);
		Chute c5 = new Chute(5, 3, 4, 8, 13);
		Chute c6 = new Chute(6, 3, 3, 6, 4);
		Chute c7 = new Chute(7, 4, 4, 5, 8);
		Chute c8 = new Chute(8, 7, 4, 7, 14);
		Chute c9 = new Chute(9, 8, 4, 7, 14);
		Chute c10 = new Chute(10, 4, 4, 6, 12);
		Chute c11 = new Chute(11, 2, 4, 5, 15);
		Chute c12 = new Chute(12, 7, 3, 6, 4);
		Chute c13 = new Chute(13, 3, 3, 8, 12);
		Chute c14 = new Chute(14, 9, 4, 7, 10);
		Chute c15 = new Chute(15, 10, 4, 7, 12);
		Chute c16 = new Chute(16, 5, 1, 4, 2);
		Chute c17 = new Chute(17, 3, 4, 5, 13);
		Chute c18 = new Chute(18, 10, 2, 4, 16);
		Chute c19 = new Chute(19, 10, 4, 5, 16);
		Chute c20 = new Chute(20, 10, 2, 3, 14);
		Chute c21 = new Chute(21, 9, 2, 1, 8);
		Chute c22 = new Chute(22, 4, 4, 8, 16);
		Chute c23 = new Chute(23, 8, 4, 6, 14);
		Chute c24 = new Chute(24, 7, 4, 7, 11);
		Chute c25 = new Chute(25, 6, 1, 0, 3);
		Chute c26 = new Chute(26, 5, 3, 6, 7);
		Chute c27 = new Chute(27, 3, 3, 8, 4);
		Chute c28 = new Chute(28, 4, 3, 6, 7);
		Chute c29 = new Chute(29, 10, 2, 2, 13);
		Chute c30 = new Chute(30, 7, 3, 5, 3);
		
		

		

	}

}
