
import java.util.Scanner;
public class mainMM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Coloque Um Numero Para Descobrir Sua Tabuada: ");
        int num = scanner.nextInt();
        
        for(int i = 0; i <=20; i++) {
            System.out.println(num+" x "+i+" = "+num * i);
        }


    }
}
