package prova01;

import java.util.ArrayList;
import java.util.Random;

public class Tentativas {

	private ArrayList<Gol> listaGol = new ArrayList<>();
	private ArrayList<Chute> listaChute = new ArrayList<>();
	private ArrayList<Selecao> listaSelecoes = new ArrayList<>();
	
	public void chutar() {
		for (Selecao selecao : listaSelecoes) {
			for (Goleiro goleiro : selecao.getListaGoleiro()) {
				for (Chute chute : listaChute) {
					Gol aux = sortearDefesa(chute);
					verificarGol(aux, chute, goleiro);
				}
			}
		}
	}
	
	//sorter a celula inicial da defesa do goleiro
	public Gol sortearDefesa(Chute chute) {
		Random gerador = new Random();
		Gol aux = new Gol();
		
		if(chute.getQuadrante() == 1) {
			aux.setPosicaoX(gerador.nextInt(5));
			aux.setPosicaoY(gerador.nextInt(9));
		}
		else if(chute.getQuadrante() == 2) {
			aux.setPosicaoX(gerador.nextInt(5));
			aux.setPosicaoY(gerador.nextInt(8, 17));
		}
		else if(chute.getQuadrante() == 3) {
			aux.setPosicaoX(gerador.nextInt(4, 9));
			aux.setPosicaoY(gerador.nextInt(9));
		}
		else {
			aux.setPosicaoX(gerador.nextInt(4, 9));
			aux.setPosicaoY(gerador.nextInt(8, 17));
		}
		
		return aux;
	}
	
	//verificar se ocorreu gol ou defesa
	public void verificarGol(Gol gol, Chute chute, Goleiro goleiro) {
		int x = gol.getPosicaoX();
		int y = gol.getPosicaoY();
		int w = goleiro.getAag();
		int cont = 0;
		int somar = 0;
		boolean defesa = false;
		
		somar = w % 4 == 0 ? (w/4) - 1 : (w/4);
		
		Chute chuteaux = new Chute(chute);
		
		do {
			if(cont < 4) {
				if(x == chute.getId() && y == chute.getPosicaoY()) {
					if(cont == 3) {
						if(goleiro.getForca() >= chute.getForca())
							defesa = true;
						else {
							goleiro.contarForcaInsuficiente();
							defesa = false;
						}
					}
					else if(y == gol.getPosicaoY() + somar) {
						if(goleiro.getForca() >= chute.getForca())
							defesa = true;
						else {
							goleiro.contarForcaInsuficiente();
							defesa = false;
						}
					}
					else
						defesa = true;
				}
				w--;
				cont++;
				if(x > 0)
					x = x -1;
				else
					x = gol.getPosicaoX();
			}
			else {
				cont = 0;
				x = gol.getPosicaoX();
				if(y > 0)
					y = y + 1;
				else
					y = gol.getPosicaoY();
			}
		
		}while(w > 0 && defesa == false);
		
		if(defesa == false) {
			chuteaux.setDivisao("gol");
			goleiro.addListaChute(chuteaux);
		}
		else {
			chuteaux.setDivisao("defesa");
			goleiro.addListaChute(chuteaux);
		}
	}
	
	//questao 1
	public double calcularMediaDeDefesas() {
		double media = 0;
		int soma = 0;
		
		for (Selecao selecoes : listaSelecoes) {
			for (Goleiro goleiro : selecoes.getListaGoleiro()) {
				soma = soma + goleiro.contarDefesas();
			}
		}
		media = soma / 25;
		
		return media;
	}
	
	//questao 2
	public String calcularPontuacaoGoleiro() {
		int defesas = 0;
		String maiorPontuador = "";
		String resultado = "";
		
		for (Selecao selecoes : listaSelecoes) {
			for (Goleiro goleiro : selecoes.getListaGoleiro()) {
				resultado = resultado + "\n" + goleiro.getNome() + " número de defesas: " + goleiro.contarDefesas();
			}
		}
		
		for (Selecao selecoes : listaSelecoes) {
			for (Goleiro goleiro : selecoes.getListaGoleiro()) {
				if(defesas < goleiro.contarDefesas()) {
					defesas = goleiro.contarDefesas();
					maiorPontuador = goleiro.getNome();
				}
			}
			defesas = 0;
			resultado = resultado + "\nGoleiro titular da " + selecoes.getNome() + ": " + maiorPontuador;
		}
		
		return resultado;
	}
	
	//questao 3
	public double calcularMediaGolsSofridos() {
		double media = 0;
		int soma = 0;
		
		for (Selecao selecoes : listaSelecoes) {
			for (Goleiro goleiro : selecoes.getListaGoleiro()) {
				soma = soma + goleiro.contarGols();
			}
		}
		media = soma / 25;
		
		return media;
	}
	
