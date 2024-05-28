package br.com.karineg;

public class Main {

	public static void main(String[] args) {
		
		//Cria as fábricas específicas para Toyota e Ford e instancia as fábricas concretas para cada marca
		ICarFactory toyotaFactory = new ToyotaFactory();
		ICarFactory fordFactory = new FordFactory();
		
		//Cria carros específicos usando as fábricas, instanciando carros 
		ISedan toyotaSedan = toyotaFactory.createSedan();
		ISuv toyotaSuv = toyotaFactory.createSuv();
		
		ISedan fordSedan = fordFactory.createSedan();
		ISuv fordSuv = fordFactory.createSuv();
		
		//Chamando os métodos nos carros criados para demonstrar e testar que funcionam corretamente 
		toyotaSedan.assemble();
		toyotaSedan.sedanFeatures();
		
		toyotaSuv.assemble();
		toyotaSuv.suvFeatures();
		
		fordSedan.assemble();
		fordSedan.sedanFeatures();
		
		fordSuv.assemble();
		fordSuv.suvFeatures();
		
	}

}
