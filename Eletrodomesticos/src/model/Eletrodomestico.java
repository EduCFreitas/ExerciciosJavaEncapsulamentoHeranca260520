package model;

public class Eletrodomestico {
	private String tipo;
	private String fabricante;
	private String cor;
	private float potencia;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	public void ligar() {
		System.out.println("O eletrodoméstico "+this.tipo+" de fabricante "+this.fabricante+" foi ligado!");
	}
	
	public void desligar() {
		System.out.println("O eletrodoméstico "+this.tipo+" de fabricante "+this.fabricante+" foi desligado!");
	}
	
	public void funcionar() {
		System.out.println("O eletrodoméstico "+this.tipo+" de fabricante "+this.fabricante+" está funcionando!");
	}

}
