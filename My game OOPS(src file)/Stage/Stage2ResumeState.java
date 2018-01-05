package Stage;

import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by abhishek on 12-07-2017.
 */
public class Stage2ResumeState extends Stage {
    private static int k=10;
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 32);
    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);
        g.setColor(Color.red);
       g.setFont(MY_FONT);
       g.drawString("congratulationssssss!!!!!!",150,50);
       g.drawString("Stage2 begins ",200,150);
       g.drawString(Integer.toString(Stage2ResumeState.k),250,200);
       g.drawString("seconds",300,200);
    }

    @Override
    public void update() {
        Stage2ResumeState.k--;
        if(Stage2ResumeState.k==0) {
            GamePanel.time=50;
            GamePanel.currentState = new Stage2State();
            Stage2ResumeState.k=10;
            ImagesAudio.gamePauseAudio.stop();
            ImagesAudio.gameAudio.loop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
