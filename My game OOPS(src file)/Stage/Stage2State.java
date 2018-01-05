package Stage;

import Entity.*;
import Entity.Player;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by abhishek on 12-07-2017.
 */
public class Stage2State extends Stage {
    private static final int CLOUD_SEP=200;
    private static final int Block_Separate=280;
    private static Entity array[] = {new Cloud(Game.GAME_WIDTH), new Cloud(Game.GAME_WIDTH + Stage2State.CLOUD_SEP),
            new Cloud(Game.GAME_WIDTH+2*Stage2State.CLOUD_SEP),
            new Block(Game.GAME_WIDTH), new Block(Game.GAME_WIDTH+Stage2State.Block_Separate),new Block(Game.GAME_WIDTH+2*
    Stage2State.Block_Separate),Stage.player};
    private static Entity blockArray[]={Stage2State.array[3],Stage2State.array[4],Stage2State.array[5]};


public Stage2State(){
    Stage.background_colour=Color.orange;
    Stage.Stage_notify="Stage 2";
    Block.XCORD_LIMIT=40;
    Block.BLOCK_X_VELOCITY=15;
    Player.plyerVelValue=30;
    Player.plyerAccValue=3;
    Stage.array=Stage2State.array;
    Stage.blockArray=Stage2State.blockArray;
}


    @Override
    public void render(Graphics g2) {
    super.render(g2);

    }

    @Override
    public void update() {
super.update();
            if(Stage.score==40){
                Stage.player.PlayerYCord=Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT);
                Stage.player.PlayerXCord=350;
                GamePanel.time=1000;
                GamePanel.currentState=new Stage3ResumeState();
                ImagesAudio.gameAudio.stop();
                ImagesAudio.gamePauseAudio.loop();
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


