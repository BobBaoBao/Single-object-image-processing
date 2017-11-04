package ipe_f_java_version;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.ToolTipManager;
import javax.swing.filechooser.FileNameExtensionFilter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amir72c
 */
public class NewJFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        myinitComponents();
        setLocationRelativeTo(null);
        //System.out.println(marker_size);
        
    }
    
    private void refreshing() {
        axis.setBounds(10,10,frame_width-20,frame_height-20);
        Frame[] main_frame = NewJFrame.getFrames();
        main_frame[0].revalidate();
        main_frame[0].repaint();
        axis.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                int mouse_x=evt.getPoint().x;
                int mouse_y=evt.getPoint().y;
                if ((!"txt".equals(final_exts) && !"csv".equals(final_exts) && final_exts!=null) || (isfed_outside==true && outside_plot_request_type=="image")){
                    Color tooltip_data = new Color(img.getRGB((int)(((float)mouse_x/(float)axis.getWidth())*(float)img.getWidth()), (int)(((float)mouse_y/(float)axis.getHeight())*(float)img.getHeight())));
                    //JToolTip tooltip = axis.createToolTip();
                    //System.out.println(tooltip_data);
                    JComponent component = (JComponent)evt.getSource();
                    component.setToolTipText("R: "+Integer.toString(tooltip_data.getRed())+" G: "+Integer.toString(tooltip_data.getGreen())+" B: "+Integer.toString(tooltip_data.getBlue())+" X: "+(int)(((float)mouse_x/(float)axis.getWidth())*(float)img.getWidth())+" Y: "+(int)(((float)mouse_y/(float)axis.getHeight())*(float)img.getHeight()));
                    //tooltip.setTipText(Integer.toString(tooltip_data.getRed())+Integer.toString(tooltip_data.getGreen())+Integer.toString(tooltip_data.getBlue()));
                    //tooltip.setVisible(true);
                    ToolTipManager.sharedInstance().mouseMoved(evt);
                }
            }
        });
    }
    
    private void myinitComponents() {
        
        Frame[] main_frame = NewJFrame.getFrames();
        axis.setBounds(10,10,frame_width-20,frame_height-20);
        getContentPane().add(axis);
        main_frame[0].setSize(frame_width, frame_height);
        main_frame[0].revalidate();
        main_frame[0].repaint();
        timer = new Timer(timer_speed*1000, new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
            try {
                read_data(file_path,final_exts);
                axis.repaint();
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        if(timer_start==1){
            timer.start();
        }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Filemenu = new javax.swing.JMenu();
        Openfcn = new javax.swing.JMenuItem();
        Exitfcn = new javax.swing.JMenuItem();
        Editmenu = new javax.swing.JMenu();
        EditPlot = new javax.swing.JMenuItem();
        Refreshfcn = new javax.swing.JMenuItem();
        Aboutmenu = new javax.swing.JMenu();
        Helpfcn = new javax.swing.JMenuItem();
        Aboutfcn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Filemenu.setText("File");

        Openfcn.setText("Open");
        Openfcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenfcnActionPerformed(evt);
            }
        });
        Filemenu.add(Openfcn);

        Exitfcn.setText("Exit");
        Exitfcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitfcnActionPerformed(evt);
            }
        });
        Filemenu.add(Exitfcn);

        jMenuBar1.add(Filemenu);

        Editmenu.setText("Edit");

        EditPlot.setText("Edit plot");
        EditPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPlotActionPerformed(evt);
            }
        });
        Editmenu.add(EditPlot);

        Refreshfcn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Refreshfcn.setText("Refresh");
        Refreshfcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshfcnActionPerformed(evt);
            }
        });
        Editmenu.add(Refreshfcn);

        jMenuBar1.add(Editmenu);

        Aboutmenu.setText("about");

        Helpfcn.setText("Help");
        Helpfcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpfcnActionPerformed(evt);
            }
        });
        Aboutmenu.add(Helpfcn);

        Aboutfcn.setText("about");
        Aboutfcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutfcnActionPerformed(evt);
            }
        });
        Aboutmenu.add(Aboutfcn);

        jMenuBar1.add(Aboutmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitfcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitfcnActionPerformed
        // TODO add your handling code here:
        Frame[] main_frame = NewJFrame.getFrames();
        main_frame[0].dispose();
    }//GEN-LAST:event_ExitfcnActionPerformed

    private void RefreshfcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshfcnActionPerformed
        // TODO add your handling code here:
        try {
            if(file_path.length()!=0)
            {
                exts=file_path.split("\\.");
                final_exts=exts[exts.length-1];
                read_data(file_path,final_exts);
            }
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        axis.repaint();
    }//GEN-LAST:event_RefreshfcnActionPerformed

    private void OpenfcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenfcnActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser1.addChoosableFileFilter(new FileNameExtensionFilter("Comma separated value","csv"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        jFileChooser1.addChoosableFileFilter(new FileNameExtensionFilter("Text","txt"));
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        int returnVal = jFileChooser1.showOpenDialog(this);
        exts = ((FileNameExtensionFilter)jFileChooser1.getFileFilter()).getExtensions();
        final_exts=exts[0];
            if (returnVal == JFileChooser.APPROVE_OPTION){
                //file_name = jFileChooser1.getSelectedFile().getName();
                file_path = jFileChooser1.getSelectedFile().getPath();
                try {
                    read_data(file_path,final_exts);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                isfed_outside=false;
                axis.repaint();
            }
    }//GEN-LAST:event_OpenfcnActionPerformed

    private void AboutfcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutfcnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AboutfcnActionPerformed

    private void HelpfcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpfcnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HelpfcnActionPerformed

    private void EditPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPlotActionPerformed
        // TODO add your handling code here:
        Frame[] main_frame = NewJFrame.getFrames();
        edit_dialog = new EditDialog(main_frame[0],true,marker_size,show_number,show_grid,grid_number,timer_start,timer_speed);
        edit_dialog.setVisible(true);
        EditDialog edit_dialog1 = (EditDialog)edit_dialog;
        marker_size=edit_dialog1.dispatch_MarkerSize();
        show_number=edit_dialog1.dispatch_ShowNumber();
        show_grid=edit_dialog1.dispatch_ShowGrid();
        grid_number=edit_dialog1.dispatch_GridNumber();
        timer_start=edit_dialog1.dispatch_TimerStart();
        timer_speed=edit_dialog1.dispatch_TimerSpeed();
        if(timer_start==1){
            timer.setDelay(timer_speed*1000);
            timer.start();
            
        }else{
            timer.stop();
        }
        axis.repaint();
        //System.out.println(marker_size);
    }//GEN-LAST:event_EditPlotActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        frame_width=getContentPane().getSize().width;
        frame_height=getContentPane().getSize().height;
        refreshing();
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Read data */
        /*
        if(args.length != 0)
        {
            file_path=args[0];
            exts=file_path.split("\\.");
            final_exts=exts[exts.length-1];
            //System.out.println(exts[exts.length-1]);
            read_data(file_path,final_exts);
        }else
        {
            //file_name=null;
            data=null;
        }
        */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public void read_data(String file_name, String final_exts) throws FileNotFoundException, IOException{
        //System.out.println(file_name);
        if ("txt".equals(final_exts) || "csv".equals(final_exts))
        {
            BufferedReader br;
            br = new BufferedReader(new FileReader(file_name));
            String line;
            String[] raw_data_x = null;
            String[] raw_data_y = null;
            int counter=0;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                if (counter==0)
                {
                    raw_data_x = line.split(",");
                }else if(counter==1)
                {
                    raw_data_y = line.split(",");
                }
                counter=counter+1;
            
            }
            br.close();
            //System.out.println(raw_data_x.length);
            data=new int[2][raw_data_x.length];
            for (int i=0;i<raw_data_x.length;i++){
                data[0][i]=Integer.parseInt(raw_data_x[i]);
                data[1][i]=Integer.parseInt(raw_data_y[i]);
                //System.out.println("x:"+data[0][i]+"y:"+data[1][i]);
            }
        }else{
            for (String readerFileSuffixe : ImageIO.getReaderFileSuffixes()) {
                if (readerFileSuffixe.equals(final_exts)) {
                    //System.out.println("Image is loaded!!!");
                    try {
                        img = ImageIO.read(new File(file_name));
                    } catch (IOException e) {
                        
                    }
                    //int rgb=new Color(255,0,0).getRGB();
                    //for(int i=0;i<100;i++){
                    //    for(int j=0;j<100;j++){
                    //        img.setRGB(i, j, rgb);
                    //    }    
                    //}
                    
                }
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aboutfcn;
    private javax.swing.JMenu Aboutmenu;
    private javax.swing.JMenuItem EditPlot;
    private javax.swing.JMenu Editmenu;
    private javax.swing.JMenuItem Exitfcn;
    private javax.swing.JMenu Filemenu;
    private javax.swing.JMenuItem Helpfcn;
    private javax.swing.JMenuItem Openfcn;
    private javax.swing.JMenuItem Refreshfcn;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    
    //plot variables
    JPanel axis=new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.white);
                g.fillRect(0, 0, frame_width-20, frame_height-20);
                if (("txt".equals(final_exts) || "csv".equals(final_exts) && isfed_outside==false)||(isfed_outside==true && outside_plot_request_type=="scatter"))
                {
                    g.setColor(Color.black);
                    //for(int i=0;i<(axis.getSize().width);i=i+10)
                        //for(int j=0;j<(axis.getSize().height);j=j+10){
                            //g.drawOval(i, j, 2, 2);
                        //}
                    if(data != null)
                    {
                    g.setColor(Color.blue);
                    int max_x=data[0][0];
                    int max_y=data[1][0];
                    int min_x=data[0][0];
                    int min_y=data[1][0];
                    for (int i=1;i<data[0].length;i++){
                        if (data[0][i]>max_x)
                        {
                            max_x=data[0][i];
                        }
                        if (data[1][i]>max_y)
                        {
                            max_y=data[1][i];
                        }
                    
                        if (data[0][i]<min_x)
                        {
                            min_x=data[0][i];
                        }
                        if (data[1][i]<min_y)
                        {
                            min_y=data[1][i];
                        }
                    }
                    xlimit[0]=min_x;
                    xlimit[1]=max_x;
                    ylimit[0]=min_y;
                    ylimit[1]=max_y;
                    int final_range[][];
                    final_range = new int[][]{{min_x-((max_x-min_x)/10),max_x+((max_x-min_x)/10)},{min_y-((max_y-min_y)/10),max_y+((max_y-min_y)/10)}};
                    float aspect_x=(float)(final_range[0][1]-final_range[0][0])/((axis.getSize().width));
                    float aspect_y=(float)(final_range[1][1]-final_range[1][0])/((axis.getSize().height));
                    int[] mid_point_real;
                    mid_point_real = new int[]{final_range[0][0]+((final_range[0][1]-final_range[0][0])/2),final_range[1][0]+((final_range[1][1]-final_range[1][0])/2)};
                    int[] mid_point=new int[]{0,0};
                    mid_point[0]=(int)(((final_range[0][1]-final_range[0][0])/2)/aspect_x);
                    mid_point[1]=(int)(((final_range[1][1]-final_range[1][0])/2)/aspect_y);
                    //g.setColor(Color.red);
                    //g.drawOval(mid_point[0], (axis.getSize().height)-mid_point[1], 20, 20);
                    g.setColor(Color.blue);
                    int[][] transformed_data = new int[2][data[0].length];
                    //System.out.println(mid_point_real[1]);
                    for (int i=0;i<data[0].length;i++){
                        transformed_data[0][i]=data[0][i]-mid_point_real[0];
                        transformed_data[1][i]=data[1][i]-mid_point_real[1];
                        transformed_data[0][i]=Math.round((transformed_data[0][i])/aspect_x)+mid_point[0];
                        transformed_data[1][i]=Math.round((transformed_data[1][i])/aspect_y+mid_point[1]);
                    }
                    //System.out.println(transformed_data[0][1]);
                    if (show_number==1){
                        for (int i=0;i<data[0].length;i++){
                        g.drawOval(transformed_data[0][i], (axis.getSize().height)-transformed_data[1][i], marker_size, marker_size);
                        g.drawString(Integer.toString(data[0][i]), transformed_data[0][i]-marker_size, (axis.getSize().height)-transformed_data[1][i]);
                        g.drawString(Integer.toString(data[1][i]), transformed_data[0][i]+marker_size, (axis.getSize().height)-transformed_data[1][i]+2*marker_size);
                        }
                    }else{
                         for (int i=0;i<data[0].length;i++){
                            g.drawOval(transformed_data[0][i], (axis.getSize().height)-transformed_data[1][i], marker_size, marker_size);
                        }
                    }
                    if (show_grid==1)
                    {
                        g.setColor(Color.red);
                        for(int i=0;i<=grid_number;i=i+1){
                            g.drawString("("+Float.toString((float) final_range[0][0])+","+Float.toString((float) final_range[1][0]+(grid_number-i+1)*((final_range[1][1]-final_range[1][0])/(grid_number+1)))+")",5,10+i*((axis.getSize().height)/(grid_number+1)));
                            for(int j=0;j<=(axis.getSize().width);j=j+10){
                                g.drawString("-",j,10+i*((axis.getSize().height)/(grid_number+1)));
                            }
                        }
                        for(int i=0;i<=grid_number;i=i+1){
                            g.drawString("("+Float.toString((float) final_range[0][0]+(i)*((final_range[0][1]-final_range[0][0])/(grid_number+1)))+","+Float.toString((float) final_range[1][0])+")",5+i*((axis.getSize().width)/(grid_number+1)),axis.getSize().height-10);
                            for(int j=0;j<=(axis.getSize().height);j=j+10){
                                g.drawString("-",i*((axis.getSize().width)/(grid_number+1)),j);
                            }
                        }
                        for(int i=0;i<=grid_number;i=i+1){
                            g.drawString("("+Float.toString((float) final_range[0][1])+","+Float.toString((float) final_range[1][0]+(i)*((final_range[1][1]-final_range[1][0])/(grid_number+1)))+")",axis.getSize().width-70,axis.getSize().height-10-i*((axis.getSize().height)/(grid_number+1)));
                            //for(int j=0;j<=(axis.getSize().width);j=j+10){
                            //    g.drawString("-",j,axis.getSize().height-i*((axis.getSize().height)/(num_grid+1)));
                            //}
                        }
                        for(int i=0;i<=grid_number;i=i+1){
                            g.drawString("("+Float.toString((float) final_range[0][0]+(grid_number-i+1)*((final_range[0][1]-final_range[0][0])/(grid_number+1)))+","+Float.toString((float) final_range[1][1])+")",axis.getSize().width-70-i*((axis.getSize().width)/(grid_number+1)),10);
                        }
                    }
                
                    }
                }else{
                    for (String readerFileSuffixe : ImageIO.getReaderFileSuffixes()) {
                        if (readerFileSuffixe.equals(final_exts) && isfed_outside==false) {
                            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                        }else if(isfed_outside==true && outside_plot_request_type=="image")
                        {
                            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                        }
                    }
                        
                }
                
                
            }
        };
    public int frame_width=420;
    public int frame_height=420;
    public Timer timer;
    public int[] xlimit=new int[]{0,0};
    public int[] ylimit=new int[]{0,0};
    public int[][] data;
    //static public String file_name="";
    static public String file_path="";
    public javax.swing.JDialog edit_dialog;
    public int marker_size=10;
    public int show_number=1;
    public int show_grid=1;
    public int grid_number=3;
    public int timer_start=0;
    public int timer_speed=10;
    public static String[] exts;
    public static String final_exts=null;
    public BufferedImage img = null;
    public boolean isfed_outside=false;
    public String outside_plot_request_type="";
    //plot variables
}
