package prova01;

import java.util.ArrayList;

public class Selecao {

	private String nome;
	private ArrayList<Goleiro> listaGoleiro;
	
	public Selecao(Goleiro goleiro) {
		listaGoleiro = new ArrayList<Goleiro>();
	}
	
	public void addGoleiros(Goleiro goleiro) {
		listaGoleiro.add(goleiro);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Goleiro> getListaGoleiro() {
		return listaGoleiro;
	}
	
	
}
