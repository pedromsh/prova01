package prova01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Goleiro> carregarGoleiros() {
		ArrayList<Goleiro> listaGoleiros = new ArrayList<>();
		
		listaGoleiros.add(new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6));
		listaGoleiros.add(new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10));
		listaGoleiros.add(new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7));
		listaGoleiros.add(new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6));
		listaGoleiros.add(new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10));
		listaGoleiros.add(new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6));
		listaGoleiros.add(new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8));
		listaGoleiros.add(new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5));
		listaGoleiros.add(new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6));
		listaGoleiros.add(new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5));
		listaGoleiros.add(new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8));
		listaGoleiros.add(new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6));
		listaGoleiros.add(new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9));
		listaGoleiros.add(new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7));
		listaGoleiros.add(new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6));
		listaGoleiros.add(new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5));
		listaGoleiros.add(new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10));
		listaGoleiros.add(new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7));
		listaGoleiros.add(new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9));
		listaGoleiros.add(new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10));
		listaGoleiros.add(new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7));
		listaGoleiros.add(new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9));
		listaGoleiros.add(new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5));
		listaGoleiros.add(new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9));
		listaGoleiros.add(new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5));
		
		return listaGoleiros;
	}
	
	public static void carregarChutes(Tentativas tentativa) {
		
		tentativa.addListaChute(new Chute(1, 2, 1, 4, 7));
		tentativa.addListaChute(new Chute(2, 6, 1, 3, 6));
		tentativa.addListaChute(new Chute(3, 9, 2, 4, 15));
		tentativa.addListaChute(new Chute(4, 5, 4, 6, 11));
		tentativa.addListaChute(new Chute(5, 3, 4, 8, 13));
		tentativa.addListaChute(new Chute(6, 3, 3, 6, 4));
		tentativa.addListaChute(new Chute(7, 4, 4, 5, 8));
		tentativa.addListaChute(new Chute(8, 7, 4, 7, 14));
		tentativa.addListaChute(new Chute(9, 8, 4, 7, 14));
		tentativa.addListaChute(new Chute(10, 4, 4, 6, 12));
		tentativa.addListaChute(new Chute(11, 2, 4, 5, 15));
		tentativa.addListaChute(new Chute(12, 7, 3, 6, 4));
		tentativa.addListaChute(new Chute(13, 3, 3, 8, 12));
		tentativa.addListaChute(new Chute(14, 9, 4, 7, 10));
		tentativa.addListaChute(new Chute(15, 10, 4, 7, 12));
		tentativa.addListaChute(new Chute(16, 5, 1, 4, 2));
		tentativa.addListaChute(new Chute(17, 3, 4, 5, 13));
		tentativa.addListaChute(new Chute(18, 10, 2, 4, 16));
		tentativa.addListaChute(new Chute(19, 10, 4, 5, 16));
		tentativa.addListaChute(new Chute(20, 10, 2, 3, 14));
		tentativa.addListaChute(new Chute(21, 9, 2, 1, 8));
		tentativa.addListaChute(new Chute(22, 4, 4, 8, 16));
		tentativa.addListaChute(new Chute(23, 8, 4, 6, 14));
		tentativa.addListaChute(new Chute(24, 7, 4, 7, 11));
		tentativa.addListaChute(new Chute(25, 6, 1, 0, 3));
		tentativa.addListaChute(new Chute(26, 5, 3, 6, 7));
		tentativa.addListaChute(new Chute(27, 3, 3, 8, 4));
		tentativa.addListaChute(new Chute(28, 4, 3, 6, 7));
		tentativa.addListaChute(new Chute(29, 10, 2, 2, 13));
		tentativa.addListaChute(new Chute(30, 7, 3, 5, 3));
		
	}
	
	public static void carregarSelecoes(Tentativas tentativa) {
		ArrayList<Goleiro> t = carregarGoleiros();
		
		Selecao selecao1 = new Selecao("Brasil");
		Selecao selecao2 = new Selecao("Alemanha");
		Selecao selecao3 = new Selecao("Uruguai");
		Selecao selecao4 = new Selecao("Dinamarca");
		Selecao selecao5 = new Selecao("Italia");
		
		for(int i = 0; i < t.size(); i++) {
			if(i < 5)
				selecao1.addGoleiros(t.get(i));
			else if(i < 10)
				selecao2.addGoleiros(t.get(i));
			else if(i < 15)
				selecao3.addGoleiros(t.get(i));
			else if(i < 20)
				selecao4.addGoleiros(t.get(i));
			else
				selecao5.addGoleiros(t.get(i));
		}
		
		tentativa.addListaSelecoes(selecao1);
		tentativa.addListaSelecoes(selecao2);
		tentativa.addListaSelecoes(selecao3);
		tentativa.addListaSelecoes(selecao4);
		tentativa.addListaSelecoes(selecao5);
	}
	
	public static Tentativas carregarGol() {
		Tentativas tentativa = new Tentativas();
		
		for (int i = 0; i < 9; i++) {
			for(int j = 0; j < 17; j++) {
				Gol gol = new Gol();
				gol.setPosicaoX(i);
				gol.setPosicaoY(j);
				gol.setDivisao();
				gol.setQuadrante();
				tentativa.addGol(gol);
			}
		}
		carregarChutes(tentativa);
		carregarSelecoes(tentativa);
		
		return tentativa;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Tentativas tentativa = carregarGol();
		tentativa.chutar();
		
//		System.out.println("Média de defesas: " + tentativa.calcularMediaDeDefesas());
//		System.out.println(tentativa.calcularPontuacaoGoleiro());
//		System.out.println("\nMédia de gols tomados: " + tentativa.calcularMediaGolsSofridos());
//		System.out.println(tentativa.alvoChutes());
//		System.out.println(tentativa.golsAngulo());
		System.out.println();
//		System.out.println("Gols tomados por força ser insuficiente: " + tentativa.golsForcaMenor());
//		System.out.println(tentativa.imprimirFicha());
		
		input.close();
	}

}

















