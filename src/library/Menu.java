package library;

import java.util.ArrayList;
import java.util.List;

public class Menu extends javax.swing.JFrame {
    public static List<String> generos = new ArrayList<>();
    public List<String> getGeneros() {return generos; }
    public void setGeneros(List<String> generos) {this.generos = generos;}  
    public static List<String> paises = new ArrayList<>();
    public List<String> getPaises() { return paises; }
    public void setPaises(List<String> paises) { this.paises = paises; }
    public Menu() {
        initComponents();
        generos.add("Fantasía");
        generos.add("Terror");
        generos.add("Suspense");
        generos.add("Cómic");
        generos.add("Acción");
        generos.add("Aventuras");
        generos.add("Juvenil");
        generos.add("Novela ligera");
        generos.add("Ciencia ficción");
        generos.add("Policiaca");
        paises.add("Alemania");
        paises.add("España");
        paises.add("USA");
        paises.add("Rusia");
        paises.add("Inglaterra");
        paises.add("Irlanda");
        paises.add("Polonia");
        paises.add("Francia");
        paises.add("Japón");
        paises.add("China");
        if(!Principal.admin){
            btn_altaUsu.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_l_nuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_l_modificar = new javax.swing.JButton();
        btn_l_eliminar = new javax.swing.JButton();
        btn_consultas = new javax.swing.JButton();
        btn_a_nombre = new javax.swing.JButton();
        btn_a_modificar = new javax.swing.JButton();
        btn_a_eliminar = new javax.swing.JButton();
        btn_altaUsu = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Libreria STUCOM");

        btn_l_nuevo.setText("Nuevo");
        btn_l_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_l_nuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Libros");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Autores");

        btn_l_modificar.setText("Modificar");
        btn_l_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_l_modificarActionPerformed(evt);
            }
        });

        btn_l_eliminar.setText("Eliminar");
        btn_l_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_l_eliminarActionPerformed(evt);
            }
        });

        btn_consultas.setText("Consultas");
        btn_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultasActionPerformed(evt);
            }
        });

        btn_a_nombre.setText("Nuevo");
        btn_a_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a_nombreActionPerformed(evt);
            }
        });

        btn_a_modificar.setText("Modificar");
        btn_a_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a_modificarActionPerformed(evt);
            }
        });

        btn_a_eliminar.setText("Eliminar");
        btn_a_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a_eliminarActionPerformed(evt);
            }
        });

        btn_altaUsu.setText("Alta usuarios");
        btn_altaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaUsuActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/exit.png"))); // NOI18N
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_altaUsu)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_l_modificar)
                            .addComponent(btn_l_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_l_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_a_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_a_modificar)
                                    .addComponent(btn_a_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_l_nuevo)
                    .addComponent(btn_a_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_l_modificar)
                    .addComponent(btn_a_modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_l_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultas)
                .addGap(18, 18, 18)
                .addComponent(btn_altaUsu)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_l_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_l_nuevoActionPerformed
        NuevoLibro n = new NuevoLibro(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_l_nuevoActionPerformed

    private void btn_l_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_l_modificarActionPerformed
        ModificarLibro n = new ModificarLibro(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_l_modificarActionPerformed

    private void btn_l_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_l_eliminarActionPerformed
        EliminarLibro n = new EliminarLibro(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_l_eliminarActionPerformed

    private void btn_consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultasActionPerformed
        Consultas n = new Consultas(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_consultasActionPerformed

    private void btn_a_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a_nombreActionPerformed
        NuevoAutor n = new NuevoAutor(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_a_nombreActionPerformed

    private void btn_a_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a_modificarActionPerformed
        ModificarAutor n = new ModificarAutor(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_a_modificarActionPerformed

    private void btn_a_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a_eliminarActionPerformed
        EliminarAutor n = new EliminarAutor(this, true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_btn_a_eliminarActionPerformed

    private void btn_altaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaUsuActionPerformed
       AltaUsu n = new AltaUsu(this, true);
       n.setLocationRelativeTo(null);
       n.setVisible(true);
    }//GEN-LAST:event_btn_altaUsuActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_a_eliminar;
    private javax.swing.JButton btn_a_modificar;
    private javax.swing.JButton btn_a_nombre;
    private javax.swing.JButton btn_altaUsu;
    private javax.swing.JButton btn_consultas;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_l_eliminar;
    private javax.swing.JButton btn_l_modificar;
    private javax.swing.JButton btn_l_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
