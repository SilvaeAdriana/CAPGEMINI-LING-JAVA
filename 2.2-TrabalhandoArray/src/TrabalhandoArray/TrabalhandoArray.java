package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		//declarando o array
		String [] paises = new String[5];
		 
		// inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Italia";
		paises[3] = "Austria";
		paises[4] = "Polonia";

		for (String lista: paises) {//percorrendo o array com for each
			System.out.println(lista);
		}
		// inserindo dados no array
		int [] numeros = new int [10];
		//indexador; verificacao;incremento
		for (int i = 0; i < numeros.length; i++) {
			//usuario insere o dado no array para a posicao [n] conforme o for roda
			
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}
		// listando os valores do array com um ForEach
		System.out.println("Apos a entrada de dados");
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
		// calculando os valores para armazenar no array
		numeros[8] = numeros[7] + 4;
		System.out.println("\nApos a alteracao do valor na posicaoo 8");
		// listando os valores do array com um ForEach
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
	}

}
