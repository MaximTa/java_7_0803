package ru.geekbrains.java;

import javax.swing.*;


public class FinishGameWindow extends JFrame {
    private static final int WINDOW_POS_X = 600;
    private static final int WINDOW_POS_Y = 400;
    private static final int WINDOW_HEIGHT = 205;
    private static final int WINDOW_WIDTH = 307;

    public FinishGameWindow() {
        setTitle("Game Over");
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        gameOver();
    }
//Задание 8
    public void gameOver() {

        if (Logic.winnerName.equals("Игрок ПОБЕДИЛ!!!")) {
            JLabel label = new JLabel("    Игрок ПОБЕДИЛ!!!");
            add(label);

        } else if (Logic.winnerName.equals("Ничья!")) {
            JLabel label = new JLabel("         Ничья!");
            add(label);

        } else {

            JLabel label = new JLabel("   ИИнтеллект ПОБЕДИЛ!!!");
            add(label);
        }
        repaint();
    }

}
