
/** Faça um programa que converte de Fahrenheit para graus Celsius. 
* O programa deve ler um valor em Fahrenheit, converter e escrever o valor corresp ondente em Celsius.
* Para realizar a conversão use a fórmula c=5/9(f−32).
*/

import java.util.Scanner;
public class Exer6
{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("Para converter de Fahrenheit para Celsius, informe o valor da temperatura: ");
    
    double temperaturaF = teclado.nextDouble();
    double temperaturaC = (temperaturaF-32)*5/9;
    
    System.out.println ("A temperatura " + temperaturaF + "ºF, é " + temperaturaC + " em graus Celcius!");
    
    }
}
