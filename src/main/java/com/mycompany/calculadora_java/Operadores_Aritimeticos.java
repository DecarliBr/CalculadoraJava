
package com.mycompany.calculadora_java;
/**  @author henri  */

public class Operadores_Aritimeticos {
    //Atributos da classe    
    public float num1;
    public float num2;
   
        // Função para somar valores
        public float soma(){
           float resultado = this.num1 + this.num2;
           return resultado;
        }
        //Função para Subtrair
        public float subtracao(){
           float resultado = this.num1 - this.num2;
           return resultado;
        }
        //Função para multiplicar
        public float multiplicacao(){
           float resultado = this.num1 * this.num2;
           return resultado;
        }
        //Função para dividir
        public float divisao(){
           float resultado = this.num1 / this.num2;
           return resultado;
        }

}