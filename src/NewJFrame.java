/**
 * Ben.C
 * Oct 7 2019
 * Program is a quiz about knowledge on the video game Halo
 */


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel1 = new javax.swing.JLabel();
        headerLabel1 = new javax.swing.JLabel();
        qtion1Label1 = new javax.swing.JLabel();
        qtion1ALabel1 = new javax.swing.JLabel();
        qtion1BLabel1 = new javax.swing.JLabel();
        qtion1CLabel1 = new javax.swing.JLabel();
        qtion1DLabel1 = new javax.swing.JLabel();
        answer1Txt1 = new javax.swing.JTextField();
        qtion2Label1 = new javax.swing.JLabel();
        qtion2ALabel1 = new javax.swing.JLabel();
        qtion2BLabel1 = new javax.swing.JLabel();
        qtion2CLabel1 = new javax.swing.JLabel();
        qtion2DLabel1 = new javax.swing.JLabel();
        answer2Txt1 = new javax.swing.JTextField();
        qtion3Label1 = new javax.swing.JLabel();
        qtion3ALabel1 = new javax.swing.JLabel();
        qtion3BLabel1 = new javax.swing.JLabel();
        qtion3CLabel1 = new javax.swing.JLabel();
        qtion3DLabel1 = new javax.swing.JLabel();
        answer3Txt1 = new javax.swing.JTextField();
        qtion4Label1 = new javax.swing.JLabel();
        qtion4ALabel1 = new javax.swing.JLabel();
        qtion4BLabel1 = new javax.swing.JLabel();
        qtion4CLabel1 = new javax.swing.JLabel();
        qtion4DLabel1 = new javax.swing.JLabel();
        answer4Txt1 = new javax.swing.JTextField();
        qtion5Label1 = new javax.swing.JLabel();
        qtion5ALabel1 = new javax.swing.JLabel();
        qtion5BLabel1 = new javax.swing.JLabel();
        qtion5CLabel1 = new javax.swing.JLabel();
        qtion5DLabel1 = new javax.swing.JLabel();
        answer5Txt1 = new javax.swing.JTextField();
        correctNumLabel1 = new javax.swing.JLabel();
        correctLabel1 = new javax.swing.JLabel();
        IncorrectLabel1 = new javax.swing.JLabel();
        incorrectNumLabel1 = new javax.swing.JLabel();
        percentageLabel1 = new javax.swing.JLabel();
        percentageNumLabel1 = new javax.swing.JLabel();
        qtion5btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        titleLabel1.setText("Halo Quiz");

        headerLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        headerLabel1.setText("Answer the questions below and then click check");

        qtion1Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion1Label1.setText("What gamemode is best resembles a sport:");

        qtion1ALabel1.setText("A) Fire Fight");

        qtion1BLabel1.setText("B) Griffball");

        qtion1CLabel1.setText("C) Slayer");

        qtion1DLabel1.setText("D) Infection");

        answer1Txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1Txt1ActionPerformed(evt);
            }
        });

        qtion2Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion2Label1.setText("Whats the upcoming Halo called?:");

        qtion2ALabel1.setText("A) Advanced Warfare");

        qtion2BLabel1.setText("B) Infinite");

        qtion2CLabel1.setText("C) New Order");

        qtion2DLabel1.setText("D) Reach");

        answer2Txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2Txt1ActionPerformed(evt);
            }
        });

        qtion3Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion3Label1.setText("What species are grunts:");

        qtion3ALabel1.setText("A) Flood");

        qtion3BLabel1.setText("B) Human");

        qtion3CLabel1.setText("C) Covenant ");

        qtion3DLabel1.setText("D) Forerunner");

        qtion4Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion4Label1.setText("What Type of swords are in Halo:");

        qtion4ALabel1.setText("A) Energy");

        qtion4BLabel1.setText("B) Daedric");

        qtion4CLabel1.setText("C) Steel");

        qtion4DLabel1.setText("D) Dragon Bone");

        answer4Txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4Txt1ActionPerformed(evt);
            }
        });

        qtion5Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion5Label1.setText("What rank is the main character in Halo:");

        qtion5ALabel1.setText("A) Eclipse");

        qtion5BLabel1.setText("B) Master Chief");

        qtion5CLabel1.setText("C) Inheritor ");

        qtion5DLabel1.setText("D) Mythic");

        correctNumLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        correctNumLabel1.setText("0/5");

        correctLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        correctLabel1.setText("Correct:");

        IncorrectLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        IncorrectLabel1.setText("Incorrect:");

        incorrectNumLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        incorrectNumLabel1.setText("0/5");

        percentageLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        percentageLabel1.setText("Percentage:");

        percentageNumLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        percentageNumLabel1.setText("0%");

        qtion5btn1.setBackground(new java.awt.Color(255, 102, 255));
        qtion5btn1.setText("Check");
        qtion5btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtion5btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(titleLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(headerLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(qtion1Label1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtion1ALabel1)
                                .addComponent(qtion1BLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtion1CLabel1)
                                .addComponent(qtion1DLabel1))
                            .addGap(117, 117, 117)
                            .addComponent(answer1Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(qtion2Label1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(qtion2ALabel1)
                            .addGap(10, 10, 10)
                            .addComponent(qtion2CLabel1)
                            .addGap(111, 111, 111)
                            .addComponent(answer2Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(qtion2BLabel1)
                            .addGap(66, 66, 66)
                            .addComponent(qtion2DLabel1))
                        .addComponent(qtion3Label1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion3ALabel1)
                            .addGap(35, 35, 35)
                            .addComponent(qtion3CLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion3BLabel1)
                            .addGap(29, 29, 29)
                            .addComponent(qtion3DLabel1)
                            .addGap(155, 155, 155)
                            .addComponent(answer3Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(qtion4Label1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion4ALabel1)
                            .addGap(18, 18, 18)
                            .addComponent(qtion4CLabel1)
                            .addGap(194, 194, 194)
                            .addComponent(answer4Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion4BLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(qtion4DLabel1))
                        .addComponent(qtion5Label1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion5ALabel1)
                            .addGap(46, 46, 46)
                            .addComponent(qtion5CLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion5BLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(qtion5DLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(147, 147, 147)
                            .addComponent(answer5Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(correctLabel1)
                            .addGap(6, 6, 6)
                            .addComponent(correctNumLabel1)
                            .addGap(214, 214, 214)
                            .addComponent(qtion5btn1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(IncorrectLabel1)
                            .addGap(6, 6, 6)
                            .addComponent(incorrectNumLabel1)
                            .addGap(75, 75, 75)
                            .addComponent(percentageLabel1)
                            .addGap(6, 6, 6)
                            .addComponent(percentageNumLabel1)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titleLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(headerLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(qtion1Label1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion1ALabel1)
                            .addGap(11, 11, 11)
                            .addComponent(qtion1BLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(qtion1CLabel1)
                            .addGap(11, 11, 11)
                            .addComponent(qtion1DLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(answer1Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addComponent(qtion2Label1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qtion2ALabel1)
                        .addComponent(qtion2CLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(answer2Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qtion2BLabel1)
                        .addComponent(qtion2DLabel1))
                    .addGap(17, 17, 17)
                    .addComponent(qtion3Label1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qtion3ALabel1)
                        .addComponent(qtion3CLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(answer3Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtion3BLabel1)
                                .addComponent(qtion3DLabel1))))
                    .addGap(18, 18, 18)
                    .addComponent(qtion4Label1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(answer4Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtion4ALabel1)
                                .addComponent(qtion4CLabel1))))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qtion4BLabel1)
                        .addComponent(qtion4DLabel1))
                    .addGap(18, 18, 18)
                    .addComponent(qtion5Label1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qtion5ALabel1)
                        .addComponent(qtion5CLabel1))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(answer5Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtion5BLabel1)
                                .addComponent(qtion5DLabel1))))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(correctLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(correctNumLabel1))
                        .addComponent(qtion5btn1))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(incorrectNumLabel1)
                        .addComponent(percentageNumLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IncorrectLabel1)
                                .addComponent(percentageLabel1))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answer1Txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1Txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1Txt1ActionPerformed

    private void answer2Txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2Txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2Txt1ActionPerformed

    private void answer4Txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4Txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer4Txt1ActionPerformed

    private void qtion5btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtion5btn1ActionPerformed
        //All variables are declared below
        int incorrect;
        int correct;
        int score = 0;
        int incorrect1 = 0;
        double percentage;
       final String ANSWER1 = answer1Txt1.getText();
       final String ANSWER2 = answer2Txt1.getText();
       final String ANSWER3 = answer3Txt1.getText();
       final String ANSWER4 = answer4Txt1.getText();
       final String ANSWER5 = answer5Txt1.getText();

       //Calculates what ansswers are wrong and right and displays that as a percentage 
        if(ANSWER5.equals("b")|| (ANSWER5.equals("B"))){
            score = score + 1;
            correctNumLabel1.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel1.setText(incorrect1 + "/5");
        }
        if(ANSWER4.equals("a")|| (ANSWER4.equals("A"))){
            score = score + 1;
            correctNumLabel1.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel1.setText(incorrect1 + "/5");
        }
        if(ANSWER3.equals("c")|| (ANSWER3.equals("C"))){
            score = score + 1;
            correctNumLabel1.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel1.setText(incorrect1 + "/5");
        }
        if(ANSWER2.equals("b")|| (ANSWER2.equals("B"))){
            score = score + 1;
            correctNumLabel1.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel1.setText(incorrect1 + "/5");
        }
        if(ANSWER1.equals("b")|| (ANSWER1.equals("B"))){
            score = score + 1;
            correctNumLabel1.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel1.setText(incorrect1 + "/5");
           
        }
         percentage = ((double)score/5.0)*100;
            percentageNumLabel1.setText(percentage + ("%"));
    }//GEN-LAST:event_qtion5btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IncorrectLabel1;
    private javax.swing.JTextField answer1Txt1;
    private javax.swing.JTextField answer2Txt1;
    private javax.swing.JTextField answer3Txt1;
    private javax.swing.JTextField answer4Txt1;
    private javax.swing.JTextField answer5Txt1;
    private javax.swing.JLabel correctLabel1;
    private javax.swing.JLabel correctNumLabel1;
    private javax.swing.JLabel headerLabel1;
    private javax.swing.JLabel incorrectNumLabel1;
    private javax.swing.JLabel percentageLabel1;
    private javax.swing.JLabel percentageNumLabel1;
    private javax.swing.JLabel qtion1ALabel1;
    private javax.swing.JLabel qtion1BLabel1;
    private javax.swing.JLabel qtion1CLabel1;
    private javax.swing.JLabel qtion1DLabel1;
    private javax.swing.JLabel qtion1Label1;
    private javax.swing.JLabel qtion2ALabel1;
    private javax.swing.JLabel qtion2BLabel1;
    private javax.swing.JLabel qtion2CLabel1;
    private javax.swing.JLabel qtion2DLabel1;
    private javax.swing.JLabel qtion2Label1;
    private javax.swing.JLabel qtion3ALabel1;
    private javax.swing.JLabel qtion3BLabel1;
    private javax.swing.JLabel qtion3CLabel1;
    private javax.swing.JLabel qtion3DLabel1;
    private javax.swing.JLabel qtion3Label1;
    private javax.swing.JLabel qtion4ALabel1;
    private javax.swing.JLabel qtion4BLabel1;
    private javax.swing.JLabel qtion4CLabel1;
    private javax.swing.JLabel qtion4DLabel1;
    private javax.swing.JLabel qtion4Label1;
    private javax.swing.JLabel qtion5ALabel1;
    private javax.swing.JLabel qtion5BLabel1;
    private javax.swing.JLabel qtion5CLabel1;
    private javax.swing.JLabel qtion5DLabel1;
    private javax.swing.JLabel qtion5Label1;
    private javax.swing.JButton qtion5btn1;
    private javax.swing.JLabel titleLabel1;
    // End of variables declaration//GEN-END:variables
}
