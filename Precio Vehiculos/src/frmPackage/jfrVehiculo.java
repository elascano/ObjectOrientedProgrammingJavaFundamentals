/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import vehiculoapp.Archivo;
import vehiculoapp.Coche;
import vehiculoapp.VehiculoPasajeros;
import vehiculoapp.Vehiculo;
import frmPackage.jfrVehiculoRenta;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import vehiculoapp.Bus;
import vehiculoapp.Camion;
import vehiculoapp.furgoneta;


/**
 *
 * @author Miguel
 */
public class jfrVehiculo extends javax.swing.JFrame implements Serializable{
FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg");
String rutaImagen;
    private String file = "Coches.txt";
Archivo rp;

ArrayList<VehiculoPasajeros> listCoche;

ArrayList<VehiculoPasajeros> listVe = new ArrayList<VehiculoPasajeros>();
ArrayList listPrueba = new ArrayList();
ArrayList listPrueba2 = new ArrayList();
ArrayList<Coche> listPrueba3 = new ArrayList<Coche>();

    /**
     * Creates new form jfrCoche
     */
    public jfrVehiculo() throws ClassNotFoundException, IOException {
        
        initComponents();
        this.setLocationRelativeTo(null);
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/rentCar.png")).getImage());
        rutaImagen ="";
        jcomboBox1();
        
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarCoche = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatriculaCoche = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBoxModelodeCoche = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtKilometraje = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCilindrada = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonGas = new javax.swing.JRadioButton();
        jRadioButtonDiesel = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButtonConfigurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setName("INGRESO AL SISTEMA - VEHICULO"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        jLabel1.setText("Tipo:");

        btnGuardarCoche.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardarIcon.png"))); // NOI18N
        btnGuardarCoche.setBorder(null);
        btnGuardarCoche.setBorderPainted(false);
        btnGuardarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCocheActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        jLabel3.setText("Numero de Pasajeros:");

        txtMatriculaCoche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaCocheKeyTyped(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner1KeyTyped(evt);
            }
        });

        jComboBoxModelodeCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModelodeCocheActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("MODELO:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel5.setText("MARCA:");

        jLabel6.setText("COLOR:");

        jLabel7.setText("KILOMETRAJE:");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        txtKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyTyped(evt);
            }
        });

        jLabel8.setText("CILINDRADA:");

        jLabel9.setText("COMBUSTIBLE:");

        buttonGroup1.add(jRadioButtonGas);
        jRadioButtonGas.setText("Gasolina");

        buttonGroup1.add(jRadioButtonDiesel);
        jRadioButtonDiesel.setText("Diesel");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1488554958_DeleteRed.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Numero de LLantas :");

        jLabel12.setText("Definir Tonelaje :");

        jSpinner2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner2KeyTyped(evt);
            }
        });

        jSpinner3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner3KeyTyped(evt);
            }
        });

        jButtonConfigurar.setText("CONFIGURAR");
        jButtonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKilometraje)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtModelo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatriculaCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxModelodeCoche, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonDiesel)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonGas))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnGuardarCoche)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(jButtonConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriculaCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxModelodeCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonGas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDiesel)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarCoche)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public String isSelected(){
    String m="";
    if(this.jRadioButtonGas.isSelected()){
         m = "Gasolina";
    }else if(this.jRadioButtonDiesel.isSelected()){
         m="Diesel";
    }
    return m;
}
private void IngresarRegistroCoche(){

   Coche  c= new Coche(Integer.parseInt(this.jSpinner1.getValue().toString())
    ,this.txtModelo.getText(),this.jComboBoxModelodeCoche.getSelectedItem().toString(),this.txtColor.getText()
    ,Integer.parseInt(this.txtKilometraje.getText()),Integer.parseInt(this.jComboBoxCilindrada.getSelectedItem().toString()),
    isSelected(),this.jComboBox1.getSelectedItem().toString()
    ,this.txtMatriculaCoche.getText());
  
    FileOutputStream fos;
            File f= new File(file);
       ObjectOutputStream ous;
        try {
            if(f.exists()){
            //ArrayList<Coche> listCoche1 = new ArrayList<Coche>();
            fos= new FileOutputStream(f,true);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(c);
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            ous.close();
            }else{

            fos= new FileOutputStream(f);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(c);ous.close();
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }     
        } catch (Exception e) {
          mensaje("Error al Guardar : "+e.getMessage());
        }
   
}
private void IngresarRegistroBus(){

    
   Bus  b= new Bus(Integer.parseInt(this.jSpinner1.getValue().toString())
    ,this.txtModelo.getText(),this.jComboBoxModelodeCoche.getSelectedItem().toString(),this.txtColor.getText()
    ,Integer.parseInt(this.txtKilometraje.getText()),Integer.parseInt(this.jComboBoxCilindrada.getSelectedItem().toString()),
    isSelected(),this.jComboBox1.getSelectedItem().toString()
    ,this.txtMatriculaCoche.getText());
    FileOutputStream fos;
        File f= new File(file);
       ObjectOutputStream ous;
        try {
            if(f.exists()){
            fos= new FileOutputStream(f,true);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(b);
    ous.close();  
    mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }else{
            fos= new FileOutputStream(f);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(b);
            ous.close();
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }
        } catch (Exception e) {
            mensaje("Error al Guardar :"+e.getMessage());
        }
     this.jLabel10.setText("INGRESO AL SISTEMA .... COMPLETADO");
}
  public byte[] leerFoto(File ruta){
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            return icono;
        }catch(Exception ex){
            return null;
        }
    }
  public void ingresarRegistroFurgoneta(){
      furgoneta  f= new furgoneta(Integer.parseInt(this.jSpinner2.getValue().toString()),
              Float.parseFloat(this.jSpinner3.getValue().toString())
    ,this.txtModelo.getText(),this.jComboBoxModelodeCoche.getSelectedItem().toString(),this.txtColor.getText()
    ,Integer.parseInt(this.txtKilometraje.getText()),Integer.parseInt(this.jComboBoxCilindrada.getSelectedItem().toString()),
    isSelected(),this.jComboBox1.getSelectedItem().toString()
    ,this.txtMatriculaCoche.getText());
    FileOutputStream fos;
        File f1= new File(file);
       ObjectOutputStream ous;
        try {
            if(f1.exists()){
            fos= new FileOutputStream(f1,true);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(f);
            ous.close(); 
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }else{
   fos= new FileOutputStream(f1);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(f);
            ous.close();
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }
        } catch (Exception e) {
            mensaje("Error al Guardar :"+e.getMessage());           
        }
     this.jLabel10.setText("INGRESO AL SISTEMA .... COMPLETADO");
  }
  public void ingresarRegistroCamion(){
      Camion  f= new Camion(Integer.parseInt(this.jSpinner2.getValue().toString()),
              Float.parseFloat(this.jSpinner3.getValue().toString())
    ,this.txtModelo.getText(),this.jComboBoxModelodeCoche.getSelectedItem().toString(),this.txtColor.getText()
    ,Integer.parseInt(this.txtKilometraje.getText()),Integer.parseInt(this.jComboBoxCilindrada.getSelectedItem().toString()),
    isSelected(),this.jComboBox1.getSelectedItem().toString()
    ,this.txtMatriculaCoche.getText());
    FileOutputStream fos;
        File f1= new File(file);
       ObjectOutputStream ous;
        try {
            if(f1.exists()){
            fos= new FileOutputStream(f1,true);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(f);
             ous.close();  
             mensaje("INGRESO AL SISTEMA .... COMPLETADO");
            }else{
             fos= new FileOutputStream(f1);
            ous = new ObjectOutputStream(fos);
            ous.writeObject(f);
            mensaje("INGRESO AL SISTEMA .... COMPLETADO");
    ous.close();
            }
        } catch (Exception e) {
            mensaje("Error al Guardar :"+e.getMessage());    
           
        }
     this.jLabel10.setText("INGRESO AL SISTEMA .... COMPLETADO");
  }
public void validarDatos(){
    if(((this.txtColor.getText().equals(""))||(this.txtKilometraje.getText().equals(""))||(this.txtMatriculaCoche.getText().equals(""))||(this.txtModelo.getText()).equals(""))){
    JOptionPane.showMessageDialog(this, "Existen campos vacios");
    return;
    
}if(!(this.jRadioButtonDiesel.isSelected()||this.jRadioButtonGas.isSelected())){
    JOptionPane.showMessageDialog(this, "No ha Seleccionado alguno de los botones");
    return;
}
}
    private void btnGuardarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCocheActionPerformed

 validarDatos();
        
if(this.jComboBox1.getSelectedItem().equals("Coche")){
    IngresarRegistroCoche();
}else if(this.jComboBox1.getSelectedItem().equals("Bus")){
    IngresarRegistroBus();
}else if(this.jComboBox1.getSelectedItem().equals("Furgoneta")){
    ingresarRegistroFurgoneta();
}else if(this.jComboBox1.getSelectedItem().equals("Camión")){
    ingresarRegistroCamion();
}
    
    }//GEN-LAST:event_btnGuardarCocheActionPerformed
