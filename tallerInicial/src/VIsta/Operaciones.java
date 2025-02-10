/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIsta;

import Logica.Gestionador;
import Logica.Persona;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Roa
 */
public class Operaciones extends javax.swing.JFrame {
    
    private Gestionador gestionador;

    public Operaciones(Gestionador gestionador) {
        initComponents();
        
        this.gestionador = gestionador;
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    
    public void cargarInformaciónEstudiante(String codigo){
        for(Persona estudiante:this.gestionador.getListaPersonas()){
            if(estudiante.getCodigo().equalsIgnoreCase(codigo)){
                jTFNewCodigo.setText(estudiante.getCodigo());
                jTFNewNombre.setText(estudiante.getNombre());
                jTFNewEdad.setText(estudiante.getEdad().toString());
                jSelectNewSexo.setSelectedItem(estudiante.getSexo());
                jSelectNewCiudad.setSelectedItem(estudiante.getCiudad());
                
                jTFNewCodigo.setEditable(false);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLMenu = new javax.swing.JLabel();
        jLCodigoSeleccionador = new javax.swing.JLabel();
        jLNewCodigo = new javax.swing.JLabel();
        jTFNewCodigo = new javax.swing.JTextField();
        jLNewSexo = new javax.swing.JLabel();
        jSelectNewSexo = new javax.swing.JComboBox<>();
        jLNewName = new javax.swing.JLabel();
        jTFNewNombre = new javax.swing.JTextField();
        jLNewCiudad = new javax.swing.JLabel();
        jSelectNewCiudad = new javax.swing.JComboBox<>();
        jLNewEdad = new javax.swing.JLabel();
        jTFNewEdad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLMenu7 = new javax.swing.JLabel();
        jLMenu8 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTFBuscador = new javax.swing.JTextField();
        jBActualizar = new javax.swing.JButton();
        jLError = new javax.swing.JLabel();
        jBReiniciarCampos = new javax.swing.JButton();
        jLFeedback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLMenu.setFont(new java.awt.Font("Noto Sans Mono", 1, 18)); // NOI18N
        jLMenu.setText("Operaciones");

        jLCodigoSeleccionador.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLCodigoSeleccionador.setText("Codigo:");

        jLNewCodigo.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLNewCodigo.setText("Codigo:");

        jTFNewCodigo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jTFNewCodigo.setText("");

        jLNewSexo.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLNewSexo.setText("Sexo:");

        jSelectNewSexo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jSelectNewSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino"}));
        jSelectNewSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectNewSexoActionPerformed(evt);
            }
        });

        jLNewName.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLNewName.setText("Nombre:");

        jTFNewNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jTFNewNombre.setText("");
        jTFNewNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNewNombreActionPerformed(evt);
            }
        });

        jLNewCiudad.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLNewCiudad.setText("Ciudad:");

        jSelectNewCiudad.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jSelectNewCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bucaramanga", "Girón", "Florida", "Piedecuesta" }));
        jSelectNewCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectNewCiudadActionPerformed(evt);
            }
        });

        jLNewEdad.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLNewEdad.setText("Edad:");

        jTFNewEdad.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jTFNewEdad.setText("");
        jTFNewEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNewEdadActionPerformed(evt);
            }
        });

        jLMenu7.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        jLMenu7.setText("Busqué al estudiante:");

        jLMenu8.setFont(new java.awt.Font("Noto Sans Mono", 1, 16)); // NOI18N
        jLMenu8.setText("Datos Estudiante");

        jBEliminar.setBackground(new java.awt.Color(102, 0, 0));
        jBEliminar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEliminarMouseClicked(evt);
            }
        });
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jBEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBEliminarKeyPressed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 102, 51));
        jBAgregar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarMouseClicked(evt);
            }
        });
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jBAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAgregarKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setText("Cargar Datos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTFBuscador.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jTFBuscador.setText("");
        jTFBuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFBuscadorFocusGained(evt);
            }
        });
        jTFBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBuscadorKeyPressed(evt);
            }
        });

        jBActualizar.setBackground(new java.awt.Color(0, 0, 102));
        jBActualizar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setText("Actualizar");
        jBActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBActualizarMouseClicked(evt);
            }
        });
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });
        jBActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBActualizarKeyPressed(evt);
            }
        });

        jLError.setFont(new java.awt.Font("Noto Sans Mono", 1, 14)); // NOI18N
        jLError.setForeground(new java.awt.Color(153, 0, 0));
        jLError.setText(" ");

        jBReiniciarCampos.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jBReiniciarCampos.setText("Reiniciar Campos");
        jBReiniciarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBReiniciarCamposMouseClicked(evt);
            }
        });
        jBReiniciarCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBReiniciarCamposKeyPressed(evt);
            }
        });

        jLFeedback.setFont(new java.awt.Font("Noto Sans Mono", 1, 14)); // NOI18N
        jLFeedback.setForeground(new java.awt.Color(0, 102, 51));
        jLFeedback.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLMenu8)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLMenu)
                        .addGap(158, 158, 158))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFeedback)
                    .addComponent(jLMenu7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLNewCodigo)
                            .addComponent(jLNewSexo)
                            .addComponent(jLNewName)
                            .addComponent(jLNewCiudad)
                            .addComponent(jLNewEdad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSelectNewCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSelectNewSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFNewNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFNewCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFNewEdad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCodigoSeleccionador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLError)
                    .addComponent(jBReiniciarCampos))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoSeleccionador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMenu8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jBReiniciarCampos)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNewCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNewCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNewSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectNewSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNewEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNewEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNewCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectNewCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBAgregar)
                    .addComponent(jBActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSelectNewSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectNewSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSelectNewSexoActionPerformed

    private void jTFNewNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNewNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNewNombreActionPerformed

    private void jSelectNewCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectNewCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSelectNewCiudadActionPerformed

    private void jTFNewEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNewEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNewEdadActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActualizarActionPerformed

    public void buscarEstudiante(){
         jLError.setText("");
        
        if(jTFBuscador.getText().trim().equals("")){
            jLError.setText("Digité un codigo Valido");
            this.reiniciarCampos();
            return;
        }
        
        for(Persona estudiante:this.gestionador.getListaPersonas()){
            if(estudiante.getCodigo().equalsIgnoreCase(jTFBuscador.getText().trim())){
                this.cargarInformaciónEstudiante(jTFBuscador.getText());
                return;
            }
        }
        
        jLError.setText("No se encontró un estudiante con ese codigo");
        this.reiniciarCampos();
    }
    
    public void reiniciarCampos() {
        jTFNewCodigo.setText("");
        jTFNewNombre.setText("");
        jTFNewEdad.setText("");
        jSelectNewSexo.setSelectedItem("Masculino");
        jSelectNewCiudad.setSelectedItem("Bucaramanga");

        jTFNewCodigo.setEditable(true);
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.buscarEstudiante();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.buscarEstudiante();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTFBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscadorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.buscarEstudiante();
        }
    }//GEN-LAST:event_jTFBuscadorKeyPressed

    private void jTFBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBuscadorFocusGained
          jTFBuscador.setText("");
    }//GEN-LAST:event_jTFBuscadorFocusGained

    public boolean camposValidos() {
        try {
            if (Integer.parseInt(jTFNewCodigo.getText().trim()) < 0 || "".equals(jTFNewCodigo.getText().trim()) || jTFNewCodigo.getText().trim().length() !=7) {
                JOptionPane.showMessageDialog(null, "¡Por favor digité un codigo valido!", "¡Campos invalidos!", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if ("".equals(jTFNewNombre.getText().trim())) {
                JOptionPane.showMessageDialog(null, "¡Por favor digité el nombre completo del estudiante!", "¡Campos invalidos!", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (Integer.parseInt(jTFNewEdad.getText().trim()) < 0 || "".equals(jTFNewEdad.getText().trim())) {
                JOptionPane.showMessageDialog(null, "¡Por favor digité una edad mayor a 0!", "¡Campos invalidos!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Por favor verifiqué que el codigo y la edad sean números validos!", "¡Campos invalidos!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void agregarEstudiante(){
        if(!this.camposValidos()){
            return;
        }    
        
        for(Persona estudiante:this.gestionador.getListaPersonas()){
            if(estudiante.getCodigo().equalsIgnoreCase(jTFNewCodigo.getText().trim())){
                JOptionPane.showMessageDialog(null, "¡Ya se ha registrado un estudiante con ese codigo!", "¡Codigo invalido!", JOptionPane.ERROR_MESSAGE);
                this.reiniciarCampos();
                return;
            }       
        }
        
        Persona nuevoEstudiante = new Persona(
                jTFNewCodigo.getText().trim(), 
                this.obtenerSexoAcortado(), 
                jTFNewNombre.getText().trim().toUpperCase(), 
                Integer.valueOf(jTFNewEdad.getText().trim()), 
                this.obtenerCodigoCiudad());
        
        jLFeedback.setText("¡Estudiante añadido Exitosamente!");
        
        ArrayList<Persona> listaActualizada = this.gestionador.getListaPersonas();
        listaActualizada.add(nuevoEstudiante);
        this.gestionador.setListaPersonas(listaActualizada);
        
        this.reiniciarCampos();
    }
    
    public String obtenerSexoAcortado(){
        if(jSelectNewSexo.getSelectedItem().toString().equalsIgnoreCase("Masculino")){
            return "M";
        } else {
           return "F";
        }
    }
    
    public Integer obtenerCodigoCiudad(){
        Integer codigoCiudad = 0; //Se inicializa en 0 pero siempre se actualizará
        switch(jSelectNewCiudad.getSelectedItem().toString()){
            case "Bucaramanga" -> codigoCiudad = 1;
            case "Girón" -> codigoCiudad = 2;
            case "Florida" -> codigoCiudad = 3;
            case "Piedecuesta" -> codigoCiudad = 4;
        }
        return codigoCiudad;
    }
    
    private void jBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseClicked
        this.agregarEstudiante();
    }//GEN-LAST:event_jBAgregarMouseClicked

    private void jBReiniciarCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBReiniciarCamposMouseClicked
        this.reiniciarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jBReiniciarCamposMouseClicked

    private void jBReiniciarCamposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBReiniciarCamposKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.reiniciarCampos();
        }
    }//GEN-LAST:event_jBReiniciarCamposKeyPressed

    private void jBAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAgregarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.agregarEstudiante();
        }
    }//GEN-LAST:event_jBAgregarKeyPressed

    private void jBActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizarMouseClicked
       if(!this.camposValidos()){
            return;
        }   
        
        for (Persona estudiante : this.gestionador.getListaPersonas()) {
            if (estudiante.getCodigo().equalsIgnoreCase(jTFNewCodigo.getText().trim())) {
                estudiante.setCiudad(jSelectNewCiudad.getSelectedItem().toString());
                estudiante.setCodigoCiudad(this.obtenerCodigoCiudad());
                estudiante.setSexo(jSelectNewSexo.getSelectedItem().toString());
                estudiante.setSexoAcortado(this.obtenerSexoAcortado());
                estudiante.setEdad(Integer.valueOf(jTFNewEdad.getText().trim()));
                estudiante.setNombre(jTFNewNombre.getText().trim().toUpperCase());

                jLFeedback.setText("¡Estudiante Actualizado Exitosamente!");
                this.cargarInformaciónEstudiante(jTFNewCodigo.getText());
                return;
            }
        }
        this.agregarEstudiante();
    }//GEN-LAST:event_jBActualizarMouseClicked

    private void jBActualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActualizarKeyPressed
        if(!this.camposValidos()){
            return;
        }   
        
        for (Persona estudiante : this.gestionador.getListaPersonas()) {
            if (estudiante.getCodigo().equalsIgnoreCase(jTFNewCodigo.getText().trim())) {
                estudiante.setCiudad(jSelectNewCiudad.getSelectedItem().toString());
                estudiante.setCodigoCiudad(this.obtenerCodigoCiudad());
                estudiante.setSexo(jSelectNewSexo.getSelectedItem().toString());
                estudiante.setSexoAcortado(this.obtenerSexoAcortado());
                estudiante.setEdad(Integer.valueOf(jTFNewEdad.getText().trim()));
                estudiante.setNombre(jTFNewNombre.getText().trim().toUpperCase());

                jLFeedback.setText("¡Estudiante Actualizado Exitosamente!");
                this.cargarInformaciónEstudiante(jTFNewCodigo.getText());
                return;
            }
        }
        this.agregarEstudiante();
    }//GEN-LAST:event_jBActualizarKeyPressed

    private void jBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseClicked
        for (Persona estudiante : this.gestionador.getListaPersonas()) {
            if (estudiante.getCodigo().equalsIgnoreCase(jTFBuscador.getText().trim())) {
                int dialogResult = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres eliminar a este estudiante?\n \n¡Es una acción irreversible!");
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Integer indiceAux = this.gestionador.getListaPersonas().indexOf(estudiante);
                    this.gestionador.getListaPersonas().remove(this.gestionador.getListaPersonas().get(indiceAux));
                    this.reiniciarCampos();
                    this.jTFBuscador.setText("");
                    return;
                }
            }
        }
        
         JOptionPane.showMessageDialog(null, "¡DIgité un codigo valido en el buscador!", "¡Codigo invalido!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jBEliminarMouseClicked

    private void jBEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBEliminarKeyPressed
        for (Persona estudiante : this.gestionador.getListaPersonas()) {
            if (estudiante.getCodigo().equalsIgnoreCase(jTFBuscador.getText().trim())) {
                int dialogResult = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres eliminar a este estudiante?\n \n¡Es una acción irreversible!");
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Integer indiceAux = this.gestionador.getListaPersonas().indexOf(estudiante);
                    this.gestionador.getListaPersonas().remove(this.gestionador.getListaPersonas().get(indiceAux));
                    this.reiniciarCampos();
                    this.jTFBuscador.setText("");
                    return;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "¡DIgité un codigo valido en el buscador!", "¡Codigo invalido!", JOptionPane.ERROR_MESSAGE);   
    }//GEN-LAST:event_jBEliminarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBReiniciarCampos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCodigoSeleccionador;
    private javax.swing.JLabel jLError;
    private javax.swing.JLabel jLFeedback;
    private javax.swing.JLabel jLMenu;
    private javax.swing.JLabel jLMenu7;
    private javax.swing.JLabel jLMenu8;
    private javax.swing.JLabel jLNewCiudad;
    private javax.swing.JLabel jLNewCodigo;
    private javax.swing.JLabel jLNewEdad;
    private javax.swing.JLabel jLNewName;
    private javax.swing.JLabel jLNewSexo;
    private javax.swing.JComboBox<String> jSelectNewCiudad;
    private javax.swing.JComboBox<String> jSelectNewSexo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFBuscador;
    private javax.swing.JTextField jTFNewCodigo;
    private javax.swing.JTextField jTFNewEdad;
    private javax.swing.JTextField jTFNewNombre;
    // End of variables declaration//GEN-END:variables
}
