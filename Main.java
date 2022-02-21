/*

 */
package Tarea2;

import java.util.Arrays;

/**
 *
 * @author Windows
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer intVector[] = {102,99,12,19,21,111,345,25,77,81};
        Integer results [] = Quicks.Orden(intVector);
        System.out.println("Arreglo Integer Ordenado: " + Arrays.toString(results));
        
        Float floatVector[] = {19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f};
        Float resultsF  [] = Quicks.Orden(floatVector);
        System.out.println("Arreglo Float Ordenado: " + Arrays.toString(resultsF));
        
        
        
    }


}
