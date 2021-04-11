/* Nama     : Intan Nas Nas Rabbiana
 * NIM      : 11200930000010
 * Kelas    : 2A- Sistem Informasi
 */
public class konversisuhu extends javax.swing.JFrame {

    double Celcius;
    double Fahrenheit;
    double Reamur;
    double Kelvin;
   
    public konversisuhu() {
        initComponents();
    }
    
    private void Celcius(){
        Celcius = Double.parseDouble(SuhuAwal.getText());
   
        Fahrenheit = Celcius * 1.8 + 32;
        Kelvin = Celcius + 273.15;
        Reamur = Celcius * 0.8;
       txtCelcius.setText(Celcius + " Celcius");
       txtFahrenheit.setText(Fahrenheit + " Fahrenheit");
       txtKelvin.setText(Kelvin+" Kelvin");
       txtReamur.setText(Reamur + " Reamur");
      
    }
    private void Fahrenheit(){
        Fahrenheit = Double.parseDouble(SuhuAwal.getText());
        
        Celcius = (Fahrenheit - 32)/ 1.8;
        Reamur = ( Fahrenheit - 32)/2.25;
        Kelvin  = (Fahrenheit + 459.67)/1.8;
       txtCelcius.setText(Celcius + " Celcius");
       txtFahrenheit.setText(Fahrenheit + " Fahrenheit");
       txtKelvin.setText(Kelvin+" Kelvin");
       txtReamur.setText(Reamur + " Reamur");
    }  
    private void Kelvin(){
        
        Kelvin = Double.parseDouble(SuhuAwal.getText());
        
        Fahrenheit = Kelvin * 1.8 -459.67;
        Celcius = Kelvin - 273.25;
        Reamur = (Kelvin - 273.15) * 0.8;
       txtCelcius.setText(Celcius + " Celcius");
       txtFahrenheit.setText(Fahrenheit + " Fahrenheit");
       txtKelvin.setText(Kelvin+" Kelvin");
       txtReamur.setText(Reamur + " Reamur");
    }
    
    private void Reamur(){
        
        Reamur = Double.parseDouble(SuhuAwal.getText());
        
        Fahrenheit = (Reamur * 2.25)+32;
        Kelvin = (Reamur/0.8)+ 273.15;
        Celcius = Reamur/ 0.8;
       txtCelcius.setText(Celcius + " Celcius");
       txtFahrenheit.setText(Fahrenheit + " Fahrenheit");
       txtKelvin.setText(Kelvin+" Kelvin");
       txtReamur.setText(Reamur + " Reamur");
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SuhuAwal = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        hasilcelcius = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        hasilfahrenheit = new javax.swing.JLabel();
        txtFahrenheit = new javax.swing.JTextField();
        hasilkelvin = new javax.swing.JLabel();
        txtReamur = new javax.swing.JTextField();
        hasilreamur = new javax.swing.JLabel();
        txtKelvin = new javax.swing.JTextField();
        btnreset = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SuhuAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuhuAwalActionPerformed(evt);
            }
        });
        getContentPane().add(SuhuAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 257, -1));

        rbCelcius.setBackground(new java.awt.Color(204, 204, 255));
        rbCelcius.setText("Celcius");
        rbCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelciusActionPerformed(evt);
            }
        });
        getContentPane().add(rbCelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        rbFahrenheit.setBackground(new java.awt.Color(204, 204, 255));
        rbFahrenheit.setText("Fahrenheit");
        getContentPane().add(rbFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        rbReamur.setBackground(new java.awt.Color(204, 204, 255));
        rbReamur.setText("Reamur");
        rbReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReamurActionPerformed(evt);
            }
        });
        getContentPane().add(rbReamur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        rbKelvin.setBackground(new java.awt.Color(204, 204, 255));
        rbKelvin.setText("Kelvin");
        getContentPane().add(rbKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        getContentPane().add(btnKonversi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        hasilcelcius.setBackground(new java.awt.Color(102, 153, 255));
        hasilcelcius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasilcelcius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasilcelcius.setText("Celcius");
        hasilcelcius.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        getContentPane().add(hasilcelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 20));

        txtCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelciusActionPerformed(evt);
            }
        });
        getContentPane().add(txtCelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, -1));

        hasilfahrenheit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasilfahrenheit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasilfahrenheit.setText("Fahrenheit");
        hasilfahrenheit.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        getContentPane().add(hasilfahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 20));
        getContentPane().add(txtFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 260, -1));

        hasilkelvin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasilkelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasilkelvin.setText("Kelvin");
        hasilkelvin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        getContentPane().add(hasilkelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 20));

        txtReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReamurActionPerformed(evt);
            }
        });
        getContentPane().add(txtReamur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 260, -1));

        hasilreamur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasilreamur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasilreamur.setText("Reamur");
        hasilreamur.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        getContentPane().add(hasilreamur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 20));
        getContentPane().add(txtKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 260, -1));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APLIKASI KONVERSI SUHU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 460, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Suhu Awal");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbReamurActionPerformed

    private void txtCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelciusActionPerformed

    private void txtReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReamurActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        if (rbCelcius.isSelected()){
            Celcius();
        } else if(rbFahrenheit.isSelected()){
            Fahrenheit();
        }else if(rbKelvin.isSelected()){
            Kelvin();
        }else if(rbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void rbCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelciusActionPerformed

    private void SuhuAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuhuAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuhuAwalActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        SuhuAwal.setText("");
        txtCelcius.setText("");
        txtFahrenheit.setText("");
        txtKelvin.setText("");
        txtReamur.setText("");
        rbCelcius.setSelected(false);
        rbFahrenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversisuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SuhuAwal;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JToggleButton btnreset;
    private javax.swing.JLabel hasilcelcius;
    private javax.swing.JLabel hasilfahrenheit;
    private javax.swing.JLabel hasilkelvin;
    private javax.swing.JLabel hasilreamur;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextField txtFahrenheit;
    private javax.swing.JTextField txtKelvin;
    private javax.swing.JTextField txtReamur;
    // End of variables declaration//GEN-END:variables
}
