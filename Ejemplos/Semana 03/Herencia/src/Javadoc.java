
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author federico
 */
public class Javadoc {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, -4};
        int res = validar(x);
        Date d = new Date();
        
    }
    
    /**
     * Verifica que ningún valor del arreglo sea negativo
     * @param v Arreglo de enteros
     * @return 1 si ninguno es negativo, 0 en caso contrario
     */
    public static int validar(int[] v) {
        for(int x: v) {
            if (x < 0)
                return 0;
        }
        return 1;
    }
}
