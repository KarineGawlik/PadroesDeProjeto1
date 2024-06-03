package br.com.karineg;

public class Main {

	public static void main(String[] args) {
		
		//Cria as fábricas específicas para Toyota e Ford e instancia as fábricas concretas para cada marca
		ICarFactory toyotaFactory = new ToyotaFactory();
		ICarFactory fordFactory = new FordFactory();
		
		//Cria carros específicos usando as fábricas, instanciando carros 
		Sedan toyotaSedan = toyotaFactory.createSedan();
		Suv toyotaSuv = toyotaFactory.createSuv();
		
		Sedan fordSedan = fordFactory.createSedan();
		Suv fordSuv = fordFactory.createSuv();
		
		//Chamando os métodos nos carros criados para demonstrar e testar que funcionam corretamente 
		toyotaSedan.assemble();
		toyotaSedan.features();
		
		toyotaSuv.assemble();
		toyotaSuv.features();
		
		fordSedan.assemble();
		fordSedan.features();
		
		fordSuv.assemble();
		fordSuv.features();
		
	}

}
