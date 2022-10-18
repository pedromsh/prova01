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
	
	public void setDivisao(int posicaoX, int posicaoY) {
		if (posicaoX == 0 || posicaoY == 0 || posicaoY == 16)
			divisao = "f";
		else if (posicaoY == 1 && posicaoX > 1)
			divisao = "te";
		else if (posicaoY == 15 && posicaoX > 1)
			divisao = "td";
		else if (posicaoX == 1 && posicaoX > 0 && posicaoX < 16)
			divisao = "tr";
		else if (posicaoX == 2 && posicaoY == 2)
			divisao = "ae";
		else if (posicaoX == 2 && posicaoY == 14)
			divisao = "ad";
		else
			divisao = "gol";
	}
	
	public String getDivisao() {
		return divisao;
	}
	public int getId() {
		return id;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getQuadrante() {
		return quadrante;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
}
