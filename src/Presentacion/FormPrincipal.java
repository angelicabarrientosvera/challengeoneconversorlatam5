/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negocio.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class FormPrincipal extends javax.swing.JFrame {

    private Principal myPrincipal;

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        this.myPrincipal = new Principal();
    }

    public Principal getMyPrincipal() {
        return this.myPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMonedas = new javax.swing.JButton();
        btnTemperatura = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CONVERSIÓN A:");

        btnMonedas.setText("MONEDAS");
        btnMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedasActionPerformed(evt);
            }
        });

        btnTemperatura.setText("TEMPERATURA");
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedasActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: "));

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
                "Seleccion")).toString();
        if(ValidarNumero(valor) == true){
            JOptionPane.showMessageDialog(null, "Valor para conversion de monedas invalido");    
        }
        else
        this.myPrincipal.ConvertirMonedas(opcion, valor);
        //Ventana.imp(this.myPrincipal.ConvertirMonedas(opcion,valor), "SISTEMA");

    }//GEN-LAST:event_btnMonedasActionPerformed

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura a convertir: "));

        String opcion = (JOptionPane.showInputDialog(null, "Elije una opcion para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        if(ValidarNumero(valor) == true){
            JOptionPane.showMessageDialog(null, "Valor para temperatura invalido");    
        }
        else
            this.myPrincipal.ConvertirTemperatura(opcion, valor);
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    public static boolean ValidarNumero(double x) {
        try {
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMonedas;
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}