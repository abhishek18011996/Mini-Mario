package Stage;

import Entity.Entity;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;
import Entity.Bomb;

/**
 * Created by abhishek on 12-07-2017.
 */
public class GameTerminateState extends Stage {
    private static int k=10;
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 32);
    public static Entity arr[]={new Bomb(Game.GAME_HEIGHT),new Bomb(Game.GAME_HEIGHT+100),new Bomb(Game.GAME_HEIGHT+200)
    ,new Bomb(Game.GAME_HEIGHT+300),new Bomb(Game.GAME_HEIGHT+50)};
    @Override
    public void render(Graphics g) {
      g.drawImage(ImagesAudio.boomImage,0,0,null);
        g.setColor(Color.red);
        g.setFont(MY_FONT);
        g.drawString("Game over!!!!!!",150,50);
        for(int i=0;i<GameTerminateState.arr.length;i++)
            GameTerminateState.arr[i].render(g);
    }

    @Override
    public void update() {

        for(int i=0;i<GameTerminateState.arr.length;i++)
            GameTerminateState.arr[i].update();

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
