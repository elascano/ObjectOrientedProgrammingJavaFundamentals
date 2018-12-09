/** Copyright ESPE-DECC
*/

package ec.edu.espe.cursomicroservicios.cert05gestionligamaven.liga.utilitario;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author edisonlascano
 */
public class UtilitarioFecha {
    
    public static Date convertirFecha(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

}
