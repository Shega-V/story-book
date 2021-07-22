/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab9storybook;

/**
 *
 * @author shegavala
 */
public class EndFrame extends javax.swing.JFrame {
    
    private StorybookModel myModel; 
    /** Creates new form EndFrame */
    public EndFrame(StorybookModel model) {
        initComponents();
        this.myModel = model;
        welcomeLabel.setText("Welcome,  "+ myModel.getUsername()+".");
        crimeLabel.setText("You have been accuse of " + myModel.getCrime() + "!");
        instructionLabel.setText("Pick a dore to determine your verdict.");
        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Door.GIF")));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        crimeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        leftDoorButton = new javax.swing.JButton();
        rightDoorButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Next = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome");

        crimeLabel.setText("Crime");

        jLabel2.setText(" ");

        instructionLabel.setText("Pick a door to determine your verdict.");

        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Door.GIF"))); // NOI18N
        leftDoorButton.setText("Click");
        leftDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftDoorButtonActionPerformed(evt);
            }
        });

        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Door.GIF"))); // NOI18N
        rightDoorButton.setText("Click");
        rightDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightDoorButtonActionPerformed(evt);
            }
        });

        Exit.setText("Exit Tribunal");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Next.setText("Next Trial--->");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(welcomeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(instructionLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 573, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(crimeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(360, 360, 360)
                        .add(jLabel2))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(leftDoorButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .add(Exit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(32, 32, 32)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Next, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rightDoorButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(welcomeLabel)
                .add(18, 18, 18)
                .add(crimeLabel)
                .add(26, 26, 26)
                .add(instructionLabel)
                .add(55, 55, 55)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(leftDoorButton)
                    .add(rightDoorButton))
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Exit)
                    .add(Next))
                .add(54, 54, 54)
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftDoorButtonActionPerformed
        // TODO add your handling code here:
       leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Tiger.GIF"))); 
       instructionLabel.setText("You are GUILTY! Prepare to be eaten!");
    }//GEN-LAST:event_leftDoorButtonActionPerformed

    private void rightDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightDoorButtonActionPerformed
        // TODO add your handling code here:
       rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Lady.GIF")));
       instructionLabel.setText( "You are INNOCENT! Sorry about that. Please accept this lady.");
    }//GEN-LAST:event_rightDoorButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        StartFrame startFrame =new StartFrame(myModel);
        startFrame.setVisible(true);
        
        this.dispose();
    
    }//GEN-LAST:event_NextActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Next;
    private javax.swing.JLabel crimeLabel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton leftDoorButton;
    private javax.swing.JButton rightDoorButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    

}
