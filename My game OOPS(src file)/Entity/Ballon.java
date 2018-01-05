package Entity;

import Run.Game;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 7/13/2017.
 */
public class Ballon extends Entity{
    private int baloonXCord;
    private int baloonYCord;

    public Ballon(int y){
        this.baloonXCord= RandomInt.randomInt(0, Game.GAME_WIDTH);
        this.baloonYCord=y;

    }
    @Override
    public void update() {
        if (this.baloonYCord<-200){
            this.baloonYCord=Game.GAME_HEIGHT;
        this.baloonXCord=RandomInt.randomInt(0,Game.GAME_WIDTH);
        }
        else
            this.baloonYCord-=10;

    }

    @Override
    public void render(Graphics g) {
g.drawImage(ImagesAudio.baloonImage,this.baloonXCord,this.baloonYCord,null);
    }
}
