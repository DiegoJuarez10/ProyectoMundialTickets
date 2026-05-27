    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
     */
    package Vista;
    import Controlador.TicketControlador;
    import Controlador.PartidoControlador;
    import Modelo.TicketModelo;
    import Modelo.TicketPartidoDTO;
    import Modelo.PartidoModelo;
import java.awt.Image;
import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    /**
     *
     * @author yorch
     */
    public class TICKETDETALLE extends javax.swing.JFrame {
        
        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TICKETDETALLE.class.getName());
        private final TicketControlador ticketControlador = new TicketControlador();
        private DefaultTableModel modeloSeleccionados = new DefaultTableModel(
        new Object[]{"ID","Partido_ID","Local","Visitante","Fase","Estadio",
                     "Fecha","Hora","Asiento","Sección","Precio","Estado"},0
    );
    private DefaultTableModel modeloTickets = new DefaultTableModel(
        new Object[]{"ID Ticket","Asiento","Sección","Precio","Estado"},0
    );
    private PartidoModelo partido;
        private int partido_id;

        /**
         * Creates new form TICKETDETALLE
         */
        public TICKETDETALLE(PartidoModelo partido) {
            initComponents();
                this.partido = partido;
            jttickets.setModel(modeloTickets);
            jtseleccionados.setModel(modeloSeleccionados);
            txtasiento.setEditable(false);
            txtseccion.setEditable(false);
            txtprecio.setEditable(false);
            txtestado.setEditable(false);
              getContentPane().setBackground(new java.awt.Color(46, 125, 90));
            ImageIcon icono = new ImageIcon(getClass().getResource("/Img/WEARE26VERDE.png"));
    Image imagen = icono.getImage();
    Image escala = imagen.getScaledInstance(
            jLabel6.getWidth(),
            jLabel6.getHeight(),
            Image.SCALE_SMOOTH
    );

    jLabel6.setIcon(new ImageIcon(escala));
        
        }
