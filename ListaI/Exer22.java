
/**
 * Na ginástica olímpica, a nota de um atleta é a soma das notas de duas
bancas de árbitros: banca A e banca B. A nota da banca A é a nota de
partida do atleta. A nota da banca B é calculada da seguinte forma:
(a) 6 juízes atribuem notas ao atleta;
(b) a nota mais baixa e a mais alta são descartadas;
(c) é feita a média das notas restantes.

Faça um programa que leia a nota da banca A e as notas dos 6 juízes.
O programa deve calcular e escrever a média da banca B e a nota final
do atleta. Para calcular a nota da banca B use as fórmulas: maior = a+b+|a-b|/2 e menor = a+b-|a-b|/2
 */
import java.util.Scanner;
public class Exer22
{
    public static void main (String args[]){
     Scanner in =new Scanner (System.in);
     
     System.out.println ("nota banca A: ");
     int notaA = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 1: ");
     int juiz1 = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 2: ");
     int juiz2 = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 3: ");
     int juiz3 = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 4: ");
     int juiz4 = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 5: ");
     int juiz5 = in.nextInt();
     System.out.println ("nota banca B:\nJuiz 6: ");
     int juiz6 = in.nextInt();
     
     int somaNotas = juiz1+juiz2+juiz3+juiz4+juiz5+juiz6;
     int menosNotas = juiz6-juiz5-juiz4-juiz3-juiz2-juiz1;
     
     double notaMaior = ((somaNotas)+(Math.abs (menosNotas)))/6;
     double notaMenor = ((somaNotas)-(Math.abs (menosNotas)))/6;
     System.out.print ("nota maior: " + notaMaior);
     System.out.print ("nota menor: " + notaMenor);
     
     double media = ((somaNotas)-notaMaior-notaMenor)/4;
     
     System.out.print ("nota banca B: " + media);
    }
  
}
