import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a extends JFrame {
    private JLabel clueLabel;
    private JTextField guessField;
    private JButton guessButton;
    private String randomNumber;
    private List<Character> unusedDigits;

    public a() {
        setTitle("Number Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        // Generate a random 4-digit number with no repetition
        randomNumber = generateRandomNumber();
        unusedDigits = new ArrayList<>();
        for (char digit = '0'; digit <= '9'; digit++) {
            unusedDigits.add(digit);
        }

        clueLabel = new JLabel("Enter your guess (4-digit number with no repetition):", SwingConstants.CENTER);
        guessField = new JTextField();
        guessButton = new JButton("Guess");

        add(clueLabel, BorderLayout.NORTH);
        add(guessField, BorderLayout.CENTER);
        add(guessButton, BorderLayout.SOUTH);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guess = guessField.getText();
                // Check if the guess is valid (no repetition)
                if (!isValidGuess(guess)) {
                    clueLabel.setText("Invalid guess. Please enter a 4-digit number with no repetition.");
                    return;
                }
                // Check if the guess is correct
                if (guess.equals(randomNumber)) {
                    clueLabel.setText("Congratulations! You guessed the correct number.");
                    System.exit(0);
                } else {
                    // Provide hint if the guessed digit is higher or lower
                    StringBuilder hint = new StringBuilder();
                    for (int i = 0; i < 4; i++) {
                        char guessDigit = guess.charAt(i);
                        char randomDigit = randomNumber.charAt(i);
                        if (guessDigit < randomDigit) {
                            hint.append("Digit at position ").append(i + 1).append(" is higher.\n");
                        } else if (guessDigit > randomDigit) {
                            hint.append("Digit at position ").append(i + 1).append(" is lower.\n");
                        }
                    }
                    clueLabel.setText("Clues: " + generateClues(guess, randomNumber, unusedDigits) + "\n" + hint.toString());
                }
            }
        });

        setVisible(true);
    }

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new a();
            }
        });
    }
}