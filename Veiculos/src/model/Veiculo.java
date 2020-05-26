package model;

public class Veiculo {
	private String fabricante;
	private String modelo;
	private String cor;
	private float velMaxima;
	private float velAtual;
	private double consumo;
	private int qtdLugares;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(float velMaxima) {
		this.velMaxima = velMaxima;
	}
	public float getVelAtual() {
		return velAtual;
	}
	public void setVelAtual(float velAtual) {
		this.velAtual = velAtual;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public int getQtdLugares() {
		return qtdLugares;
	}
	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}
	
	public void acelerar(float velAcelerar) {
		this.velAtual+=velAcelerar;
		if(this.velAtual<this.velMaxima) {
			System.out.println(this.fabricante+" "+this.modelo+" acelerando! Velocidade atual: "+this.getVelAtual()+"km/h.");
		}else {
			this.velAtual = this.velMaxima;
			System.out.println(this.fabricante+" "+this.modelo+" chegou à velocidade máxima de "+this.getVelMaxima()+"km/h.");
		}
	}
	
	public void reduzir(float velReduzir) {
		this.velAtual-=velReduzir;
		if(this.velAtual>0) {
			System.out.println(this.fabricante+" "+this.modelo+" reduzindo! Velocidade atual: "+this.getVelAtual()+"km/h.");
		}else {
			this.velAtual = 0;
			System.out.println(this.fabricante+" "+this.modelo+" chegou à imobilidade!");
		}
	}
	
	public void contornarCurva() {
		if(this.velAtual>70) {
			this.capotar();
		}else {
			System.out.println(this.fabricante+" "+this.modelo+" contornou a curva com segurança!");
		}
	}
	
	public void capotar() {
		System.out.println(this.fabricante+" "+this.modelo+" capotou!");
	}
	
	public void mostrarCaracteristicas() {
		System.out.println("O veículo da marca "+this.fabricante+" e modelo "+this.modelo+" é da cor "+this.cor+", tem sua velocidade máxima de "+this.velMaxima+"km/h e consumo de "+this.consumo+"km/l.");
	}
	
}



