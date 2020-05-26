package main;

import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setFabricante("Toyota");
		carro.setModelo("Fielder");
		carro.setCor("preto");
		carro.setVelMaxima(186);
		carro.setVelAtual(120);
		carro.setConsumo(8.9);
		carro.setQtdLugares(5);
		carro.setQtdPortas(5);
		carro.setVolumeBagageiro(500);
		
		carro.acelerar(50);
		carro.acelerar(50);
		carro.contornarCurva();
		carro.reduzir(100);
		carro.reduzir(100);
		carro.mostrarCaracteristicas();
		carro.mostrarQtdPortas();
		carro.mostrarVolumeBagageiro();
		
		System.out.println("\n----------------------------------------------\n");
		
		Moto moto = new Moto();
		moto.setFabricante("Triumph");
		moto.setModelo("Bonneville");
		moto.setCor("verde");
		moto.setVelMaxima(160);
		moto.setVelAtual(50);
		moto.setConsumo(15);
		moto.setQtdLugares(2);
		moto.setParaBrisa(true);
		moto.setCorrenteSeguranca(false);
		
		moto.acelerar(30);
		moto.reduzir(20);
		moto.contornarCurva();
		moto.reduzir(100);
		moto.mostrarAcessorios();
	}

}
