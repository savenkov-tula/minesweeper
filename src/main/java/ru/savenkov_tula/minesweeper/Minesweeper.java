package ru.savenkov_tula.minesweeper;

import ru.savenkov_tula.minesweeper.model.Cell;

import javax.swing.*;
import java.awt.*;

public class Minesweeper extends JFrame {
    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;

    public static void main(String[] args) {
        new Minesweeper();
    }

    private Minesweeper(){
        setImages();
        initPanel();
        initFrame();
    }

    private void initPanel(){
        panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Cell cell: Cell.values())
                g.drawImage((Image) cell.image,
                        cell.ordinal() * IMAGE_SIZE,0, this);
            }
        };
        panel.setPreferredSize(new Dimension(
                COLS * IMAGE_SIZE,ROWS * IMAGE_SIZE));
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

    private void setImages(){
        for (Cell cell: Cell.values()) {
            cell.image = getImage(cell.name().toLowerCase());
        }
    }

    private Image getImage(String name){
        String filename = "/img/" + name + ".png";

        ImageIcon icon = new ImageIcon (getClass().getResource(filename));
        return icon.getImage();
    }
}
