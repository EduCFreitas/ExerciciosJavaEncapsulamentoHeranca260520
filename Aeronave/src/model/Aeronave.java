package model;

public class Aeronave {
	private String nome;
	private String tipo;
	private int numPassageiros;
	private float potencia;
	private boolean helice;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public boolean isHelice() {
		return helice;
	}
	public void setHelice(boolean helice) {
		this.helice = helice;
	}
	
	public void decolar() {
		System.out.println("O avião "+this.tipo+" "+this.nome+" decolou!");
	}
	
	public void aterrissar() {
		System.out.println("O avião "+this.tipo+" "+this.nome+" aterrissou!");
	}
	
	public void sofrerTurbulencia() {
		System.out.println("O avião "+this.tipo+" "+this.nome+" sofreu turbulência!");
	}
}
