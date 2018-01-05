package Entity;

import Run.Game;
import Stage.Stage;
import Utility.ImagesAudio;
import Utility.RandomInt;

import java.awt.*;

/**
 * Created by abhishek on 10-07-2017.
 */
public class Block extends Entity {
    public static  int XCORD_LIMIT=70;
    public static  int BLOCK_X_VELOCITY=7;
    private int BlockXCord;
    private int BlockYCord;
    private static final int BLOCK_WIDTH=20;
    public static final int BLOCK_HEIGHT=50;
    public Block(int X){
        this.BlockXCord=X;
        this.BlockYCord=RandomInt.random();
        this.r=new Rectangle(Block.BLOCK_WIDTH,Block.BLOCK_HEIGHT);

    }

    @Override
    public void update() {
        if (this.BlockXCord<=-Block.XCORD_LIMIT)
        {
            this.BlockXCord=Game.GAME_WIDTH;
            this.BlockYCord=RandomInt.random();
            if(this.setVisible==true)
                Stage.score++;
            else
            this.setVisible=true;

        }
        else
            this.BlockXCord-=Block.BLOCK_X_VELOCITY;
        this.r.setLocation(this.BlockXCord,this.BlockYCord);

    }

    @Override
    public void render(Graphics g) {
       if(this.setVisible==true)
        g.drawImage(ImagesAudio.blockImage1,this.BlockXCord,this.BlockYCord,null);

    }
}
