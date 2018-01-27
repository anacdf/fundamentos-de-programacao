
/**
Maria tem muitos cães e por isso costuma comprar muitos sacos de ração de 25kg. Faça um programa que leia a quantidade e o valor unitário 
de cada saco comprado por Maria e o valor total que ela costuma pagar por  eles. A Pet Shop onde Maria costuma comprar a ração está
com uma promoção, a cada 10 sacos de ração, o cliente ganha 5% de desconto.
Sabendo disso, mostre também quanto Maria pagará pelos sacos de ração ao usufruir da promoção. 
*/
import java.util.Scanner;
public class Exer14
{
    public static void main (String args []){
    Scanner in = new Scanner (System.in);
    
    System.out.print ("informe quantos sacos de ração vc quer comprar: ");
    double sacos = in.nextFloat();
    double kgsaco = sacos*25; //25kg cada saco
    double custoUnitario = 17; //17 reais cada saco
    double custoTotal = sacos*17;
    if (sacos<10) System.out.println (sacos + " sacos de ração de 25kg \nTotal: " + kgsaco + " Kg.\nO valor da sua compra é de\nR$" + custoUnitario + " por saco e R$" + custoTotal + " no total");
    else {
        System.out.println ("Vimos que você encomendou mais de 10 sacos,\nestamos com uma ótima promoção de 5% de desconto!");
        double custoDescontoUn = custoUnitario-(custoUnitario*0.05);
        double custoDesconto = custoDescontoUn*sacos;
        System.out.print ("Você vai pagar R$" + custoDescontoUn + " por cada saco e R$" + custoDesconto + " no total.");
    }
    }   
    }
