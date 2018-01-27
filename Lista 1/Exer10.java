
/**
 Construa um programa que lê o tempo de um evento em segundos e o escreve decomposto em horas, minutos e segundos.
 */
import java.util.Scanner;

public class Exer10
{
    public static void main (String args []){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("Informe o tempo do evento em segundos:");
    int tempo = teclado.nextInt();
    int hora = tempo/3600;
    int resto = tempo%3600;
    int minuto = resto/60;
    int segundo = resto%60;
    
    
    //int eventoSegundos = teclado.nextInt();
    
    //int eventoHoras = eventoSegundos/3600; //3600 segundos em 1 hora
    //int eventoMinutos = eventoSegundos%60;
    
    
    
    System.out.println("O tempo do evento em horas é de: " + hora + "h " + minuto + "min e " + segundo + "seg.");
   
    }
}
