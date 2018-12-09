package utils;

import iva.Iva;

/** Copyright ESPE-DECC
*/

/**
 *
 * @author edisonlascano
 */
public class Tax {
    public static float computeIva(float base) {
        Iva.computeIva(3.4F);
        return base*1.12F;
    }

    
    
}
