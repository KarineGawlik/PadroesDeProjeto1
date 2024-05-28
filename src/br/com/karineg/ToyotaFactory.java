package br.com.karineg;


//Implementação concreta da fábrica para criar carros Toyota
public class ToyotaFactory implements ICarFactory {
	public ISedan createSedan() {
		return new ToyotaSedan();
	}
	
	public ISuv createSuv() {
		return new ToyotaSuv(); 
	}
}
