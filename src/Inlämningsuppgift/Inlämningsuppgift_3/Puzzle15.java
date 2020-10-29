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
    private final JPanel northButtons = new JPanel();
    private final JPanel southButtons = new JPanel();
    private final JPanel tileButtons = new JPanel();

    private final JButton newGame = new JButton("New Game");
    private final JButton cheat = new JButton("Cheat");
    private final JButton exit = new JButton("Exit");

    private final int sizeX = Integer.parseInt(JOptionPane.showInputDialog("Number of rows and column"));//Number of rows from user input
    private final int sizeY = sizeX;//Number of columns from user input

    private final JButton[][] tilesBoard = new JButton[sizeX][sizeY];

    public void run() {
        this.setTitle("15-spel");
        this.setSize(600, 600);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        initComponent();
    }

    private void initComponent() {
        int maxBrickor = (sizeX * sizeY) - 1;
        int count = 1;//As the text in the tiles starts from 1
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (count > maxBrickor)
                    break;
                JButton newButton = new JButton(Integer.toString(count));
                tilesBoard[x][y] = newButton;
                newButton.addActionListener(this);
                tileButtons.add(newButton);
                count++;
            }
        }

        JButton dummyButton = new JButton("");//An empty tiles in the last (dummyButton)
        tilesBoard[sizeX - 1][sizeY - 1] = dummyButton;
        dummyButton.addActionListener(this);
        tileButtons.add(dummyButton);
        southButtons.add(cheat);
        southButtons.add(exit);
        newGame.addActionListener(this);
        cheat.addActionListener(this);
        exit.addActionListener(this);
        tileButtons.setLayout(new GridLayout(sizeX, sizeY));
        northButtons.setLayout(new BorderLayout());
        add(newGame, BorderLayout.NORTH);
        add(tileButtons, BorderLayout.CENTER);
        add(southButtons, BorderLayout.SOUTH);
        mixTiles(tilesBoard);
        revalidate();
    }

    private void mixTiles(JButton[][] tilesBoard) {
        Random rnd = new Random();
        for (int i = 0; i < tilesBoard.length; i++) {
            for (int j = 0; j < tilesBoard[i].length; j++) {
                int m = rnd.nextInt(i + 1);
                int n = rnd.nextInt(j + 1);

                changeTilesPosition(i, j, m, n);
            }
        }
    }

    private void changeTilesPosition(int i, int j, int m, int n) {
        String temp = tilesBoard[i][j].getText();
        tilesBoard[i][j].setText(tilesBoard[m][n].getText());
        tilesBoard[m][n].setText(temp);
    }

    private void cheatInGame(JButton[][] tilesBoard) {
        int count = 1;
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                tilesBoard[x][y].setText(count + "");
                count++;
            }//Reset every tiles text from 1 to 16
        }
        tilesBoard[sizeX - 1][sizeY - 1].setText("");//Making the last tile a blank tile
        changeTilesPosition(sizeX - 1, sizeY - 1, sizeX - 2, sizeY - 1);
        JOptionPane.showMessageDialog(null, "Cheat code applied. Move just the last button");

    }

    public boolean onWinning() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                String tilesText = tilesBoard[x][y].getText();
                int tilesPosition = x + 1 + y * sizeY;

                if (tilesText.equals("")) {
                    if (tilesPosition != sizeX * sizeY) {//Check if the empty tiles is in the last of the board
                        return false;
                    }
                } else {
                    if (tilesPosition != Integer.parseInt(tilesText)) {//Check if text is equal to tiles text
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame)
            mixTiles(tilesBoard);

        if (e.getSource() == cheat)
            cheatInGame(tilesBoard);

        JButton clickedButton = (JButton) e.getSource();
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (tilesBoard[x][y].equals(clickedButton)) {
                    if (x > 0)//Check left
                        if (tilesBoard[x - 1][y].getText().equals(""))
                            changeTilesPosition(x - 1, y, x, y);
                    if (x < sizeX - 1)//Check right
                        if (tilesBoard[x + 1][y].getText().equals(""))
                            changeTilesPosition(x + 1, y, x, y);
                    if (y > 0)//Check up
                        if (tilesBoard[x][y - 1].getText().equals(""))
                            changeTilesPosition(x, y - 1, x, y);
                    if (y < sizeY - 1)//Check down
                        if (tilesBoard[x][y + 1].getText().equals(""))
                            changeTilesPosition(x, y + 1, x, y);
                }
            }
        }

        if (onWinning())
            if (JOptionPane.showConfirmDialog(null, "You win this round. Try again! ", "Congratulation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                mixTiles(tilesBoard);
            else
                System.exit(0);
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }
}