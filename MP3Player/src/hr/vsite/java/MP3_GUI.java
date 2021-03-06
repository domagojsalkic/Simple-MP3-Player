/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.vsite.java;


/**
 *
 * @author Domagoj
 */
public class MP3_GUI extends javax.swing.JFrame {

    /**
     * Creates new form MP3_GUI
     */
    public MP3_Player mp3player = new MP3_Player();
    
    public MP3_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        functionPanel = new javax.swing.JPanel();
        openBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        replayBtn = new javax.swing.JButton();
        volumeDown = new javax.swing.JButton();
        volumeUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(90, 90, 90));
        titlePanel.setLayout(null);

        titleLabel.setBackground(new java.awt.Color(102, 102, 102));
        titleLabel.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(150, 150, 150));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Song title");
        titleLabel.setMaximumSize(new java.awt.Dimension(500, 35));
        titleLabel.setMinimumSize(new java.awt.Dimension(500, 35));
        titleLabel.setPreferredSize(new java.awt.Dimension(500, 35));
        titlePanel.add(titleLabel);
        titleLabel.setBounds(20, 20, 570, 35);

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 70));

        functionPanel.setBackground(new java.awt.Color(120, 120, 120));
        functionPanel.setLayout(null);

        openBtn.setBackground(new java.awt.Color(40, 40, 40));
        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/open.png"))); // NOI18N
        openBtn.setAlignmentY(1.0F);
        openBtn.setMaximumSize(new java.awt.Dimension(65, 65));
        openBtn.setMinimumSize(new java.awt.Dimension(65, 65));
        openBtn.setPreferredSize(new java.awt.Dimension(64, 64));
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        functionPanel.add(openBtn);
        openBtn.setBounds(400, 30, 64, 64);

        pauseBtn.setBackground(new java.awt.Color(40, 40, 40));
        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/pause.png"))); // NOI18N
        pauseBtn.setAlignmentY(1.0F);
        pauseBtn.setMaximumSize(new java.awt.Dimension(65, 65));
        pauseBtn.setMinimumSize(new java.awt.Dimension(65, 65));
        pauseBtn.setPreferredSize(new java.awt.Dimension(64, 64));
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });
        functionPanel.add(pauseBtn);
        pauseBtn.setBounds(140, 30, 64, 64);

        playBtn.setBackground(new java.awt.Color(40, 40, 40));
        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/play-button.png"))); // NOI18N
        playBtn.setAlignmentY(1.0F);
        playBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playBtn.setInheritsPopupMenu(true);
        playBtn.setMaximumSize(new java.awt.Dimension(65, 65));
        playBtn.setMinimumSize(new java.awt.Dimension(65, 65));
        playBtn.setPreferredSize(new java.awt.Dimension(80, 80));
        playBtn.setSelected(true);
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        functionPanel.add(playBtn);
        playBtn.setBounds(220, 20, 80, 80);

        stopBtn.setBackground(new java.awt.Color(40, 40, 40));
        stopBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/stop.png"))); // NOI18N
        stopBtn.setAlignmentY(1.0F);
        stopBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stopBtn.setMaximumSize(new java.awt.Dimension(65, 65));
        stopBtn.setMinimumSize(new java.awt.Dimension(65, 65));
        stopBtn.setPreferredSize(new java.awt.Dimension(80, 80));
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });
        functionPanel.add(stopBtn);
        stopBtn.setBounds(310, 20, 80, 80);

        replayBtn.setBackground(new java.awt.Color(40, 40, 40));
        replayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/replay.png"))); // NOI18N
        replayBtn.setAlignmentY(1.0F);
        replayBtn.setMaximumSize(new java.awt.Dimension(65, 65));
        replayBtn.setMinimumSize(new java.awt.Dimension(65, 65));
        replayBtn.setPreferredSize(new java.awt.Dimension(64, 64));
        replayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replayBtnActionPerformed(evt);
            }
        });
        functionPanel.add(replayBtn);
        replayBtn.setBounds(10, 30, 64, 64);

        volumeDown.setBackground(new java.awt.Color(40, 40, 40));
        volumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/minus.png"))); // NOI18N
        volumeDown.setAlignmentY(1.0F);
        volumeDown.setPreferredSize(new java.awt.Dimension(40, 40));
        volumeDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeDownActionPerformed(evt);
            }
        });
        functionPanel.add(volumeDown);
        volumeDown.setBounds(510, 40, 40, 40);

        volumeUp.setBackground(new java.awt.Color(40, 40, 40));
        volumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MP3_icons/plus.png"))); // NOI18N
        volumeUp.setAlignmentY(1.0F);
        volumeUp.setPreferredSize(new java.awt.Dimension(40, 40));
        volumeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeUpActionPerformed(evt);
            }
        });
        functionPanel.add(volumeUp);
        volumeUp.setBounds(560, 40, 40, 40);

        getContentPane().add(functionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 610, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        if(mp3player.IsOpened())
        {
            mp3player.Play();
            playBtn.setBackground(new java.awt.Color(40, 60, 60));
            pauseBtn.setBackground(new java.awt.Color(40, 40, 40));
        }
    }//GEN-LAST:event_playBtnActionPerformed

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        mp3player.OpenSong();
        if(mp3player.IsOpened())
        {
            titleLabel.setText(mp3player.songName());
        }
    }//GEN-LAST:event_openBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        if(mp3player.isPlaying())
        {
            playBtn.setBackground(new java.awt.Color(40, 40, 40));
        }
        else
        {
            pauseBtn.setBackground(new java.awt.Color(40, 40, 40));
        }
        mp3player.Stop();
    }//GEN-LAST:event_stopBtnActionPerformed

    private void replayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replayBtnActionPerformed
        mp3player.Repeat();
        if(mp3player.isRepeatEnable())
        {
            replayBtn.setBackground(new java.awt.Color(40, 60, 60));
        } else
        {
            replayBtn.setBackground(new java.awt.Color(40, 40, 40));
        }
    }//GEN-LAST:event_replayBtnActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
          if(mp3player.IsOpened())
          {  
            mp3player.Pause();
            pauseBtn.setBackground(new java.awt.Color(40, 60, 60));
            playBtn.setBackground(new java.awt.Color(40, 40, 40));
          }
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void volumeDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeDownActionPerformed
        mp3player.VolumeDown(0.05);
    }//GEN-LAST:event_volumeDownActionPerformed

    private void volumeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeUpActionPerformed
        mp3player.VolumeUp(0.05);
    }//GEN-LAST:event_volumeUpActionPerformed

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
            java.util.logging.Logger.getLogger(MP3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MP3_GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton replayBtn;
    private javax.swing.JButton stopBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton volumeDown;
    private javax.swing.JButton volumeUp;
    // End of variables declaration//GEN-END:variables
}
