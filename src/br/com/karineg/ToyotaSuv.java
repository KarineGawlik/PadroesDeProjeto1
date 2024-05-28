package br.com.karineg;


//implementação da classe concreta da interface SUV para carros toyota
public class ToyotaSuv implements ISuv {
	public void assemble() {
		System.out.println("Montando um Toyota SUV\n");
	}
	
	public void suvFeatures() {
		System.out.println("Características Toyota SUV\n");
	}
}
