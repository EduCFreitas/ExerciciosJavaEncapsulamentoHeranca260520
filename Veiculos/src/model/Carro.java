package model;

public class Carro extends Veiculo{
	private int qtdPortas;
	private float volumeBagageiro;
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public float getVolumeBagageiro() {
		return volumeBagageiro;
	}
	public void setVolumeBagageiro(float volumeBagageiro) {
		this.volumeBagageiro = volumeBagageiro;
	}
	
	public void mostrarQtdPortas() {
		System.out.println("O carro "+getFabricante()+" "+getModelo()+" possui "+this.qtdPortas+" portas.");
	}
	public void mostrarVolumeBagageiro() {
		System.out.println("O carro "+getFabricante()+" "+getModelo()+" possui volume de "+this.volumeBagageiro+" litros em seu bagageiro.");
	}
}
