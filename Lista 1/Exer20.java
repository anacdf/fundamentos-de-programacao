
/**
Maria vai viajar por 15 dias e vai deixar os seus cães na casa de um amigo,
no entanto ela não sabe quantos sacos de ração de 25kg deve comprar para
que os cães possam ser alimentados nesse período. 
Ajude Maria complementando o programa anterior. O programa (anterior) deve (ainda) solicitar
a quantidade de dias que os cães precisam ser alimentados, calcular
e escrever a quantidade de sacos de ração necessários para alimentar os
animais.
 */
import java.util.Scanner;
public class Exer20
{
   public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     double sacoRacao = 25000;
    
     System.out.print("quantos cães vc tem? ");
     double caes = in.nextDouble();
     System.out.print("quantas gramas eles comem por refeição?");
     double consumoRefeicao = in.nextDouble();
     
     double consumoDiario = (caes*consumoRefeicao)*3; //comem 3x ao dia
     double viagem15dias = consumoDiario*15;
     double sacos15dias = viagem15dias/sacoRacao;   
     System.out.printf("vc precisa de %3.2f", sacos15dias);
     System.out.printf(" sacos para viajar por 15 dias");
     
    }
}
