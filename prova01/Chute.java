package prova01;

public class Chute {

	private int id;
	private int forca;
	private int quadrante;
	private int posicaoX;
	private int posicaoY;
	private String divisao;
	
	public Chute(int id, int forca, int quadrante, int posicaoX, int posicaoY) {
		this.id = id;
		this.forca = forca;
		this.quadrante = quadrante;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.divisao = null;
	}
	
	public Chute(Chute chute) {
		this.id = chute.getId();
		this.forca = chute.getForca();
		this.quadrante = chute.getQuadrante();
		this.posicaoX = chute.getPosicaoX();
		this.posicaoY = chute.getPosicaoY();
		this.divisao = null;
	}
	
	//definindo aonde o chute acerta
	public String mapearGol() {
		if (posicaoX == 0 || posicaoY == 0 || posicaoY == 16)
			divisao = "f";
		else if (posicaoY == 1 && posicaoX > 1)
			divisao = "te";
		else if (posicaoY == 15 && posicaoX > 1)
			divisao = "td";
		else if (posicaoX == 1 && posicaoX > 0 && posicaoX < 16)
			divisao = "tr";
		else if (posicaoX == 2 && posicaoY == 2)
			divisao = "a";
		else if (posicaoX == 2 && posicaoY == 14)
			divisao = "a";
		else
			divisao = "gol";
		
		return divisao;
	}
	
	//recebe o o que sera divisao
	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}
	
	//retorna aonde o chute acerta
	public String getDivisao() {
		return divisao;
	}
	
	//retorna o id do chute
	public int getId() {
		return id;
	}
	
	//retorna a forca do chute
	public int getForca() {
		return forca;
	}
	
	//retorna o quadrante do chute
	public int getQuadrante() {
		return quadrante;
	}
	
	//retorna a posicao x onde vai o chute
	public int getPosicaoX() {
		return posicaoX;
	}
	
	//retorna a posicao y onde vai o chute
	public int getPosicaoY() {
		return posicaoY;
	}
}
