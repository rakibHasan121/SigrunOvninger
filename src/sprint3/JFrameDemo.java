package sprint3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rakib
 * Date: 2020-10-19
 * Time: 08:29
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class JFrameDemo extends JFrame {
    public JFrameDemo() throws HeadlessException {
        JPanel jp = new JPanel();
        setTitle("Test Area");
        setSize(600, 300);
        setLocation(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDemo g = new JFrameDemo();
    }
}
