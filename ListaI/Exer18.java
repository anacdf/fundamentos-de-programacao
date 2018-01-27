
/**
Implemente um programa que calcula o volume de uma garrafa.
O casco de uma garrafa aproxima-se a dois cilindros de raios r1 e r2 e de alturas h1 e h2, unidos por um cone de altura h3.
Solicite ao usuário os dados necessários, calcule e escreva o volume da garrafa, sabendo que o volume
de um cilíndro é calculado por vcl = r2h e que o volume de um cone é
dado por vcn =  (r2 1+r1r2+r2 2)h 3
 */
import java.util.Scanner;
public class Exer18
{
    public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     System.out.println("informe a seguir:\nA altura do cilindro1: ");
     double hc1 = in.nextDouble();
     System.out.println("o raio do cilindro1: ");
     double rc1 = in.nextDouble();
     System.out.println("a altura do cilindro2: ");
     double hc2 = in.nextDouble();
     System.out.println("o raio do cilindro2: ");
     double rc2 = in.nextDouble();
     System.out.println("a altura do cone: ");
     double hcn = in.nextDouble();
     
     double volumeC1 = Math.PI*(rc1*rc1)*hc1;
     double volumeC2 = Math.PI*(rc2*rc2)*hc2;
     double volumeCN = Math.PI*((rc1*rc1)+(rc1*rc2)+(rc2*rc2))*hcn/3;
     double total = volumeC1 + volumeC2 + volumeCN;
     
     System.out.printf("volume da garrafa: %10.2f", total);
    }
    
}
