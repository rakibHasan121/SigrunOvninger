package Inlämningsuppgift.Inlämningsuppgift_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by rakib
 * Date: 2020-10-26
 * Time: 18:14
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class Puzzle15 extends JFrame implements ActionListener {
    private final JPanel otherButtons = new JPanel();
    private final JPanel tilesButtons = new JPanel();

    private final JButton nyttSpel = new JButton("Nytt Spel");
    private final JButton cheat = new JButton("CheatCode");

    private final int size = 4;
    private final JButton[][] tilesBoard = new JButton[size][size];

    public Puzzle15() {
        initShowUI();
        initComponent();
    }


    private void initShowUI() {
        this.setTitle("15-spel");
        this.setSize(600, 600);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponent() {
        int maxBrickor = (size * size) - 1;
        int count = 1;//Texten på brickor börjar på 1
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (count > maxBrickor) {
                    break;
                }
                JButton newButton = new JButton(Integer.toString(count));
                tilesBoard[x][y] = newButton;
                newButton.addActionListener(this);
                tilesButtons.add(newButton);
                count++;
            }
        }


        JButton dummyButton = new JButton("");//En blank bricka i sist
        tilesBoard[size - 1][size - 1] = dummyButton;

        mixTiles(tilesBoard);

        dummyButton.addActionListener(this);
        tilesButtons.add(dummyButton);

        otherButtons.add(nyttSpel);
        otherButtons.add(cheat);

        nyttSpel.addActionListener(this);
        cheat.addActionListener(this);

        tilesButtons.setLayout(new GridLayout(size, size));
        otherButtons.setLayout(new BorderLayout());

        add(nyttSpel, BorderLayout.NORTH);
        add(tilesButtons, BorderLayout.CENTER);
        add(cheat, BorderLayout.SOUTH);
        revalidate();
    }

    private void mixTiles(JButton[][] newTilesBoard) {
        Random rnd = new Random();
        for (int i = newTilesBoard.length - 1; i > 0; i--) {
            for (int j = newTilesBoard[i].length - 1; j > 0; j--) {
                int m = rnd.nextInt(i + 1);
                int n = rnd.nextInt(j + 1);

                changeTilesPosition(i, j, m, n);
            }
        }

    }

    private void changeTilesPosition(int i1, int j1, int m1, int n1) {
        String temp = tilesBoard[i1][j1].getText();
        tilesBoard[i1][j1].setText(tilesBoard[m1][n1].getText());
        tilesBoard[m1][n1].setText(temp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (tilesBoard[x][y].equals(clickedButton)) {
                    if (x > 0) {                                        //kolla åt vänster
                        if (tilesBoard[x - 1][y].getText().equals("")) {
                            changeTilesPosition(x - 1, y, x, y);
                        }
                    }
                    if (x < size - 1) {                                 //kolla åt höger
                        if (tilesBoard[x + 1][y].getText().equals("")) {
                            changeTilesPosition(x + 1, y, x, y);
                        }
                    }
                    if (y > 0) {                                        //kolla åt uppåt
                        if (tilesBoard[x][y - 1].getText().equals("")) {
                            changeTilesPosition(x, y - 1, x, y);
                        }
                    }
                    if (y < size - 1) {                                 //kolla åt nedåt
                        if (tilesBoard[x][y + 1].getText().equals("")) {
                            changeTilesPosition(x, y + 1, x, y);
                        }
                    }
                }
            }
        }
        if (e.getSource() == nyttSpel) {
            mixTiles(tilesBoard);
        }
        if (e.getSource() == cheat) {
            cheatInGame(tilesBoard);
        }
        if (gameWon()) {
            if (JOptionPane.showConfirmDialog(null, "Du vann ", "Grattis!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                mixTiles(tilesBoard);
            } else {
                System.exit(0);
            }
        }
    }

    private void cheatInGame(JButton[][] tilesBoard) {
        int count = 1;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                tilesBoard[x][y].setText(count+"");
                count++;
            }
        }
        tilesBoard[size-1][size-1].setText("");
        changeTilesPosition(size-1,size-1,size-2,size-1);

    }


    public boolean gameWon() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                String tilesText = tilesBoard[x][y].getText();
                int tilesPosition = x + 1 + y * size;

                if (tilesText.equals("")) {
                    if (tilesPosition != size * size) {
                        return false;//Kolla om dummy brickan står i sist
                    }
                } else {
                    if (tilesPosition != Integer.parseInt(tilesText)) {
                        return false;//Kolla om brickan text stämmer med brickan plats
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        new Puzzle15();
    }
}