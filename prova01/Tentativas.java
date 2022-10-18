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
	
	public Gol sortearDefesa(Chute chute) {
		Random gerador = new Random();
		Gol aux = new Gol();
		
		do {
			aux.setPosicaoX(gerador.nextInt(8));
			aux.setPosicaoY(gerador.nextInt(16));
			aux.getQuadrante();
		}while(aux.getQuadrante() != chute.getQuadrante());
		
		return aux;
	}
	
	public void verificarGol(Gol gol, Chute chute, Goleiro goleiro) {
		int x = gol.getPosicaoX();
		int y = gol.getPosicaoY();
		int w = goleiro.getAag();
		int cont = 0;
		int somar = 0;
		boolean defesa = false;
		
		somar = w % 4 == 0 ? (w/4) - 1 : (w/4);
		
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
	
	public ArrayList<Selecao> getListaSelecoes(){
		return listaSelecoes;
	}
	
	public ArrayList<Chute> getListaChute() {
		return listaChute;
	}
	
	public ArrayList<Gol> getListaGol() {
		return listaGol;
	}
	
}
