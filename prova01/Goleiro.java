package prova01;

import java.util.ArrayList;

public class Goleiro {

	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int aag;
	private int forcaInsuficiente = 0;
	private ArrayList<Chute> listaChute;
	
	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
		this.aag = ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + forca + (equilibrio * 2)) / 8;
		listaChute = new ArrayList<Chute>();
	}
	
	//contabilizar o numero de defesas
	public int contarDefesas() {
		int defesas = 0;
		for (Chute chutes : listaChute) {
			if(chutes.getDivisao().equals("defesa")) {
				defesas++;
			}
		}
		
		return defesas;
	}
	
	//contabiliza o numero de gols tomados
	public int contarGols() {
		int gols = 0;
		
		for (Chute chutes : listaChute) {
			if(chutes.getDivisao().equalsIgnoreCase("gol")) {
				gols++;
			}
		}
		
		return gols;
	}
	
	//adiciona um chute ao arraylist de chutes
	public void addListaChute(Chute chute) {
		this.listaChute.add(chute);
	}
	
	//retorna o arraylist de chutes
	public ArrayList<Chute> getListaChute() {
		return this.listaChute;
	}
	
	//retorna o numero de celulas de defesa do goleiro
	public int getAag() {
		return aag;
	}
    
	//retorna Id do goleiro
	public int getId() {
		return id;
	}
    
	//retorna nome do goleiro
	public String getNome() {
		return nome;
	}
	
	//retorna velocidade do goleiro
	public int getVelocidade() {
		return velocidade;
	}
    
	//retorna flexibilidade do goleiro
	public int getFlexibilidade() {
		return flexibilidade;
	}
    
	//retorna coordenacao do goleiro
	public int getCoordenacao() {
		return coordenacao;
	}
    
	//retorna agilideade do goleiro
	public int getAgilidade() {
		return agilidade;
	}
    
	//retorna forca do goleiro
	public int getForca() {
		return forca;
	}
    
	//retorna equilibrio do goleiro
	public int getEquilibrio() {
		return equilibrio;
	}
	
	//incrementa o contador de gols tomados por forca insuficiente
	public void contarForcaInsuficiente() {
		forcaInsuficiente++;
	}
	
	//retorna a quantidade de gols tomados por forca insuficiente
	public int getForcaInauficiente() {
		return forcaInsuficiente;
	}
}
