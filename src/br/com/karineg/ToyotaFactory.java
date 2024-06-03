package br.com.karineg;


//Implementação concreta da fábrica para criar carros Toyota
public class ToyotaFactory implements ICarFactory {
	public Sedan createSedan() {
		return new Sedan("Toyota");
	}
	
	public Suv createSuv() {
		return new Suv("Toyota"); 
	}
}
