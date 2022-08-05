
package com.mycompany.calculadora_java;
import java.util.Scanner;
/** @author Henrique_Decarli **/
public class Calculadora_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("calculador");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        int opcao=sc.nextInt();
                
        Operadores_Aritimeticos calcula = new Operadores_Aritimeticos();
        float resultado;
        System.out.println("Digite dois valores para somar:");
        calcula.num1 = sc.nextFloat();
        calcula.num2 = sc.nextFloat();

        switch (opcao) {
            case 1 -> {
                resultado = calcula.soma();
                System.out.println("total= " + resultado);
            }
            case 2 -> {
                resultado = calcula.subtracao();
                System.out.println("total= " + resultado);
            }
            case 3 -> {
                resultado = calcula.soma();
                System.out.println("total= " + resultado);
            }
            case 4 -> {
                resultado = calcula.soma();
                System.out.println("total= " + resultado);
            }
            default -> System.out.println("Operador aritmético inválido");
        }
    }
}

