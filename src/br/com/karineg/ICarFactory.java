package br.com.karineg;

//Criando a interface da Abstract Factory que declara métodos para criar objetos do tipo sedan e SUV
public interface ICarFactory {
	ISedan createSedan();
	ISuv createSuv();
}
