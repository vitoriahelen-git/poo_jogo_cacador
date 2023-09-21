public class Personagem{
    //atributos
    String nome; 
    int energia = 10; 
    int fome = 0; 
    int sono = 0; 

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
        if(fome >= 1){
            System.out.println(nome + "comendo...");
            energia = energia + 1 > 10 ? 10: energia + 1; 
            fome --; 
        }
        else{
            System.out.println(nome + "sem fome...");
        }
    }

    void dormir(){
        if(sono > 0){
            System.out.println(nome + "dormindo...");
            sono -= 1; 
            energia = Math.min(10, energia + 1); 
        }
        else{
            System.out.println(nome + "sem sono...");
        }
    }



}

