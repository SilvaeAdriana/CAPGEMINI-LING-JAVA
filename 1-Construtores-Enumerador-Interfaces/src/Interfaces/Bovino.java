package Interfaces;

public class Bovino implements Animal {

	@Override//metodos da Interface Animal sendo implementados
	public void animalSom() {// Bovino tem que ter o metodo de Animal, mas Bovino que define o que eh esse metodo
		System.out.println("Muuuu");
	}

	@Override
	public void animalComer() { // idem metodo animalSom
		System.out.println("Comendo capim");	
	}
}