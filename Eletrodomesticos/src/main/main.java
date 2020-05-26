package main;

import model.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		String tipo = "liquidificador";
		String fabricante = "Philips";
		String cor = "preto";
		float potencia = 50;
		Eletrodomestico eletro = new Eletrodomestico();
		
		eletro.setTipo(tipo);
		eletro.setFabricante(fabricante);
		eletro.setCor(cor);
		eletro.setPotencia(potencia);
		
		eletro.ligar();
		eletro.funcionar();
		eletro.desligar();

	}

}
