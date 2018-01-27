
/**
 * Implemente um programa que leia o horário de um evento qualquer ocorrido durante o dia.
 * Considerando que o horário é representado em hora, minuto e segundo, o programa deve:
(a) converter esse horário para segundos e escrever tal informação na tela.
(b) escrever na tela quantos segundos faltam para o dia acabar.
 */
import java.util.Scanner;
public class Exer16
{
    public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     System.out.print ("Informe o horário do evento em\nHoras: ");
     int hora = in.nextInt();
     System.out.print ("Minutos: ");
     int minuto = in.nextInt();
     System.out.print ("Segundos: ");
     int segundo = in.nextInt();
     
     int umaHora = 3600;
     int umMinuto = 60;
     int umDia = 86400;
         
     int totalSegundos = (hora*umaHora)+(minuto*umMinuto)+segundo;
     int faltaDia = umDia-totalSegundos;
     
     System.out.println ("Duração do evento em segundos: " + totalSegundos + "\nFaltando " + faltaDia + " segundos para o dia acabar.");        
    }
}
