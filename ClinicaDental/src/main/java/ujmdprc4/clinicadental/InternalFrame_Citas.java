/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ujmdprc4.clinicadental;

import Clases.Citas;
import Clases.ComboCliente;
import Clases.ComboDentista;
import Clases.ComboProducto;
import Conexion.Conexion;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class InternalFrame_Citas extends javax.swing.JInternalFrame {
    Citas citas;

    /**
     * Creates new form InternalFrame_Citas
     */
    public InternalFrame_Citas() {
        initComponents();
        this.setSize(900, 400);
        this.jdcFecha.setDateFormatString(" yyyy.MM.dd hh:mm:ss");
        citas = new Citas();
        CargarDatos();
        LlenarComboCliente();
        LlenarComboProducto();
        LlenarComboDentista();
    }
    
    public void CargarDatos(){
        this.TablaCitas.setModel(this.citas.CargarCita());
    }
    
    public void LlenarComboCliente(){
        Conexion c = new Conexion();
        c.EstableceConexion();
        ArrayList cl = new ArrayList();
        this.cmbClientes.removeAllItems();
        cl = c.GetListaClientes();
        Iterator iterador = cl.iterator();
        while(iterador.hasNext()){
            ComboCliente CI = (ComboCliente) iterador.next();
            this.cmbClientes.addItem(CI.getCliente());
        }
    }
    
    public void LlenarComboProducto(){
        Conexion c = new Conexion();
        c.EstableceConexion();
        ArrayList p = new ArrayList();
        this.cmbProductos.removeAllItems();
        p = c.GetListaProducto();
        Iterator iterador = p.iterator();
        while(iterador.hasNext()){
            ComboProducto CP = (ComboProducto) iterador.next();
            this.cmbProductos.addItem(CP.getProducto());
        }
    }
    
    public void LlenarComboDentista(){
        Conexion c = new Conexion();
        c.EstableceConexion();
        ArrayList d = new ArrayList();
        this.cmbDentista.removeAllItems();
        d = c.GetListaDentista();
        Iterator iterador = d.iterator();
        while(iterador.hasNext()){
            ComboDentista CD = (ComboDentista) iterador.next();
            this.cmbDentista.addItem(CD.getDentista());
            
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

        lblClientes = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblProductos = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        lblFechaHora = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        chkAtendido = new javax.swing.JCheckBox();
        chkCancelado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCitas = new javax.swing.JTable();
        btnAgendar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblDentista = new javax.swing.JLabel();
        cmbDentista = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblClientes.setText("Clientes:");

        lblCodigo.setText("Codigo:");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblProductos.setText("Productos:");

        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        lblFechaHora.setText("Fecha y hora:");

        lblDescripcion.setText("Descripcion:");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        chkAtendido.setText("Atendido");
        chkAtendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAtendidoActionPerformed(evt);
            }
        });

        chkCancelado.setText("Cancelado");
        chkCancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCanceladoActionPerformed(evt);
            }
        });

        TablaCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCitas);

        btnAgendar.setText("Agendar cita");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        lblDentista.setText("Dentista:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClientes)
                        .addGap(6, 6, 6)
                        .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAtendido)
                        .addGap(18, 18, 18)
                        .addComponent(chkCancelado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion)
                            .addComponent(lblDentista))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addComponent(cmbDentista, 0, 166, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgendar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblCodigo))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblClientes))
                            .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductos))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblFechaHora))
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescripcion)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDentista)
                            .addComponent(cmbDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgendar)
                    .addComponent(btnEditar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnLimpiar))
                    .addComponent(chkAtendido)
                    .addComponent(chkCancelado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductosActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void chkAtendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAtendidoActionPerformed
        // TODO add your handling code here:
        if(this.chkAtendido.isSelected()){
            this.chkCancelado.setSelected(false);
        }else{
            this.chkCancelado.setSelected(true);
        }
    }//GEN-LAST:event_chkAtendidoActionPerformed

    private void chkCanceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCanceladoActionPerformed
        // TODO add your handling code here:
        if(this.chkCancelado.isSelected()){
            this.chkAtendido.setSelected(false);
        }else{
            this.chkAtendido.setSelected(true);
        }
    }//GEN-LAST:event_chkCanceladoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
        ((JTextField)this.jdcFecha.getDateEditor().getUiComponent()).setText("");
        this.chkAtendido.setSelected(false);
        this.chkCancelado.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
        Citas cita = new Citas();
        String personas = this.cmbClientes.getSelectedItem().toString();
        String productos = this.cmbProductos.getSelectedItem().toString();
        String dent = this.cmbDentista.getSelectedItem().toString();
        String FechaHora = ((JTextField)this.jdcFecha.getDateEditor().getUiComponent()).getText();
        String desc = this.txtDescripcion.getText();
        try{
            if(this.chkAtendido.isSelected()){
                String Atendido = this.chkAtendido.getText();
               Atendido = "Atendido";
                if(cita.AgendarCita(personas, productos, FechaHora, desc,dent, Atendido)>0){
                    JOptionPane.showMessageDialog(null, "datos ingresados");
                    this.TablaCitas.setModel(this.citas.CargarCita());
                    
                }
            }
            
            if(this.chkCancelado.isSelected()){
                String Cancelado  = this.chkCancelado.getText();
                Cancelado = "Cancelado";
                if(cita.AgendarCita(personas, productos, FechaHora, desc,dent ,Cancelado)>0){
                    JOptionPane.showMessageDialog(null, "datos ingresados");  
                    this.TablaCitas.setModel(this.citas.CargarCita());
                }
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
         Citas cita = new Citas();
         int cod = parseInt(this.txtCodigo.getText());
        String personas = this.cmbClientes.getSelectedItem().toString();
        String productos = this.cmbProductos.getSelectedItem().toString();
        String dent = this.cmbDentista.getSelectedItem().toString();
        String FechaHora = ((JTextField)this.jdcFecha.getDateEditor().getUiComponent()).getText();
        String desc = this.txtDescripcion.getText();
        try{
            if(this.chkAtendido.isSelected()){
               String Atendido = this.chkAtendido.getText();
               Atendido = "Atendido";
                if(cita.EditarCita(cod, personas, productos, FechaHora, desc,dent,Atendido)>0){
                    JOptionPane.showMessageDialog(null, "datos modificados");
                    this.TablaCitas.setModel(this.citas.CargarCita());
                    
                }
            }
            
            if(this.chkCancelado.isSelected()){
                String Cancelado  = this.chkCancelado.getText();
                Cancelado = "Cancelado";
                if(cita.EditarCita(cod, personas, productos, FechaHora, desc,dent,Cancelado)>0){
                    JOptionPane.showMessageDialog(null, "datos modificados");  
                    this.TablaCitas.setModel(this.citas.CargarCita());
                }
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void TablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitasMouseClicked
        // TODO add your handling code here:
        int seleccion = this.TablaCitas.getSelectedRow();
        try{
            this.txtCodigo.setText(this.TablaCitas.getValueAt(seleccion, 0).toString());
        ((JTextField)this.jdcFecha.getDateEditor().getUiComponent()).setText(this.TablaCitas.getValueAt(seleccion, 3).toString());
        this.txtDescripcion.setText(this.TablaCitas.getValueAt(seleccion, 4).toString());
        String Estado = this.TablaCitas.getValueAt(seleccion, 6).toString();
        if(Estado.equals("Atendido")){
            this.chkAtendido.setSelected(true);
            this.chkCancelado.setSelected(false);
        }else{
            this.chkCancelado.setSelected(true);
            this.chkAtendido.setSelected(false);
        }
            
        }catch(ArrayIndexOutOfBoundsException ex){
            
        }
        
    }//GEN-LAST:event_TablaCitasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Citas cita = new Citas();
        int cod = parseInt(this.txtCodigo.getText());
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        
        if(respuesta == JOptionPane.YES_OPTION){
            try{
                if(cita.EliminarCita(cod)>0){
                    JOptionPane.showMessageDialog(null, "Datos eliminados");
                    this.CargarDatos();
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCitas;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkAtendido;
    private javax.swing.JCheckBox chkCancelado;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JComboBox<String> cmbDentista;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDentista;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
