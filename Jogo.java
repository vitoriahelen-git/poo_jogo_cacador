import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        var gerador = new Random(); 
        var personagem = new Personagem("John"); 
        var soneca = new Personagem("Soneca", 0, 4, 10); 
        //nasce com muito sono e sem energia, fome mais ou menos 
        //ele tem probabilidade 80% de dormir 
        //10% de caçar 
        //10% de comer
        while(true){
            int oQuefazer = gerador.nextInt(3); //[0..3]
            switch(oQuefazer){
                case 0: 
                    personagem.cacar();
                    break; 
                case 1: 
                    personagem.comer();
                    break; 
                case 2: 
                    personagem.dormir(); 
                    break; 
            }
            personagem.cacar();
            personagem.comer();
            personagem.dormir();
            personagem.exibirEstado();
            //System.out.printf("e: %d, f: %d, s: %d\n", personagem.energia, personagem.fome, personagem.sono);
            System.out.println("-------------------");

            var oQueOSonecaVaiFazer = gerador.nextDouble();
            if(oQueOSonecaVaiFazer <= 0.8)
                soneca.dormir();
            else if(oQueOSonecaVaiFazer <= 0.9)
                soneca.comer(); 
            else 
                soneca.cacar();

            personagem.exibirEstado();
            //System.out.printf("e: %d, f: %d, s: %d\n", soneca.energia, soneca.fome, soneca.sono);
            System.out.println("*******************");
            Thread.sleep(8000); 
            
        }
    }
}
