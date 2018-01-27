
/**
 * Escreva a descrição da classe Exer3 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.text.DecimalFormat;
public class Exer3
{
    public static void main(String args[]){
double valorDaCompra=19.93;
double pagamento=20.0;
double diferenca =pagamento-valorDaCompra;
DecimalFormat formatador = new DecimalFormat("0.00");
System.out.println("Diferenca= " + formatador.format (diferenca));
}
}
