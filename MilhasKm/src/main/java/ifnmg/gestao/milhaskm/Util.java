/*
Classe com método que converte valor de milhas para km. 
*/
package ifnmg.gestao.milhaskm;

/**
 *
 * @author Ryanderson
 */
public class Util 
{
    public double milhas;    
    public static double milhasEmKm(double milhas)
    {
        return ( milhas * 1.609344);
    }
}
