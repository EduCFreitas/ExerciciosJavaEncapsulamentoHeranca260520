package main;

import model.Aeronave;

public class main {

	public static void main(String[] args) {
		String nome = "P51-Mustang";
		String tipo = "caça";
		int numPassageiros = 2;
		float potencia = 500;
		boolean helice = true;
		Aeronave aviao = new Aeronave();
		
		aviao.setNome(nome);
		aviao.setTipo(tipo);
		aviao.setNumPassageiros(numPassageiros);
		aviao.setPotencia(potencia);
		aviao.setHelice(helice);
		
		aviao.decolar();
		aviao.sofrerTurbulencia();
		aviao.aterrissar();

	}

}
