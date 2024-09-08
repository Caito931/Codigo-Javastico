import java.util.Scanner;
import java.util.Random;

public class mainMM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean reiniciar = false;
        int tentativas = 0;

        int numeroaleatorio = random.nextInt(1,101);

        while( reiniciar == false) {
            
            System.out.println("Palpite: ");
            int resposta = scanner.nextInt();

            if(resposta > numeroaleatorio) {
                System.out.println("Maior");
                tentativas++;
            }
            else if(resposta < numeroaleatorio) {
                System.out.println("Menor");
                tentativas++;
            }
            if(resposta == numeroaleatorio) {
                System.out.println("Certo!");
                tentativas++;
                System.out.println("Quer Jogar De Novo? 1-sim outro numero-nao");
                int querreiniciar = scanner.nextInt();
                if(querreiniciar == 1) {
                    reiniciar = false;
                    numeroaleatorio = random.nextInt(1,101);
                }
                else {
                    reiniciar = true;
                    System.out.println("Obrigado Por Jogar");
                }


            }

        
        }
    }
    
}
