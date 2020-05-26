package model;

public class Moto extends Veiculo {
	private boolean paraBrisa;
	private boolean correnteSeguranca;
	
	public boolean isParaBrisa() {
		return paraBrisa;
	}
	public void setParaBrisa(boolean paraBrisa) {
		this.paraBrisa = paraBrisa;
	}
	public boolean isCorrenteSeguranca() {
		return correnteSeguranca;
	}
	public void setCorrenteSeguranca(boolean correnteSeguranca) {
		this.correnteSeguranca = correnteSeguranca;
	}
	
	public void mostrarAcessorios() {
		if(this.paraBrisa==true) {
			System.out.print("A moto "+getFabricante()+" "+getModelo()+" possui p�ra-brisa ");
		}else {
			System.out.print("A moto "+getFabricante()+" "+getModelo()+" n�o possui p�ra-brisa ");
		}
		if(this.correnteSeguranca==true) {
			System.out.print("e possui corrente de seguran�a.");
		}else {
			System.out.print("e n�o possui corrente de seguran�a.");
		}
	}
}
