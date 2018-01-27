
/**
 * Escreva a descrição da classe Exer2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Exer2
{
 public static void main(String args []){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Informe um valor real: ");
     double valor = entrada.nextDouble();
     System.out.println("Resultado de floor(" + valor+ ")=" + Math.floor(valor));
     System.out.println("Resultado de CEIL(" + valor+ ")=" + Math.ceil(valor));
     System.out.println("Resultado de round(" + valor+ ")=" + Math.round(valor));
     //pag50
    }
}
