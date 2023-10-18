
package pizzarendelo;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PizzaRendelo extends javax.swing.JFrame {

   private int fizetendoOsszeg = 0;
   
   private void updateFizetendoOsszeg(){
       fizetendoOsszeg = 0;
       
       //Feltet ha selectelve van 
       
       if(jCheckBoxSajt.isSelected()) {
           fizetendoOsszeg += 200;
       }
       if(jCheckBoxParadicsom.isSelected()) {
           fizetendoOsszeg += 250;
       }
       if(jCheckBoxSonka.isSelected()){
           fizetendoOsszeg += 400;
       }
       if(jCheckBoxGomba.isSelected()){
           fizetendoOsszeg += 300;
       }
       if(jCheckBoxPaprika.isSelected()){
           fizetendoOsszeg += 250;
       }
       if(jCheckBoxOlivabogyo.isSelected()){
           fizetendoOsszeg += 300;
       }
       if(jCheckBoxHagyma.isSelected()){
           fizetendoOsszeg += 400;
       }
       if(jCheckBoxPepperoni.isSelected()){
           fizetendoOsszeg += 500;
       }
       
       //Feltet select vege
       
       
       
       //Teszta ha selectelve van
       
       if(jRadioButtonHaziTeszta.isSelected()){
           fizetendoOsszeg += 700;
       }
       if(jRadioButtonTeljKiorl.isSelected()){
           fizetendoOsszeg += 600;
       }
       if(jRadioButtonGlutenmentes.isSelected()){
           fizetendoOsszeg += 800;
       }
       
       //Teszta select vege
       
       
       
       // Meret ha selectelve van
       
       if(jRadioButtonHarmincNyolc.isSelected()) {
           fizetendoOsszeg += 600;
       }
       if(jRadioButtonNegyvenOt.isSelected()) {
           fizetendoOsszeg += 800;
       }
       
       // Meret select vege
       
       
       
       jTextFieldFizetendoOsszeg.setText(String.valueOf(fizetendoOsszeg +" " +"Ft"));
       
   }
   private String getKivalasztottFeltetek() {
    StringBuilder feltetek = new StringBuilder();
    if (jCheckBoxSajt.isSelected()) {
        feltetek.append("Sajt");
    }
    if (jCheckBoxParadicsom.isSelected()) {
        feltetek.append("Paradicsom ");
    }
    if (jCheckBoxSonka.isSelected()) {
        feltetek.append("Sonka ");
    }
    if (jCheckBoxGomba.isSelected()) {
        feltetek.append("Gomba ");
    }
    if (jCheckBoxPaprika.isSelected()) {
        feltetek.append("Paprika ");
    }
    if (jCheckBoxOlivabogyo.isSelected()) {
        feltetek.append("Olivabogyó ");
    }
    if (jCheckBoxHagyma.isSelected()) {
        feltetek.append("Hagyma ");
    }
    if (jCheckBoxPepperoni.isSelected()) {
        feltetek.append("Pepperoni ");
    }
    
    
    
    return feltetek.toString();
}

    private String getKivalasztottTeszta() {
        if (jRadioButtonHaziTeszta.isSelected()) {
            return "Házi tészta";
        }
        if (jRadioButtonTeljKiorl.isSelected()) {
            return "Teljes kiörlésű";
        }
        if (jRadioButtonGlutenmentes.isSelected()) {
            return "Gluténmentes";
        }
        return "";
    }

private String getKivalasztottMeret() {
    if (jRadioButtonHarmincNyolc.isSelected()) {
        return "38 cm";
    }
    if (jRadioButtonNegyvenOt.isSelected()) {
        return "45 cm";
    }
    return "";
}
   
    public PizzaRendelo() {
        initComponents();
        Image ikon = new ImageIcon(this.getClass().getResource("/kepek/pizzaIcon300.png")).getImage();
        this.setIconImage(ikon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTeszta = new javax.swing.ButtonGroup();
        buttonGroupMeret = new javax.swing.ButtonGroup();
        PizzaIcon = new javax.swing.JLabel();
        jPanelFeltet = new javax.swing.JPanel();
        jCheckBoxGomba = new javax.swing.JCheckBox();
        jCheckBoxSonka = new javax.swing.JCheckBox();
        jCheckBoxParadicsom = new javax.swing.JCheckBox();
        jCheckBoxPaprika = new javax.swing.JCheckBox();
        jCheckBoxSajt = new javax.swing.JCheckBox();
        jCheckBoxOlivabogyo = new javax.swing.JCheckBox();
        jCheckBoxPepperoni = new javax.swing.JCheckBox();
        jCheckBoxHagyma = new javax.swing.JCheckBox();
        jPanelTeszta = new javax.swing.JPanel();
        jRadioButtonHaziTeszta = new javax.swing.JRadioButton();
        jRadioButtonGlutenmentes = new javax.swing.JRadioButton();
        jRadioButtonTeljKiorl = new javax.swing.JRadioButton();
        jPanelMeret = new javax.swing.JPanel();
        jRadioButtonHarmincNyolc = new javax.swing.JRadioButton();
        jRadioButtonNegyvenOt = new javax.swing.JRadioButton();
        jLabelPizzaRendeloTItle = new javax.swing.JLabel();
        jButtonKilepes = new javax.swing.JButton();
        jTextFieldFizetendoOsszeg = new javax.swing.JTextField();
        jLabelAr = new javax.swing.JLabel();
        jButtonRendeles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza rendelő");
        setMinimumSize(new java.awt.Dimension(455, 455));

        PizzaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pizzaIcon300.png"))); // NOI18N

        jPanelFeltet.setBorder(javax.swing.BorderFactory.createTitledBorder("Feltét"));

        jCheckBoxGomba.setText("Gomba");
        jCheckBoxGomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGombaActionPerformed(evt);
            }
        });

        jCheckBoxSonka.setText("Sonka");
        jCheckBoxSonka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSonkaActionPerformed(evt);
            }
        });

        jCheckBoxParadicsom.setText("Paradicsom");
        jCheckBoxParadicsom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxParadicsomActionPerformed(evt);
            }
        });

        jCheckBoxPaprika.setText("Paprika");
        jCheckBoxPaprika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPaprikaActionPerformed(evt);
            }
        });

        jCheckBoxSajt.setText("Sajt");
        jCheckBoxSajt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSajtActionPerformed(evt);
            }
        });

        jCheckBoxOlivabogyo.setText("Olivabogyó");
        jCheckBoxOlivabogyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOlivabogyoActionPerformed(evt);
            }
        });

        jCheckBoxPepperoni.setText("Pepperoni");
        jCheckBoxPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPepperoniActionPerformed(evt);
            }
        });

        jCheckBoxHagyma.setText("Hagyma");
        jCheckBoxHagyma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHagymaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFeltetLayout = new javax.swing.GroupLayout(jPanelFeltet);
        jPanelFeltet.setLayout(jPanelFeltetLayout);
        jPanelFeltetLayout.setHorizontalGroup(
            jPanelFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxGomba)
                    .addComponent(jCheckBoxPaprika)
                    .addComponent(jCheckBoxParadicsom)
                    .addComponent(jCheckBoxSonka)
                    .addComponent(jCheckBoxSajt)
                    .addComponent(jCheckBoxHagyma)
                    .addComponent(jCheckBoxOlivabogyo)
                    .addComponent(jCheckBoxPepperoni))
                .addContainerGap())
        );
        jPanelFeltetLayout.setVerticalGroup(
            jPanelFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxParadicsom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSonka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxGomba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxPaprika)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxOlivabogyo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxPepperoni))
        );

        jPanelTeszta.setBorder(javax.swing.BorderFactory.createTitledBorder("Tészta"));

        buttonGroupTeszta.add(jRadioButtonHaziTeszta);
        jRadioButtonHaziTeszta.setText("Házi tészta");
        jRadioButtonHaziTeszta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHaziTesztaActionPerformed(evt);
            }
        });

        buttonGroupTeszta.add(jRadioButtonGlutenmentes);
        jRadioButtonGlutenmentes.setText("Gluténmentes ");
        jRadioButtonGlutenmentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGlutenmentesActionPerformed(evt);
            }
        });

        buttonGroupTeszta.add(jRadioButtonTeljKiorl);
        jRadioButtonTeljKiorl.setText("Teljes kiörlésű");
        jRadioButtonTeljKiorl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTeljKiorlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTesztaLayout = new javax.swing.GroupLayout(jPanelTeszta);
        jPanelTeszta.setLayout(jPanelTesztaLayout);
        jPanelTesztaLayout.setHorizontalGroup(
            jPanelTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonHaziTeszta)
                    .addComponent(jRadioButtonTeljKiorl)
                    .addComponent(jRadioButtonGlutenmentes))
                .addContainerGap())
        );
        jPanelTesztaLayout.setVerticalGroup(
            jPanelTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonHaziTeszta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTeljKiorl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonGlutenmentes)
                .addContainerGap())
        );

        jPanelMeret.setBorder(javax.swing.BorderFactory.createTitledBorder("Meret"));

        buttonGroupMeret.add(jRadioButtonHarmincNyolc);
        jRadioButtonHarmincNyolc.setText("38 cm");
        jRadioButtonHarmincNyolc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHarmincNyolcActionPerformed(evt);
            }
        });

        buttonGroupMeret.add(jRadioButtonNegyvenOt);
        jRadioButtonNegyvenOt.setText("45 cm");
        jRadioButtonNegyvenOt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNegyvenOtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMeretLayout = new javax.swing.GroupLayout(jPanelMeret);
        jPanelMeret.setLayout(jPanelMeretLayout);
        jPanelMeretLayout.setHorizontalGroup(
            jPanelMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonNegyvenOt)
                    .addComponent(jRadioButtonHarmincNyolc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMeretLayout.setVerticalGroup(
            jPanelMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonHarmincNyolc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNegyvenOt)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabelPizzaRendeloTItle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPizzaRendeloTItle.setText("Pizza rendelő");

        jButtonKilepes.setText("Kilépés");
        jButtonKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKilepesActionPerformed(evt);
            }
        });

        jLabelAr.setText("Ár");

        jButtonRendeles.setText("Rendelés");
        jButtonRendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRendelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanelFeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldFizetendoOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(PizzaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelTeszta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonRendeles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonKilepes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPizzaRendeloTItle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(165, 165, 165)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelPizzaRendeloTItle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTeszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PizzaIcon)
                    .addComponent(jPanelFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFizetendoOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAr))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonKilepes))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRendeles)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxGombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGombaActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxGombaActionPerformed

    private void jCheckBoxSajtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSajtActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxSajtActionPerformed

    private void jCheckBoxSonkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSonkaActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxSonkaActionPerformed

    private void jCheckBoxParadicsomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxParadicsomActionPerformed
       updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxParadicsomActionPerformed

    private void jCheckBoxPaprikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPaprikaActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxPaprikaActionPerformed

    private void jCheckBoxOlivabogyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOlivabogyoActionPerformed
       updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxOlivabogyoActionPerformed

    private void jCheckBoxHagymaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHagymaActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxHagymaActionPerformed

    private void jCheckBoxPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPepperoniActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jCheckBoxPepperoniActionPerformed

    private void jRadioButtonHaziTesztaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHaziTesztaActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jRadioButtonHaziTesztaActionPerformed

    private void jRadioButtonTeljKiorlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTeljKiorlActionPerformed
        updateFizetendoOsszeg();        
    }//GEN-LAST:event_jRadioButtonTeljKiorlActionPerformed

    private void jRadioButtonGlutenmentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGlutenmentesActionPerformed
        
        updateFizetendoOsszeg();        
    }//GEN-LAST:event_jRadioButtonGlutenmentesActionPerformed

    private void jRadioButtonHarmincNyolcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHarmincNyolcActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jRadioButtonHarmincNyolcActionPerformed

    private void jRadioButtonNegyvenOtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNegyvenOtActionPerformed
        updateFizetendoOsszeg();
    }//GEN-LAST:event_jRadioButtonNegyvenOtActionPerformed

    private void jButtonKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKilepesActionPerformed
        int valasztas = JOptionPane.showConfirmDialog(null, "Biztosan ki akarsz lépni?", "Kilépés megerősítése", JOptionPane.YES_NO_OPTION);
        if(valasztas == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonKilepesActionPerformed

    private void jButtonRendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRendelesActionPerformed
        JOptionPane.showMessageDialog(null, "Tesztverzió!","Cím",2);
        
        
        boolean vanMeretKivalasztva = jRadioButtonNegyvenOt.isSelected() || jRadioButtonHarmincNyolc.isSelected();
        boolean vanTesztaKivalasztva = jRadioButtonHaziTeszta.isSelected()|| jRadioButtonTeljKiorl.isSelected() || jRadioButtonGlutenmentes.isSelected();
         if (vanMeretKivalasztva && vanTesztaKivalasztva) {
        // Rendelés hozzáadva, készítsd elő a számlát
        String feltetek = getKivalasztottFeltetek();
        String tészta = getKivalasztottTeszta();
        String méret = getKivalasztottMeret();
        String fizetendo = jTextFieldFizetendoOsszeg.getText();

        String szamla = "Feltétek: " + feltetek + "\nTészta: " + tészta + "\nMéret: " + méret + "\nFizetendő összeg: " + fizetendo;

        JOptionPane.showMessageDialog(this, szamla, "Számla", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Válassz tészta fajtát és méretet", "Hiba", JOptionPane.ERROR_MESSAGE);            
    }
        
        
    }//GEN-LAST:event_jButtonRendelesActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaRendelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaRendelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PizzaIcon;
    private javax.swing.ButtonGroup buttonGroupMeret;
    private javax.swing.ButtonGroup buttonGroupTeszta;
    private javax.swing.JButton jButtonKilepes;
    private javax.swing.JButton jButtonRendeles;
    private javax.swing.JCheckBox jCheckBoxGomba;
    private javax.swing.JCheckBox jCheckBoxHagyma;
    private javax.swing.JCheckBox jCheckBoxOlivabogyo;
    private javax.swing.JCheckBox jCheckBoxPaprika;
    private javax.swing.JCheckBox jCheckBoxParadicsom;
    private javax.swing.JCheckBox jCheckBoxPepperoni;
    private javax.swing.JCheckBox jCheckBoxSajt;
    private javax.swing.JCheckBox jCheckBoxSonka;
    private javax.swing.JLabel jLabelAr;
    private javax.swing.JLabel jLabelPizzaRendeloTItle;
    private javax.swing.JPanel jPanelFeltet;
    private javax.swing.JPanel jPanelMeret;
    private javax.swing.JPanel jPanelTeszta;
    private javax.swing.JRadioButton jRadioButtonGlutenmentes;
    private javax.swing.JRadioButton jRadioButtonHarmincNyolc;
    private javax.swing.JRadioButton jRadioButtonHaziTeszta;
    private javax.swing.JRadioButton jRadioButtonNegyvenOt;
    private javax.swing.JRadioButton jRadioButtonTeljKiorl;
    private javax.swing.JTextField jTextFieldFizetendoOsszeg;
    // End of variables declaration//GEN-END:variables
}
