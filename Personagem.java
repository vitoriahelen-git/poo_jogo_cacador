public class Personagem{
    //atributos
    String nome; 
    int energia; 
    int fome; 
    int sono; 

    //comportamentos (método)
    void cacar(){
        System.out.println(nome + "caçando..."); 
    }

    void comer(){
        System.out.println(nome + "comendo...");
    }

    void dormir(){
        System.out.println(nome + "dormindo...");
    }

}

