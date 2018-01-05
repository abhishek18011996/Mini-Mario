package Stage;

import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by abhishek on 08-07-2017.
 */
public class WelcomeStage extends Stage {
    private static final int SELECT_X_Cord=350;
    private static int selectYCord=300;
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 20);
    public WelcomeStage(){
    ImagesAudio.gameAudio.loop();
    GamePanel.time=400;

        }


    @Override
    public void render(Graphics a) {
       a.drawImage(ImagesAudio.WelcomeImage,0,0,null);
       a.drawImage(ImagesAudio.SelectorImage,SELECT_X_Cord,WelcomeStage.selectYCord,null);
       a.setColor(Color.white);
       a.fillRect(500,300,300,100);
       a.setColor(Color.black);
        a.setFont(MY_FONT);
       a.drawString("Made by:Abhishek Chauhan",510,350);
        a.drawString("--Utkarsh Varma",590,370);
        a.drawString("A.K.G.E.C",590,395);
        a.setColor(Color.white);
        a.fillRect(0,300,300,100);
        a.setColor(Color.black);
        a.setFont(MY_FONT);
        a.drawString("-----Project Exhibition",10,350);
        a.drawString("-----Game Development",10,370);
        a.drawString("-----K.I.E.T",10,395);
    }

    @Override
    public void update() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_UP)
            WelcomeStage.selectYCord=250;
        else if(e.getKeyCode()==KeyEvent.VK_DOWN)
            WelcomeStage.selectYCord=300;
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(WelcomeStage.selectYCord==250)
                GamePanel.currentState=new Stage1State();
            else{
                ImagesAudio.gameAudio.stop();
                Game.frame.dispose();


            }
        }

    }

}
