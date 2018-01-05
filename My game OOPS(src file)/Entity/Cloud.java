package Entity;

import Run.Game;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 10-07-2017.
 */
public class Cloud extends Entity {

    /////variablesss.......
    private int CloudXCord;
    private int CloudYCord;
    private static final int CLOUD_WIDTH=128;
    private static final int UPPER_LIMIT=200;
    private static final int CLOUD_X_VEL=10;
    //////constuctorrrrr
    public Cloud(int X){
        this.CloudXCord=X;
        this.CloudYCord=RandomInt.randomInt(0,UPPER_LIMIT);

    }
    @Override
    public void update() {
        if (this.CloudXCord<-Cloud.CLOUD_WIDTH)
        {

            this.CloudXCord=Game.GAME_WIDTH+RandomInt.randomInt(50,250);

            this.CloudYCord=RandomInt.randomInt(0,UPPER_LIMIT);}

        else
            this.CloudXCord-=Cloud.CLOUD_X_VEL;


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(ImagesAudio.cloudImage1,this.CloudXCord,this.CloudYCord ,null);
    }


}
