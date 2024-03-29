/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.DataController;
import java.io.FileNotFoundException;

/**
 * Panel skor.
 * Menampilkan skor permainan.
 * @author Asus
 */
public class ScorePanel extends javax.swing.JPanel {
  /*Controller untuk player*/
  private DataController dataController;
  
  /**
   * Creates new form ScorePanel.
   */
  public ScorePanel() {
    initComponents();
    try {
      dataController = new DataController(score, highScore,level);
    } catch (FileNotFoundException ex) {
      System.out.println("File Not Found");
    }
    //dataController.start();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    score = new javax.swing.JLabel();
    highScore = new javax.swing.JLabel();
    level = new javax.swing.JLabel();

    setBackground(new java.awt.Color(153, 153, 153));
    setMaximumSize(new java.awt.Dimension(714, 50));
    setMinimumSize(new java.awt.Dimension(714, 50));

    score.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    score.setForeground(new java.awt.Color(0, 0, 0));
    score.setText("Score : ");

    highScore.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    highScore.setForeground(new java.awt.Color(0, 0, 0));
    highScore.setText("High Score : ");

    level.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    level.setForeground(new java.awt.Color(0, 0, 0));
    level.setText("Level : ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(106, 106, 106)
        .addComponent(level)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
        .addComponent(highScore)
        .addGap(124, 124, 124)
        .addComponent(score)
        .addGap(156, 156, 156))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(score)
          .addComponent(highScore)
          .addComponent(level))
        .addContainerGap(16, Short.MAX_VALUE))
    );
  }
  // </editor-fold>//GEN-END:initComponents

  /**
   * Getter DataController.
   * @return DataController dari panel ini
   */
  public DataController getDataController() {
    return dataController;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel highScore;
  private javax.swing.JLabel level;
  private javax.swing.JLabel score;
  // End of variables declaration//GEN-END:variables
}
