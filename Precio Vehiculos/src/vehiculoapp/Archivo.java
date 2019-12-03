/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoapp;


import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import login.Registro;
import vehiculoapp.Vehiculo;

/**
 *
 * @author espe
 */
public class Archivo implements Serializable{
    private ArrayList<Object> a = new ArrayList<Object>();
    private int nunCoches;
    
    public Archivo() {
    }


     public ArrayList leerArchivo(String file){
     ArrayList listPrueba = new ArrayList();
     FileInputStream fis;
     ObjectInputStream ois;
     File f= new File(file);
        try {
          if(f.exists()){
            fis = new FileInputStream(file);
 
            try {
              Vehiculo co;
              while (fis.available() > 0) {
                ObjectInputStream in = new ObjectInputStream(fis);
                co = (Vehiculo) in.readObject();
                listPrueba.add(co);
                
          }
        } finally {
            fis.close();
        }

}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPrueba;
  }
     public ArrayList leerArchivoRegistro(String file){
     ArrayList listPrueba = new ArrayList();
     FileInputStream fis;
     ObjectInputStream ois;
     File f= new File(file);
        try {
            if(f.exists()){
     fis = new FileInputStream(file);
 
        try {
            Registro co;
            while (fis.available() > 0) {
                ObjectInputStream in = new ObjectInputStream(fis);
                co = (Registro) in.readObject();
                listPrueba.add(co);
                
            }
        } finally {
            fis.close();
        }

}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPrueba;
  }
    
    
    
   public int obtenerNumCoches(String file) {
          int num=0;
        FileInputStream fis;
     ObjectInputStream ois;
     File f= new File(file);
       try {
           if(f.exists()){
     
     fis = new FileInputStream(file);
 
        try {
            Vehiculo co;
            while (fis.available() > 0) {
                ObjectInputStream in = new ObjectInputStream(fis);
                co = (Vehiculo) in.readObject();
              num++;
                
            }
        } finally {
            fis.close();
        }

}else{
               num=0;
           }
       } catch (Exception e) {
       }

       return num;
   } 
}

