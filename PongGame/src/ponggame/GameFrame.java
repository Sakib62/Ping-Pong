package ponggame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GamePanel panel;
    
    GameFrame() {
        panel = new GamePanel();
    }
}
