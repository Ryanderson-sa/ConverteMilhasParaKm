/*Progama que converte Milhas para km à partir do método estático*/
package ifnmg.gestao.milhaskm;

/**
 *
 * @author Ryanderson
 */
import java.util.Scanner;
public class MilhasKm 
{

    public static void main(String[] args) {
        System.out.println("----Conversor de Milhas para Quilomêtros----");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor em milhas: ");
        double milhas = scanner.nextDouble();

        double km = Util.milhasEmKm(milhas);
        
        System.out.println( milhas + " milhas é igual a: " + km + ("km."));

        scanner.close();
    }
}