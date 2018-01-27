
/**
 Faça um programa que lê a altura de uma pessoa em metros e a escreve em centímetros e em milímetros.
 */
import java.util.Scanner;
public class Exer9
{
public static void main(String args []){
Scanner teclado = new Scanner (System.in);

System.out.println("Qual é a sua altura em metros?");
double alturaMetros = teclado.nextDouble();

double alturaCm = alturaMetros*100;
double alturaMm = alturaMetros*1000;
System.out.println ("A sua altura em centímetros é: " + alturaCm + "cm.\nE a sua altura em milímetros é: " + alturaMm + "mm.");
}
}
