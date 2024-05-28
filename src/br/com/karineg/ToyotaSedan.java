package br.com.karineg;

//implementação da classe concreta da interface sedan para carros toyota
public class ToyotaSedan implements ISedan {
	public void assemble() {
		System.out.println("Montando um Toyota Sedan\n");
	}
	
	public void sedanFeatures() {
		System.out.println("Características Toyota Sedan\n");
	}
}
