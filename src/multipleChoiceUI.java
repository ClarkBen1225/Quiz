

/**
 *Benjamin Clark
 * Oct 2nd 2019
 * A 5 question multiple choice quiz that calculates incorrect correct and percentage
 */
public class multipleChoiceUI extends javax.swing.JFrame {

    /**
     * Creates new form multipleChoiceUI
     */
    public multipleChoiceUI() {
        //Variable Declaration
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        qtion1Label = new javax.swing.JLabel();
        qtion1ALabel = new javax.swing.JLabel();
        qtion1BLabel = new javax.swing.JLabel();
        qtion1CLabel = new javax.swing.JLabel();
        qtion1DLabel = new javax.swing.JLabel();
        answer1Txt = new javax.swing.JTextField();
        qtion2Label = new javax.swing.JLabel();
        qtion2ALabel = new javax.swing.JLabel();
        qtion2BLabel = new javax.swing.JLabel();
        qtion2CLabel = new javax.swing.JLabel();
        qtion2DLabel = new javax.swing.JLabel();
        answer2Txt = new javax.swing.JTextField();
        qtion3Label = new javax.swing.JLabel();
        qtion3ALabel = new javax.swing.JLabel();
        qtion3BLabel = new javax.swing.JLabel();
        qtion3CLabel = new javax.swing.JLabel();
        qtion3DLabel = new javax.swing.JLabel();
        answer3Txt = new javax.swing.JTextField();
        qtion4Label = new javax.swing.JLabel();
        qtion4ALabel = new javax.swing.JLabel();
        qtion4BLabel = new javax.swing.JLabel();
        qtion4CLabel = new javax.swing.JLabel();
        qtion4DLabel = new javax.swing.JLabel();
        answer4Txt = new javax.swing.JTextField();
        qtion5Label = new javax.swing.JLabel();
        qtion5ALabel = new javax.swing.JLabel();
        qtion5BLabel = new javax.swing.JLabel();
        qtion5CLabel = new javax.swing.JLabel();
        qtion5DLabel = new javax.swing.JLabel();
        answer5Txt = new javax.swing.JTextField();
        correctNumLabel = new javax.swing.JLabel();
        correctLabel = new javax.swing.JLabel();
        IncorrectLabel = new javax.swing.JLabel();
        incorrectNumLabel = new javax.swing.JLabel();
        percentageLabel = new javax.swing.JLabel();
        percentageNumLabel = new javax.swing.JLabel();
        qtion5btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        titleLabel.setText("Halo Quiz");

        headerLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        headerLabel.setText("Answer the questions below and then click check");

        qtion1Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion1Label.setText("What gamemode is best resembles a sport:");

        qtion1ALabel.setText("A) Fire Fight");

        qtion1BLabel.setText("B) Griffball");

        qtion1CLabel.setText("C) Slayer");

        qtion1DLabel.setText("D) Infection");

        answer1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1TxtActionPerformed(evt);
            }
        });

        qtion2Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion2Label.setText("Whats the upcoming Halo called?:");

        qtion2ALabel.setText("A) Advanced Warfare");

        qtion2BLabel.setText("B) Infinite");

        qtion2CLabel.setText("C) New Order");

        qtion2DLabel.setText("D) Reach");

        answer2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2TxtActionPerformed(evt);
            }
        });

        qtion3Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion3Label.setText("What species are grunts:");

        qtion3ALabel.setText("A) Flood");

        qtion3BLabel.setText("B) Human");

        qtion3CLabel.setText("C) Covenant ");

        qtion3DLabel.setText("D) Forerunner");

        qtion4Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion4Label.setText("What Type of swords are in Halo:");

        qtion4ALabel.setText("A) Energy");

        qtion4BLabel.setText("B) Daedric");

        qtion4CLabel.setText("C) Steel");

        qtion4DLabel.setText("D) Dragon Bone");

        answer4Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4TxtActionPerformed(evt);
            }
        });

        qtion5Label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        qtion5Label.setText("What rank is the main character in Halo:");

        qtion5ALabel.setText("A) Eclipse");

        qtion5BLabel.setText("B) Master Chief");

        qtion5CLabel.setText("C) Inheritor ");

        qtion5DLabel.setText("D) Mythic");

        correctNumLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        correctNumLabel.setText("0/5");

        correctLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        correctLabel.setText("Correct:");

        IncorrectLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        IncorrectLabel.setText("Incorrect:");

        incorrectNumLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        incorrectNumLabel.setText("0/5");

        percentageLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        percentageLabel.setText("Percentage:");

        percentageNumLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        percentageNumLabel.setText("0%");

        qtion5btn.setBackground(new java.awt.Color(255, 102, 255));
        qtion5btn.setText("Check");
        qtion5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtion5btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtion3ALabel)
                                    .addComponent(qtion3BLabel))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtion3DLabel)
                                    .addComponent(qtion3CLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(correctLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(134, 134, 134)
                                                    .addComponent(answer2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(245, 245, 245)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(answer1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(answer3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(answer5Txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                .addComponent(answer4Txt, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(correctNumLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(qtion5btn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(qtion4BLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(qtion4DLabel))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(qtion2DLabel)
                                        .addComponent(qtion3Label))
                                    .addComponent(qtion4Label)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(qtion4ALabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(qtion4CLabel))
                                    .addComponent(qtion5Label)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(qtion5BLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(qtion5DLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(qtion5ALabel)
                                            .addGap(46, 46, 46)
                                            .addComponent(qtion5CLabel)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IncorrectLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(incorrectNumLabel)
                                        .addGap(75, 75, 75)
                                        .addComponent(percentageLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(percentageNumLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(titleLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtion2BLabel)
                                    .addComponent(headerLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(qtion2ALabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(qtion2CLabel))
                                    .addComponent(qtion2Label)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qtion1BLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(qtion1ALabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qtion1CLabel)
                                            .addComponent(qtion1DLabel)))
                                    .addComponent(qtion1Label))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(headerLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(qtion1Label)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion1ALabel)
                            .addComponent(qtion1CLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtion1BLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtion1DLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(answer1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(qtion2Label)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion2ALabel)
                            .addComponent(qtion2CLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(answer2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion2BLabel)
                            .addComponent(qtion2DLabel))
                        .addGap(17, 17, 17)
                        .addComponent(qtion3Label)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion3ALabel)
                            .addComponent(qtion3CLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion3DLabel)
                            .addComponent(qtion3BLabel))
                        .addGap(18, 18, 18)
                        .addComponent(qtion4Label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(answer3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtion4ALabel)
                    .addComponent(qtion4CLabel)
                    .addComponent(answer4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtion4BLabel)
                    .addComponent(qtion4DLabel))
                .addGap(18, 18, 18)
                .addComponent(qtion5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtion5ALabel)
                    .addComponent(qtion5CLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtion5BLabel)
                            .addComponent(qtion5DLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctLabel)
                            .addComponent(correctNumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IncorrectLabel)
                            .addComponent(incorrectNumLabel)
                            .addComponent(percentageLabel)
                            .addComponent(percentageNumLabel))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(answer5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(qtion5btn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answer1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1TxtActionPerformed

    private void answer2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2TxtActionPerformed

    private void answer4TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer4TxtActionPerformed

        //Allows the bottons to check for incorrect and correct answers
    private void qtion5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtion5btnActionPerformed
        int incorrect;
        int correct;
        int score = 0;
        int incorrect1 = 0;
        int percentage;
        String answer1 = answer1Txt.getText();
        String answer2 = answer2Txt.getText();
        String answer3 = answer3Txt.getText();
        String answer4 = answer4Txt.getText();
        String answer5 = answer5Txt.getText();



        if(answer5.equals("b")|| (answer5.equals("B"))){
            score = score + 1;
            correctNumLabel.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel.setText(incorrect1 + "/5");;
            percentage = score/5;
            percentageNumLabel.setText(percentage + ("%"));
        }
        if(answer4.equals("a")|| (answer4.equals("A"))){
            score = score + 1;
            correctNumLabel.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel.setText(incorrect1 + "/5");;
            percentage = score/5;
            percentageNumLabel.setText(percentage + ("%"));
        }
        if(answer3.equals("c")|| (answer3.equals("C"))){
            score = score + 1;
            correctNumLabel.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel.setText(incorrect1 + "/5");;
            percentage = score/5;
            percentageNumLabel.setText(percentage + ("%"));
        }
        if(answer2.equals("b")|| (answer2.equals("B"))){
            score = score + 1;
            correctNumLabel.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel.setText(incorrect1 + "/5");;
            percentage = score/5;
            percentageNumLabel.setText(percentage + ("%"));
        }
        if(answer1.equals("b")|| (answer1.equals("B"))){
            score = score + 1;
            correctNumLabel.setText(score + "/5");
            
        }
        else{
            incorrect1 = incorrect1 + 1;
            incorrectNumLabel.setText(incorrect1 + "/5");;
            percentage = score/5;
            percentageNumLabel.setText(percentage + ("%"));
        }
    }//GEN-LAST:event_qtion5btnActionPerformed

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
            java.util.logging.Logger.getLogger(multipleChoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new multipleChoiceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IncorrectLabel;
    private javax.swing.JTextField answer1Txt;
    private javax.swing.JTextField answer2Txt;
    private javax.swing.JTextField answer3Txt;
    private javax.swing.JTextField answer4Txt;
    private javax.swing.JTextField answer5Txt;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JLabel correctNumLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel incorrectNumLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JLabel percentageNumLabel;
    private javax.swing.JLabel qtion1ALabel;
    private javax.swing.JLabel qtion1BLabel;
    private javax.swing.JLabel qtion1CLabel;
    private javax.swing.JLabel qtion1DLabel;
    private javax.swing.JLabel qtion1Label;
    private javax.swing.JLabel qtion2ALabel;
    private javax.swing.JLabel qtion2BLabel;
    private javax.swing.JLabel qtion2CLabel;
    private javax.swing.JLabel qtion2DLabel;
    private javax.swing.JLabel qtion2Label;
    private javax.swing.JLabel qtion3ALabel;
    private javax.swing.JLabel qtion3BLabel;
    private javax.swing.JLabel qtion3CLabel;
    private javax.swing.JLabel qtion3DLabel;
    private javax.swing.JLabel qtion3Label;
    private javax.swing.JLabel qtion4ALabel;
    private javax.swing.JLabel qtion4BLabel;
    private javax.swing.JLabel qtion4CLabel;
    private javax.swing.JLabel qtion4DLabel;
    private javax.swing.JLabel qtion4Label;
    private javax.swing.JLabel qtion5ALabel;
    private javax.swing.JLabel qtion5BLabel;
    private javax.swing.JLabel qtion5CLabel;
    private javax.swing.JLabel qtion5DLabel;
    private javax.swing.JLabel qtion5Label;
    private javax.swing.JButton qtion5btn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
