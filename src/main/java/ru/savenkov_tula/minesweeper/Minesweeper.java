package ru.savenkov_tula.minesweeper;

import javax.swing.*;
import java.awt.*;

public class Minesweeper extends JFrame {
    private JPanel panel;

    public static void main(String[] args) {
        new Minesweeper();
    }

    private Minesweeper(){
        initFrame();
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        add(panel);
    }

    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Minesweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
