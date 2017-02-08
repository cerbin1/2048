import javax.swing.*;
import java.awt.*;

public class Application extends JComponent{
    Frame ramka = new Frame();
    JButton[][] jButtons;

    void showFrame() {
        JFrame frame = ramka.createFrame("2048");
        JPanel panel = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jButtons[i][j] = ramka.createSingleJButton(50, 50);
                panel.add(jButtons[i][j]);
                System.out.println();
            }
        }
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Application().showFrame());
    }
}
