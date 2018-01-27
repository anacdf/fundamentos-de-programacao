
/**
Construa um programa que leia dois valores inteiros e escreve na tela:
(a) a soma
(b) a diferença
(c) a média
(d) a distância (valor absoluto da diferença)
(e) o maior dos dois (use maior =a+b+|a−b|2)
(f) o menor dos dois (use menor =a+b−|a−b|2).
 */
import java.util.Scanner;
public class Exer7
{
    public static void main(String args []){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("Informe dois valores inteiros: ");
    double valor1 = teclado.nextDouble();
    double valor2 = teclado.nextDouble();
    // preferencia usar float
    double valorA = valor1+valor2;
    double valorB = valor1-valor2;
    double valorC = (valor1+valor2)/2;
    // pode ser  valorC = (valorA)/2;
    double valorD = Math.abs(valor1-valor2);
    // pode ser valorD = Math.abs(valorB);
    
    //double valorE = ((valor1+valor2)+(Math.abs(valor1-valor2))/2);
    //double valorF = ((valor1+valor2)-(Math.abs(valor1-valor2))/2);
    double valorE = Math.max(valor1, valor2);
    double valorF = Math.min(valor1, valor2);
    
    //pode ser System.out.println ("A soma e: " + (valor+valor2)); e não precisa declarar todas variaveis antes.
    
    System.out.println ("Com os valores de " + valor1 + " e " + valor2 + ", podemos obter os seguintes resultados:\n(a) a soma = " + valorA + "\n(b) a diferença = " + valorB + "\n(c) a média = " + valorC + "\n(d) a distância = " + valorD + "\n(e) o maior dos dois = " + valorE + "\ne (f) o menor dos dois = " + valorF);
    }
}
