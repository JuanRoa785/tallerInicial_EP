package VIsta;

import Logica.Gestionador;
import Logica.Persona;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Juan Roa
 */
public final class Index extends javax.swing.JFrame {

    private Gestionador gestionador;
    private JFileChooser seleccionadorArchivo = new JFileChooser();;
    private Reporte reporteEspecial;
    private Operaciones operaciones;

    public Index() {
        initComponents();
        
        TableColumnModel columnModel = jTPersonas.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(400);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(200);
        
        this.setLocationRelativeTo(null);
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> this.sincronizarTabla();
        service.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLMenu = new javax.swing.JLabel();
        jLStudentName = new javax.swing.JLabel();
        jLCourse = new javax.swing.JLabel();
        jBLoadData = new javax.swing.JButton();
        jBShowData = new javax.swing.JButton();
        jBOperations = new javax.swing.JButton();
        jBExportData = new javax.swing.JButton();
        jPContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLMenu.setFont(new java.awt.Font("Noto Sans Mono", 1, 18)); // NOI18N
        jLMenu.setText("Menú Principal");

        jLStudentName.setFont(new java.awt.Font("Noto Sans Mono", 0, 16)); // NOI18N
        jLStudentName.setText("Juan Diego Roa Porras - 2210086");

        jLCourse.setFont(new java.awt.Font("Noto Sans Mono", 0, 16)); // NOI18N
        jLCourse.setText("Entornos De Programación - UIS");

        jBLoadData.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jBLoadData.setText("Cargar Datos");
        jBLoadData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLoadDataMouseClicked(evt);
            }
        });
        jBLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoadDataActionPerformed(evt);
            }
        });

        jBShowData.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jBShowData.setText("Informe Especial");
        jBShowData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBShowDataMouseClicked(evt);
            }
        });
        jBShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowDataActionPerformed(evt);
            }
        });

        jBOperations.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jBOperations.setText("Operaciones");
        jBOperations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBOperationsMouseClicked(evt);
            }
        });
        jBOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOperationsActionPerformed(evt);
            }
        });

        jBExportData.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jBExportData.setText("Exportar Datos");
        jBExportData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBExportDataMouseClicked(evt);
            }
        });
        jBExportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExportDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jBLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBShowData))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jBOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBExportData, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLStudentName)
                                .addComponent(jLCourse))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLMenu)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLStudentName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLoadData)
                    .addComponent(jBShowData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOperations)
                    .addComponent(jBExportData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTPersonas.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jTPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo", "Sexo", "Nombre", "Edad", "CIudad"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Aquí se establece que ninguna celda es editable
            }
        }
    );
    jScrollPane1.setViewportView(jTPersonas);

    javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
    jPContent.setLayout(jPContentLayout);
    jPContentLayout.setHorizontalGroup(
        jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContentLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10))
    );
    jPContentLayout.setVerticalGroup(
        jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPContentLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10))
    );

    javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
    container.setLayout(containerLayout);
    containerLayout.setHorizontalGroup(
        containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(containerLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        .addGroup(containerLayout.createSequentialGroup()
            .addGap(313, 313, 313)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    containerLayout.setVerticalGroup(
        containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(containerLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(37, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoadDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLoadDataActionPerformed

    private void jBShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBShowDataActionPerformed

    private void jBOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOperationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOperationsActionPerformed

    private void jBExportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExportDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExportDataActionPerformed

    private void jBLoadDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLoadDataMouseClicked
       this.cerrarVentanasInnecesarias("todas");
        this.seleccionadorArchivo.showOpenDialog(null);
        File archivoSeleccionado = this.seleccionadorArchivo.getSelectedFile();
        
        if(archivoSeleccionado == null){
            return; 
        }
        
        if(!archivoSeleccionado.getName().contains("chicos.csv")) {
            JOptionPane.showMessageDialog(null, "¡Por favor seleccioné el archivo chicos.csv!", "¡Archivo Incorrecto!", JOptionPane.ERROR_MESSAGE);
        } else {
            String ruta = this.seleccionadorArchivo.getCurrentDirectory() + "/" + archivoSeleccionado.getName();
            try {
                Gestionador gestionadorAuxiliar = new Gestionador(ruta);
                this.gestionador = gestionadorAuxiliar; //Se asigna al atributo
                this.cargarPersonas();
                
            } catch (IOException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBLoadDataMouseClicked

    public void limpiarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) jTPersonas.getModel();
        modeloTabla.setRowCount(0);
    }
    
    private void jBShowDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBShowDataMouseClicked
        if (this.gestionador == null) {
            JOptionPane.showMessageDialog(null, "¡Por favor cargué el archivo chicos.csv para poder generar el informe!", "¡Archivo Sin Cargar!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (this.reporteEspecial != null) {
            if (this.reporteEspecial.isVisible()) {
                return;
            } 
        }
        
        this.cerrarVentanasInnecesarias("operaciones");
        this.reporteEspecial = new Reporte(this.gestionador);
        this.reporteEspecial.setVisible(true);
    }//GEN-LAST:event_jBShowDataMouseClicked

    private void jBOperationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOperationsMouseClicked
        if (this.gestionador == null) {
            JOptionPane.showMessageDialog(null, "¡Por favor cargué el archivo chicos.csv para poder editarlo!", "¡Archivo Sin Cargar!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (this.operaciones != null) {
            if (this.operaciones.isVisible()) {
                return;
            }
        }

        this.cerrarVentanasInnecesarias("reporte");
        this.operaciones = new Operaciones(this.gestionador);
        this.operaciones.setVisible(true);
    }//GEN-LAST:event_jBOperationsMouseClicked

    private void jBExportDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBExportDataMouseClicked
        if (this.gestionador == null) {
            JOptionPane.showMessageDialog(null, "¡Por favor cargué el archivo chicos.csv para poder editarlo y luego exportarlo!", "¡Archivo Sin Cargar!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        String ruta = this.seleccionadorArchivo.getCurrentDirectory() + "/" + date.format(now) + "-chicos.csv";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            boolean estoyEnElCSV = false;
            for (Persona estudiante : this.gestionador.getListaPersonas()) {
                if (estudiante.getCodigo().equalsIgnoreCase("2210086")) {
                    estoyEnElCSV = true;
                }

                writer.write(estudiante.getCodigo() + "," + estudiante.getSexoAcortado() + "," + estudiante.getNombre() + ","
                        + estudiante.getEdad().toString() + "," + estudiante.getCodigoCiudad().toString() + "\n");
            }

            if (!estoyEnElCSV) {
                writer.write("2210086,M,JUAN DIEGO ROA PORRAS,21,1,5.0");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Se han exportado con exito los datos a la siguiente ruta: \n \n " + ruta, "¡Datos Exportados!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBExportDataMouseClicked

    public void cerrarVentanasInnecesarias(String tipo) {
        if (tipo.equalsIgnoreCase("todas")) {
            if (this.reporteEspecial != null) {
                this.reporteEspecial.setVisible(false);
            }

            if (this.operaciones != null) {
                this.operaciones.setVisible(false);
            }
        } else if (tipo.equalsIgnoreCase("reporte")) {
            if (this.reporteEspecial != null) {
                this.reporteEspecial.setVisible(false);
            }
        } else {
            if (this.operaciones != null) {
                this.operaciones.setVisible(false);
            }
        }
    }

    public void cargarPersonas() {
        DefaultTableModel model = (DefaultTableModel) jTPersonas.getModel();
        
        this.limpiarTabla();

        for (Persona persona : this.gestionador.getListaPersonas()) {
            //Generamos la estructura del movimiento:
            Object[] movimiento = {persona.getCodigo(), persona.getSexo(), persona.getNombre(), persona.getEdad(), persona.getCiudad()};
            model.addRow(movimiento);
        }

    }

    public void sincronizarTabla() {
        if (this.gestionador == null) {
           return;
        }
        
        this.cargarPersonas();
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Index index = new Index();
                index.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jBExportData;
    private javax.swing.JButton jBLoadData;
    private javax.swing.JButton jBOperations;
    private javax.swing.JButton jBShowData;
    private javax.swing.JLabel jLCourse;
    private javax.swing.JLabel jLMenu;
    private javax.swing.JLabel jLStudentName;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPersonas;
    // End of variables declaration//GEN-END:variables
}
