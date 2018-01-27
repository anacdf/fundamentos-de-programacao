
//** Faça um programa que leia o valor do raio, calcule e escreva a área de uma esfera. A área de uma esfera é dada por a= 4πr2.
import java.util.Scanner;
public class Exer4
{
    public static void main(String args []){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("Para calcular a área da esfera, informe o valor do raio: ");
    
    double raio = teclado.nextDouble();
    double area = (4*Math.PI)*Math.pow(raio,2);
    
    System.out.println ("A área da esfera é " + area);
  
    }
    
}
