
/**
 * Faça um programa que leia a capacidade (em litros) do tanque de um
carro, o seu consumo médio (km/litro) e a distância (em km) que esse
carro precisa percorrer. O programa deve calcular e escrever tantas vezes
será necessário parar para abastecer para que o carro consiga percorrer a
distância informada.
 */
import java.util.Scanner;
public class Exer23
{
    public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     System.out.print("qual é a capacidade do tanque? ");
     double tanque = in.nextDouble();
     System.out.print("qual é o consumo médio (km/litro)? ");
     double consMedio = in.nextDouble();
     System.out.print("qual é a distância? ");
     double distancia = in.nextDouble();
     
     double distMaxTanque = consMedio*tanque;
     double abastecer = distancia/distMaxTanque;
     
     System.out.println("Você precisa abastecer " + abastecer + " vezes até atingir a distância informada.");
    
    }
}
