/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.certificacion.gestion.liga.logica.negocio.cer05gestionligalogicanegociomaven.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edisonlascano
 */
public interface GenericoDao {
    void guardar(Object obj) throws SQLException;
    void actualiazr(Object obj) throws SQLException;
    void eliminar(Object obj) throws SQLException;
    
    List<Liga> listarTodo() throws SQLException;
}
