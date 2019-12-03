/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmPackage;

import static frmPackage.jfrVehiculoRenta.arr;
import static frmPackage.jfrVehiculoRenta.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vehiculoapp.Archivo;
import vehiculoapp.Bus;
import vehiculoapp.Camion;
import vehiculoapp.Coche;
import vehiculoapp.Vehiculo;
import vehiculoapp.furgoneta;

/**
 *
 * @author Miguel
 */
public class JFrameAlqBUS extends javax.swing.JFrame {
static String  file ="Coches.txt";
 static String C[]={"N°","Matricula","Numero de Pasajeros","Modelo","Marca","Color","Kilometraje","Cilindrada"
         ,"Tipo de Combustión","Disponibilidad"};
static String D[][]={};
 static DefaultTableModel model;  
 static ArrayList <Vehiculo>arr2=frmPackage.jfrVehiculoRenta.getArr();
File f =new File(file);

    public JFrameAlqBUS() {
        initComponents();
           this.setLocationRelativeTo(null);
            
         
        if(f.exists()){
             Archivo a = new Archivo();
//         arr2=  a.leerArchivo(file);
        
    model = new DefaultTableModel(D,C);
    this.jTable1.setModel(model);
    ArrayList <Bus> Coches = new  ArrayList <Bus>();
            
              //************************************************
              for (int i = 0; i < arr2.size(); i++) {
                   if(arr2.get(i) instanceof Bus){
                       Coches.add((Bus) arr2.get(i));
                   }
            }
              int k=0;
              for (int i = 0; i < Coches.size(); i++) {
                if(Coches.get(i).isDisponibilidad()==true){
                     Object O[]={(k+1),Coches.get(i).getMatricula(),Coches.get(i).getNumPasajeros(),Coches.get(i).getModelo()
    ,Coches.get(i).getMarca(),Coches.get(i).getColor(),Coches.get(i).getKilometraje(),
    Coches.get(i).getCilindrada(),Coches.get(i).getCombustible(),"No Alquilado"};
      this.model.addRow(O);
      k++;
                }
            }
              
              //************************************************
        }else{
            JOptionPane.showMessageDialog(null, "El archivo no Existe");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonALQUILAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.light"));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 940, 260);

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(570, 10, 240, 26);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("INGRESE MATRÍCULA DEL COCHE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 10, 290, 32);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3), "Escoja la Matricula del Vehículo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei Light", 1, 14))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 960, 290);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("ALQUILAR VEHÍCULO [BUS]");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 11, 260, 32);

        jButtonALQUILAR.setText("ALQUILAR");
        jButtonALQUILAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonALQUILARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonALQUILAR);
        jButtonALQUILAR.setBounds(873, 10, 100, 23);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, 352));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonALQUILARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALQUILARActionPerformed
       ArrayList <Bus> Coches = new  ArrayList <Bus>();
        
       
        if(f.exists()){
            Archivo a = new Archivo();
//         arr2=  a.leerArchivo(file);
          
         for (int i = 0; i < arr2.size(); i++) {
                   if(arr2.get(i) instanceof Bus){
                       Coches.add((Bus) arr2.get(i));
                   }
            }
         int c=0;
         String m = null;
            for (int i = 0; i < Coches.size(); i++) {
                if(Coches.get(i).getMatricula().equals(this.jTextField1.getText())){
                    m=Coches.get(i).getMatricula();
                    JOptionPane.showMessageDialog(null, "VEHICULO ALQUILADO");
                    for (int j = 0; j < arr2.size(); j++) {
                        if(arr2.get(j).getMatricula().equals(m)){
                            
                            arr2.get(j).setDisponibilidad(false);
                           
                       break;     
                        }
                    }
                    break;
                }
                c++;
            }
            if(c==Coches.size()){
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ EL VEHÍCULO");
            }
//             FileOutputStream fos;
//        File f1= new File(file);
//        f1.delete();
//       ObjectOutputStream ous;
//        try {
//            
//            fos= new FileOutputStream(f1);
//            ous = new ObjectOutputStream(fos);
//            for (int k = 0; k < arr.size(); k++) {
//               //   ous.writeObject(arr.get(k));
//                    if(arr.get(k) instanceof Coche){
//                        
//                        ous.writeObject((Coche)arr.get(k));
//                      
//                    } if(arr.get(k) instanceof Bus){
//                       
//                        ous.writeObject((Bus)arr.get(k));
//                         
//                    } if(arr.get(k) instanceof Camion){
//                        ous.writeObject((Camion)arr.get(k)); 
//                    } if(arr.get(k) instanceof furgoneta){
//                        ous.writeObject((furgoneta)arr.get(k)); 
//                    }
//            }

       //  ous.writeObject(arr);
           
//               ous.close();
//            
//        } catch (Exception e) {
//                System.out.println(e.getMessage());  
//        }
            sobreescribirDatos();
       }else{
           
       }
    }//GEN-LAST:event_jButtonALQUILARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAlqBUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAlqBUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAlqBUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAlqBUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAlqBUS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonALQUILAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


