package ponggame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GamePanel panel;
    
    GameFrame() {
        panel = new GamePanel();
        
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
