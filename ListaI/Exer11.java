
/**
 Implemente um programa que  lê um (único) valor inteiro de 4 dígitos. 
 A seguir, esse programa deve escrever um inteiro que corresponde ao valor lido na ordem inversa. (Exemplo: 1234 -> 4321)
 */
import java.util.Scanner;
public class Exer11
{
    public static void main (String args []){
    Scanner teclado = new Scanner(System.in);   
    
    System.out.println ("Informe um valor inteiro de 4 dígitos:");
    int valor = teclado.nextInt();
    
    int milhar = valor/1000;
    int restoMilhar = valor%1000;
    int centena = restoMilhar/100;
    int restoCentena = restoMilhar%100;
    int dezenas = restoCentena/10;
    int restoDezenas = restoCentena%10;
    int unidades = restoDezenas;
    
    //String reverse = new StringBuffer(valor1).reverse().toString();
    
    System.out.println("Seu valor invertido: " + unidades + dezenas + centena + milhar);
    
    }
}
