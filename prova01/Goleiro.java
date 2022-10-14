package prova01;

public class Goleiro {

	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	
	public Goleiro(int id, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
		this.id = id;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
	}
	
	public int areaAtuacaoGoleiro(){
		int aag = 0;
		
		aag = ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + forca + (equilibrio * 2)) / 8;
		
		return aag;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getFlexibilidade() {
		return flexibilidade;
	}

	public int getCoordenacao() {
		return coordenacao;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public int getForca() {
		return forca;
	}

	public int getEquilibrio() {
		return equilibrio;
	}
}
