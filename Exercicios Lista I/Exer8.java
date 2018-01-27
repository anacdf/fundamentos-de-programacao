
/**
Faça um programa que leia as dimensoes de um terreno (largura e comprimento) e as dimensoes da casa (largura e comprimento) 
 construída nesse mesmo terreno, o programa deve calcular e escrever a área livre existente no terreno.
 */
import java.util.Scanner;
public class Exer8
{
public static void main(String args []){
Scanner teclado = new Scanner(System.in);

System.out.println ("Qual é o comprimento do terreno?");
double comprimentoTerreno = teclado.nextDouble();
System.out.println ("Qual é a largura do terreno?");
double larguraTerreno = teclado.nextDouble();
double areaTerreno = comprimentoTerreno * larguraTerreno;

System.out.println ("Qual é o comprimento da Casa?");
double comprimentoCasa = teclado.nextDouble();
System.out.println ("Qual é a largura da Casa?");
double larguraCasa = teclado.nextDouble();
double areaCasa = comprimentoCasa * larguraCasa;

double areaLivre = areaTerreno-areaCasa;

System.out.println ("A área do terreno é de " + areaTerreno + "m², e a área da casa é de " + areaCasa + "m². \nA área livre existente no terreno é de " + areaLivre + "m².");

}
}
