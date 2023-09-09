/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ejemplopoo.paneles;

import ejemplopoo.elementos.Cuenta;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author edush
 */
public class panelCuenta extends javax.swing.JPanel {

    /**
     * Creates new form cuenta
     */
    public panelCuenta() {
        initComponents();
        rutaImagenDefecto=getClass().getResource("/img/fotoDefault.png").toString();
        rutaImagenDefecto=rutaImagenDefecto.replace("file:/", "");        
        listaCuentas.add(new Cuenta("Eduardo", "Garcia", "2023",rutaImagenDefecto, "2023",true));
        fotoActual(rutaImagenDefecto.toString());
        this.revalidate();
        this.repaint();
    }
    
    
    public void fotoActual(String origen){
        ImageIcon imageIcon = new ImageIcon(origen);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100,100, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        fotoActual.setIcon(scaledImageIcon);
        this.repaint();
    }
    
    public void fotoPreview(String origen){
        ImageIcon imageIcon = new ImageIcon(origen);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100,100, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        subirFoto.setIcon(scaledImageIcon);
        this.repaint();
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
        jTextArea1 = new javax.swing.JTextArea();
        fotoActual = new javax.swing.JLabel();
        subirImagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        subirFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        nuevaClave = new javax.swing.JPasswordField();
        revalidarNueva = new javax.swing.JPasswordField();
        guardarCambios = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 102, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        fotoActual.setForeground(new java.awt.Color(0, 0, 0));
        fotoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoActual.setText("Foto actual");
        fotoActual.setPreferredSize(new java.awt.Dimension(100, 100));

        subirImagen.setText("Elegir imagen");
        subirImagen.setActionCommand("SubirImagen");
        subirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirImagenActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Foto actual");

        subirFoto.setForeground(new java.awt.Color(0, 0, 0));
        subirFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subirFoto.setText("Preview");
        subirFoto.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Revalidar contraseña");

        guardarCambios.setText("Guardar cambios");
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        mensaje.setForeground(new java.awt.Color(0, 0, 0));
        mensaje.setText("...");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(67, 67, 67)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nuevaClave)
                                    .addComponent(revalidarNueva)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apellidos)
                                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(mensaje))
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarCambios)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fotoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subirImagen)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subirImagen)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fotoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nuevaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(revalidarNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarCambios))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(mensaje)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirImagenActionPerformed
        
        fotoActual.setPreferredSize(new Dimension(100, 100));
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {            
                File seleccionarArchivo = fileChooser.getSelectedFile();                
                rutaFoto = seleccionarArchivo.getAbsolutePath();
                fotoPreview(rutaFoto);
        }        
    }//GEN-LAST:event_subirImagenActionPerformed

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        // TODO add your handling code here:
        String contrasenia="";
        char[] nuevaChar = nuevaClave.getPassword();
        char[] revalidarChar = revalidarNueva.getPassword();
        String nueva = new String(nuevaChar);
        String revalidar = new String(revalidarChar); 
        
        if(nueva.equals(revalidar) && !nueva.equals("") && !revalidar.equals("")){
            contrasenia = nueva;
            listaCuentas.add(new Cuenta(nombres.getText(), apellidos.getText(), contrasenia, rutaFoto, usuario.getText(),false));
            
            JOptionPane.showConfirmDialog(this, "Se a agregado al usuario:  "+usuario.getText(), "Confirmar acción", JOptionPane.DEFAULT_OPTION);
            
            nuevaClave.setText("");
            revalidarNueva.setText("");            
            nombres.setText("");
            apellidos.setText("");
            usuario.setText("");
            mensaje.setText("");
            
            fotoActual(rutaFoto);
            fotoPreview(rutaImagenDefecto);
            this.revalidate();
            this.repaint();
            
            
        }else{
            mensaje.setText("La contraseña no es igual a la revalidación de contraseña o no ingresado una contraseña");
        }
        
            
        
        
        System.out.println("----------------------------");
        mostrarContenido();
    }//GEN-LAST:event_guardarCambiosActionPerformed

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }   
    
    public void mostrarContenido(){
        for(int i=0; i<listaCuentas.size(); i++){
            Cuenta temporal = new Cuenta();
            temporal = listaCuentas.get(i);
            System.out.println(i+". "+temporal.getNombres()+" "+temporal.getApellidos()+" "+temporal.getContraseña()+" "+temporal.getRutaFoto()+" "+temporal.getUsuario());
        }
    }
    
    private ArrayList<Cuenta> listaCuentas = new ArrayList <Cuenta>();
    private String rutaImagenDefecto = "";
    private String rutaFoto;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JLabel fotoActual;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nombres;
    private javax.swing.JPasswordField nuevaClave;
    private javax.swing.JPasswordField revalidarNueva;
    private javax.swing.JLabel subirFoto;
    private javax.swing.JButton subirImagen;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