public void mensaje(String s){
    JOptionPane.showMessageDialog(this, s);
}
    private void jComboBoxModelodeCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModelodeCocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModelodeCocheActionPerformed
private void combobox(){
    this.buttonGroup1.add(this.jRadioButtonGas);
this.buttonGroup1.add(this.jRadioButtonDiesel);


this.jSpinner1.setEnabled(false);
this.jSpinner2.setEnabled(false);
this.jSpinner3.setEnabled(false);
        if(this.jComboBox1.getSelectedItem().equals("Coche")){
          
            SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
            modeloSpinner.setMaximum(6);
                 modeloSpinner.setMinimum(1);
                 modeloSpinner.setValue(4);
                 this.jSpinner1.setModel(modeloSpinner);
                 
                 
               
             this.jComboBoxModelodeCoche.removeAllItems();
              this.jComboBoxCilindrada.removeAllItems();
           comboBoxMarca();
           this.jComboBoxCilindrada.addItem("1500");
           this.jComboBoxCilindrada.addItem("1700");
           this.jComboBoxCilindrada.addItem("2000");
           this.jComboBoxCilindrada.addItem("2250");
           
          
           
    }
            if(this.jComboBox1.getSelectedItem().equals("Bus")){
                
                SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
            modeloSpinner.setMaximum(90);
                 modeloSpinner.setMinimum(10);
                 modeloSpinner.setValue(20);
                 this.jSpinner1.setModel(modeloSpinner);
              
                // this.jSpinner1.enable();
                this.jComboBoxModelodeCoche.removeAllItems();
                 this.jComboBoxCilindrada.removeAllItems();
            this.jComboBoxModelodeCoche.addItem("Boxer");
            this.jComboBoxModelodeCoche.addItem("Gran Viale");
            this.jComboBoxModelodeCoche.addItem("Gran Viale LE CNG");
            this.jComboBoxModelodeCoche.addItem("Torino");
            this.jComboBoxModelodeCoche.addItem("Viale BRT");
            this.jComboBoxModelodeCoche.addItem("Toreto");
            this.jComboBoxCilindrada.addItem("2000");
           this.jComboBoxCilindrada.addItem("2100");
           this.jComboBoxCilindrada.addItem("2200");
           this.jComboBoxCilindrada.addItem("2500");
    }
            if(this.jComboBox1.getSelectedItem().equals("Furgoneta")){
                
                 this.jComboBoxModelodeCoche.removeAllItems();
                 this.jComboBoxCilindrada.removeAllItems();
                 this.jComboBoxModelodeCoche.addItem("Citroen");
                 this.jComboBoxModelodeCoche.addItem("Decia");
                 this.jComboBoxModelodeCoche.addItem("Daewoo");
                 this.jComboBoxModelodeCoche.addItem("Fiat");
                 this.jComboBoxModelodeCoche.addItem("Ford");
                 this.jComboBoxModelodeCoche.addItem("Hyundai");
                 this.jComboBoxModelodeCoche.addItem("Izuzu");  
                 this.jComboBoxModelodeCoche.addItem("Nissan");
                 this.jComboBoxCilindrada.addItem("1500");
                 this.jComboBoxCilindrada.addItem("2100");
                 this.jComboBoxCilindrada.addItem("2200");
                 this.jComboBoxCilindrada.addItem("2800");
                 SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
                 SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel();
                 modeloSpinner1.setMaximum(20);
                  modeloSpinner1.setMinimum(1);
                   modeloSpinner1.setValue(5);
                   this.jSpinner3.setModel(modeloSpinner1);
                  
                 modeloSpinner.setMaximum(6);
                 modeloSpinner.setMinimum(4);
                 modeloSpinner.setValue(4);
                 this.jSpinner2.setModel(modeloSpinner);
                 
            }
            if(this.jComboBox1.getSelectedItem().equals("Camión")){
             
                 this.jComboBoxModelodeCoche.removeAllItems();
                 this.jComboBoxCilindrada.removeAllItems();
                 this.jComboBoxModelodeCoche.addItem("Scania");
                 this.jComboBoxModelodeCoche.addItem("Man");
                 this.jComboBoxModelodeCoche.addItem("Volvo");
                 this.jComboBoxModelodeCoche.addItem("Mercedes");
                 this.jComboBoxModelodeCoche.addItem("Isuzu");
                 this.jComboBoxModelodeCoche.addItem("GMC");
                 this.jComboBoxModelodeCoche.addItem("Hino");  
                 this.jComboBoxModelodeCoche.addItem("Hummer");
                 this.jComboBoxModelodeCoche.addItem("Mack Trucks");
                 this.jComboBoxModelodeCoche.addItem("Ford");
                 this.jComboBoxCilindrada.addItem("3000");
                 this.jComboBoxCilindrada.addItem("4000");
                 this.jComboBoxCilindrada.addItem("5000");
                 this.jComboBoxCilindrada.addItem("6000");
                 SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
                 modeloSpinner.setMaximum(16);
                 modeloSpinner.setMinimum(4);
                 modeloSpinner.setValue(4);
                 this.jSpinner2.setModel(modeloSpinner);
                
                 SpinnerNumberModel modeloSpinner1 = new SpinnerNumberModel();
                 modeloSpinner1.setMaximum(30);
                  modeloSpinner1.setMinimum(1);
                   modeloSpinner1.setValue(10);
                   this.jSpinner3.setModel(modeloSpinner1);
                   
            }
                  
    
}
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
combobox();
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMatriculaCocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaCocheKeyTyped
       
    }//GEN-LAST:event_txtMatriculaCocheKeyTyped

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        char TipodeTecla= evt.getKeyChar();
        if(Character.isDigit(TipodeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyTyped
         char TipodeTecla= evt.getKeyChar();
        if(!Character.isDigit(TipodeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtKilometrajeKeyTyped

    private void jSpinner1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyTyped
char TipodeTecla= evt.getKeyChar();
        if(!Character.isDigit(TipodeTecla)){
            evt.consume();
        }        
    }//GEN-LAST:event_jSpinner1KeyTyped

    private void jSpinner2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner2KeyTyped
        char TipodeTecla= evt.getKeyChar();
        if(!Character.isDigit(TipodeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_jSpinner2KeyTyped

    private void jSpinner3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner3KeyTyped
       char TipodeTecla= evt.getKeyChar();
        if(!Character.isDigit(TipodeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_jSpinner3KeyTyped

    private void jButtonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarActionPerformed
        if((this.jComboBox1.getSelectedItem().equals("Coche")||(this.jComboBox1.getSelectedItem().equals("Bus")))){
            this.jSpinner1.setEnabled(true);
            this.jSpinner2.setEnabled(false);
            this.jSpinner3.setEnabled(false);
        }else if((this.jComboBox1.getSelectedItem().equals("Camión")||(this.jComboBox1.getSelectedItem().equals("Furgoneta")))){
             this.jSpinner1.setEnabled(false);
            this.jSpinner2.setEnabled(true);
            this.jSpinner3.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonConfigurarActionPerformed
private void jcomboBox1(){
    this.jComboBox1.addItem("ESCOJA TIPO VEHICULO");
    this.jComboBox1.addItem("Coche");
      this.jComboBox1.addItem("Bus");
      this.jComboBox1.addItem("Furgoneta");
      this.jComboBox1.addItem("Camión");
}
    private void comboBoxMarca(){
         String marc="9ff\n" +"Abarth\n" +"Abt\n" +"AC Propulsion\n" +"AC Schnitzer\n" +"AC\n" +"Acoma\n" +
"Acrea\n" +"Acura\n" +"A:level\n" +"Adams Probe\n" +"Aero Willys\n" +"Aixam\n" +"Aleko\n" +"Alessi\n" +"Alfa Romeo\n" +
"Allard\n" +"Alpina\n" +"Alvis\n" +"AMC\n" +"American Bamtan\n" +"Amoritz\n" +"Anadol\n" +"Anibal\n" +"Anteros\n" +
"Apal\n" +"Apollo\n" +"Aptera\n" +"AQC\n" +"Aquila\n" +"Arash\n" +"Arex\n" +"Argyll\n" +"ARH\n" +"Ariel Atom\n" +"Arkley\n" +
"Armstrong Siddeley\n" +"Arnold Bristol\n" +"ARO\n" +"Arrinera\n" +"Arta Garaiya\n" +"Artega\n" +"Artés\n" +"Asardo\n" +
"Ascari\n" +"Ashok Leyland\n" +"Asia Motors\n" +"ASL\n" +"Aspid\n" +"Aston Martin\n" +"Astra\n" +"Atalanta\n" +"ATS\n" +
"Auburn\n" +"Audi\n" +"Austin\n" +"Auto Avio\n" +"Autobacs\n" +"Autobianchi\n" +"Autocars\n" +"Autozam\n" +"Auverland\n" +
"Avia\n" +"Aymesa\n" +"B. engineering\n" +"Bac\n" +"Bag Splitz\n" +"Bajaj\n" +"Ballot\n" +"Bandini\n" +"Baojun\n" +"Bargon\n" +
"Baw\n" +"Beck\n" +"Bell Aurens\n" +"Bell-Ross\n" +"Bellier\n" +"Belumbury\n" +"Bentley\n" +"Berkeley\n" +"Bertone\n" +"BF Performance\n" +
"Bill Tomas\n" +"Birkin\n" +"Bitter\n" +"Bizzarrini\n" +"Blakely\n" +"Bmw\n" +"Bohse\n" +"Bolwell\n" +"Bond\n" +"Borgward\n" +"Brabham\n" +
"Brabus\n" +"Breckland\n" +"Bricklin\n" +"Brilliance\n" +"Bristol\n" +"Brokernet\n" +"Bucciali\n" +"Bufori\n" +"Bugatti\n" +"Buick\n" +"Bulldog\n" +
"Burgfalke\n" +"BYD\n" +"Cadillac\n" +"Callaway\n" +"Camo Marauder\n" +"Campagna\n" +"Caparo\n" +"Capstone\n" +"Carbontech\n" +"Cardi\n" +
"Carice\n" +"Carlsson\n" +"Carver One\n" +"Casalini\n" +"Case\n" +"Castagna\n" +"Caterham\n" +"Caterpillar\n" +"Chana\n" +"Changan\n" +
"Changfeng\n" +"Checker\n" +"Chery\n" +"Chevrolet\n" +"Chrysler\n" +"Citröen\n" +"Cizeta\n" +"Clan\n" +"Clenet\n" +"Climax\n" +"Clua\n" +
"Coda\n" +"Comarth\n" +"Condor Aguzzoli\n" +"Connaught\n" +"Conquest Knight\n" +"Corbin\n" +"Cord\n" +"Covini\n" +"Crosley\n" +"Cross Lander\n" +
"Cunninham\n" +"Dacia\n" +"Daewoo\n" +"DAF\n" +"Daihatsu\n" +"Dare\n" +"Darl´Mat\n" +"Dartmoor\n" +"Dartz\n" +"Datsun\n" +"David Brown Automotive\n" +
"Davis\n" +"DB\n" +"DC Desing\n" +"DDR\n" +"De Dion\n" +"De La Chapelle\n" +"De Macross\n" +"De Tomaso\n" +"Dean Jefries\n" +"Delage\n" +
"Delahaye\n" +"Delfino\n" +"Delorean\n" +"Deronda\n" +"Derways\n" +"Desoto\n" +"Detroit Electric\n" +"Devaux\n" +"Devel\n" +"Devon\n" +
"Diatto\n" +"Didia\n" +"Divco\n" +"DKW\n" +"Dodge\n" +"Dome\n" +"Dongfeng\n" +"Donkervoort\n" +"Duesenberg\n" +"Ebbro Btec\n" +"EDAG\n" +
"Edo\n" +"Edsel\n" +"Eagle\n" +"Elfin\n" +"Elio Motors\n" +"Elva\n" +"Emme\n" +"Enzman\n" +"ERF\n" +"Ermini\n" +"Eterniti\n" +"EuropeStar\n" +
"Evante\n" +"Evans\n" +"E-Wolf\n" +"Exagon\n" +"Facel Vega\n" +"Fairthorpe\n" +"Falcon\n" +"falhke\n" +"Faralli & Mazzanti\n" +"Farbio\n" +
"Farboud\n" +"Farus\n" +"Faw\n" +"Felino\n" +"Fenix Automotive\n" +"Ferrari\n" +"Ferves\n" +"Fiat\n" +"Fiberfab\n" +"Fioravanti\n" +"Fisher\n" +
"Fisker\n" +"Flajole\n" +"FM Auto\n" +"Force\n" +"Ford\n" +"Fornasari\n" +"Four Stroke\n" +"Fournier\n" +"FPV\n" +"Francis Lombardi\n" +"Franklin\n" +
"FreeStream\n" +"Freightliner\n" +"Gaz\n" +"Galloper\n" +"GD\n" +"Geely\n" +"Geiger\n" +"Gemballa\n" +"Genevart\n" +"Genty\n" +"Ghia\n" +"Gibbs\n" +
"Gillet\n" +"Ginetta\n" +"Glas\n" +"Glasspar\n" +"GM\n" +"GMC\n" +"Gonow\n" +"Gordini\n" +"Gordon Kleebe\n" +"Gordon Murray\n" +"Graham-Paige\n" +
"Great Wall\n" +"Grecav\n" +"Griffith\n" +"GTA\n" +"GTM\n" +"Gumpert\n" +"Gurgel\n" +"GWA\n" +"Haima\n" +"Hamann\n" +"Heffner Performance\n" +"Henry J\n" +
"Hennessey\n" +"Heuliez\n" +"Hillman\n" +"Hindustan\n" +"Hino\n" +"Hispano Suiza\n" +"HMC\n" +"Hoftetter\n" +"Holden\n" +"Hommell\n" +"Honda\n" +
"Hongqi\n" +"Horch\n" +"Hotchkiss\n" +"HSV\n" +"HTT\n" +"Hulme\n" +"Humber\n" +"Hummer\n" +"Hurtan\n" +"Hyundai\n" +"Jiotto\n" +"Joss\n" +"Jösse\n" +
"Justicialista\n" +"Lanchester\n" +"Lancia\n" +"Land Rover\n" +"Landwind\n" +"Laraki\n" +"LCC\n" +"LDV\n" +"Le Marquis\n" +"Le Blanc\n" +
"Lea Francis\n" +"Lola\n" +"Lombardi\n" +"Loremo\n" +"Lotec\n" +"Lotus\n" +"Lucra\n" +"Luxgen\n" +"Marcadier\n" +"Marcos\n" +"Marlin\n" +
"Marmon\n" +"Marussia\n" +"Maserati\n" +"Mastretta\n" +"Mathis\n" +"Matra\n" +"Maybach\n" +"MAZ\n" +"Mazda\n" +"Mazel\n" +"MB Roadcars\n" +
"MCA\n" +"McLaren\n" +"MCV\n" +"Mega\n" +"Melkus\n" +"Mercedez Benz\n" +"Mercer\n" +"Mercury\n" +"Monteverdi\n" +"Morgan\n" +"Mosler\n" +
"Mostro Di Potenza\n" +"Mullen\n" +"Nami\n" +"Nardi Española\n" +"Panoz\n" +"Panther\n" +"Parradine\n" +"Pars Khodro\n" +"Pontiac\n" +
"Porsche\n" +"Praga\n" +"Prince\n" +"Proton\n" +"Protoscar\n" +"PTG\n" +"Renauld\n" +"Renauld Alpine\n" +"Rene Bonnet\n" +"RENNtech\n" +
"Reo\n" +"Rezvani\n" +"Riley & Scott\n" +"Riley\n" +"Rimac\n" +"Rinho\n" +"Rinspeed\n" +"Robur\n" +"Saleem\n" +"Salmson\n" +"Samsung\n" +
"Skoda\n" +"Smart\n" +"Soueast\n" +"Spada\n" +"Studio Torino\n" +"Stutz\n" +"Subaru\n" +"Sunbean\n" +"Sunred\n" +"Superlite\n" +
"Trident\n" +"Triumph\n" +"Troller\n" +"Tucker\n" +"Tushek\n" +"TVR\n" +"UAZ\n" +"Ultima\n" +"UMM\n" +"Unipower\n" +"URI\n" +"URO\n" +
"Valmet\n" +"Vision\n" +"Voisin\n" +"Volga\n" +"Volkswagen\n" +"Volvo\n" +"Vortex\n" +"Zagato\n" +"Zap\n" +"Zarooq\n" +"Zavasta\n" +
"ZAZ\n" +"Zender\n" +"Zenos\n" +"Zenvo\n" +"Zeus Twelve\n" +"Zil\n" +"Zimmer\n" +"Zinoro\n" +"Zolfe\n" +"Zotye ";
        String o[] = new String [623];
        o=marc.split("\n");
        for (int i = 0; i < o.length; i++) {
            this.jComboBoxModelodeCoche.addItem(o[i]);
        }
       
    }
    
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
            java.util.logging.Logger.getLogger(jfrVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new jfrVehiculo().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(jfrVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(jfrVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCoche;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfigurar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxCilindrada;
    private javax.swing.JComboBox<String> jComboBoxModelodeCoche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDiesel;
    private javax.swing.JRadioButton jRadioButtonGas;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMatriculaCoche;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
