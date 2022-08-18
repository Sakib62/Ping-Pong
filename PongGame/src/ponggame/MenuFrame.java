
package ponggame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MenuFrame extends JFrame implements ActionListener
{
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    
    MenuFrame()
    {
        button1 = new JButton();
        button1.setBounds(170,100,150,50);   
        button1.addActionListener(this);
        button1.setText("PLAY"); 
        button1.setBackground(new Color(123, 223, 20));
        
        button2 = new JButton();
        button2.setBounds(170,150,150,50);   
        button2.addActionListener(this);
        button2.setText("INSTRUCTION");
        button2.setBackground(new Color(123, 223, 20));
        
        button3 = new JButton();
        button3.setBounds(170,200,150,50);   
        button3.addActionListener(this);
        button3.setText("HIGH SCORE");
        button3.setBackground(new Color(123, 223, 20));
        
        button4 = new JButton();
        button4.setBounds(170,250,150,50);   
        button4.addActionListener(this);
        button4.setText("ABOUT");
        button4.setBackground(new Color(123, 223, 20));
        
        
        this.setLayout(null);
        this.setSize(500,500);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button1)
        { 
            try {
                GameFrame frame = new GameFrame();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
