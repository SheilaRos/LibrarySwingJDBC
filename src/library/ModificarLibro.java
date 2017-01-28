/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Author;
import model.Book;
import persistence.LibraryJDBC;

/**
 *
 * @author dam
 */
public class ModificarLibro extends javax.swing.JDialog implements ItemListener{
    LibraryJDBC gestor = new LibraryJDBC();
    private List<Book> libros;
    public List<Book> getLibros() {  return libros; }
    public void setLibros(List<Book> libros) { this.libros = libros;}
    private List<String> generos = Menu.generos;
    public List<String> getGeneros() {return generos;}
    public void setGeneros(List<String> generos) {  this.generos = generos; }   
    private List<Author> autores;
    public List<Author> getAutores() { return autores; }
    public void setAutores(List<Author> autores) {this.autores = autores;}

    public ModificarLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            libros = gestor.allBooks();
            autores = gestor.allAuthors();
        } catch (SQLException ex) {
            System.out.println(ex);
        }       
        initComponents();
        Book b = (Book) comboLibro.getSelectedItem();
        if(b.getIsbn()==1){
            ISBN.setVisible(false);
            comboAutores.setVisible(false);
            comboGeneros.setVisible(false);
            paginas.setVisible(false);
            tituloLibro.setVisible(false);
        }
        ISBN.setText(b.getIsbn()+"");
        for(Author a: autores){
              if(b.getAuthor().getIdauthor()==a.getIdauthor()){
                 comboAutores.setSelectedItem(a);
              }
          }
        
        comboGeneros.setSelectedItem(b.getGenre());
        paginas.setValue(b.getNpages());
        tituloLibro.setText(b.getTitle());
        comboLibro.addItemListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tituloLibro = new javax.swing.JTextField();
        comboAutores = new javax.swing.JComboBox<>();
        paginas = new javax.swing.JSpinner();
        comboGeneros = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboLibro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ISBN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Libro a modificar");

        jLabel2.setText("Título:");

        jLabel3.setText("Autor:");

        jLabel4.setText("ISBN:");

        jLabel5.setText("Páginas:");

        jLabel6.setText("Género:");

        comboAutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${autores}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, comboAutores);
        bindingGroup.addBinding(jComboBoxBinding);

        comboGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${generos}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, comboGeneros);
        bindingGroup.addBinding(jComboBoxBinding);

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        jLabel7.setText("Libro:");

        comboLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${libros}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, comboLibro);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Datos modificados del libro");

        ISBN.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btn_modificar)
                        .addGap(50, 50, 50)
                        .addComponent(btn_atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboGeneros, 0, 309, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel2))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboLibro, 0, 311, Short.MAX_VALUE)
                                    .addComponent(tituloLibro)
                                    .addComponent(comboAutores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_atras))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Author a = (Author)comboAutores.getSelectedItem();
        if(tituloLibro.getText().equals("") || ISBN.getText().equals("") || paginas.getValue().equals(0)){
            JOptionPane.showMessageDialog(this, "El título, número de páginas y ISBN no pueden quedar vacios", "Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else if(ISBN.getText().length()>8){
            JOptionPane.showMessageDialog(this, "El ISBN no puede superar los 8 carácteres", "ISBN demasiado extenso", JOptionPane.ERROR_MESSAGE);
        }else if(tituloLibro.getText().length()>200){
            JOptionPane.showMessageDialog(this, "El titulo del libro no puede superar los 80 carácteres", "Nombre del titulo demasiado extenso", JOptionPane.ERROR_MESSAGE);
        }else if(comboGeneros.getSelectedItem().equals("Selecciona un genero")){
            JOptionPane.showMessageDialog(this, "El genero no pueden quedar vacio", "Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else if(a.getName().equals("Selecciona un autor")){
            JOptionPane.showMessageDialog(this, "El autor no pueden quedar vacio", "Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
            Book bk = (Book)comboLibro.getSelectedItem();
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de modificar este libro: "+bk.getTitle() +"?", "Modificar libro", JOptionPane.OK_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                    int isbn = Integer.parseInt(ISBN.getText());
                    try{
                        int pag =(int) paginas.getValue();
                        Book b = new Book(isbn, tituloLibro.getText(), pag, comboGeneros.getSelectedItem().toString(), a);
                        gestor.updateBook(b);
                        JOptionPane.showMessageDialog(this, "Libro modificado", "Regitro de libros", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }catch(Exception ex){
                        System.out.println(ex);
                    }
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarLibro dialog = new ModificarLibro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBN;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> comboAutores;
    private javax.swing.JComboBox<String> comboGeneros;
    private javax.swing.JComboBox<String> comboLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner paginas;
    private javax.swing.JTextField tituloLibro;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboLibro) {
          int selec = comboLibro.getSelectedIndex();
          Book seleccionado = libros.get(selec);
          if(seleccionado.getIsbn()==1){
            ISBN.setVisible(false);
            comboAutores.setVisible(false);
            comboGeneros.setVisible(false);
            paginas.setVisible(false);
            tituloLibro.setVisible(false);
        }else{
            ISBN.setVisible(true);
            comboAutores.setVisible(true);
            comboGeneros.setVisible(true);
            paginas.setVisible(true);
            tituloLibro.setVisible(true);
        }
          ISBN.setText(seleccionado.getIsbn()+"");
          tituloLibro.setText(seleccionado.getTitle());
          paginas.setValue(seleccionado.getNpages());
          for(Author a: autores){
              if(seleccionado.getAuthor().getIdauthor()==a.getIdauthor()){
                  comboAutores.setSelectedItem(a);
              }
          }
          comboGeneros.setSelectedItem(seleccionado.getGenre());
       }
    }
}
