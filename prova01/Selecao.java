package prova01;

import java.util.ArrayList;

public class Selecao {

	private String nome;
	private ArrayList<Goleiro> listaGoleiro;
	
	public Selecao(String nome) {
		listaGoleiro = new ArrayList<Goleiro>();
		this.nome = nome;
	}
	
	//adiciona um goleiro a lista
	public void addGoleiros(Goleiro goleiro) {
		listaGoleiro.add(goleiro);
	}
	
	//retorna o nome da selecao
	public String getNome() {
		return nome;
	}
	
	
	public ArrayList<Goleiro> getListaGoleiro() {
		return listaGoleiro;
	}
	
	
}
