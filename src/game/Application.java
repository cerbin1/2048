package game;

import javax.swing.*;
import java.awt.*;

public class Application {
    JButton[][] jButtons = new JButton[4][4];

    Panel panel = new Panel();

    void showFrame() {
        JFrame frame = new JFrame();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jButtons[i][j] = createSingleJButton();
            }
        }
        JPanel jPanel = panel.createJPanel(jButtons);

        frame.getContentPane().add(jPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(jPanel);
        frame.setVisible(true);
        frame.pack();
    }

    public JButton createSingleJButton() {
        JButton jButton = new JButton("2");
        jButton.setPreferredSize(new Dimension(50, 50));
        jButton.setEnabled(false);
        return jButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Application().showFrame());
    }
}
