package prova01;

public class Gol {

	private int posicaoX;
	private int posicaoY;
	private int quadrante;
	private String divisao;
	
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	public int getQuadrante() {
		return quadrante;
	}
	
	public void setQuadrante() {
		if(posicaoX <= 4 && posicaoY <= 7)
			quadrante = 1;
		if(posicaoX > 4 && posicaoY <= 7)
			quadrante = 3;
		if(posicaoX <= 4 && posicaoY > 7)
			quadrante = 2;
		if(posicaoX > 4 && posicaoY > 7)
			quadrante = 4;
	}
	
	public void setDivisao() {
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
	
	
}
