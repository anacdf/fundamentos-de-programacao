
/**
 O domingo de Páscoa é o primeiro domingo após a primeira lua cheia do equinócio de outono no Hemisfério Sul. 
 Para o cálculo da data da Páscoa pode-se usar o algoritmo descrito abaixo e inventado pelo matemático Carl Friedrich Gauss em 1800.
(a) y representa um ano (por exemplo 2001).
(b) divida y por 19 e armazene o resto da divisão em a.
(c) divida y por 100 e armazene o coeciente da divisão em b e o resto da divisão em c.
(d) divida b por 4 e armazene o coeciente da divisão em d e o resto da divisão em e.
(e) divida 8 x b + 13 por 25 e armazene o coeciente da divisão em g.
(f) divida 19 x a + b-d-g + 15 por 30 e armazene o resto da divisão em h.
(g) divida c por 4 e armazene o coeciente da divisão em j e o resto da divisão em k.
(h) divida a + 11 x h por 319 e armazene o coeciente da divisão em m.
(i) divida 2xe+2xj-k-h+m+32 por 7 e armazene o resto da divisão em r.
(j) divida h-m+r+90 por 25 e armazene o coeciente da divisão em n.
(k) divida h-m+ r + n + 19 por 32 e armazene o resto da divisão em p.
A Páscoa será no dia p do mês n. Por exemplo, se y é 2001: a = 6, b = 20,
c = 1, d = 5, e = 0, g = 6, h = 18, j = 0, k = 1, m = 0, r = 6, n = 4
e p = 15, ou seja, em 2001, o domingo de Páscoa foi no dia 15 de abril.
Codique esse algoritmo na linguagem Java.
 */
import java.util.Scanner;
public class Exer15
{
    public static void main (String args []){
        Scanner in = new Scanner (System.in);
        
        System.out.print("informe o ano: ");
        int y = in.nextInt();
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        int n = (h-m+r+90)/25;
        int p = (h-m+r+n+19)%32;
        
        System.out.print ("A páscoa em " + y + " foi/será no dia " + p + " do mês de "); 
        
        switch (n){
            case 1: System.out.print ("janeiro");
                break;
            case 2: System.out.print ("fevereiro");
                break;
            case 3: System.out.print ("março");
                break;
            case 4: System.out.print ("abril");
                break;
            case 5: System.out.print ("maio");
                break;
            case 6: System.out.print ("junho");
                break;
            case 7: System.out.print ("julho");
                break;
            case 8: System.out.print ("agosto");
                break;
            case 9: System.out.print ("setembro");
                break;
            case 10: System.out.print ("outubro");
                break;
            case 11: System.out.print ("novembro");
                break;
            case 12: System.out.print ("dezembro");
                break; 
        }
    }
}
