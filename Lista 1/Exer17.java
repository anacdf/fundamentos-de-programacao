
/**
 * Faça um programa que leia a quantidade e a altura dos degraus de uma escada.
 * A seguir, o programa deve solicitar a altura do usuário e a altura que essa pessoa deseja atingir ao usar a escada.
 * A partir desses dados, o programa deve informar quantos degraus a pessoa deve subir para atingir a altura desejada.
 * O programa deve informar também a altura máxima que essa pessoa pode atingir se subir todos os degraus da escada.
 */
import java.util.Scanner;
public class Exer17
{
    public static void main (String args[]){
     Scanner in=new Scanner(System.in);
     
     System.out.print ("ESCADA: 10 degraus, 20cm cada = 2 metros\nInforme qual a SUA altura e qual altura vc quer atingir (em centímetros): ");
     int pessoa = in.nextInt();
     int atingir = in.nextInt();
     int umDegrau = 20; //um degrau tem 20cm
     int escada = 10*umDegrau; //a escada tem 10 degraus
     
     System.out.println("Com a sua altura, você pode chegar até " + (escada+pessoa) + "cm de altura, pisando no último degrau.");
     
     if (atingir<=escada){
     int subirDegraus = atingir-pessoa;
     System.out.print ("Você deve subir " + subirDegraus + " degraus.");
    }
    }
    
}
