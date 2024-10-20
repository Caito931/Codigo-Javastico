package Principaal;
import java.util.*;
public class Desafio {
    public static void main(String[] args) {
        /*Programa que converta moedas
        * Real => Dolar
        * Dolar => Real
        * 1 Real = 0.18 dolar*/
        Scanner scanner = new Scanner(System.in);
        double resultado;
        System.out.println("1- Real => Dolar // 2- Dolar => Real");
        int operacao = scanner.nextInt();

        // Verificação de Erro
        if(operacao > 2 || operacao < 1) {
            System.out.println("ERRO!, insira algo valido!");
        } else {
            switch (operacao) {
                case 1:
                    System.out.println("Insira o valor em Real: ");
                    double real = scanner.nextDouble();
                    resultado = real * 0.18;
                    System.out.printf("Resultado: %.2f$\n",resultado);
                    break;
                case 2:
                    System.out.println("Insira o valor em Dolar: ");
                    double dolar = scanner.nextDouble();
                    resultado = dolar / 0.18;
                    System.out.printf("Resultado: %.2f$\n",resultado);
                    break;
                default: System.out.println("Valor Nao Identificado!");
                break;
            }
        }
    }
}
