package com.mcdorgle;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author mcdor
 */
public class MainFrm extends javax.swing.JFrame {
    private SugarsDatabase sugarsDatabase = new SugarsDatabase();
    
    /**
     * Creates new form MainFrm
     */
    public MainFrm() {
        initComponents();
        RatioInputMain.setText(sugarsDatabase.getRatio().toString());
        updateSugars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutdlg = new javax.swing.JDialog();
        desclabel = new javax.swing.JLabel();
        abtclosebtn = new javax.swing.JButton();
        authorlabel = new javax.swing.JLabel();
        verslabel = new javax.swing.JLabel();
        settingDlg = new javax.swing.JDialog();
        RatioLbl = new javax.swing.JLabel();
        RatioInput = new javax.swing.JTextField();
        SetUpdateBtn = new javax.swing.JButton();
        SettingsDesc = new javax.swing.JLabel();
        MainFormPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataOutput = new javax.swing.JTextArea();
        SugarInput = new javax.swing.JTextField();
        SugarLbl = new javax.swing.JLabel();
        CarbsLbl = new javax.swing.JLabel();
        CarbsInput = new javax.swing.JTextField();
        RatioLblMain = new javax.swing.JLabel();
        InsulinLbl = new javax.swing.JLabel();
        RatioInputMain = new javax.swing.JTextField();
        InsulinInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ExitBtnMain = new javax.swing.JButton();
        MainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        SettingsMenuIt = new javax.swing.JMenuItem();
        exitMenuIt = new javax.swing.JMenuItem();
        aboutmnu = new javax.swing.JMenu();

        desclabel.setText("<html>Java Sugar Miner is the JAVA version of Sugar Miner by Deshi McDorgle.  <br> This program is for generating reports and graphs from your Medtronic  Insulin pump<br>  and or Contour Next link blood glucose monitor via usb  and or bluetooth. It can also<br>  be used by diabetics without insulin pumps  by manually entering blood sugars, carbs<br> , and insulin dose/ratio.");

        abtclosebtn.setText("Close");
        abtclosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abtclosebtnActionPerformed(evt);
            }
        });

        authorlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        authorlabel.setText("Author: Deshi McDorgle");

        verslabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verslabel.setText("Version: 1.0.0.3");

        javax.swing.GroupLayout aboutdlgLayout = new javax.swing.GroupLayout(aboutdlg.getContentPane());
        aboutdlg.getContentPane().setLayout(aboutdlgLayout);
        aboutdlgLayout.setHorizontalGroup(
            aboutdlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutdlgLayout.createSequentialGroup()
                .addGroup(aboutdlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutdlgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desclabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aboutdlgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(authorlabel))
                    .addGroup(aboutdlgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(verslabel))
                    .addGroup(aboutdlgLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(abtclosebtn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        aboutdlgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authorlabel, verslabel});

        aboutdlgLayout.setVerticalGroup(
            aboutdlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutdlgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(authorlabel)
                .addGap(18, 18, 18)
                .addComponent(verslabel)
                .addGap(18, 18, 18)
                .addComponent(desclabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abtclosebtn)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        RatioLbl.setText("Ratio:");

        RatioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatioInputActionPerformed(evt);
            }
        });

        SetUpdateBtn.setText("Update");
        SetUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUpdateBtnActionPerformed(evt);
            }
        });

        SettingsDesc.setText("Enter your insulin/carb ratio");

        javax.swing.GroupLayout settingDlgLayout = new javax.swing.GroupLayout(settingDlg.getContentPane());
        settingDlg.getContentPane().setLayout(settingDlgLayout);
        settingDlgLayout.setHorizontalGroup(
            settingDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingDlgLayout.createSequentialGroup()
                .addGroup(settingDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingDlgLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(SetUpdateBtn))
                    .addGroup(settingDlgLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(settingDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SettingsDesc)
                            .addGroup(settingDlgLayout.createSequentialGroup()
                                .addComponent(RatioLbl)
                                .addGap(18, 18, 18)
                                .addComponent(RatioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        settingDlgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RatioInput, RatioLbl});

        settingDlgLayout.setVerticalGroup(
            settingDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingDlgLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(settingDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatioLbl)
                    .addComponent(RatioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SettingsDesc)
                .addGap(23, 23, 23)
                .addComponent(SetUpdateBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sugar Miner");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        DataOutput.setColumns(20);
        DataOutput.setRows(5);
        jScrollPane1.setViewportView(DataOutput);

        SugarLbl.setText("Sugar:");

        CarbsLbl.setText("Carbs:");

        RatioLblMain.setText("Ratio:");

        InsulinLbl.setText("Insulin:");

        RatioInputMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatioInputMainActionPerformed(evt);
            }
        });

        jButton1.setText("Add Entry");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ExitBtnMain.setText("Exit");
        ExitBtnMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitBtnMainMousePressed(evt);
            }
        });
        ExitBtnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainFormPanelLayout = new javax.swing.GroupLayout(MainFormPanel);
        MainFormPanel.setLayout(MainFormPanelLayout);
        MainFormPanelLayout.setHorizontalGroup(
            MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainFormPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainFormPanelLayout.createSequentialGroup()
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainFormPanelLayout.createSequentialGroup()
                                .addComponent(CarbsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CarbsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(InsulinLbl))
                            .addGroup(MainFormPanelLayout.createSequentialGroup()
                                .addComponent(SugarLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SugarInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(RatioLblMain)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainFormPanelLayout.createSequentialGroup()
                                .addComponent(InsulinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainFormPanelLayout.createSequentialGroup()
                                .addComponent(RatioInputMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitBtnMain)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        MainFormPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CarbsInput, CarbsLbl, InsulinInput, InsulinLbl, RatioInputMain, RatioLblMain, SugarInput, SugarLbl});

        MainFormPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ExitBtnMain, jButton1});

        MainFormPanelLayout.setVerticalGroup(
            MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFormPanelLayout.createSequentialGroup()
                .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainFormPanelLayout.createSequentialGroup()
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SugarLbl)
                            .addComponent(SugarInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RatioLblMain))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CarbsLbl)
                            .addComponent(CarbsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsulinLbl)))
                    .addGroup(MainFormPanelLayout.createSequentialGroup()
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RatioInputMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitBtnMain))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsulinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        SettingsMenuIt.setText("Settings");
        SettingsMenuIt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsMenuItMousePressed(evt);
            }
        });
        fileMenu.add(SettingsMenuIt);

        exitMenuIt.setText("Exit");
        exitMenuIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuIt);

        MainMenu.add(fileMenu);

        aboutmnu.setText("About");
        aboutmnu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutmnuMousePressed(evt);
            }
        });
        aboutmnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutmnuActionPerformed(evt);
            }
        });
        MainMenu.add(aboutmnu);

        setJMenuBar(MainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItActionPerformed
        sugarsDatabase.close();
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItActionPerformed

    private void aboutmnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmnuActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_aboutmnuActionPerformed

    private void abtclosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtclosebtnActionPerformed
aboutdlg.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_abtclosebtnActionPerformed

    private void aboutmnuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutmnuMousePressed
aboutdlg.setVisible(true);
aboutdlg.setBounds(400,0,500,250);
// TODO add your handling code here:
    }//GEN-LAST:event_aboutmnuMousePressed

    private void SettingsMenuItMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMenuItMousePressed
