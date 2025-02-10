/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIsta;

import Logica.Gestionador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Enumeration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Juan Roa
 */
public class Reporte extends javax.swing.JFrame {

    private  Gestionador gestionador;
    
    public Reporte(Gestionador gestionador) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        jPDiagCiudad.setLayout(new BorderLayout());
        jPDiagEdad.setLayout(new BorderLayout());
        jPDiagSexo.setLayout(new BorderLayout());
        
        this.gestionador = gestionador;
        this.hacerGraficos();

    }
    
    public void hacerGraficos(){
        DefaultPieDataset datosEdad = new DefaultPieDataset();
        Enumeration<String> edadKeys = this.gestionador.getGrupoEdad().keys();
        Enumeration<Integer> edadValues = this.gestionador.getGrupoEdad().elements();

        while (edadKeys.hasMoreElements()) {
            datosEdad.setValue(edadKeys.nextElement(), edadValues.nextElement());
        }
        
        DefaultPieDataset datosCiudad = new DefaultPieDataset();
        Enumeration<String> ciudadKeys = this.gestionador.getTotalPorCiudad().keys();
        Enumeration<Integer> ciudadValues = this.gestionador.getTotalPorCiudad().elements();

        while (ciudadKeys.hasMoreElements()) {
            datosCiudad.setValue(ciudadKeys.nextElement(), ciudadValues.nextElement());
        }
        
        DefaultPieDataset datosSexo = new DefaultPieDataset();
        Enumeration<String> sexoKeys = this.gestionador.getTotalPorSexo().keys();
        Enumeration<Integer> sexoValues = this.gestionador.getTotalPorSexo().elements();
        
        while (sexoKeys.hasMoreElements()) {
            datosSexo.setValue(sexoKeys.nextElement(), sexoValues.nextElement());
        }
        
        JFreeChart graficoSexo = ChartFactory.createPieChart("Distribución de Estudiantes por Sexo", datosSexo, true, true, true);
        JFreeChart graficoEdad = ChartFactory.createPieChart("Distribución de Estudiantes por Grupo de Edad", datosEdad, true, true, true);
        JFreeChart graficoCiudad = ChartFactory.createPieChart("Distribución de Estudiantes por CIudad", datosCiudad, true, true, true);
        
        ChartPanel panelSexo = new ChartPanel(graficoSexo);
        //panelSexo.setMouseWheelEnabled(true);
        panelSexo.setPreferredSize( new Dimension(400, 300));
        jPDiagSexo.add(panelSexo);
        
        ChartPanel panelEdad = new ChartPanel(graficoEdad);
        //panelEdad.setMouseWheelEnabled(true);
        panelEdad.setPreferredSize( new Dimension(400, 300));
        jPDiagEdad.add(panelEdad);
        
        ChartPanel panelCIudad = new ChartPanel(graficoCiudad);
        //panelCIudad.setMouseWheelEnabled(true);
        panelCIudad.setPreferredSize( new Dimension(400, 300));
        jPDiagCiudad.add(panelCIudad);
        
        pack();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPContenedor = new javax.swing.JPanel();
        jLMenu = new javax.swing.JLabel();
        jPDiagCiudad = new javax.swing.JPanel();
        jPDiagEdad = new javax.swing.JPanel();
        jPDiagSexo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLMenu.setFont(new java.awt.Font("Noto Sans Mono", 1, 18)); // NOI18N
        jLMenu.setText("Informe Especial");

        jPDiagCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPDiagCiudadLayout = new javax.swing.GroupLayout(jPDiagCiudad);
        jPDiagCiudad.setLayout(jPDiagCiudadLayout);
        jPDiagCiudadLayout.setHorizontalGroup(
            jPDiagCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPDiagCiudadLayout.setVerticalGroup(
            jPDiagCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jPDiagEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPDiagEdadLayout = new javax.swing.GroupLayout(jPDiagEdad);
        jPDiagEdad.setLayout(jPDiagEdadLayout);
        jPDiagEdadLayout.setHorizontalGroup(
            jPDiagEdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPDiagEdadLayout.setVerticalGroup(
            jPDiagEdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jPDiagSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPDiagSexoLayout = new javax.swing.GroupLayout(jPDiagSexo);
        jPDiagSexo.setLayout(jPDiagSexoLayout);
        jPDiagSexoLayout.setHorizontalGroup(
            jPDiagSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPDiagSexoLayout.setVerticalGroup(
            jPDiagSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Grupo 1: 0-4 años, Grupo 2: 5-9 años y Grupo 3: >10 años");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPContenedorLayout = new javax.swing.GroupLayout(jPContenedor);
        jPContenedor.setLayout(jPContenedorLayout);
        jPContenedorLayout.setHorizontalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorLayout.createSequentialGroup()
                .addGroup(jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContenedorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPDiagCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContenedorLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLMenu))
                    .addGroup(jPContenedorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPDiagSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPDiagEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        jPContenedorLayout.setVerticalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenedorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPDiagCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPDiagEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPDiagSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPDiagCiudad;
    private javax.swing.JPanel jPDiagEdad;
    private javax.swing.JPanel jPDiagSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
