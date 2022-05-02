
package editortexto;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;

public class editortextoo extends javax.swing.JFrame {
JFileChooser seleccionado = new JFileChooser();
FileInputStream entrada;
File archivo;
GestionA gestion = new GestionA();

public String AbrirArchivo (File archivo){
    String documento="";
    try{
        entrada=new FileInputStream(archivo);
int ascci;
while((ascci= entrada.read())!=-1){
char caracter = (char) ascci;
documento+=caracter;
}
    } catch (Exception e){
}
return documento;
}
    public editortextoo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_abrir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btn_salir = new javax.swing.JButton();
        contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_abrir.setText("Abrir Archivo");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_abrir)
                .addGap(67, 67, 67)
                .addComponent(btn_guardar)
                .addGap(74, 74, 74)
                .addComponent(btn_salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_abrir)
                            .addComponent(btn_guardar)
                            .addComponent(btn_salir))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
     if (seleccionado.showDialog(null, "Abrir Archivo") == JFileChooser.APPROVE_OPTION){
         archivo = seleccionado.getSelectedFile();
    if(archivo.canRead()){
    if(archivo.getName().endsWith("txt")){
    String documento = AbrirArchivo (archivo);
        txtArea.setText(documento);
    } else {
        JOptionPane.showMessageDialog(null, "Seleccionar Archivo de Texto");   
    }
    }
}
// TODO add your handling code here:
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
         if (seleccionado.showDialog(this, "Guardar Archivo") == JFileChooser.APPROVE_OPTION){
         archivo = seleccionado.getSelectedFile();
if(archivo.getName().endsWith("txt"));
String contenido = txtArea.getText();
String respuesta = gestion.GuardarTexto(archivo, contenido);

if (respuesta!=null){
    JOptionPane.showMessageDialog(null, respuesta);
} else{
    JOptionPane.showMessageDialog(null, "Error al guardar el texto");             
         }
         }else{
             JOptionPane.showMessageDialog(null, "El texto se debe Guardar en archivo TXT");
    
    }    // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
this.dispose();         
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
int d= txtArea.getText().length();
contador.setText(String.valueOf(d));
if(d==50){
    txtArea.append("\n\n");
}if (d==100){
    txtArea.append("\n\n");
    }if (d==150){
    txtArea.append("\n\n");
}if(d==200){
    txtArea.append("\n\n");
}if (d==250){
    txtArea.append("\n\n");
}if(d==300){
    txtArea.append("\n\n");
}if (d==350){
    txtArea.append("\n\n");
}if(d==400){
    txtArea.append("\n\n");
}if (d==450){
    txtArea.append("\n\n");
}if(d==500){
    txtArea.append("\n\n");
}if (d==550){
    txtArea.append("\n\n");
}if(d==600){
    txtArea.append("\n\n");
}if (d==650){
    txtArea.append("\n\n");
}if(d==700){
    txtArea.append("\n\n");
}if (d==750){
    txtArea.append("\n\n");
}if(d==800){
    txtArea.append("\n\n");
}if (d==850){
    txtArea.append("\n\n");
}if(d==900){
    txtArea.append("\n\n");
}if (d==950){
    txtArea.append("\n\n");
}if(d==1000){
    txtArea.append("\n\n");
}if (d==1050){
    txtArea.append("\n\n");
}if(d==1100){
    txtArea.append("\n\n");
}if (d==1150){
    txtArea.append("\n\n");
}if(d==1200){
    txtArea.append("\n\n");
}if (d==1250){
    txtArea.append("\n\n\n\n\n\n");
    
    
    
}if(d==1300){
    txtArea.append("\n\n");
}if (d==1350){
    txtArea.append("\n\n");
}if(d==1400){
    txtArea.append("\n\n");
}if (d==1450){
    txtArea.append("\n\n");
}if(d==1500){
    txtArea.append("\n\n");
}if (d==1550){
    txtArea.append("\n\n");
}if(d==1600){
    txtArea.append("\n\n");
}if (d==1650){
    txtArea.append("\n\n");
}if(d==1700){
    txtArea.append("\n\n");
}if (d==1750){
    txtArea.append("\n\n");
}if(d==1800){
    txtArea.append("\n\n");
}if (d==1850){
    txtArea.append("\n\n");
}if(d==1900){
    txtArea.append("\n\n");
}if (d==1950){
    txtArea.append("\n\n");
    }if(d==2000){
    txtArea.append("\n\n");
}if (d==2050){
    txtArea.append("\n\n");
}if(d==2100){
    txtArea.append("\n\n");
}if (d==2150){
    txtArea.append("\n\n");
}if(d==2200){
    txtArea.append("\n\n");
}if (d==2250){
    txtArea.append("\n\n");
}if(d==2300){
    txtArea.append("\n\n");
}if (d==2350){
    txtArea.append("\n\n");
}if(d==2400){
    txtArea.append("\n\n");
}if (d==2450){
    txtArea.append("\n\n");
}if(d==2500){
    txtArea.append("\n\n\n\n\n\n");
 
}

else{}
    
    }//GEN-LAST:event_txtAreaKeyTyped

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
            java.util.logging.Logger.getLogger(editortextoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editortextoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editortextoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editortextoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editortextoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel contador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