settingDlg.setVisible(true);
settingDlg.setBounds (400,0,350,250);
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsMenuItMousePressed

    private void SetUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUpdateBtnActionPerformed
        Integer ratio = Integer.parseInt(RatioInput.getText());
        sugarsDatabase.setRatio(ratio);
        settingDlg.setVisible(false);
        RatioInputMain.setText(sugarsDatabase.getRatio().toString()+":1");
        // TODO add your handling code here:
    }//GEN-LAST:event_SetUpdateBtnActionPerformed

    private void ExitBtnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBtnMainActionPerformed

    private void ExitBtnMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMainMousePressed
        exitMenuItActionPerformed(null);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBtnMainMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sugars sugars = new Sugars();
        sugars.setSugar(Integer.parseInt(SugarInput.getText()));
        sugars.setCarbs(Integer.parseInt(CarbsInput.getText()));
        sugars.setInsulin(Integer.parseInt(InsulinInput.getText()));
        sugars.setDatetime(LocalDateTime.now());
        sugarsDatabase.addSugars(sugars);
        updateSugars();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RatioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatioInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RatioInputActionPerformed

    private void RatioInputMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatioInputMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RatioInputMainActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarbsInput;
    private javax.swing.JLabel CarbsLbl;
    private javax.swing.JTextArea DataOutput;
    private javax.swing.JButton ExitBtnMain;
    private javax.swing.JTextField InsulinInput;
    private javax.swing.JLabel InsulinLbl;
    private javax.swing.JPanel MainFormPanel;
    private javax.swing.JMenuBar MainMenu;
    private javax.swing.JTextField RatioInput;
    private javax.swing.JTextField RatioInputMain;
    private javax.swing.JLabel RatioLbl;
    private javax.swing.JLabel RatioLblMain;
    private javax.swing.JButton SetUpdateBtn;
    private javax.swing.JLabel SettingsDesc;
    private javax.swing.JMenuItem SettingsMenuIt;
    private javax.swing.JTextField SugarInput;
    private javax.swing.JLabel SugarLbl;
    private javax.swing.JDialog aboutdlg;
    private javax.swing.JMenu aboutmnu;
    private javax.swing.JButton abtclosebtn;
    private javax.swing.JLabel authorlabel;
    private javax.swing.JLabel desclabel;
    private javax.swing.JMenuItem exitMenuIt;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog settingDlg;
    private javax.swing.JLabel verslabel;
    // End of variables declaration//GEN-END:variables

    private void updateSugars() {
        List<Sugars> sugars = sugarsDatabase.getSugars();
        String output = "";
        for(Sugars sugar : sugars) {
            String entry = String.format("sugars %d, carbs %d, insulin %d, Date Time %s",
                    sugar.getSugar(),
                    sugar.getCarbs(),
                    sugar.getInsulin(),
                    sugar.getDatetime().toString());
            output += entry + "\n";
        }
        DataOutput.setText(output);
    }
    
    private static class jDialog {

        private static void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jDialog() {
        }
    }
}
