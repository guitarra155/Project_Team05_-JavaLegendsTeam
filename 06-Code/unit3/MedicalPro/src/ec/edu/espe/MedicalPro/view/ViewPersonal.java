package ec.edu.espe.MedicalPro.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.MedicalPro.controller.ControlPersonal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.model.ModelF;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti 
 * Guzman 
 * Guitarra 
 * Landazuri 
 * Lincango
 * 
 */
public class ViewPersonal extends javax.swing.JInternalFrame implements Observer {

    MongoCollection<Document> ListPersonal = new Connection().obtenerDB().getCollection("PersonalsMedicalPro");
    private ModelF model;
    private ControlPersonal control;

    public ViewPersonal() {
        initComponents();
        desahabilitar();
    }

    public ModelF getModel() {
        return model;
    }

    public void setModel(ModelF model) {
        this.model = model;
        model.addObserver(this);
    }

    public ControlPersonal getControl() {
        return control;
    }

    public void setControl(ControlPersonal control) {
        this.control = control;
    }

    @Override
    public void update(Observable o, Object o1) {
        Personal f = model.getFuntion();
        if (model.isEdit()) {
            ahabilitar();
            txtDocumentIdPersonal.setEnabled(true);
        }
        tablita.setModel(model.getColumns());
        textNamePersonal.setText(f.getName());
        txtFirstNameFather.setText(f.getFatherLastName());
        txtLastNameMother.setText(f.getMotherLastName());
        txtDocumentIdPersonal.setText(f.getDocumentId());
        txtPasswordPersonal.setText(f.getPassword());
        txtUserPersonal.setText(f.getUsername());
        lstTypeOfCharge.setSelectedIndex(f.getRol());
        textBuscar.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom3 = new javax.swing.JLabel();
        textNamePersonal = new javax.swing.JTextField();
        ape7 = new javax.swing.JLabel();
        txtFirstNameFather = new javax.swing.JTextField();
        ape8 = new javax.swing.JLabel();
        txtLastNameMother = new javax.swing.JTextField();
        ced3 = new javax.swing.JLabel();
        txtDocumentIdPersonal = new javax.swing.JTextField();
        btnAddPersonal = new javax.swing.JButton();
        btnNewPersonal = new javax.swing.JButton();
        btnCancelPersonal = new javax.swing.JButton();
        ced4 = new javax.swing.JLabel();
        lstTypeOfCharge = new javax.swing.JComboBox<>();
        ced5 = new javax.swing.JLabel();
        txtUserPersonal = new javax.swing.JTextField();
        ced6 = new javax.swing.JLabel();
        txtPasswordPersonal = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        textBuscar = new javax.swing.JTextField();
        btnSearchPersonal = new javax.swing.JButton();
        btnRemoveFunctionari = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        nom3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nom3.setText("Name");

        textNamePersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textNamePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamePersonalActionPerformed(evt);
            }
        });

        ape7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape7.setText("Father Last Name");

        txtFirstNameFather.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ape8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ape8.setText("Mother Last Name");

        txtLastNameMother.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced3.setText("Document ID");

        txtDocumentIdPersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAddPersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddPersonal.setText("Add");
        btnAddPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonalActionPerformed(evt);
            }
        });

        btnNewPersonal.setText("New");
        btnNewPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPersonalActionPerformed(evt);
            }
        });

        btnCancelPersonal.setText("Cancel");
        btnCancelPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPersonalActionPerformed(evt);
            }
        });

        ced4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced4.setText("Type of charge");

        lstTypeOfCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretary", "Administrator", " " }));
        lstTypeOfCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstTypeOfChargeActionPerformed(evt);
            }
        });

        ced5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced5.setText("Username");

        txtUserPersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ced6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ced6.setText("Password");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS PERSONALES ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ced6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nom3)
                                    .addComponent(ape7))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstNameFather, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNamePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ced4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAddPersonal)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNewPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelPersonal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ced5)
                                    .addComponent(ape8)
                                    .addComponent(ced3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocumentIdPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastNameMother, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lstTypeOfCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPasswordPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom3)
                    .addComponent(textNamePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape7)
                    .addComponent(txtFirstNameFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastNameMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ape8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced3)
                    .addComponent(txtDocumentIdPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced4)
                    .addComponent(lstTypeOfCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ced5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ced6)
                    .addComponent(txtPasswordPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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

        btnSearchPersonal.setText("Search");
        btnSearchPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonalActionPerformed(evt);
            }
        });

        btnRemoveFunctionari.setText("Remove");
        btnRemoveFunctionari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFunctionariActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Personal List");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Don't erase Edison");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearchPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveFunctionari, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRemoveFunctionari, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean valida(String nom, String ape1, String ape2, String ced, String user, String pass) {
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
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Userbame");
            return false;
        }
        if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Password");
            return false;
        }
        return true;
    }

    private void desahabilitar() {
        txtFirstNameFather.setEnabled(false);
        txtLastNameMother.setEnabled(false);
        txtDocumentIdPersonal.setEnabled(false);
        textNamePersonal.setEnabled(false);
        txtUserPersonal.setEnabled(false);
        txtPasswordPersonal.setEnabled(false);
    }

    private void ahabilitar() {
        txtFirstNameFather.setEnabled(true);
        txtLastNameMother.setEnabled(true);
        txtDocumentIdPersonal.setEnabled(true);
        textNamePersonal.setEnabled(true);
        txtUserPersonal.setEnabled(true);
        txtPasswordPersonal.setEnabled(true);
    }

    private void btnAddPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonalActionPerformed
        InsertNewPatient();
        desahabilitar();
    }//GEN-LAST:event_btnAddPersonalActionPerformed
    public void InsertNewPatient() {
        String nom = textNamePersonal.getText();
        String ape1 = txtFirstNameFather.getText();
        String ape2 = txtLastNameMother.getText();
        String ced = txtDocumentIdPersonal.getText();
        String user = txtUserPersonal.getText();
        String pass = txtPasswordPersonal.getText();
        int rol = lstTypeOfCharge.getSelectedIndex();
        String rolPersonal = "";
        if (rol == 1) {
            rolPersonal = "Secretary";
        } else if (rol == 2) {
            rolPersonal = "Administrator";
        }
        try {
            Document data = new Document();
            data.put("Name", nom);
            data.put("Father Last Name", ape1);
            data.put("Mother Last Name", ape2);
            data.put("Document ID", Integer.parseInt(ced));
            data.put("Official's role", rolPersonal);
            data.put("User Personal", user);
            data.put("User Password", Integer.parseInt(pass));
            ListPersonal.insertOne(data);
            JOptionPane.showMessageDialog(this, "Successfully Insert Serie:" + Integer.parseInt(txtDocumentIdPersonal.getText().toString()));
            control.add(model.isEdit(), nom, ape1, ape2, ced, rol, user, pass);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }


    private void btnNewPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPersonalActionPerformed
        ahabilitar();
    }//GEN-LAST:event_btnNewPersonalActionPerformed

    private void btnCancelPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPersonalActionPerformed
        control.cancel();
        desahabilitar();
    }//GEN-LAST:event_btnCancelPersonalActionPerformed

    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        if (evt.getClickCount() == 2) {
            control.eddit();
            int row = tablita.getSelectedRow();
            control.recoverEditable(row);
        }
    }//GEN-LAST:event_tablitaMouseClicked

    private void btnSearchPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonalActionPerformed
        String b = textBuscar.getText();
        if (!b.isEmpty()) {
            control.searchPersonal(b);
        } else {
            control.solTodos();
        }
    }//GEN-LAST:event_btnSearchPersonalActionPerformed

    private void btnRemoveFunctionariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFunctionariActionPerformed
        DeleteSelected();
