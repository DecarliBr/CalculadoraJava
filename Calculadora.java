
package calculadora;
//importar pacote Scanner para armazenar valores digitados
import java.util.Scanner;
/**
 *
 * @author Henrique_Decarli
 */
public class Calculadora {
    
//funcao para somar valores
public static int soma(int a, int b){
    int c=a+b;
    return c;
}
    // funcao para multiplicar valores
    public static float produto(float a,float b){
        float c=a*b;
        return c;
    }
        //funcao para dividir valores
        public static float divisao(float a, float b){
            float c=a/b;
            return c;
        }
            //funcao para subtrair valores
            public static float subtracao(float a, float b){
            float c=a-b;
            return c;
            }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        System.out.println("calculadora");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        opcao=sc.nextInt();
        
        if (opcao ==1 ){
          int a,b,c;  
          System.out.println("voce escolheu a opcao SOMA");
          System.out.println("digite dois valores para somar");
          a=sc.nextInt();
          b=sc.nextInt();
          c=soma(a,b);
          System.out.println("total= " + c);  
        }else{}
            if (opcao ==2 ){
              float a,b,c;  
              System.out.println("voce escolheu a opcao SUBTRAÇAO");
              System.out.println("digite dois valores para somar");
              a=sc.nextInt();
              b=sc.nextInt();
              c=subtracao(a,b);
              System.out.println("total= " + c);  
            }else{}
                if (opcao ==3 ){
                   float a,b,c;  
                   System.out.println("voce escolheu a opcao MULTIPLICAÇÂO");
                   System.out.println("digite dois valores para somar");
                   a=sc.nextInt();
                   b=sc.nextInt();
                   c=produto(a,b);
                   System.out.println("total= " + c);  
                }else{}
                    if (opcao ==4 ){
                        float a,b,c;  
                        System.out.println("voce escolheu a opcao DIVISÂO");
                        System.out.println("digite dois valores para somar");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=divisao(a,b);
                        System.out.println("total= " + c);  
                     }else{
                    
                    }
        
    }
    
}
