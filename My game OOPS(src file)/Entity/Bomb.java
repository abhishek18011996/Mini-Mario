package Entity;

import Run.Game;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 7/13/2017.
 */
public class Bomb extends Entity{
    private int bombXCord;
    private int bombYCord;
    public Bomb(int y){
        this.bombXCord= RandomInt.randomInt(0, Game.GAME_WIDTH);
        this.bombYCord=y;
    }

    @Override
    public void update() {
        if (this.bombYCord<-200){
            this.bombYCord=Game.GAME_HEIGHT;
            this.bombXCord=RandomInt.randomInt(0,Game.GAME_WIDTH);
        }
        else
            this.bombYCord-=10;


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(ImagesAudio.bombImage,this.bombXCord,this.bombYCord,null);
    }
}
