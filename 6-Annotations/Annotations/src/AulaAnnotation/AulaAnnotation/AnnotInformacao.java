package AulaAnnotation.AulaAnnotation;

    class DeprecatedTeste {
    void visualizar(){
        System.out.println("Metodo visualizacao");
    }

    //TESTAR O METODO EXIBIR COM E SEM  O DEPRECATED
    /*
     * 
     * @deprecated replaced by display() // deprecated é fora de uso apontado para um metodo
     */
    /**
     * 
     */
    @Deprecated  //sua presenca desabilita/descontinua o metodo
    void exibir(){
        System.out.println("Mostrando que o metodo exibe eh deprecated");
     }
    
}
