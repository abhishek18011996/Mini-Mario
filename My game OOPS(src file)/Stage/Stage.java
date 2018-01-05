package Stage;

import Entity.Entity;
import Run.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import Entity.*;
import Utility.ImagesAudio;


/**
 * Created by abhishek on 08-07-2017.
 */
abstract public class Stage {
    public static final int GRASS_HEIGHT = 45;
     static Player player=new Player(350);
    /*default*/ static final Font MY_FONT = new Font("Aerial", Font.BOLD, 24);
     public static int score=0;
     /*default*/static Color background_colour;
    /*default*/static String Stage_notify;
    /*default*/static Entity array[];
    /*default*/ static Entity blockArray[];
    public static boolean pauseButton=true;

     public void render(Graphics g){
         g.setColor(Stage.background_colour);
         g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
         g.drawImage(ImagesAudio.grassImage, 0, Game.GAME_HEIGHT - Stage.GRASS_HEIGHT, null);
         g.drawImage(ImagesAudio.pauseImage,50,200,null);
         g.setColor(Color.red);
         g.setFont(MY_FONT);
         g.drawString(Stage.Stage_notify,10,20);
         g.drawString(Integer.toString(score),700,50);
         for (int i = 0; i < Stage.array.length; i++) {
             Stage.array[i].render(g);
         }
    }
     public void update(){
         for(int i=0;i<Stage.array.length;i++)
             Stage.array[i].update();
         for(int i=0;i<Stage.blockArray.length;i++) {
             if ((Stage.player.r.intersects(Stage.blockArray[i].r)) && Stage.blockArray[i].setVisible == true) {
                 Stage.player.PlayerXCord -= 50;
                 Stage.blockArray[i].setVisible = false;
                 ImagesAudio.hitAudio.play();
             }

         }}
      public void keyTyped(KeyEvent e){}



    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode()==KeyEvent.VK_UP&&Stage.player.PlayerYCord==(Game.GAME_HEIGHT-(
                Stage1State.GRASS_HEIGHT+Player.PLAYER_HEIGHT))&&Stage1State.player.duck==0)
        {
            Stage.player.PlayerYCord-=10;
            //to ensure that first the update of equality doesnt execute
            Stage.player.jump();
        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN)

            Stage.player.duck();
    }
     public void keyReleased(KeyEvent e){}
    public void mouseClicked(MouseEvent e){
         if(e.getX()>50&&e.getX()<100&&e.getY()>200&&e.getY()<250)
             Stage.pauseButton=!Stage.pauseButton;
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
}
