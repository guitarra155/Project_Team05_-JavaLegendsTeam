package ec.edu.espe.MedicalPro.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.MedicalPro.controller.ControlPatient;
import ec.edu.espe.MedicalPro.controller.Patient;
import ec.edu.espe.MedicalPro.model.ModelI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;
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
    MongoCollection<Document> ListPatients = new Connection().obtenerDB().getCollection("PatientsMedicalPro");
    private ModelI model;
    private ControlPatient control;
    
    DefaultTableModel table = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    

    public ViewPatient() {
        initComponents();
        table.addColumn("ID Cloud");
        table.addColumn("Name");
        table.addColumn("Father Last Name");
        table.addColumn("Mother Last Name");
        table.addColumn("Document ID");
        table.addColumn("Date of admission");
        table.addColumn("Diagnosis");
        tablePatients.setModel(table);
//        desahabilitar();
    }

    public ModelI getModel() {
        return model;
    }

    private void ahabilitar() {
        txtFirstLastName.setEnabled(true);
        txtSecondLastName.setEnabled(true);
        txtDocumentId.setEnabled(true);
        txtName.setEnabled(true);
        txtDateOfBirth.setEnabled(true);
        txtDiagnosis.setEnabled(true);
    }

    private void desahabilitar() {
        txtFirstLastName.setEnabled(false);
        txtSecondLastName.setEnabled(false);
        txtDocumentId.setEnabled(false);
        txtName.setEnabled(false);
        txtDateOfBirth.setEnabled(false);
        txtDiagnosis.setEnabled(false);
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
//            ahabilitar();
            txtDocumentId.setEnabled(false);
        }
        txtFirstLastName.setText(p.getFatherLastName());
        txtSecondLastName.setText(p.getMotherLastName());
        txtName.setText(p.getName());
        txtDocumentId.setText(p.getDocumentId());
        txtDiagnosis.setText(p.getDiagnosis());
        tablePatients.setModel(model.getTable());
        txtSearch.setText("");
        if (p.getDate() != null) {
            try {
                java.util.Date fe = new SimpleDateFormat("dd/MM/yyyy").parse(p.getDate());
                txtDateOfBirth.setValue(fe);
            } catch (ParseException ex) {
                Logger.getLogger(ViewPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtDateOfBirth.setValue(new Date());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        ape1 = new javax.swing.JLabel();
        txtFirstLastName = new javax.swing.JTextField();
        ape2 = new javax.swing.JLabel();
        txtSecondLastName = new javax.swing.JTextField();
        ced = new javax.swing.JLabel();
        txtDocumentId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pato = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnosis = new javax.swing.JTextArea();
        txtDateOfBirth = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQueryValue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFinalValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePatients = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom.setText("Name");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape1.setText("Father Last Name");

        txtFirstLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape2.setText("Mother Last Name");

        txtSecondLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced.setText("Document ID");

        txtDocumentId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date of admission");

        pato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pato.setText("Diagnosis");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtDiagnosis.setColumns(20);
        txtDiagnosis.setRows(5);
        jScrollPane2.setViewportView(txtDiagnosis);

        txtDateOfBirth.setModel(new javax.swing.SpinnerDateModel());
        txtDateOfBirth.setEditor(new javax.swing.JSpinner.DateEditor(txtDateOfBirth, "dd/MM/yyyyy"));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Personal Information");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient");

        txtQueryValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueryValueActionPerformed(evt);
            }
        });

        jLabel4.setText("Query Value");

        txtFinalValue.setEnabled(false);

        jLabel7.setText("Final Value");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ape1)
                                    .addComponent(nom)
                                    .addComponent(ced)
                                    .addComponent(jLabel5)
                                    .addComponent(ape2))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDocumentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSecondLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFirstLastName, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFinalValue, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtQueryValue))))
                        .addContainerGap(37, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(21, 21, 21))
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
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape1)
                    .addComponent(txtFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape2)
                    .addComponent(txtSecondLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced)
                    .addComponent(txtDocumentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pato))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueryValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Patient");

        tablePatients.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablePatients);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String b = txtSearch.getText();
        if (!b.isEmpty()) {
            control.buscarPaciente(b);
        } else {
            control.solTodos();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int x = tablePatients.getSelectedRow();
        int option;
       option = JOptionPane.showConfirmDialog(this,"are you sure you want to eliminate whit Serie :"+tablePatients.getValueAt(tablePatients.getSelectedRow(),2).toString());
       if(option == 0){
            Delete();
            control.eliminar(x);
       }if(option == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(this,"Series :" + tablePatients.getValueAt(tablePatients.getSelectedRow(),2).toString()+", not deleted");
       }
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    public boolean Delete() {
        try {
            String id = tablePatients.getValueAt(tablePatients.getSelectedRow(), 3).toString();
            DeleteResult answer = ListPatients.deleteOne(new Document("Document ID", new ObjectId(id)));
            JOptionPane.showMessageDialog(this, "Successfully Removed:" + id);
            return true;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
            return false;
        }
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
//        control.cancelar();
        desahabilitar();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
//        control.cancelar();
        ahabilitar();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        String nom = txtName.getText();
        String ape1 = txtFirstLastName.getText();
        String ape2 = txtSecondLastName.getText();
        String ced = txtDocumentId.getText();
        String pato = txtDiagnosis.getText();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fe = formatter.format(txtDateOfBirth.getValue());
        
        InsertNewBed(fe);
        ShowAll();
        
    }//GEN-LAST:event_btnAddActionPerformed
 
    public void InsertNewBed(String date){
        try{
            Document data = new Document();
            data.put("Name", txtName.getText());
            data.put("Father Last Name", txtFirstLastName.getText());
            data.put("Mother Last Name", txtSecondLastName.getText());
            data.put("Document ID",Integer.parseInt(txtDocumentId.getText()));
            data.put("Date of admission",date);   
            data.put("Diagnosis",txtDiagnosis.getText());
            
            ListPatients.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully Insert Serie:" + Integer.parseInt(txtDocumentId.getText().toString()) );

            }catch(Exception err){

                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

            }
    }
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtQueryValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueryValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueryValueActionPerformed

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
       
    public void ShowAll() {
        try {
            MongoCursor<Document> contact = ListPatients.find().iterator();
            int total = table.getRowCount();
            for (int i = 0; i < total; i++) {
                table.removeRow(0);
            }
            while (contact.hasNext()) {
                ArrayList<Object> document = new ArrayList<Object>(contact.next().values());
                table.addRow(document.toArray());
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape1;
    private javax.swing.JLabel ape2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel ced;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel pato;
    private javax.swing.JTable tablePatients;
    private javax.swing.JSpinner txtDateOfBirth;
    private javax.swing.JTextArea txtDiagnosis;
    private javax.swing.JTextField txtDocumentId;
    private javax.swing.JTextField txtFinalValue;
    private javax.swing.JTextField txtFirstLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQueryValue;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSecondLastName;
    // End of variables declaration//GEN-END:variables

}
