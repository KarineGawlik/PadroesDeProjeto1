package br.com.karineg;

//Implementando classe concreta da interface SUC para carros ford 
public class FordSuv implements ISuv {
	public void assemble() {
		System.out.println("\nMontando um Ford SUV\n");
	}

	@Override
	public void suvFeatures() {
		System.out.println("Características Ford SUV\n");		
	}
	
}
