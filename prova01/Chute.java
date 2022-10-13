package prova01;

public class Chute {

	private int id;
	private int forca;
	private int quadrante;
	private int posicaoX;
	private int posicaoY;
	
	public Chute(int id, int forca, int quadrante, int posicaoX, int posicaoY) {
		this.id = id;
		this.forca = forca;
		this.quadrante = quadrante;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
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
