/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author Mis Documentos
 */
public class RegistrarClientes extends javax.swing.JFrame {

    /** Creates new form RegistrarUsuario */
    public RegistrarClientes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClienteIDRC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedulaRC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarRC = new javax.swing.JButton();
        btnEditarRC = new javax.swing.JButton();
        btnEliminarRC = new javax.swing.JButton();
        btnLimpiarRC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombreRC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoRC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionRC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCorreoRC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCelularRC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnRegresraRC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 155, 86));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("REGISTRO DE CLIENTES");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Cliente ID:");

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Cedula:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarRC.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregarRC.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        btnAgregarRC.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarRC.setText("Agregar");
        btnAgregarRC.setBorder(null);
        btnAgregarRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarRCMouseClicked(evt);
            }
        });

        btnEditarRC.setBackground(new java.awt.Color(255, 102, 0));
        btnEditarRC.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        btnEditarRC.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarRC.setText("Editar");
        btnEditarRC.setBorder(null);
        btnEditarRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarRCMouseClicked(evt);
            }
        });

        btnEliminarRC.setBackground(new java.awt.Color(255, 102, 0));
        btnEliminarRC.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        btnEliminarRC.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRC.setText("Eliminar");
        btnEliminarRC.setBorder(null);
        btnEliminarRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarRCMouseClicked(evt);
            }
        });

        btnLimpiarRC.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiarRC.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        btnLimpiarRC.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarRC.setText("Limpiar");
        btnLimpiarRC.setBorder(null);
        btnLimpiarRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarRCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnAgregarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEditarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliminarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLimpiarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 51));
        jLabel9.setText("Apellido:");

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        jLabel10.setText("Dirección:");

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Correo:");

        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 51));
        jLabel12.setText("Celular:");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "APELLIDO", "DIRECCION", "CORREO", "CELULAR"
            }
        ));
        TablaProductos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaProductos.setRowHeight(25);
        TablaProductos.setSelectionBackground(new java.awt.Color(255, 102, 0));
        TablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(txtClienteIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtCelularRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtClienteIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtCedulaRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoRC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        btnRegresraRC.setBackground(new java.awt.Color(255, 102, 0));
        btnRegresraRC.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        btnRegresraRC.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresraRC.setText("<");
        btnRegresraRC.setBorder(null);
        btnRegresraRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresraRCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresraRC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(776, 776, 776)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresraRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRCMouseClicked
        // TODO add your handling code here:
//        if(txtClienteIDRC.getText().isEmpty()|| txtCedulaRC.getText().isEmpty()||SelPass.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this, "Informacion Faltante");
//        }
//        else{
//            try {
//                //Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermarket","null","null");
//                Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SellerTBL","postgres","1234");
//                PreparedStatement add = Con.prepareStatement("insert into SELLERTBL values(?,?,?,?)");
//                add.setInt(1, Integer.valueOf(txtClienteIDRC.getText()));
//                add.setString(2, txtCedulaRC.getText());
//                add.setString(3, SelPass.getText());
//                add.setString(4, GenderCB.getSelectedItem().toString());
//                int row = add.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Vendedor agregado con exito");
//                Con.close();
//                SelectSeller();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }//GEN-LAST:event_btnAgregarRCMouseClicked

    private void btnEditarRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarRCMouseClicked
//        // TODO add your handling code here:
//        if(txtClienteIDRC.getText().isEmpty()||txtCedulaRC.getText().isEmpty()||SelPass.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this, "Informacion faltante");
//        }else{
//            try{
//                Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SellerTBL","postgres","1234");
//                String Query = "Update User1.SELLERTBL set SELNAME='"+txtCedulaRC.getText()+"'"+",SELPASS='"+SelPass.getText()+"'"+",SELGENDER='"+GenderCB.getSelectedItem().toString()+"'"+"where SELID="+txtClienteIDRC.getText();
//                Statement Add = Con.createStatement();
//                Add.executeUpdate(Query);
//                JOptionPane.showMessageDialog(this, "Vendedror actualizado");
//                SelectSeller();
//            }catch(SQLException e){
//                e.printStackTrace();
//            }
//        }
    }//GEN-LAST:event_btnEditarRCMouseClicked

    private void btnEliminarRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarRCMouseClicked
//        // TODO add your handling code here:
//        if (txtClienteIDRC.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Introduzca la vendedora que se eliminará");
//        }else{
//            try{
//                Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SellerTBL","postgres","1234");
//                String Sid = txtClienteIDRC.getText();
//                String Query = "Delete from User1.SELLERTBL where Selid="+Sid;
//                Statement Add = Con.createStatement();
//                Add.execute(Query);
//                SelectSeller();
//                JOptionPane.showMessageDialog(this, "vendedor eleimiando satisfactoriamente");
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//        }
    }//GEN-LAST:event_btnEliminarRCMouseClicked

    private void btnLimpiarRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarRCMouseClicked
        // TODO add your handling code here:
        txtClienteIDRC.setText("");
        txtCedulaRC.setText("");
        txtApellidoRC.setText("");
        txtCelularRC.setText("");
        txtCorreoRC.setText("");
        txtDireccionRC.setText("");
        txtNombreRC.setText("");
    }//GEN-LAST:event_btnLimpiarRCMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnRegresraRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresraRCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresraRCMouseClicked

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        //        // TODO add your handling code here:
        //        DefaultTableModel model = (DefaultTableModel)TablaProductos.getModel();
        //        int Myindex = TablaProductos.getSelectedRow();
        //        txtProductoIDPRO.setText(model.getValueAt(Myindex, 0).toString());
        //        txtNombrePRO.setText(model.getValueAt(Myindex, 1).toString());
        //        txtCantidadPRO.setText(model.getValueAt(Myindex, 2).toString());
        //        txtPrecioPRO.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_TablaProductosMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAgregarRC;
    private javax.swing.JButton btnEditarRC;
    private javax.swing.JButton btnEliminarRC;
    private javax.swing.JButton btnLimpiarRC;
    private javax.swing.JButton btnRegresraRC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidoRC;
    private javax.swing.JTextField txtCedulaRC;
    private javax.swing.JTextField txtCelularRC;
    private javax.swing.JTextField txtClienteIDRC;
    private javax.swing.JTextField txtCorreoRC;
    private javax.swing.JTextField txtDireccionRC;
    private javax.swing.JTextField txtNombreRC;
    // End of variables declaration//GEN-END:variables

}
