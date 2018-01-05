package Stage;

import Entity.*;
import Run.Game;

import java.awt.*;

/**
 * Created by abhishek on 7/13/2017.
 */
public class GameFinishStage extends Stage {
    private static final Font MY_FONT = new Font("Aerial", Font.BOLD, 32);
    public static Entity arr[]={new Ballon(Game.GAME_HEIGHT),new Ballon(Game.GAME_HEIGHT+100),new Ballon(Game.GAME_HEIGHT+200)
            ,new Ballon(Game.GAME_HEIGHT+300),new Ballon(Game.GAME_HEIGHT+50)};
    @Override
    public void update() {
        for(int i=0;i<GameTerminateState.arr.length;i++)
            GameFinishStage.arr[i].update();
    }
    public void render(Graphics gc){
        gc.setColor(Color.pink);
        gc.fillRect(0,0, Game.GAME_WIDTH,Game.GAME_HEIGHT);
        gc.setColor(Color.red);
        gc.setFont(MY_FONT);
        gc.drawString("Congratulationsssss youuu won",150,50);
        gc.drawString("your score was ",200,150);
        gc.drawString(Integer.toString(Stage.score),250,200);
        gc.drawString("bravooooo",300,200);
        for(int i=0;i<GameTerminateState.arr.length;i++)
            GameFinishStage.arr[i].render(gc);

    }
}
