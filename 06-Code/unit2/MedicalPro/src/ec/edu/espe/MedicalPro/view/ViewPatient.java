package ec.edu.espe.MedicalPro.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import ec.edu.espe.MedicalPro.controller.ControlPatient;
import ec.edu.espe.MedicalPro.controller.Patient;
import ec.edu.espe.MedicalPro.model.ModelI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class ViewPatient extends javax.swing.JInternalFrame implements Observer {

    private ModelI model;
    private ControlPatient control;

    public ViewPatient() {
        initComponents();
        desahabilitar();
    }

    public ModelI getModel() {
        return model;
    }

    private void ahabilitar() {
        textApe1.setEnabled(true);
        textApe2.setEnabled(true);
        textCed.setEnabled(true);
        textNombre.setEnabled(true);
        fecha.setEnabled(true);
        textArea.setEnabled(true);
    }

    private void desahabilitar() {
        textApe1.setEnabled(false);
        textApe2.setEnabled(false);
        textCed.setEnabled(false);
        textNombre.setEnabled(false);
        fecha.setEnabled(false);
        textArea.setEnabled(false);
    }

    public void setModel(ModelI model) {
        this.model = model;
        model.addObserver(this);
    }

    public ControlPatient getControl() {
        return control;
    }

    public void setControl(ControlPatient control) {
        this.control = control;
    }

    @Override
    public void update(Observable o, Object o1) {
        Patient p = model.getPatient();
        boolean e = model.isColumns();
        if (e) {
            ahabilitar();
            textCed.setEnabled(false);
        }
        textApe1.setText(p.getFatherLastName());
        textApe2.setText(p.getMotherLastName());
        textNombre.setText(p.getName());
        textCed.setText(p.getDocumentId());
        textArea.setText(p.getDiagnosis());
        tablita.setModel(model.getTable());
        textBuscar.setText("");
        if (p.getDate() != null) {
            try {
                java.util.Date fe = new SimpleDateFormat("dd/MM/yyyy").parse(p.getDate());
                fecha.setValue(fe);
            } catch (ParseException ex) {
                Logger.getLogger(ViewPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            fecha.setValue(new Date());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        ape1 = new javax.swing.JLabel();
        textApe1 = new javax.swing.JTextField();
        ape2 = new javax.swing.JLabel();
        textApe2 = new javax.swing.JTextField();
        ced = new javax.swing.JLabel();
        textCed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pato = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        fecha = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        textBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom.setText("Name");

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape1.setText("Father Last Name");

        textApe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape2.setText("Mother Last Name");

        textApe2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced.setText("Document ID");

        textCed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date of admission");

        pato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pato.setText("Diagnosis");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Save");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("New");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancel");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        fecha.setModel(new javax.swing.SpinnerDateModel());
        fecha.setEditor(new javax.swing.JSpinner.DateEditor(fecha, "dd/MM/yyyyy"));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Personal Information");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ape1)
                            .addComponent(nom)
                            .addComponent(ced)
                            .addComponent(jLabel5)
                            .addComponent(pato)
                            .addComponent(ape2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textApe2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(textApe1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(textCed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape1)
                    .addComponent(textApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape2)
                    .addComponent(textApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced)
                    .addComponent(textCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(pato)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addGap(63, 63, 63))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tablita.setModel(new javax.swing.table.DefaultTableModel(
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
        tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablita);

        textBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Patient");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean valida(String nom, String ape1, String ape2, String ced, String pato) {
        if (nom.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Name");
            return false;
        }
        if (ape1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Father Last Name");
            return false;
        }
        if (ape2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Mother Last Name");
            return false;
        }
        if (ced.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Document ID");
            return false;
        }
        if (pato.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Diagnosis");
            return false;
        }
        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String b = textBuscar.getText();
        if (!b.isEmpty()) {
            control.buscarPaciente(b);
        } else {
            control.solTodos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        if (evt.getClickCount() == 2) {
            control.editar();
            int row = tablita.getSelectedRow();
            control.recuperarEditable(row);
        }
    }//GEN-LAST:event_tablitaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = tablita.getSelectedRow();
        if (x >= 0) {
            String nameSelected = tablita.getValueAt(x,1).toString();
            System.out.println(nameSelected);
            MongoClient mongo = createConnection();
            DB db = mongo.getDB("DataBaseMedicalPro");
            EraseDataPatients(db,"PatientsMedicalPro",nameSelected);
            control.eliminar(x);
            } else {
            JOptionPane.showMessageDialog(null, "Choose the patient to eliminate");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void EraseDataPatients(DB db, String coleccion, String name) {
        DBCollection colec = db.getCollection(coleccion);
        colec.remove(new BasicDBObject().append("Name",name));
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        control.cancelar();
        desahabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        control.cancelar();
        ahabilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nom = textNombre.getText();
        String ape1 = textApe1.getText();
        String ape2 = textApe2.getText();
        String ced = textCed.getText();
        String pato = textArea.getText();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fe = formatter.format(fecha.getValue());
        
        if(valida(nom, ape1, ape2, ced, pato)){
            control.agregar(model.isColumns(), nom, ape1, ape2, ced, pato, fe); 
            MongoClient mongo = createConnection();
            DB db = mongo.getDB("DataBaseMedicalPro");
            System.out.println("DATABASE CREATED ");
            insertData(db,"PatientsMedicalPro",nom, ape1, ape2, ced, pato, fe);
            desahabilitar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void textBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarActionPerformed

public static MongoClient createConnection(){
        MongoClient mongoClient = new MongoClient( "localhost",27017); 
        return mongoClient;
    }
    
    public static void insertData(DB db,String collection,String name,String firstLastName,String secondtLastName,String id,String patology,String dateInfo){
        DBCollection colec = db.getCollection(collection);
        BasicDBObject documento = new BasicDBObject();
        documento.put("Name", name);
        documento.put("First Name", firstLastName);
        documento.put("Second Name", secondtLastName);
        documento.put("Identifi", id);
        documento.put("Patology", patology);
        documento.put("Date", dateInfo);
        colec.insert (documento);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape1;
    private javax.swing.JLabel ape2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel ced;
    private javax.swing.JSpinner fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel pato;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField textApe1;
    private javax.swing.JTextField textApe2;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textCed;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

}
