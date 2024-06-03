package br.com.karineg;

//criar interface para carros tipo sedan, que extende a interface de ICar
public class Sedan implements ICar {
	private String brand;
	
	public Sedan(String brand) {
		this.brand = brand;
	}
	
	public void assemble() {
		System.out.println("Montando um sedan " + brand);
	}
	
	public void features() {
		System.out.println("Características do sedan " + brand);
	}
	
}
