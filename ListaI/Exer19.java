
/**
 Maria costuma comprar sacos de ração de 25 kg para alimentar os seus cães, que fazem 3 refeições ao dia. 
Faça um programa que leia a quantidade de cães que Maria possui e quanto, em gramas, em média, os cães de Maria consomem por refeição. 
O programa deve informar, por quantos dias um saco de ração é suficiente para alimentar os cães.
 */
import java.util.Scanner;
public class Exer19
{
    public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     double sacoRacao = 25000;
    
     System.out.print("quantos cães vc tem? ");
     double caes = in.nextDouble();
     System.out.print("quantas gramas eles comem por refeição?");
     double consumoRefeicao = in.nextDouble();
     
     double consumoDiario = (caes*consumoRefeicao)*3; //comem 3x ao dia
     double diasUmSaco = sacoRacao/consumoDiario;
     
     System.out.printf("Um saco de 25kg dura %3.2f", diasUmSaco, " dias.");

    }
}
