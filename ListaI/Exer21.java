
/**
 Construa um programa que calcula o digito verificador de uma conta corrente
de 3 dígitos. Para isso, inicialmente o programa deve solicitar ao
usuário o número dessa conta. O programa deve, então, calcular o dígito
verificador da seguinte forma:
(a) Soma o número da conta com um valor que corresponde ao número
na ordem inversa. (Ex: para numero = 235, o valor na ordem inversa
é 532. Faça 235 + 532 = 767)
(b) Multiplica cada dígito do valor encontrado em (a) pela sua posição e
soma os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)
(c) O último dígito do valor encontrado em (b) é o dígito verificador
(Ex:40 ! 0).
O programa, ao final da execução, deve escrever a conta e o seu digito
verificador (Exemplo: 235.0).
 */
import java.util.Scanner;
public class Exer21
{
    public static void main (String args[]){
     Scanner in = new Scanner (System.in);
     
     System.out.print ("informe a conta corrente: ");
     int conta = in.nextInt();
     
     int centena = conta/100;
     int restoCentena = conta%100;
     int dezena = restoCentena/10;
     int restoDezena = restoCentena%10;
     int unidade = restoDezena;
     
     int contaInversa = (unidade*100)+(dezena*10)+centena;
     
     int parteA = conta+contaInversa;
     int centenaA = parteA/100;
     int restoCentenaA = parteA%100;
     int dezenaA = restoCentenaA/10;
     int restoDezenaA = restoCentenaA%10;
     int unidadeA = restoDezenaA;
     
     int parteB = (centenaA*1)+(dezenaA*2)+(unidadeA*3);
     
     int centenaB = parteB/100;
     int restoCentenaB = parteB%100;
     int dezenaB = restoCentenaB/10;
     int restoDezenaB = restoCentenaB%10;
     int unidadeB = restoDezenaB;
     
     int parteC = unidadeB;
     
     System.out.print ("A conta com dígito verificador é " + conta + "." + parteC);
    }
}
