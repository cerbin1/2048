import javax.swing.*;
import java.awt.*;

public class Frame {

    JFrame createFrame(String name) {
        JFrame frame = new JFrame(name);
        frame.setName("Frame");
        frame.setSize(new Dimension(250, 250));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                frame.add(createSingleJButton(50, 50));
            }
        }
        return frame;
    }

    JButton createSingleJButton(int width, int height) {
        JButton jButton = new JButton("2");
        jButton.setPreferredSize(new Dimension(width, height));
        return jButton;
    }
}
