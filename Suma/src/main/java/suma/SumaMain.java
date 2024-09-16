
package suma;
import java.util.Scanner;
/**
 *
 * @author varga
 */
public class SumaMain {
    public static void main (String args [])
    {
        Scanner key = new Scanner (System.in);
        System.out.println("Dame el primer valor:");
        int valorUno = key.nextInt();
        System.out.println("Dame el segundo valor:");
        int valorDos = key.nextInt();
        
        Suma valores  = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }
}
