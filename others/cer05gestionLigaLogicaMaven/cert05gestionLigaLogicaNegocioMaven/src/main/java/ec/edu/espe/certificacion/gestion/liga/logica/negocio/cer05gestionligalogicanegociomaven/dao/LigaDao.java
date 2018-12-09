/** Copyright ESPE-DECC
 */
package ec.edu.espe.certificacion.gestion.liga.logica.negocio.cer05gestionligalogicanegociomaven.dao;

import ec.edu.espe.certificacion.gestion.liga.logica.negocio.cer05gestionligalogicanegociomaven.conexion.bd.ConexionBd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edisonlascano
 */
public class LigaDao implements GenericoDao {

    private Statement stt;
    private ResultSet res;
    private ConexionBd conexion;

    @Override
    public void guardar(Object obj) throws SQLException {

        Liga liga = (Liga) obj;
        String sql = "INSERT INTO sch_administracion_liga.liga(nombre, descripcion, fecha_operacion)"
                + " VALUES ('" + liga.getNombre() + "'," + liga.getDescripcion() + "'," + liga.getFechaCreacion() + "'";
        setConexion(new ConexionBd());
        setStt(getConexion().obtenerConexionPostgress().createStatement());
        getStt().execute(sql);
        getStt().close();
        getConexion().obtenerConexionPostgress().close();

    }

    @Override
    public void actualiazr(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Liga> listarTodo() throws SQLException {
        List<liga> listaDatos = new ArrayList<>();
        String sql = "SELECT id_liga, nombre, descripcion, fecha_creacion FROM sch_administracion_liga.liga";
        setConexion(new ConexionBd());
        setStt(getConexion().obtenerConexionPostgress().createStatement());
        setRes(getStt().executeQuery(sql));
        while(getRes().next()) {
            Liga liga = new Liga();
            liga.setId(getRes().getString(1));
            liga.setNombre(getRes().getString(2));
            liga.setDescripcion(getRes().getString(3));
            liga.setDateFecah(getRes().getString(4));
            listaDatos.add(liga);

            
        }
        
        getRes().close();
        getStt().close();
        getConexion().obtenerConexionPostgress().close();
        
        return listaDatos;
    }

    /**
     * @return the stt
     */
    private Statement getStt() {
        return stt;
    }

    /**
     * @param stt the stt to set
     */
    private void setStt(Statement stt) {
        this.stt = stt;
    }

    /**
     * @return the res
     */
    private ResultSet getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    private void setRes(ResultSet res) {
        this.res = res;
    }

    /**
     * @return the conexion
     */
    private ConexionBd getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    private void setConexion(ConexionBd conexion) {
        this.conexion = conexion;
    }

}
