package prova01;

public class Main {

	public static void main(String[] args) {
		Gol[][] gol = new Gol[9][17];
		
		for (int i = 0; i < 9; i++) {
			for(int j = 0; j < 17; j++) {
				gol[i][j] = new Gol();
				gol[i][j].setPosicaoX(i);
				gol[i][j].setPosicaoY(j);
				gol[i][j].setDivisao(i, j);
				gol[i][j].setQuadrante(i, j);
			}
		}
		
		//Instancia dos chutes
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
		
		//Instancia dos goleiros
		Goleiro g1 = new Goleiro(1, 5, 7, 8, 9, 6, 6);
		g1.setNome("Pratik Skaggs");
		
		Goleiro g2 = new Goleiro(2, 9, 6, 8, 8, 7, 10);
		g2.setNome("Uehudah Hack");
		
		Goleiro g3 = new Goleiro(3, 5, 8, 5, 8, 10, 7);
		g3.setNome("Edison Drye");
		
		Goleiro g4 = new Goleiro(4, 6, 6, 5, 8, 7, 6);
		g4.setNome("Ajani Harding");
		
		Goleiro g5 = new Goleiro(5, 5, 8, 7, 9, 9, 10);
		g5.setNome("Orazio Hart");
		
		Goleiro g6 = new Goleiro(6, 9, 7, 10, 7, 7, 6);
		g6.setNome("Tristan Karns");
		
		Goleiro g7 = new Goleiro(7, 10, 9, 7, 6, 5, 8);
		g7.setNome("Niven Glaser");
		
		Goleiro g8 = new Goleiro(8, 10, 7, 9, 5, 9, 5);
		g8.setNome("Derwyn Devers");
		
		Goleiro g9 = new Goleiro(9, 10, 7, 7, 5, 5, 6);
		g9.setNome("Tod Phan");
		
		Goleiro g10 = new Goleiro(10, 7, 6, 5, 9, 7, 5);
		g10.setNome("Eddie Hulse");
		
		Goleiro g11 = new Goleiro(11, 5, 8, 8, 7, 7, 8);
		g11.setNome("Welford Yepez");
		
		Goleiro g12 = new Goleiro(12, 6, 5, 6, 5, 7, 6);
		g12.setNome("Rishley Snyder");
		
		Goleiro g13 = new Goleiro(13, 10, 9, 8, 6, 10, 9);
		g13.setNome("Milo Mccurdy");
		
		Goleiro g14 = new Goleiro(14, 8, 5, 8, 5, 10, 7);
		g14.setNome("Carden Justus");
		
		Goleiro g15 = new Goleiro(15, 8, 5, 8, 8, 8, 6);
		g15.setNome("Carlyon Gorby");
		
		Goleiro g16 = new Goleiro(16, 8, 10, 9, 8, 9, 5);
		g16.setNome("Mungo Spangler");
		
		Goleiro g17 = new Goleiro(17, 9, 10, 7, 9, 9, 10);
		g17.setNome("Whitmore Squires");
		
		Goleiro g18 = new Goleiro(18, 8, 5, 10, 5, 7, 7);
		g18.setNome("Pedrog Mccurdy");
		
		Goleiro g19 = new Goleiro(19, 8, 8, 8, 9, 9, 9);
		g19.setNome("Ridgley Leo");
		
		Goleiro g20 = new Goleiro(20, 9, 8, 7, 6, 9, 10);
		g20.setNome("Bolton Tarin");
		
		Goleiro g21 = new Goleiro(21, 7, 7, 5, 10, 10, 7);
		g21.setNome("Edison Loy");
		
		Goleiro g22 = new Goleiro(22, 7, 5, 5, 8, 9, 9);
		g22.setNome("Delling Herndon");
		
		Goleiro g23 = new Goleiro(23, 7, 7, 5, 8, 10, 5);
		g23.setNome("Senichi Iorio");
		
		Goleiro g24 = new Goleiro(24, 6, 7, 8, 8, 9, 9);
		g24.setNome("Albin Kerner");
		
		Goleiro g25 = new Goleiro(25, 9, 10, 8, 7, 7, 5);
		g25.setNome("Jivin Justus");
		
		Goleiro g26 = new Goleiro(26, 10, 9, 10, 5, 7, 8);
		g26.setNome("Clement Fleisher");
		
		//Instancia das selecoes
		Selecao selecao1 = new Selecao(g1);
		selecao1.setNome("Brasil");
		selecao1.addGoleiros(g2);
		selecao1.addGoleiros(g3);
		selecao1.addGoleiros(g4);
		selecao1.addGoleiros(g5);
		
		Selecao selecao2 = new Selecao(g6);
		selecao2.setNome("Alemanha");
		selecao2.addGoleiros(g7);
		selecao2.addGoleiros(g8);
		selecao2.addGoleiros(g9);
		selecao2.addGoleiros(g10);
		
		Selecao selecao3 = new Selecao(g11);
		selecao3.setNome("Franca");
		selecao3.addGoleiros(g12);
		selecao3.addGoleiros(g13);
		selecao3.addGoleiros(g14);
		selecao3.addGoleiros(g15);
		
		Selecao selecao4 = new Selecao(g16);
		selecao4.setNome("Dinamarca");
		selecao4.addGoleiros(g17);
		selecao4.addGoleiros(g18);
		selecao4.addGoleiros(g19);
		selecao4.addGoleiros(g20);
		
		Selecao selecao5 = new Selecao(g21);
		selecao5.setNome("Italia");
		selecao5.addGoleiros(g22);
		selecao5.addGoleiros(g23);
		selecao5.addGoleiros(g24);
		selecao5.addGoleiros(g25);
		
	}

}
