package ipe_f_java_version;

import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amir72c
 */
public class EditDialog extends javax.swing.JDialog {

    /**
     * Creates new form EditDialog
     */
    public EditDialog(java.awt.Frame parent, boolean modal, int marker_size, int show_number,int show_grid,int grid_number,int timer_start,int timer_speed) {
        super(parent, modal);
        mydialog = this;
        main_frame=(JFrame) parent;
        initComponents();
        MarkerSize.setValue(marker_size);
        if (show_number==1)
        {
            ShowNumber.setSelected(true);
        }else{
            ShowNumber.setSelected(false);
        }
        GridNumber.setValue(grid_number);
        if (show_grid==1)
        {
            ShowGrid.setSelected(true);
        }else{
            ShowGrid.setSelected(false);
        }
        if (timer_start==1)
        {
            TimerStart.setSelected(true);
        }else{
            TimerStart.setSelected(false);
        }
        TimerSpeed.setValue(timer_speed);
        TimerSpeedText.setText("Refrsh speed : "+Integer.toString(timer_speed));
        setLocationRelativeTo(null);
        refresh_all_values();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarkerSize = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        ShowNumber = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ShowGrid = new javax.swing.JCheckBox();
        Approve = new javax.swing.JButton();
        GridNumber = new javax.swing.JSlider();
        TimerStart = new javax.swing.JCheckBox();
        TimerSpeed = new javax.swing.JSlider();
        TimerSpeedText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MarkerSize.setMaximum(20);
        MarkerSize.setMinimum(1);
        MarkerSize.setValue(10);
        MarkerSize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MarkerSizeMouseDragged(evt);
            }
        });
        MarkerSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarkerSizeMouseClicked(evt);
            }
        });

        jLabel1.setText("Scatter marker size");

        ShowNumber.setSelected(true);
        ShowNumber.setText("Write position of data");
        ShowNumber.setToolTipText("");
        ShowNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowNumberActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of grids");

        ShowGrid.setSelected(true);
        ShowGrid.setText("Show grid");
        ShowGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowGridActionPerformed(evt);
            }
        });

        Approve.setText("Ok");
        Approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveActionPerformed(evt);
            }
        });

        GridNumber.setMaximum(10);
        GridNumber.setMinimum(1);
        GridNumber.setValue(3);
        GridNumber.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                GridNumberMouseDragged(evt);
            }
        });
        GridNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GridNumberMouseClicked(evt);
            }
        });

        TimerStart.setText("Timer existance to refresh plot of selected data");
        TimerStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimerStartActionPerformed(evt);
            }
        });

        TimerSpeed.setMaximum(50);
        TimerSpeed.setMinimum(1);
        TimerSpeed.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TimerSpeedMouseDragged(evt);
            }
        });
        TimerSpeed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerSpeedMouseClicked(evt);
            }
        });

        TimerSpeedText.setText("Refresh speed : 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MarkerSize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GridNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimerSpeedText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TimerSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(ShowNumber)
                            .addComponent(ShowGrid)
                            .addComponent(TimerStart)
                            .addComponent(Approve))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarkerSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ShowNumber)
                .addGap(18, 18, 18)
                .addComponent(ShowGrid)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GridNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TimerStart)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimerSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimerSpeedText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Approve)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MarkerSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarkerSizeMouseClicked
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_MarkerSizeMouseClicked

    private void MarkerSizeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarkerSizeMouseDragged
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_MarkerSizeMouseDragged
public int dispatch_MarkerSize(){
        return marker_size;
    }

    private void ShowNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowNumberActionPerformed
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_ShowNumberActionPerformed

    public int dispatch_ShowNumber(){
        return show_number;
    }
    
    private void ShowGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowGridActionPerformed
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_ShowGridActionPerformed

    public int dispatch_ShowGrid(){
        return show_grid;
    }
    
    private void GridNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GridNumberMouseClicked
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_GridNumberMouseClicked

    private void GridNumberMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GridNumberMouseDragged
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_GridNumberMouseDragged

    public int dispatch_GridNumber(){
        return grid_number;
    }
    
    private void ApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveActionPerformed
        // TODO add your handling code here:
        mydialog.dispose();
        //setDefaultCloseOperation(EditDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ApproveActionPerformed

    private void TimerStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimerStartActionPerformed
        // TODO add your handling code here:
        refresh_all_values();
    }//GEN-LAST:event_TimerStartActionPerformed

    public int dispatch_TimerStart(){
        return timer_start;
    }
    
    private void TimerSpeedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerSpeedMouseClicked
        // TODO add your handling code here:
        refresh_all_values();
        TimerSpeedText.setText("Refrsh speed : "+Integer.toString(timer_speed));
    }//GEN-LAST:event_TimerSpeedMouseClicked

    
    private void TimerSpeedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerSpeedMouseDragged
        // TODO add your handling code here:
        refresh_all_values();
        TimerSpeedText.setText("Refrsh speed : "+Integer.toString(timer_speed));
    }//GEN-LAST:event_TimerSpeedMouseDragged

    public int dispatch_TimerSpeed(){
        return timer_speed;
    }

    
    public void refresh_all_values(){
        if (ShowNumber.isSelected()==true){
            show_number=1;
        }else{
            show_number=0;
        }
        dispatch_ShowNumber();
        marker_size = MarkerSize.getValue();
        //System.out.println(marker_size);
        dispatch_MarkerSize();
        if (ShowGrid.isSelected()==true){
            show_grid=1;
        }else{
            show_grid=0;
        }
        dispatch_ShowGrid();
        grid_number = GridNumber.getValue();
        dispatch_GridNumber();
        if (TimerStart.isSelected()==true){
            timer_start=1;
        }else{
            timer_start=0;
        }
        dispatch_TimerStart();
        timer_speed=TimerSpeed.getValue();
        dispatch_TimerSpeed();
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
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDialog dialog = new EditDialog(new javax.swing.JFrame(), true, marker_size,show_number,show_grid,grid_number,timer_start,timer_speed);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approve;
    private javax.swing.JSlider GridNumber;
    private javax.swing.JSlider MarkerSize;
    private javax.swing.JCheckBox ShowGrid;
    private javax.swing.JCheckBox ShowNumber;
    private javax.swing.JSlider TimerSpeed;
    private javax.swing.JLabel TimerSpeedText;
    private javax.swing.JCheckBox TimerStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    public JFrame main_frame=null;
    public static int marker_size;
    public static int show_number;
    public static int show_grid;
    public static int grid_number;
    public static int timer_start;
    public static int timer_speed;
    public static JDialog mydialog;
}
