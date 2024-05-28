package br.com.karineg;

//implementação concreta da interface ISedan para carros Ford
public class FordSedan implements ISedan {
	public void assemble() {
		System.out.println("Montando um Ford Sedan\n");
	}
	
	public void sedanFeatures() {
		System.out.print("Características Ford Sedan\n");
	}
	
}
