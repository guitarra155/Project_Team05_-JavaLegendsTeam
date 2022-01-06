package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.controller.ControlMenu;
import ec.edu.espe.MedicalPro.view.Principal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.model.ModelPre;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JInternalFrame;
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

public class ViewMenu extends javax.swing.JFrame implements Observer{
    private ModelPre model;
    private ControlMenu control;
    
    public ViewMenu() {
        initComponents();
        this.setSize(this.getSize());
        this.setTitle("Medical Appointment System");
    }

    public ModelPre getModel() {
        return model;
    }

    public void setModel(ModelPre model) {
        this.model = model;
        model.addObserver(this);
    }

    public ControlMenu getControl() {
        return control;
    }

    public void setControl(ControlMenu control) {
        this.control = control;
    }

    @Override
    public void update(Observable o, Object o1) {
        Personal f = model.getF();
        nombre.setText(f.getNombre());
        ape1.setText(f.getApellido1());
        ape2.setText(f.getApellido2());
        ced.setText(f.getCedula());
        int r = f.getRol();
        if(r == 1){
            admi.setEnabled(true);
        }else{
            admi.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        panel = new javax.swing.JDesktopPane();
        nombre = new javax.swing.JLabel();
        ape1 = new javax.swing.JLabel();
        ape2 = new javax.swing.JLabel();
        ced = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        administrador = new javax.swing.JMenu();
        inter = new javax.swing.JMenuItem();
        admi = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setMinimumSize(new java.awt.Dimension(95, 34));
        panel.setPreferredSize(new java.awt.Dimension(799, 589));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("jLabel1");
        panel.add(nombre);
        nombre.setBounds(110, 10, 150, 20);

        ape1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ape1.setForeground(new java.awt.Color(255, 255, 255));
        ape1.setText("jLabel1");
        panel.add(ape1);
        ape1.setBounds(420, 10, 120, 20);

        ape2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ape2.setForeground(new java.awt.Color(255, 255, 255));
        ape2.setText("jLabel1");
        panel.add(ape2);
        ape2.setBounds(270, 10, 130, 20);

        ced.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ced.setForeground(new java.awt.Color(255, 255, 255));
        ced.setText("jLabel1");
        panel.add(ced);
        ced.setBounds(640, 10, 110, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO:");
        panel.add(jLabel1);
        jLabel1.setBounds(550, 10, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES :");
        panel.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 20);

        jMenu1.setText("Get out");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        administrador.setText("Management");

        inter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        inter.setText("Patients");
        inter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interActionPerformed(evt);
            }
        });
        administrador.add(inter);

        admi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        admi.setText("Administrative");
        admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiActionPerformed(evt);
            }
        });
        administrador.add(admi);

        menuBar.add(administrador);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        ec.edu.espe.MedicalPro.model.ModelData.getInstance().guardar();
        control.reabrir();
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiActionPerformed
        Principal.CONTROLF.init();
    }//GEN-LAST:event_admiActionPerformed

    private void interActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interActionPerformed
        control.initInternos();
    }//GEN-LAST:event_interActionPerformed

    public void addInternalFrame(JInternalFrame f){
        this.panel.add(f);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admi;
    private javax.swing.JMenu administrador;
    private javax.swing.JLabel ape1;
    private javax.swing.JLabel ape2;
    private javax.swing.JLabel ced;
    private javax.swing.JMenuItem inter;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nombre;
    private javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables


}
