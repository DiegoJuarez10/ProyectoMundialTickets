/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import controlador.UsuarioControlador;
import java.awt.Image;
import modelo.UsuarioModelo;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class UsuarioVista extends javax.swing.JFrame {
    // Instancia del controlador
    UsuarioControlador controlador = new UsuarioControlador();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioVista.class.getName());

   
    public UsuarioVista() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();
          getContentPane().setBackground(new java.awt.Color(45, 70, 95));
            ImageIcon icono = new ImageIcon(getClass().getResource("/Img/WEARE26AZUL.jpg"));
    Image imagen = icono.getImage();
   Image escala = imagen.getScaledInstance(
            jLabel1.getWidth(),
            jLabel1.getHeight(),
            Image.SCALE_SMOOTH
    );

    jLabel1.setIcon(new ImageIcon(escala));

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtID = new java.awt.TextField();
        txtUsername = new java.awt.TextField();
        txtPassword = new java.awt.TextField();
        txtRol = new java.awt.TextField();
        txtEstado = new java.awt.TextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");

        lblUsuario.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");

        lblPassword.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        lbl.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Rol:");

        lblEstado.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");

        btnAgregar.setBackground(new java.awt.Color(23, 116, 209));
        btnAgregar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(243, 236, 236));
        btnAgregar.setText("Agregar Vendedor");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnActualizar.setBackground(new java.awt.Color(23, 116, 209));
        btnActualizar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(243, 236, 236));
        btnActualizar.setText("Actualizar Vendedor");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnConsultar.setBackground(new java.awt.Color(23, 116, 209));
        btnConsultar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(243, 236, 236));
        btnConsultar.setText("Consultar Vendedor");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnEliminar.setBackground(new java.awt.Color(232, 55, 55));
        btnEliminar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(243, 236, 236));
        btnEliminar.setText("Eliminar Vendedor");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "Rol", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnVolver.setBackground(new java.awt.Color(0, 0, 102));
        btnVolver.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        jLabel3.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión de Empleados");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(198, 198, 198)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario)
                            .addComponent(lblPassword)
                            .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregar)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(25, 25, 25)
                        .addComponent(btnConsultar)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado))
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String rol = txtRol.getText();
        boolean resultado = controlador.agregarUsuario(username, password, rol);
        mostrarDatos();
        if(resultado){
            JOptionPane.showMessageDialog(this,"Usuario agregado correctamente!");
        }else{ 
            JOptionPane.showMessageDialog(this,"Error al registrar usuario!");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String rol = txtRol.getText();
        int id = Integer.parseInt(txtID.getText());
        boolean resultado = controlador.actualizarUsuario(id,username, password, rol);
         mostrarDatos();
        if(resultado){
            JOptionPane.showMessageDialog(this,"Usuario actualizado correctamente!");
        }else{ 
            JOptionPane.showMessageDialog(this,"Error al actualizar usuario!");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtID.getText());
        boolean resultado = controlador.eliminarUsuario(id);
         mostrarDatos();
        if(resultado){
            JOptionPane.showMessageDialog(this,"Usuario eliminado correctamente");
        }else{ 
            JOptionPane.showMessageDialog(this,"Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int id = Integer.parseInt(txtID.getText());
        UsuarioModelo U  = controlador.consultarUsuario(id);
        if(U!=null){
         txtUsername.setText(U.getUsername());
         txtPassword.setText(U.getPassword());
         txtRol.setText(U.getRol());
        }else{ 
            JOptionPane.showMessageDialog(this,"Error: ");
        } 
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       MenuPrincipalAdmin menu = new MenuPrincipalAdmin();
       menu.setVisible(true); 
       this.dispose(); 
    }//GEN-LAST:event_btnVolverActionPerformed

    DefaultTableModel modelo;

public void mostrarDatos() {
    modelo = new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Username");
    modelo.addColumn("Password");
    modelo.addColumn("Rol");
    UsuarioControlador controlador = new UsuarioControlador();
    List<UsuarioModelo> lista = controlador.ObtenerTodos();
    for (UsuarioModelo U : lista) {
        modelo.addRow(new Object[]{
            U.getId(),
            U.getUsername(),
            U.getPassword(),
            U.getRol()
        });
    }
    jTable1.setModel(modelo);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UsuarioVista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private java.awt.TextField txtEstado;
    private java.awt.TextField txtID;
    private java.awt.TextField txtPassword;
    private java.awt.TextField txtRol;
    private java.awt.TextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
