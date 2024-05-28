package br.com.karineg;

//Implementação concreta da fábrica para criar carros Ford
public class FordFactory implements ICarFactory {
	public ISedan createSedan() {
		return new FordSedan();
	}
	
	public ISuv createSuv() {
		return new FordSuv();
	}
}
