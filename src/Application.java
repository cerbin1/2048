import javax.swing.*;

public class Application {
    Frame ramka = new Frame();

    void showFrame() {
        JFrame frame = ramka.createFrame("2048");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Application().showFrame());
    }
}
