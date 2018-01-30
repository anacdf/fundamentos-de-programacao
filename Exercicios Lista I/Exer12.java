
/**
 * Faça um programa que leia uma quantia inteira em R$ e decompõe essa quantia na menor quantidade de notas 
 * de 100, 50, 20, 10, 5, 2 e 1.
 */
import java.util.Scanner;
public class Exer12
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
        System.out.println ("Informe o valor em Reais");
        int valor = teclado.nextInt();
        
        int nota100 = valor/100;
        int resto100 = valor%100;
        int nota50 = resto100/50;
        int resto50 = resto100%50;
        int nota20 = resto50/20;
        int resto20 = resto50%20;
        int nota10 = resto20/10;
        int resto10 = resto20%10;
        int nota5 = resto10/5;
        int resto5 = resto10%5;
        int nota2 = resto5/2;
        int resto2 = resto5%2;
        
        System.out.println ("Serão \n" + nota100 + " notas de 100, \n" + nota50 + " notas de 50,\n " + nota20 + " notas de 20,\n " + nota10 + "notas de 10,\n " + nota5 + "notas de 5 e \n" + nota2 + "notas de 2 reais.");
    }
}
