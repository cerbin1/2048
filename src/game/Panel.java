package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Panel {
    JPanel createJPanel(JButton[][] jButtons, Field[][] fields) {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        panel.setPreferredSize(new Dimension(400, 400));
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 40) {

                    for (int i = 0; i < 4; i++) {
                        if (!fields[3][i].isEmpty() && !fields[2][i].isEmpty()) {
                            if (Integer.parseInt(fields[3][i].getValue()) == Integer.parseInt(fields[2][i].getValue())) {
                                System.out.println("3 sie zgadza");
                                fields[3][i].setValue(Integer.toString(Integer.parseInt(fields[3][i].getValue()) + Integer.parseInt(fields[2][i].getValue())));
                                fields[2][i].setValue(fields[1][i].getValue());
                                fields[1][i].setValue(fields[0][i].getValue());
                                fields[0][i].setValue("");
                                fields[0][i].setEmpty(true);

                                displayValues(fields);
                            } else if (!fields[3][i].isEmpty() && !fields[2][i].isEmpty()) {
                                if (Integer.parseInt(fields[2][i].getValue()) == Integer.parseInt(fields[1][i].getValue())) {
                                    System.out.println("2 sie zgadza");
                                    fields[2][i].setValue(Integer.toString(Integer.parseInt(fields[2][i].getValue()) + Integer.parseInt(fields[1][i].getValue())));
                                    fields[1][i].setValue(fields[0][i].getValue());
                                    fields[0][i].setValue("");
                                    fields[0][i].setEmpty(true);
                                    displayValues(fields);
                                } else if (!fields[1][i].isEmpty() && !fields[0][i].isEmpty()) {
                                    if (Integer.parseInt(fields[1][i].getValue()) == Integer.parseInt(fields[0][i].getValue())) {
                                        System.out.println("1 sie zgadza");
                                        fields[1][i].setValue(Integer.toString(Integer.parseInt(fields[1][i].getValue()) + Integer.parseInt(fields[0][i].getValue())));
                                        fields[0][i].setValue("");
                                        fields[1][i].setEmpty(true);
                                    }
                                }
                            }
                        }
                        setButtonsValue(jButtons, fields);
                    }
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

    private void displayValues(Field[][] fields) {
        for (int d = 0; d < 4; d++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(fields[d][j].getValue() + ", ");
            }
            System.out.println();
        }
    }

    void setButtonsValue(JButton[][] jButtons, Field[][] fields) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (fields[i][j].isEmpty()) {
                    jButtons[i][j].setText("");
                } else {
                    jButtons[i][j].setText(fields[i][j].getValue());
                }
            }
        }
    }
}