public void sobreescribirDatos(){
     FileOutputStream fos;
            File f= new File(file);
            ObjectOutputStream ous;
            f.delete();
            ArrayList<Coche> co = new ArrayList<Coche>();
            ArrayList<Bus> bus = new ArrayList<Bus>();
            ArrayList<furgoneta> furgo = new ArrayList<furgoneta>();
            ArrayList<Camion> cam = new ArrayList<Camion>();
            for (int i = 0; i < arr2.size(); i++) {
                try {
                    fos= new FileOutputStream(f,true);
                    ous = new ObjectOutputStream(fos);
                    if(arr2.get(i) instanceof Coche){
                        co.add((Coche) arr2.get(i));
                        co.set(0,(Coche) arr2.get(i));
                        Coche  n= new Coche(co.get(0).getNumPasajeros(),co.get(0).getModelo(),co.get(0).getMarca(),
                                co.get(0).getColor(),co.get(0).getKilometraje(),co.get(0).getCilindrada(),co.get(0).getCombustible()
                                ,co.get(0).getTipo(),co.get(0).getMatricula(),co.get(0).isDisponibilidad());
                        ous.writeObject(n);
                    }else if(arr2.get(i) instanceof Bus){
                         bus.add((Bus) arr2.get(i));
                        bus.set(0,(Bus) arr2.get(i));
                        Bus  a= new Bus(bus.get(0).getNumPasajeros(),bus.get(0).getModelo(),bus.get(0).getMarca(),
                                bus.get(0).getColor(),bus.get(0).getKilometraje(),bus.get(0).getCilindrada(),bus.get(0).getCombustible()
                                ,bus.get(0).getTipo(),bus.get(0).getMatricula(),bus.get(0).isDisponibilidad());
                        ous.writeObject(a);
                    }else if(arr2.get(i) instanceof furgoneta){
                        furgo.add((furgoneta) arr2.get(i)); 
                        furgo.set(0,(furgoneta) arr2.get(i));
                        furgoneta  e= new furgoneta(furgo.get(0).getNumllantas(),furgo.get(0).getTonelaje(),furgo.get(0).getModelo(),furgo.get(0).getMarca(),
                                furgo.get(0).getColor(),furgo.get(0).getKilometraje(),furgo.get(0).getCilindrada(),furgo.get(0).getCombustible()
                                ,furgo.get(0).getTipo(),furgo.get(0).getMatricula(),furgo.get(0).isDisponibilidad());
                        ous.writeObject(e);
                    }else if(arr2.get(i) instanceof Camion){
                        cam.add((Camion) arr2.get(i)); 
                        cam.set(0,(Camion) arr2.get(i));
                        Camion  e= new Camion(cam.get(0).getNumllantas(),cam.get(0).getTonelaje(),cam.get(0).getModelo(),cam.get(0).getMarca(),
                                cam.get(0).getColor(),cam.get(0).getKilometraje(),cam.get(0).getCilindrada(),cam.get(0).getCombustible()
                                ,cam.get(0).getTipo(),cam.get(0).getMatricula(),cam.get(0).isDisponibilidad());
                        ous.writeObject(e);
                    }
ous.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
             
        dispose();
        
        
}     


}


