/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Proyecto
 */
public class FormGestionPacientes extends javax.swing.JFrame {
    Menu menu;
    PacientesTableModel ptm = new PacientesTableModel();
    
    //Valores antiguos para editar
    String numero1;
    String nombre1;
    String apellido1;
    String telefono1;
    String direccion1;
    String mutua1;
    /**
     * Creates new form FormGestionPacientes
     */
    public FormGestionPacientes() {
        initComponents();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblNum = new javax.swing.JLabel();
        txtRegNum = new javax.swing.JTextField();
        lblNom = new javax.swing.JLabel();
        txtRegNom = new javax.swing.JTextField();
        lblApe = new javax.swing.JLabel();
        txtRegApe = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtRegTel = new javax.swing.JTextField();
        lblDir = new javax.swing.JLabel();
        txtRegDir = new javax.swing.JTextField();
        lblMut = new javax.swing.JLabel();
        txtRegMut = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBuscarPaciente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBusNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBusNom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBusApe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBusTel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBusDir = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBusMut = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(941, 500));

        lblNum.setText("Número");

        txtRegNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegNumKeyTyped(evt);
            }
        });

        lblNom.setText("Nombre");

        lblApe.setText("Apellido");

        lblTel.setText("Teléfono");

        lblDir.setText("Dirección");

        lblMut.setText("Mutua");

        tblPacientes.setModel(ptm);
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum)
                            .addComponent(lblNom)
                            .addComponent(lblApe)
                            .addComponent(lblDir)
                            .addComponent(lblMut)
                            .addComponent(lblTel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRegNom, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtRegMut)
                                        .addComponent(txtRegNum))
                                    .addComponent(txtRegApe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtRegTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRegDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(242, 242, 242))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(txtRegNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtRegNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApe)
                    .addComponent(txtRegApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMut)
                    .addComponent(txtRegMut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestionar pacientes", jPanel2);

        tblBuscarPaciente.setModel(ptm);
        jScrollPane3.setViewportView(tblBuscarPaciente);

        jLabel7.setText("Filtros:");

        jLabel8.setText("Número");

        txtBusNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusNumKeyTyped(evt);
            }
        });

        jLabel9.setText("Nombre");

        txtBusNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusNomKeyReleased(evt);
            }
        });

        jLabel10.setText("Apellido");

        txtBusApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusApeKeyReleased(evt);
            }
        });

        jLabel11.setText("Teléfono");

        txtBusTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusTelKeyReleased(evt);
            }
        });

        jLabel12.setText("Dirección");

        txtBusDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusDirKeyReleased(evt);
            }
        });

        jLabel13.setText("Mutua");

        txtBusMut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusMutKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusNom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBusTel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBusMut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBusApe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(txtBusDir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBusNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(txtBusDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtBusNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtBusMut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBusTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar paciente", jPanel3);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String numero = txtRegNum.getText();
        String nombre = txtRegNom.getText();
        String apellido = txtRegApe.getText();
        String telefono = txtRegTel.getText();
        String direccion = txtRegDir.getText();
        String mutua = txtRegMut.getText();
        if(numero.equals("") || nombre.equals("") || apellido.equals("") || telefono.equals("") || direccion.equals("") || mutua.equals("")){
            JOptionPane.showMessageDialog(
                this,
                "Por favor complete todos los campos",
                "No se pudo registrar al paciente",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                String cmd = String.format("insert into malade(numero, nom, prenom, adresse, tel, mutuelle) values(%s, '%s', '%s', '%s', '%s', '%s')", numero, apellido, nombre, direccion, telefono, mutua);
                new Conexion().ejecutarQuery(cmd);
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
        limpiar();
        ptm = new PacientesTableModel();
        tblPacientes.setModel(ptm);
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            txtRegNum.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 0));
            txtRegNom.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 1));
            txtRegApe.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 2));
            txtRegTel.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 3));
            txtRegDir.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 4));
            txtRegMut.setText(""+tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 5));
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
        numero1 = txtRegNum.getText();
        nombre1 = txtRegNom.getText();
        apellido1 = txtRegApe.getText();
        telefono1 = txtRegTel.getText();
        direccion1 = txtRegDir.getText();
        mutua1 = txtRegMut.getText();
    }//GEN-LAST:event_tblPacientesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        String numero2 = txtRegNum.getText();
        String nombre2 = txtRegNom.getText();
        String apellido2 = txtRegApe.getText();
        String telefono2 = txtRegTel.getText();
        String direccion2 = txtRegDir.getText();
        String mutua2 = txtRegMut.getText();

        String cmd = String.format("update malade set numero=%s, nom='%s', prenom='%s', adresse='%s', tel='%s', mutuelle='%s' where numero=%s and nom='%s' and prenom='%s' and adresse='%s' and tel='%s' and mutuelle='%s'", numero2, apellido2, nombre2, direccion2, telefono2, mutua2, numero1, apellido1, nombre1, direccion1, telefono1, mutua1);
        try {
            if (JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de modificar este registro?",
                "Modificar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new Conexion().ejecutarQuery(cmd);
            limpiar();
        }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        //new Conexion().ejecutarQuery(cmd);
        limpiar();
        ptm = new PacientesTableModel();
        tblPacientes.setModel(ptm);
        tblBuscarPaciente.setModel(ptm);
        
        btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String numero = txtRegNum.getText();
        String nombre = txtRegNom.getText();
        String apellido = txtRegApe.getText();
        String telefono = txtRegTel.getText();
        String direccion = txtRegDir.getText();
        String mutua = txtRegMut.getText();

        String cmd = String.format(
            "delete from malade where numero=%s and nom='%s' and prenom='%s' and adresse='%s' and tel='%s' and mutuelle='%s'",
            numero, apellido, nombre, direccion, telefono, mutua);
        try {
            if (JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de eliminar este registro?",
                "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            new Conexion().ejecutarQuery(cmd);
            limpiar();
        }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        limpiar();
        ptm = new PacientesTableModel();
        tblPacientes.setModel(ptm);
        tblBuscarPaciente.setModel(ptm);
        
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNumKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusNumKeyReleased

    private void txtBusNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNomKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusNomKeyReleased

    private void txtBusApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusApeKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusApeKeyReleased

    private void txtBusTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusTelKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusTelKeyReleased

    private void txtBusDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusDirKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusDirKeyReleased

    private void txtBusMutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusMutKeyReleased
        // TODO add your handling code here:
        ptm = new PacientesTableModel(txtBusNum.getText(),txtBusNom.getText(), txtBusApe.getText(), txtBusTel.getText(), txtBusDir.getText(), txtBusMut.getText());
        tblBuscarPaciente.setModel(ptm);
    }//GEN-LAST:event_txtBusMutKeyReleased

    private void txtRegNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNumKeyTyped
        // TODO add your handling code here:
        //Para permitir solo números
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')
            evt.consume();
    }//GEN-LAST:event_txtRegNumKeyTyped

    private void txtBusNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNumKeyTyped
        // TODO add your handling code here:
        //Para permitir solo números
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')
            evt.consume();
        
    }//GEN-LAST:event_txtBusNumKeyTyped

    
    
    private void limpiar(){
        txtRegNum.setText("");
        txtRegNom.setText("");
        txtRegApe.setText("");
        txtRegTel.setText("");
        txtRegDir.setText("");
        txtRegMut.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(FormGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGestionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGestionPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblMut;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tblBuscarPaciente;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtBusApe;
    private javax.swing.JTextField txtBusDir;
    private javax.swing.JTextField txtBusMut;
    private javax.swing.JTextField txtBusNom;
    private javax.swing.JTextField txtBusNum;
    private javax.swing.JTextField txtBusTel;
    private javax.swing.JTextField txtRegApe;
    private javax.swing.JTextField txtRegDir;
    private javax.swing.JTextField txtRegMut;
    private javax.swing.JTextField txtRegNom;
    private javax.swing.JTextField txtRegNum;
    private javax.swing.JTextField txtRegTel;
    // End of variables declaration//GEN-END:variables
}