public TICKETDETALLE(int partido_id, PartidoModelo partido) {
    initComponents();
this.partido = partido;
    this.partido_id = partido_id;

    jttickets.setModel(modeloTickets);
    jtseleccionados.setModel(modeloSeleccionados);

    cargarTickets();

    jttickets.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {

            int fila = jttickets.getSelectedRow();

            if (fila >= 0) {

                String asiento = jttickets.getValueAt(fila, 1).toString();
                String seccion = jttickets.getValueAt(fila, 2).toString();
                String precio  = jttickets.getValueAt(fila, 3).toString();
                String estado  = jttickets.getValueAt(fila, 4).toString();

                txtasiento.setText(asiento);
                txtseccion.setText(seccion);
                txtprecio.setText(precio);
                txtestado.setText(estado);
            }
        }
    });

    getContentPane().setBackground(new java.awt.Color(46, 125, 90));

    ImageIcon icono = new ImageIcon(getClass().getResource("/Img/WEARE26VERDE.png"));

    Image imagen = icono.getImage();

    Image escala = imagen.getScaledInstance(
            jLabel6.getWidth(),
            jLabel6.getHeight(),
            Image.SCALE_SMOOTH
    );

    jLabel6.setIcon(new ImageIcon(escala));
}
         public TICKETDETALLE(int partido_id, DefaultTableModel seleccionadosPrevios) {
    initComponents(); 
    this.partido_id = partido_id;
    jttickets.setModel(modeloTickets);
    jtseleccionados.setModel(modeloSeleccionados);
    if (seleccionadosPrevios != null) {
        for (int i = 0; i < seleccionadosPrevios.getRowCount(); i++) {
            Object[] fila = new Object[seleccionadosPrevios.getColumnCount()];
            for (int j = 0; j < seleccionadosPrevios.getColumnCount(); j++) {
                fila[j] = seleccionadosPrevios.getValueAt(i, j);
            }
            modeloSeleccionados.addRow(fila);
        }
    }
    cargarTickets();
    setLocationRelativeTo(null);
    setExtendedState(javax.swing.JFrame.NORMAL);
      jttickets.addMouseListener(new java.awt.event.MouseAdapter() {

                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int fila = jttickets.getSelectedRow();
                    if (fila >= 0) {
               String asiento = jttickets.getValueAt(fila, 1).toString();
               String seccion = jttickets.getValueAt(fila, 2).toString();
               String precio  = jttickets.getValueAt(fila, 3).toString();
               String estado  = jttickets.getValueAt(fila, 4).toString();

               txtasiento.setText(asiento);
               txtseccion.setText(seccion);
               txtprecio.setText(precio);
               txtestado.setText(estado);
                    }
                }
            });
       getContentPane().setBackground(new java.awt.Color(46, 125, 90));
            ImageIcon icono = new ImageIcon(getClass().getResource("/Img/WEARE26VERDE.png"));
    Image imagen = icono.getImage();
    Image escala = imagen.getScaledInstance(
            jLabel6.getWidth(),
            jLabel6.getHeight(),
            Image.SCALE_SMOOTH
    );

    jLabel6.setIcon(new ImageIcon(escala));
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
        jtseleccionados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jttickets = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtasiento = new javax.swing.JTextField();
        btagregar = new javax.swing.JButton();
        btañadir = new javax.swing.JButton();
        btvolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtseccion = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        btcancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtseleccionados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtseleccionados);

        jButton1.setBackground(new java.awt.Color(2, 153, 52));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(243, 236, 236));
        jButton1.setText("REALIZAR PAGO");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jttickets.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jttickets);

        jLabel1.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TICKET");

        btagregar.setBackground(new java.awt.Color(2, 153, 52));
        btagregar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btagregar.setForeground(new java.awt.Color(243, 236, 236));
        btagregar.setText("AGREGAR");
        btagregar.addActionListener(this::btagregarActionPerformed);

        btañadir.setBackground(new java.awt.Color(2, 153, 52));
        btañadir.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        btañadir.setForeground(new java.awt.Color(243, 236, 236));
        btañadir.setText("SELECCION DE PARTIDO");
        btañadir.addActionListener(this::btañadirActionPerformed);

        btvolver.setBackground(new java.awt.Color(232, 55, 55));
        btvolver.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        btvolver.setForeground(new java.awt.Color(243, 236, 236));
        btvolver.setText("CANCELAR");
        btvolver.addActionListener(this::btvolverActionPerformed);

        jLabel3.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");

        jLabel2.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Asiento");

        jLabel9.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sección");

        jLabel10.setFont(new java.awt.Font("FWC2026 UltraCondensed Medium", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio");

        btcancelar.setBackground(new java.awt.Color(232, 55, 55));
        btcancelar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(243, 236, 236));
        btcancelar.setText("CANCELAR");
        btcancelar.addActionListener(this::btcancelarActionPerformed);

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btañadir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtasiento)
                                    .addComponent(txtseccion)
                                    .addComponent(txtprecio)
                                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btcancelar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btagregar)
                            .addComponent(btcancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btvolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2)))
                .addGap(23, 23, 23)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:                                    
   int fila = jttickets.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar un ticket");
        return;
    }
    String estado = jttickets.getValueAt(fila, 4).toString();
    if (estado.equalsIgnoreCase("VENDIDO") || estado.equalsIgnoreCase("RESERVADO")) {
        JOptionPane.showMessageDialog(this, "Este ticket ya está " + estado + ", no se puede agregar.");
        return;
    }
    int idTicket = Integer.parseInt(jttickets.getValueAt(fila, 0).toString());
    for (TicketPartidoDTO dto : ticketControlador.obtenerTicketsConPartido()) {
        if (dto.getTicketId() == idTicket) {
            modeloSeleccionados.addRow(new Object[]{
                dto.getTicketId(),
                dto.getPartidoId(),
                dto.getEquipoLocal(),
                dto.getEquipoVisitante(),
                dto.getFase(),
                dto.getEstadio(),
                dto.getFecha(),
                dto.getHora(),
                dto.getNumeroAsiento(),
                dto.getSeccion(),
                dto.getPrecio(),
                dto.getEstado()
            });
            break;
        }
    }
    modeloTickets.removeRow(fila);
    txtasiento.setText("");
    txtseccion.setText("");
    txtprecio.setText("");
    txtestado.setText("");
    }//GEN-LAST:event_btagregarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        // TODO add your handling code here:
         int fila = jtseleccionados.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar un ticket en la tabla de arriba");
        return;
    }
    int idTicket = Integer.parseInt(jtseleccionados.getValueAt(fila, 0).toString());
    for (TicketPartidoDTO dto : ticketControlador.obtenerTicketsConPartido()) {
        if (dto.getTicketId() == idTicket) {
            // Regresar el ticket a la tabla de abajo (solo datos básicos)
            modeloTickets.addRow(new Object[]{
                dto.getTicketId(),
                dto.getNumeroAsiento(),
                dto.getSeccion(),
                dto.getPrecio(),
                dto.getEstado()
            });
            break;
        }
    }
    modeloSeleccionados.removeRow(fila);
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btañadirActionPerformed
        // TODO add your handling code here:
    DefaultTableModel seleccionadosPrevios = modeloSeleccionados;
    this.dispose();
    new MasPartidos(seleccionadosPrevios).setVisible(true);
    }//GEN-LAST:event_btañadirActionPerformed

    private void btvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvolverActionPerformed
        // TODO add your handling code here:
    Spartidos v = new Spartidos();
    modeloSeleccionados.setRowCount(0);
    v.setVisible(true);
    v.setLocationRelativeTo(null);
    v.setExtendedState(javax.swing.JFrame.NORMAL);
    this.dispose();

    }//GEN-LAST:event_btvolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloPago = new DefaultTableModel(
    new Object[]{"ID Ticket","Asiento","Sección","Precio","Estado"},0
);

for(int i = 0; i < modeloSeleccionados.getRowCount(); i++){

    modeloPago.addRow(new Object[]{
        modeloSeleccionados.getValueAt(i, 0), 
        modeloSeleccionados.getValueAt(i, 8), 
        modeloSeleccionados.getValueAt(i, 9),
        modeloSeleccionados.getValueAt(i, 10), 
        modeloSeleccionados.getValueAt(i, 11) 
    });
}

ClienteVista cli = new ClienteVista(this, modeloPago, partido);

cli.setVisible(true);

this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed
 private void cargarTickets() {
    modeloTickets.setRowCount(0);
    for (TicketPartidoDTO dto : ticketControlador.obtenerTicketsConPartido()) {
        if (dto.getPartidoId() == partido_id) { 
            modeloTickets.addRow(new Object[]{
                dto.getTicketId(),
                dto.getNumeroAsiento(),
                dto.getSeccion(),
                dto.getPrecio(),
                dto.getEstado()
            });
        }
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(() -> new TICKETDETALLE().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btañadir;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btvolver;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtseleccionados;
    private javax.swing.JTable jttickets;
    private javax.swing.JTextField txtasiento;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtseccion;
    // End of variables declaration//GEN-END:variables
}
