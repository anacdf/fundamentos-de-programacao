
/**
Um robô precisa percorrer um piso revestido com cerâmidas pretas e brancas.
Crie um programa que recebe como entrada a linha e a coluna (ver imagem abaixo) 
correspondente a cada cerâmica do piso e escreve 0 quando a cerâmica tem cor preta e 1 quando a cerâmica tem cor branca
 */
import java.util.Scanner;
public class Exer13
{
public static void main(String args []){
Scanner teclado = new Scanner (System.in);

System.out.println("\fDiga o número da linha e da coluna, da 1 a 4");   
int linha = teclado.nextInt();
int coluna = teclado.nextInt();

int soma = ((linha%2) + (coluna%2)) %2;

System.out.println("A ceramica escolhida é " + soma + "\nSe o resultado for 0, a coluna é preta.\nSe o resultado for 1, a coluna é branca.");
    }
}
