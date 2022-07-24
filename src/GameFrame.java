import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    GameFrame() {

        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Ping Pong Game");
        this.setResizable(false);
        this.setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
