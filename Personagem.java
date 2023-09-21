public class Personagem{
    //atributos
    String nome; 
    int energia; 
    int fome; 
    int sono; 

    //comportamentos (método)
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + "caçando..."); 
            energia -= 2; //energia = energia -2 
        }
        else{
            System.out.println(nome + "sem energia para caçar..."); 
        }
        fome = Math.min(fome + 1, 10); 
        sono = Math.min(sono + 1, 10); 
        //System.out.println(nome + "caçando..."); 
    }

    void comer(){
        System.out.println(nome + "comendo...");
    }

    void dormir(){
        System.out.println(nome + "dormindo...");
    }

}

