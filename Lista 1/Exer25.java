
/**
 * Uma casa de espetáculos teatrais precisa de um programa que calcula
o valor do ingresso. Faça um programa que leia o custo total do espet
áculo (esse valor total é a soma dos gastos com: elenco, técnicos, local
da apresentação, ...) e o número de poltronas existentes no teatro. O
programa deve solicitar ainda ao usuário: percentual de lucro desejado,
percentual mínimo de ocupação esperado (das poltronas do teatro) em
cada espetáculo e quantidade de espetáculos que será realizada. Com
base nesses dados, o programa deve calcular e escrever o valor do ingresso.
 */
import java.util.Scanner;
public class Exer25
{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("custo total: ");
        double custoTotal = in.nextDouble();
        System.out.println("numero de poltronas: ");
        double maxPoltronas = in.nextDouble();
        System.out.println("percentual de lucro: ");
        double lucro = in.nextDouble();
        System.out.println("mínimo de poltronas: ");
        double minPoltronas = in.nextDouble();
        System.out.println("quantos espetáculos: ");
        double quantidade = in.nextDouble();
        
        double valorIngresso = ((quantidade*custoTotal)/(maxPoltronas-minPoltronas))+(lucro/100);
        System.out.println("valor ingresso: " + valorIngresso);
    }
}