//        int row = tablita.getSelectedRow();
//        String idRemove = tablita.getValueAt(row, 0).toString();
//        int option = JOptionPane.showConfirmDialog(this, "are you sure you want to eliminate whit Serie :" + tablita.getValueAt(tablita.getSelectedRow(), 2).toString());
//        if (option == 0) {
//            Delete();
//            control.delete(row);
//        }
//        if (option == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(this, "Series :" + tablita.getValueAt(tablita.getSelectedRow(), 2).toString() + ", not deleted");
//        }
    }//GEN-LAST:event_btnRemoveFunctionariActionPerformed

    public boolean Delete() {
        try {
            Document filter = new Document();
            int id = Integer.valueOf(tablita.getValueAt(tablita.getSelectedRow(), 3).toString());
            filter.put("Document ID", id);
            ListPersonal.findOneAndDelete(filter);
            JOptionPane.showMessageDialog(this, "Successfully Removed:" + id);
            return true;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
            return false;
        }
    }

    public void DeleteSelected() {
        int row = tablita.getSelectedRow();
        int option;
        String idRemove = tablita.getValueAt(row, 0).toString();
        option = JOptionPane.showConfirmDialog(this, "are you sure you want to eliminate whit Serie :" + tablita.getValueAt(tablita.getSelectedRow(), 3).toString());
        if (option == 0) {
            Delete();
            control.delete(row);
        }
        if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Series :" + tablita.getValueAt(tablita.getSelectedRow(), 3).toString() + ", not deleted");
        }
    }
    private void lstTypeOfChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstTypeOfChargeActionPerformed

    }//GEN-LAST:event_lstTypeOfChargeActionPerformed

    private void textNamePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamePersonalActionPerformed

    }//GEN-LAST:event_textNamePersonalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape7;
    private javax.swing.JLabel ape8;
    private javax.swing.JButton btnAddPersonal;
    private javax.swing.JButton btnCancelPersonal;
    private javax.swing.JButton btnNewPersonal;
    private javax.swing.JButton btnRemoveFunctionari;
    private javax.swing.JButton btnSearchPersonal;
    private javax.swing.JLabel ced3;
    private javax.swing.JLabel ced4;
    private javax.swing.JLabel ced5;
    private javax.swing.JLabel ced6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lstTypeOfCharge;
    private javax.swing.JLabel nom3;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textNamePersonal;
    private javax.swing.JTextField txtDocumentIdPersonal;
    private javax.swing.JTextField txtFirstNameFather;
    private javax.swing.JTextField txtLastNameMother;
    private javax.swing.JPasswordField txtPasswordPersonal;
    private javax.swing.JTextField txtUserPersonal;
    // End of variables declaration//GEN-END:variables
}
