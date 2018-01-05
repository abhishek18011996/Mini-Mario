package Stage;

import Entity.Entity;
import Run.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import Entity.*;
import Run.GamePanel;
import Utility.ImagesAudio;

/**
 * Created by abhishek on 7/13/2017.
 */
public class Stage3State extends Stage {
    private static final int Cloud_Sep=150;
    private static final int Block_Separate=170;
    private static Entity array[] = {new Cloud(Game.GAME_WIDTH), new Cloud(Game.GAME_WIDTH +Stage3State.Cloud_Sep )
            , new Cloud(Game.GAME_WIDTH + 2*Stage3State.Cloud_Sep),new Cloud(Game.GAME_WIDTH+ 3*Stage3State.Cloud_Sep),
            new Block(Game.GAME_WIDTH), new Block(Game.GAME_WIDTH+Stage3State.Block_Separate),new Block(Game.GAME_WIDTH+2*
            Stage3State.Block_Separate),new Block(Game.GAME_WIDTH+3*Stage3State.Block_Separate)
            ,new Block(Game.GAME_WIDTH+4*Stage3State.Block_Separate),Stage.player};
    private static Entity blockArray[]={Stage3State.array[4],Stage3State.array[5],Stage3State.array[6],Stage3State.array[7],
    Stage3State.array[8]};


    public Stage3State(){
        Stage.background_colour=Color.blue;
        Stage.Stage_notify="Stage 3";
        Block.XCORD_LIMIT=70;
        Block.BLOCK_X_VELOCITY=10;
        Player.plyerVelValue=40;
        Player.plyerAccValue=4;
        Stage.array=Stage3State.array;
        Stage.blockArray=Stage3State.blockArray;
    }
    public void render(Graphics g3){
        super.render(g3);
    }
    @Override
    public void update() {
super.update();
            if(Stage.score==60){
                GamePanel.time=50;
                GamePanel.currentState=new GameFinishStage();
            }
        if (Stage.player.PlayerXCord<-72){
            GamePanel.time=50;
            GamePanel.currentState=new GameTerminateState();
            ImagesAudio.gameAudio.stop();

        }


    }

    @Override
    public void keyPressed(KeyEvent e) {
      super.keyPressed(e);
    }
}
