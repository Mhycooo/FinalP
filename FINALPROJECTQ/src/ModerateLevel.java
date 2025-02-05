import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModerateLevel extends javax.swing.JFrame {
    private String randomNumber;
    private int attempts = 0;
    private final int maxAttempts = 10;
    private List<Character> unusedDigits;
    private int num_hint = 1;

    /**
     * Creates new form ModerateLevel
     */
    public ModerateLevel() {
        initComponents();
        randomNumber = generateRandomNumber();
        unusedDigits = new ArrayList<>();
        for (char digit = '0'; digit <= '9'; digit++) {
            unusedDigits.add(digit);
        }
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        gameTitle = new javax.swing.JLabel();
        enterTitle = new javax.swing.JLabel();
        enterValue = new javax.swing.JTextField();
        clueTitle = new javax.swing.JLabel();
        guessButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        notice = new javax.swing.JTextField();
        attemptsBox = new javax.swing.JTextField();
        clueArea = new javax.swing.JTextField();
        hint_label_total = new javax.swing.JTextField();
        HINTT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(226, 191, 179));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel3.setBackground(new java.awt.Color(247, 222, 208));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameTitle.setBackground(new java.awt.Color(255, 190, 152));
        gameTitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 50)); // NOI18N
        gameTitle.setForeground(new java.awt.Color(255, 190, 152));
        gameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTitle.setText("GUESS THE NUMBER");
        jPanel3.add(gameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 690, 75));

        enterTitle.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterTitle.setForeground(new java.awt.Color(255, 255, 255));
        enterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterTitle.setText("ENTER FOUR DIGIT NUMBER HERE");
        jPanel3.add(enterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 440, 50));

        enterValue.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        enterValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterValue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enterValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterValueActionPerformed(evt);
            }
        });
        jPanel3.add(enterValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 450, 150));

        clueTitle.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        clueTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clueTitle.setText("CLUE");
        jPanel3.add(clueTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 118, 50));

        guessButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        guessButton.setText("GUESS!");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });
        jPanel3.add(guessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("X = CORRECT NUMBER CORRECT PLACEMENT");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 370, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("O = CORRECT NUMBER WRONG PLACEMENT");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 553, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("- = WRONG NUMBER");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 351, -1));

        jPanel5.setBackground(new java.awt.Color(254, 236, 226));

        notice.setEditable(false);
        notice.setBackground(new java.awt.Color(254, 236, 226));
        notice.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        notice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notice.setBorder(null);
        notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noticeActionPerformed(evt);
            }
        });

        attemptsBox.setEditable(false);
        attemptsBox.setBackground(new java.awt.Color(254, 236, 226));
        attemptsBox.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        attemptsBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attemptsBox.setText("ATTEMPTS LEFT: 10");
        attemptsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptsBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notice)
            .addComponent(attemptsBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(notice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(attemptsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 410, 150));

        clueArea.setEditable(false);
        clueArea.setBackground(new java.awt.Color(254, 236, 226));
        clueArea.setColumns(2);
        clueArea.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        clueArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clueArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(clueArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 410, 72));

        hint_label_total.setEditable(false);
        hint_label_total.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        hint_label_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hint_label_total.setText("5");
        hint_label_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint_label_totalActionPerformed(evt);
            }
        });
        jPanel3.add(hint_label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 72, 34));

        HINTT.setBackground(new java.awt.Color(255, 255, 140));
        HINTT.setText("HINT");
        HINTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HINTTActionPerformed(evt);
            }
        });
        jPanel3.add(HINTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, 34));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void enterValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterValueActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        String guess = enterValue.getText();
        int guess_num = Integer.parseInt(guess);
        notice.setText(generateClues(guess, randomNumber, unusedDigits) );
        attempts++;
        
        int total_Attempts = maxAttempts - attempts;
        String total_Atmp = Integer.toString(total_Attempts);
        attemptsBox.setText("ATTEMPTS LEFT: " + total_Atmp);
        if (total_Attempts <= 0){
            JOptionPane.showMessageDialog(null, "You have no more attempts left. "+"The correct answer is "+ randomNumber);
            NewJFrame2 jflevel = new NewJFrame2();
            jflevel.show();
            dispose();
        }
        // Check if the guess is valid (no repetition)
        if (!isValidGuess(guess)) {
            notice.setText("Invalid guess. "
                + "Please enter a 4-digit number with no repetition.");
            return;
        }
        else if(guess.length() < 4){
            return;
        }

        if (guess_num >= 10000){
            notice.setText("Invalid guess. "
                + "Please enter a 4-digit number only.");
            return;
        }
        
        // Check if the guess is correct
        if (guess.equals(randomNumber)) {
            JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number. " + randomNumber );
            NewJFrame2 jflevel = new NewJFrame2();
            jflevel.show();
            dispose();

        }

    }//GEN-LAST:event_guessButtonActionPerformed

    private void noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noticeActionPerformed

    private void attemptsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attemptsBoxActionPerformed

    private void hint_label_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint_label_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hint_label_totalActionPerformed

    private void HINTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HINTTActionPerformed
        // TODO add your handling code here:
        String guess = enterValue.getText();
        // Provide hint if the guessed digit is higher or lower
        StringBuilder hint = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char guessDigit = guess.charAt(i);
            char randomDigit = randomNumber.charAt(i);
            if (guessDigit < randomDigit) {
                hint.append("Position ").append(i + 1).append(" is higher.   ");
            }
            else if (guessDigit > randomDigit) {
                hint.append("Position ").append(i + 1).append(" is lower.   ");
            }
        }
        int total_hint = 5-num_hint;
        String str_int = Integer.toString(total_hint);
        hint_label_total.setText(str_int);

        if(num_hint < 5){
            clueArea.setText(hint.toString());
            num_hint++;
        }
        else if(num_hint == 5){
            clueArea.setText("You have no more Hints");
        }

    }//GEN-LAST:event_HINTTActionPerformed
    // Method to generate a random 4-digit number with no repetition
    private static String generateRandomNumber() {
        List<Integer> digits = new ArrayList<>();
        // Add digits 0-9 to the list
        for (int i = 0; i < 10; i++) {
            digits.add(i);
        }
        Collections.shuffle(digits); // Shuffle the list to get random order

        StringBuilder sb = new StringBuilder();
        // Pick the first 4 digits from the shuffled list
        for (int i = 0; i < 4; i++) {
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    // Method to generate clues based on the guess and the random number
    private static String generateClues(String guess, String randomNumber, List<Character> unusedDigits) {
        StringBuilder sb = new StringBuilder();
        if(guess.length() < 4){
            return "Please enter exact 4-digits ";
        }
        for (int i = 0; i < 4; i++) {
            char guessDigit = guess.charAt(i);
            char randomDigit = randomNumber.charAt(i);
            if (guessDigit == randomDigit) {
                sb.append("X"); // Correct digit in the correct position
                // Mark the digit as used
                unusedDigits.remove(Character.valueOf(guessDigit));
            } else if (randomNumber.contains(String.valueOf(guessDigit))) {
                sb.append("O"); // Correct digit but in the wrong position
            } else {
                sb.append("-"); // Incorrect digit
            }
        }
        return sb.toString();
    }
    
    // Method to check if the guess is valid (no repetition)
    private static boolean isValidGuess(String guess) {
        for (int i = 0; i < guess.length(); i++) {
            char digit = guess.charAt(i);
            if (i != guess.indexOf(digit)) {
                return false; // Digit repeated
            }
            
        }
        return true;
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
            java.util.logging.Logger.getLogger(ModerateLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModerateLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModerateLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModerateLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModerateLevel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HINTT;
    private javax.swing.JTextField attemptsBox;
    private javax.swing.JTextField clueArea;
    private javax.swing.JLabel clueTitle;
    private javax.swing.JLabel enterTitle;
    private javax.swing.JTextField enterValue;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JButton guessButton;
    private javax.swing.JTextField hint_label_total;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField notice;
    // End of variables declaration//GEN-END:variables

}
