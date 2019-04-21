/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfdverificatintool;

import com.sun.tools.javac.util.Pair;
import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell-1
 */
public class Launcher extends javax.swing.JFrame {
    
    public int levelSelected,noOfProcess,noOfStorage,noOfEntity;
    public static Vector<String> errors = new Vector();
    public ArrayList<Pair<String,String>> dataFlow = new ArrayList<>();

    /**
     * Creates new form Launcher
     */
    public Launcher() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noOfStorages = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dfdLevel = new javax.swing.JComboBox<>();
        noOfEntities = new javax.swing.JComboBox<>();
        noOfProcesses = new javax.swing.JComboBox<>();
        btnverify = new javax.swing.JButton();
        toEntity = new javax.swing.JComboBox<>();
        fromEntity = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        btnAddDataFlow = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gungsuh", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DFD Verification Tool");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 730, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Number of Storage");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 130, 30));

        noOfStorages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        noOfStorages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfStoragesActionPerformed(evt);
            }
        });
        getContentPane().add(noOfStorages, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 50, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Level of DFD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Number of Entities");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Number of Processes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, 30));

        dfdLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        dfdLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfdLevelActionPerformed(evt);
            }
        });
        getContentPane().add(dfdLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, 30));

        noOfEntities.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        noOfEntities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfEntitiesActionPerformed(evt);
            }
        });
        getContentPane().add(noOfEntities, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 50, 30));

        noOfProcesses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        noOfProcesses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfProcessesActionPerformed(evt);
            }
        });
        getContentPane().add(noOfProcesses, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 50, 30));

        btnverify.setText("Verify My DFD");
        btnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnverify, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 850, 40));

        getContentPane().add(toEntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 250, 30));

        getContentPane().add(fromEntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 30));

        jLabel3.setText("To");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setText("From");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 440, 150));

        btnAddDataFlow.setText("Start Adding Data Flow");
        btnAddDataFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataFlowActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDataFlow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, 860, 40));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jPanel1.setBackground(new java.awt.Color(196, 188, 100));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noOfStoragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfStoragesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfStoragesActionPerformed

    private void dfdLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfdLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dfdLevelActionPerformed

    private void noOfEntitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfEntitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfEntitiesActionPerformed

    private void noOfProcessesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfProcessesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfProcessesActionPerformed

    private void btnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyActionPerformed
        // TODO add your handling code here:
        String displayData = display.getText();
        if(displayData.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter Data Flows");
        }
        else
        {
             int left,right;
            for(int i = 0;i<noOfProcess;i++)
            {
               left = right = 0;
               for(int j = 0;j<dataFlow.size();j++)
               {
                   String first = dataFlow.get(j).fst;
                   String second = dataFlow.get(j).snd;
                   if(first.equals("Process " +i))
                       left = 1;
                   if(second.equals("Process "+i))
                       right=1;
               }
               if(left==0 || right==0)
                   errors.add("Process "+i+"  should have atleast one input and one output.");
            }
            for(int i = 0;i<noOfStorage;i++)
            {
               left = right = 0;
               for(int j = 0;j<dataFlow.size();j++)
               {
                   String first = dataFlow.get(j).fst;
                   String second = dataFlow.get(j).snd;
                   if(first.equals("Storage " +i))
                       left = 1;
                   if(second.equals("Storage "+i))
                       right=1;
               }
               if(left==0 || right==0)
                   errors.add("Storage "+i+"  should have atleast one input and one output.");
            }
            int flag=0;
               for(int j = 0;j<dataFlow.size();j++)
               {
                   char first = dataFlow.get(j).fst.charAt(0);
                   char second = dataFlow.get(j).snd.charAt(0);
                   if(first=='S' && second=='S')
                       errors.add("Two Storages "+"( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )"+ " cannot have direct dataflow ");
                    if(first=='E' && second=='E')
                       errors.add("Two Entities "+"( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )"+ " cannot have direct dataflow ");
                    if(first=='E' && second=='S')
                       errors.add("An Entity and a Storage "+"( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )"+ " cannot have direct dataflow ");
                    if(first=='S' && second=='E')
                       errors.add("An Entity and a Storage "+"( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )"+ " cannot have direct dataflow ");
                    if(dataFlow.get(j).fst.equals(dataFlow.get(j).snd))
                        errors.add("DFD should not have seif loop ( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )");
               }
            
               for(int i=0;i<dataFlow.size()-1;i++)
               {
                   for(int j=i+1;j<dataFlow.size();j++)
                   {
                       if((dataFlow.get(i).fst.equals(dataFlow.get(j).fst)) && (dataFlow.get(i).snd.equals(dataFlow.get(j).snd)))
                           errors.add("DFD should not have multiple edges ( "+dataFlow.get(j).fst+" --> "+dataFlow.get(j).snd+" )");
                   }
               }
            
//            for(int i =0;i<errors.size();i++)
//            {
//                System.out.println(errors.get(i));
//            }

            new Output().setVisible(true);
        }
    }//GEN-LAST:event_btnverifyActionPerformed

    private void btnAddDataFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataFlowActionPerformed
        // TODO add your handling code here:
        levelSelected = Integer.parseInt(dfdLevel.getSelectedItem().toString());
        noOfEntity = Integer.parseInt(noOfEntities.getSelectedItem().toString());
        noOfProcess = Integer.parseInt(noOfProcesses.getSelectedItem().toString());
        noOfStorage = Integer.parseInt(noOfStorages.getSelectedItem().toString());
        
        if(levelSelected==0 && noOfStorage!=0)
            errors.add("Level 0 DFD can't have any storage");
        if(noOfEntity==0 || noOfProcess==0)
            errors.add("DFD should contain atleast one process and one entity");
        if(levelSelected==0  &&  noOfProcess>1)
            errors.add("Level 0 DFD should not contain more than one process");
        
        String process = "Process ";
        String entity = "Entity ";
        String storage = "Storage ";
        for(int i=0;i<noOfProcess;i++)
        {
            fromEntity.addItem(process+i);
            toEntity.addItem(process+i);
        }
        for(int i=0;i<noOfEntity;i++)
        {
            fromEntity.addItem(entity+i);
            toEntity.addItem(entity+i);
        }
        for(int i=0;i<noOfStorage;i++)
        {
            fromEntity.addItem(storage+i);
            toEntity.addItem(storage+i);
        }
    }//GEN-LAST:event_btnAddDataFlowActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String from = fromEntity.getSelectedItem().toString();
        String to = toEntity.getSelectedItem().toString();
          display.setText(display.getText() + "\n"+ from + "  -->  " + to);
      dataFlow.add(new Pair<String,String>(from,to));
      
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Launcher().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddDataFlow;
    private javax.swing.JButton btnverify;
    private javax.swing.JComboBox<String> dfdLevel;
    private javax.swing.JTextArea display;
    private javax.swing.JComboBox<String> fromEntity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> noOfEntities;
    private javax.swing.JComboBox<String> noOfProcesses;
    private javax.swing.JComboBox<String> noOfStorages;
    private javax.swing.JComboBox<String> toEntity;
    // End of variables declaration//GEN-END:variables
}
