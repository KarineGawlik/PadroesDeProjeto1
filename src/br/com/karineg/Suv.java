package br.com.karineg;

//Criar interface para carros do tipo SUV, que estende a iterface ICar
public class Suv implements ICar {
	private String brand; 
	
	public Suv(String brand) {
		this.brand = brand;
	}
	
	public void assemble() {
		System.out.println("Montando um SUV" + brand);
	}
	
	public void features() {
		System.out.println("Características do SUV " + brand);
	}
}
