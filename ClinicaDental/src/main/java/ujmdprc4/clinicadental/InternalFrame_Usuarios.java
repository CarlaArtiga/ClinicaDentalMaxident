/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ujmdprc4.clinicadental;

import Clases.Usuarios;
import Conexion.Conexion;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class InternalFrame_Usuarios extends javax.swing.JInternalFrame {
    Usuarios usuario;

    /**
     * Creates new form InternalFrame_Usuarios
     */
    public InternalFrame_Usuarios() {
        initComponents();
        this.setSize(500, 500);
        Conexion c = new Conexion();
        c.EstableceConexion();
        usuario = new Usuarios();
        CargarDatos();
    }
    
    public void CargarDatos(){
        this.TablaUsuarios.setModel(usuario.cargarUsuarios());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        lblCodUsuario = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        rdbAdmin = new javax.swing.JRadioButton();
        rdbClient = new javax.swing.JRadioButton();
        btnInsertar = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

        lblCodUsuario.setText("Codigo:");

        txtCodUsuario.setEnabled(false);

        lblUsuario.setText("Usuario:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblClave.setText("Clave:");

        rdbAdmin.setText("Administrador");
        rdbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAdminActionPerformed(evt);
            }
        });

        rdbClient.setText("Cliente");
        rdbClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbClientActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(rdbAdmin)
                .addGap(12, 12, 12)
                .addComponent(rdbClient, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnInsertar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(7, 7, 7)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblCodUsuario))
                    .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbAdmin)
                    .addComponent(rdbClient))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void rdbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAdminActionPerformed
        // TODO add your handling code here:
        if(this.rdbAdmin.isSelected()){
            this.rdbClient.setSelected(false);
        }else{
            this.rdbClient.setSelected(true);
        }
    }//GEN-LAST:event_rdbAdminActionPerformed

    private void rdbClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbClientActionPerformed
        // TODO add your handling code here:
        if(this.rdbClient.isSelected()){
            this.rdbAdmin.setSelected(false);
        }else{
            this.rdbAdmin.setSelected(true);
        }
    }//GEN-LAST:event_rdbClientActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.txtCodUsuario.setText("");
        this.txtUsuario.setText("");
        this.txtClave.setText("");
        this.rdbAdmin.setSelected(false);
        this.rdbClient.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        Usuarios user = new Usuarios();
        String Usuario = this.txtUsuario.getText();
        String Contra = this.txtClave.getText();
        try{
            if(this.rdbAdmin.isSelected()){
               //String Activo = this.rdbActivo.getText(); 
               int Admin = 1;
                if(user.InsertarUser(Usuario,Contra,Admin)>0){
                    JOptionPane.showMessageDialog(null, "datos ingresados");
                    this.TablaUsuarios.setModel(usuario.cargarUsuarios());
                }
            }
            
            if(this.rdbClient.isSelected()){
                //String Desactivo = this.rdbDesactivo.getText();
                int cliente = 2;
                if(user.InsertarUser(Usuario, Contra, cliente)>0){
                    JOptionPane.showMessageDialog(null, "datos ingresados"); 
                    this.TablaUsuarios.setModel(usuario.cargarUsuarios());
                    
                }
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        // TODO add your handling code here:
        int seleccion = this.TablaUsuarios.getSelectedRow();
        this.txtCodUsuario.setText(this.TablaUsuarios.getValueAt(seleccion, 0).toString());
        this.txtUsuario.setText(this.TablaUsuarios.getValueAt(seleccion, 1).toString());
        this.txtClave.setText(this.TablaUsuarios.getValueAt(seleccion, 2).toString());
        String rol = this.TablaUsuarios.getValueAt(seleccion, 3).toString();
        if(rol.equals("1")){
            this.rdbAdmin.setSelected(true);
            this.rdbClient.setSelected(false);
        }else{
            this.rdbClient.setSelected(true);
            this.rdbAdmin.setSelected(false);
        }
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        //Actualizar
        Usuarios u = new Usuarios();
        int cod = parseInt(this.txtCodUsuario.getText());
        String user = this.txtUsuario.getText();
        String clave = this.txtClave.getText();
        try{
            if(this.rdbAdmin.isSelected()){
               //String Activo = this.rdbActivo.getText(); 
               int Admin = 1;
                if(u.ActualizarUser(user, clave, Admin, cod)>0){
                    JOptionPane.showMessageDialog(null, " datos modificados");
                    this.TablaUsuarios.setModel(usuario.cargarUsuarios());
                }
            }
            
            if(this.rdbClient.isSelected()){
                //String Desactivo = this.rdbDesactivo.getText();
                int cliente = 2;
                if(u.ActualizarUser(user, clave, cliente, cod)>0){
                    JOptionPane.showMessageDialog(null, "datos modificados"); 
                    this.TablaUsuarios.setModel(usuario.cargarUsuarios());
                    
                }
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        int cod = parseInt(this.txtCodUsuario.getText());
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        if(respuesta == JOptionPane.YES_OPTION){
            try{
                if(this.usuario.EliminarUsuario(cod)>0){
                    JOptionPane.showMessageDialog(null, "Datos eliminados");
                    this.CargarDatos();
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCodUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rdbAdmin;
    private javax.swing.JRadioButton rdbClient;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
