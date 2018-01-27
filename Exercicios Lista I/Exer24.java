
/**
 * Uma empresa de bolinhas de gude precisa de um programa que calcula
a quantidade de caixas necessárias para embalar as bolinhas. A empresa
trabalha com caixas cuja capacidade é de 100 bolinhas. Faça um programa
que leia a quantidade de bolinhas, calcule e escreva a quantidade de caixas
necessárias para embalar as bolinhas.
 */
import java.util.Scanner;
public class Exer24
{
  public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     System.out.println("quantas bolinhas vc quer embalar? ");
     int quantidade = in.nextInt();
     int caixa = 100;
     int total = quantidade/100;
     System.out.println("vc precisa de " + total + " caixas.");
    }
}
