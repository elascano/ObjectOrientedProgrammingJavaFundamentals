/** Copyright ESPE-DECC
*/

package ec.edu.espe.certificacion.gestion.liga.logica.negocio.cer05gestionligalogicanegociomaven.conexion.bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author edisonlascano
 */
public class ConexionBd {

    public Connection obtenerConexionPostgress() {
        
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.0.104:5432/administracion_ligas", "postgres", "postgres");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
