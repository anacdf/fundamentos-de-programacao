
//** Implemente um programa que leia um valor n, calcule e escreva n2,n3 e n4.
import java.util.Scanner;
public class Exer5
{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("Informe o valor de n: ");
    double valor1 = teclado.nextDouble();
    double valor2 = Math.pow(valor1, 2);
    double valor3 = Math.pow(valor1, 3);
    double valor4 = Math.pow(valor1, 4);
    
    System.out.println ("Valor de n " + valor1 + ",\n valor de n2: " + valor2 + ",\n valor de n3: " + valor3 + ",\n valor de n4: " + valor4 + ".");
    
    }
}
