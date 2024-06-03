package br.com.karineg;

//Implementação concreta da fábrica para criar carros Ford
public class FordFactory implements ICarFactory {
	public Sedan createSedan() {
		return new Sedan("Ford");
	}
	
	public Suv createSuv() {
		return new Suv("Ford");
	}
}
