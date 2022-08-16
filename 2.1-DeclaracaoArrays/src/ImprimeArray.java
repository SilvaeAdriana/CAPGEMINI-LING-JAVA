public class ImprimeArray {
    public static void main (String[] args){
    //Declarando a array
    String [] paises = new String[5];


    //inicializando o array
    paises[0]  = "Brasil";
    paises[1] = "Alemanha";
    paises[2] = "Italia";
    paises[3] = "Austria";
    paises[4] = "Argentina";

    for (String lista: paises){//for each: percorrendo o array
    System.out.println(lista);
    }

    }
}
