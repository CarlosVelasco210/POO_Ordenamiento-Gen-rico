/*

 */
package Tarea2;


/**
 *
 * @author Windows
 */
public class Quicks {
    
    public static <T extends Number> T[] Orden(T[] Vect) {
        QS(Vect, 0 ,Vect.length-1);
        return Vect;
    }
    
    public static <T extends Number> void QS (T arreglo[], Integer izquierda, Integer derecha) {
        Integer i = izquierda;
        Integer j = derecha;
        T pivote = arreglo[izquierda], aux;
        
        while (i<j){
            while (arreglo[i].doubleValue() <= pivote.doubleValue() && i < j) 
                i++;
            
            while (arreglo[j].doubleValue() > pivote.doubleValue()) 
                j--;
            
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }   
            arreglo[izquierda]=arreglo[j];
            arreglo[j]=pivote;
            
            if(izquierda < (j-1))
                QS(arreglo,izquierda,j-1);
            if(j+1 < derecha)
                QS(arreglo,j+1,derecha);
    }  
}
  