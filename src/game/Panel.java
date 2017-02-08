package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Panel {
    JPanel createJPanel(JButton[][] jButtons) {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        panel.setPreferredSize(new Dimension(400, 400));
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) {
                    System.out.println("Wygrales");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                panel.add(jButtons[i][j]);
            }
        }


        panel.setFocusable(true);
        panel.requestFocusInWindow();
        return panel;
    }
}
