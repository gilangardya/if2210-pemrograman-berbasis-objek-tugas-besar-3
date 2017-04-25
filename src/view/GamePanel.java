/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.EnemyController;
import controller.PlayerController;
import controller.BackgroundController;
import java.util.Vector;
import javax.swing.JLabel;

/**
 * Panel permainan.
 * Berisi pemain dan musuh.
 * Warna background dapat berubah-ubah.
 * @author Asus
 */
public class GamePanel extends javax.swing.JPanel {
  /*Controller untuk player*/
  private PlayerController playerController;
  /*Controller untuk enemy*/
  private EnemyController enemyController;
  /*Controller untuk background*/
  private BackgroundController backgroundController;
  /*Parent*/
  private MainFrame parent;
  
  /**
   * Konstruktor.
   */
  public GamePanel() {
    initComponents();
    player.setFocusable(true);
    playerController = new PlayerController(player);
    backgroundController = new BackgroundController(this);
    Vector<JLabel> enemyVector = new Vector<>();
    enemyVector.add(wall1);
    enemyVector.add(wall2);
    enemyVector.add(wall3);
    enemyVector.add(cactus1);
    enemyVector.add(cactus2);
    enemyController = new EnemyController(enemyVector, this);
  }
  
  /**
   * Setter parent.
   * @param mainFrame parent 
   */
  public void setParent(MainFrame mainFrame) {
    parent = mainFrame;
  }
  
  /**
   * Getter parent.
   * @return parent
   */
  @Override
  public MainFrame getParent() {
    return parent;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    player = new javax.swing.JLabel();
    wall1 = new javax.swing.JLabel();
    wall2 = new javax.swing.JLabel();
    wall3 = new javax.swing.JLabel();
    cactus1 = new javax.swing.JLabel();
    cactus2 = new javax.swing.JLabel();

    setBackground(new java.awt.Color(102, 255, 204));
    setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    setMaximumSize(new java.awt.Dimension(714, 300));
    setMinimumSize(new java.awt.Dimension(714, 300));
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(714, 300));
    setLayout(null);

    player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/komodo.gif"))); // NOI18N
    player.setName("player"); // NOI18N
    player.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        playerKeyPressed(evt);
      }
    });
    add(player);
    player.setBounds(37, 222, 64, 78);

    wall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wall.png"))); // NOI18N
    wall1.setText("jLabel1");
    wall1.setMaximumSize(new java.awt.Dimension(35, 70));
    wall1.setMinimumSize(new java.awt.Dimension(35, 70));
    wall1.setName("wall"); // NOI18N
    wall1.setPreferredSize(new java.awt.Dimension(35, 70));
    add(wall1);
    wall1.setBounds(715, 230, 35, 70);

    wall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wall.png"))); // NOI18N
    wall2.setText("jLabel1");
    wall2.setMaximumSize(new java.awt.Dimension(35, 70));
    wall2.setMinimumSize(new java.awt.Dimension(35, 70));
    wall2.setName("wall"); // NOI18N
    wall2.setPreferredSize(new java.awt.Dimension(35, 70));
    add(wall2);
    wall2.setBounds(715, 230, 35, 70);

    wall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wall.png"))); // NOI18N
    wall3.setText("jLabel1");
    wall3.setMaximumSize(new java.awt.Dimension(35, 70));
    wall3.setMinimumSize(new java.awt.Dimension(35, 70));
    wall3.setName("wall"); // NOI18N
    wall3.setPreferredSize(new java.awt.Dimension(35, 70));
    add(wall3);
    wall3.setBounds(715, 230, 35, 70);

    cactus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cactus.png"))); // NOI18N
    cactus1.setText("jLabel1");
    cactus1.setMaximumSize(new java.awt.Dimension(35, 70));
    cactus1.setMinimumSize(new java.awt.Dimension(35, 70));
    cactus1.setName("cactus"); // NOI18N
    cactus1.setPreferredSize(new java.awt.Dimension(35, 70));
    add(cactus1);
    cactus1.setBounds(715, 230, 50, 70);

    cactus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cactus.png"))); // NOI18N
    cactus2.setText("jLabel1");
    cactus2.setMaximumSize(new java.awt.Dimension(35, 70));
    cactus2.setMinimumSize(new java.awt.Dimension(35, 70));
    cactus2.setName("cactus"); // NOI18N
    cactus2.setPreferredSize(new java.awt.Dimension(35, 70));
    add(cactus2);
    cactus2.setBounds(715, 230, 50, 70);

    getAccessibleContext().setAccessibleParent(this);
  }// </editor-fold>//GEN-END:initComponents

  private void playerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_playerKeyPressed
    if (!playerController.isStartJumping && evt.getExtendedKeyCode() == 38) {
      System.out.println("up");
      playerController.isStartJumping = true;
    }
  }//GEN-LAST:event_playerKeyPressed

  /**
   * Getter PlayerController.
   * @return PlayerController dari panel ini
   */
  public PlayerController getPlayerController() {
    return playerController;
  }
  
  /**
   * Getter EnemyController.
   * @return EnemyController dari panel ini
   */
  public EnemyController getEnemyController() {
    return enemyController;
  }
  
  /**
   * Getter BackgroundController.
   * @return BackgroundController dari panel ini
   */
  public BackgroundController getBackgroundController() {
    return backgroundController;
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel cactus1;
  private javax.swing.JLabel cactus2;
  private javax.swing.JLabel player;
  private javax.swing.JLabel wall1;
  private javax.swing.JLabel wall2;
  private javax.swing.JLabel wall3;
  // End of variables declaration//GEN-END:variables
}
