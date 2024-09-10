//Desafio-3. Calculadora Simples
//- Implemente uma calculadora que realiza adição, subtração, multiplicação e divisão entre dois números.
//- Tenha Um Sistema De Repetição.


package lib.VideoJava;

import java.util.Scanner;

public class mainMM5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean reiniciar = false;

        while(reiniciar == false) {
            System.out.println("Coloque o primeiro numero: ");
            double num1 = scanner.nextDouble();
            System.out.println("Coloque o segundo numero: ");
            double num2 = scanner.nextDouble();
            System.out.println("Coloque a operacao: ");
            String op = scanner.next();

            switch (op) {
                case "+": {
                double resultado = num1 + num2;
                System.out.println("Resultado: "+resultado);
                break;
                }
                case "-": {
                double resultado = num1 - num2;
                System.out.println("Resultado: "+resultado);
                break;
                } 
                case "*": {
                double resultado = num1 * num2;
                System.out.println("Resultado: "+resultado);
                break;
                }
                case "/": {
                    if(num2 == 0) {
                        System.out.println("Operacao Invalida!");
                        reiniciar = true;
                    }
                else {
                    double resultado = num1 / num2;
                    System.out.println("Resultado: "+resultado);   
                    break;
                }    
                }
                default: System.out.println("Nao Reconhecido");
                    break;
            }
                    System.out.println("Quer Calcular de Novo?: 1=sim outro=nao");
                    int qcd = scanner.nextInt();
                    if( qcd == 1) {
                        reiniciar = false;
                    }
                    else {
                        reiniciar = true;
                        System.out.println("Volte Mais Tarde!");
                    }

            }

        }


    }