	//questao 4
	public String alvoChutes() {
		int fora = 0;
		int te = 0;
		int td = 0;
		int tr = 0;
		String resultado = "";
		
		for (Chute chutes : listaChute) {
			if(chutes.mapearGol().equals("f")) {
				fora++;
			}
			else if(chutes.mapearGol().equals("te")) {
				te++;
			}
			else if(chutes.mapearGol().equals("td")) {
				td++;
			}
			else if(chutes.mapearGol().equals("tr")) {
				tr++;
			}
		}
		
		resultado = resultado + "\nChutes para fora: " + fora + "\nChutes na trave esquerda: " + te + "\nChutes na trave direita: " + td + "\nChutes no travessão: " + tr;
		
		return resultado;
	}
	
	//questao 5 
	public String golsAngulo() {
		String resultado = "";
		int id = 0;
		for (Chute chutes : listaChute) {
			if(chutes.mapearGol().equals("a")) {
				id = chutes.getId();
				resultado = resultado + "\nChutes no ângulo:\n" + id;
			}
		}
		
		return resultado;
	}
	
	//questao 6
	public String melhoresGoleiros() {
		int defesas1 = 0;
		int defesas2 = 0;
		int defesas3 = 0;
		String resultado = "";
		String maiorPontuador = "";
		String segundoMaior = "";
		String terceiroMaior = "";
		String selecao1 = "";
		String selecao2 = "";
		String selecao3 = "";
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiro : selecoes.getListaGoleiro()) {
				if(defesas1 < goleiro.contarDefesas()) {
					defesas1 = goleiro.contarDefesas();
					maiorPontuador = goleiro.getNome();
					selecao1 = selecoes.getNome();
				}
			}
			
		}
		resultado = resultado + "\nMaior pontuador: " + maiorPontuador + " Seleção: " + selecao1;
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiro : selecoes.getListaGoleiro()) {
				if(defesas2 < goleiro.contarDefesas() && goleiro.contarDefesas() < defesas1) {
					defesas2 = goleiro.contarDefesas();
					segundoMaior = goleiro.getNome();
					selecao2 = selecoes.getNome();
				}
			}
		}
		
		resultado = resultado + "\nSegundo maior pontuador: " + segundoMaior + " Seleção: " + selecao2;
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiro : selecoes.getListaGoleiro()) {
				if(defesas3 < goleiro.contarDefesas() && goleiro.contarDefesas() < defesas2) {
					defesas3 = goleiro.contarDefesas();
					terceiroMaior = goleiro.getNome();
					selecao3 = selecoes.getNome();
				}
			}
		}
		
		resultado = resultado + "\nTerceiro maior pontuador: " + terceiroMaior + " Seleção: " + selecao3;
		
		return resultado;
		
	}
	
	
	
	//questao 7
	public int golsForcaMenor() {
		int gols = 0;
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiros : selecoes.getListaGoleiro()) {
				gols = gols + goleiros.getForcaInauficiente();
			}
		}
		
		return gols;
		
	}
	
	//questao 8
	public String imprimirFicha() {
		String resultado = "";
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiros : selecoes.getListaGoleiro()) {
				resultado = resultado + "\nNome: " + goleiros.getNome() + "\nSeleçao: " + selecoes.getNome();
				resultado = resultado + "\nGols defendidos: " + goleiros.contarDefesas() + "\nGols tomados: " + goleiros.contarGols();
				resultado = resultado + "\nAAG: " + goleiros.getAag() + "\n";
			}
		}
		
		return resultado;
	}
	
	//questao 9
	public String pegarId(int id) {
		String resultado = "";
		
		for (Selecao selecoes : listaSelecoes) {
			for(Goleiro goleiros : selecoes.getListaGoleiro()) {
				if(goleiros.getId() == id) {
					resultado = goleiros.golsPorQuadrante();
				}
			}
		}
		
		return resultado;
	}
	
	//adiciona selecoes a lista
	public void addListaSelecoes(Selecao selecao) {
		this.listaSelecoes.add(selecao);
	}
	
	//adiciona chutes a lista
	public void addListaChute(Chute chute) {
		this.listaChute.add(chute);
	}
	
	//adiciona celulas do gol a lista
	public void addGol(Gol gol) {
		this.listaGol.add(gol);
	}
	
	//retorna o arraylist de selecoes
	public ArrayList<Selecao> getListaSelecoes(){
		return listaSelecoes;
	}
	
	//retorna o arraylist de chutes
	public ArrayList<Chute> getListaChute() {
		return listaChute;
	}
	
	//retorna o arraylist de celulas do gol
	public ArrayList<Gol> getListaGol() {
		return listaGol;
	}
	
}
