package ponggame;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music 
{
       File file;
       AudioInputStream audioStream;
       Clip clip;
      
       Music() throws UnsupportedAudioFileException, IOException, LineUnavailableException
       {
            file = new File("Song.wav");
            audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
           
       }
       
       public void KeyPressed(KeyEvent e)
       {
            if(e.getKeyCode()==KeyEvent.VK_P)
            {
                clip.start();
            }
            
            if(e.getKeyCode()==KeyEvent.VK_M)
            {
                clip.stop();
            }
       }
}
