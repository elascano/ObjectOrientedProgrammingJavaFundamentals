/** Copyright ESPE-DECC
 */
package ec.edu.espe.cursomicroservicios.cert05gestionligamaven.controlador;

import ec.edu.espe.certificacion.gestion.liga.modelo.cert05gestionligamodelomaven.Liga;
import ec.edu.espe.cursomicroservicios.cert05gestionligamaven.liga.utilitario.PatronFecha;
import ec.edu.espe.cursomicroservicios.cert05gestionligamaven.liga.utilitario.UtilitarioFecha;
import ec.edu.espe.cursomicroservicios.cert05gestionligamaven.liga.utilitario.UtilitarioForma;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author edisonlascano
 */
public class LigaControlador implements Initializable {
    //Liga liga;

    @FXML
    private TextField txtNombre;

    @FXML
    private DatePicker dateFecha;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private TableView tblDatos;

    private Liga liga;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        limpiarForma();

    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    private void limpiarForma() {
        UtilitarioForma.limpiarNodos(txtDescripcion, txtNombre, dateFecha);
        setLiga(new Liga());
        dateFecha.setConverter(UtilitarioForma.converterFecha());
        dateFecha.setPromptText(PatronFecha.PATRON_FECHA.toLowerCase());
        cargarTabla();
    }

    public void limpiarForma(ActionEvent evt) {
        limpiarForma();
    }

    public void cargarTabla() {
        try{
            LigaServicio ligaServicio = new LigaServicio();
            Lista<Liga> listaLiga = ligaServicio.listarTodo();
            for (Liga l : listaLiga) {
                System.out.println(" nombre" + l.getNombre() + "descripcion = " + l.getDescripcion);
            }
        } catch(SQLException) {
            
        }
    }
    
    public void guardar(ActionEvent evt) {
        try {
            
            if(UtilitarioForma.checkEmptyFields(txtDescripcion, txtNombre, dateFecha)) {
                cargarEntidadControles();
                LigaServicio ligaServicio = new LigaServicio();
                ligaServicio.guardar(getLiga());
                System.out.println("-- registro guardado");
                limpiarForma();
                
                
            }
            /*        Liga liga = new Liga();
        liga.setDescripcion("drscripcion de mi liga");
        liga.setNombre("chimbacalle");
        liga.setFechaCreacion("2-17-01-01 16:30:00");
        
        LigaServicio ligaServicio = new LigaServicio();
        ligaServicio.guardar(liga);
             */

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //ConexionBd conexionBd = new ConexionBd();
        //conexionBd.obtenerConexionPostgress();
        //System.out.println("... ejecuta botón desde la interface por medio del controlador...");
    }

    public void cargarEntidadControles() {
        DateFormat formatoFecha = new SimpleDateFormat(PatronFecha.PATRON_FECHA);
        getLiga().setDescripcion(txtDescripcion.getText().trim().toUpperCase());
        getLiga().setNombre(txtNombre.getText().trim().toUpperCase());
         getLiga().setDateFecha(formatoFecha.format(UtilitarioFecha.convertirFecha(dateFecha.getValue()))); 

    }

}
