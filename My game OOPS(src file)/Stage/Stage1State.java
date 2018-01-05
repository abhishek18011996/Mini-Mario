package Stage;

import Entity.Entity;
import Run.Game;
import Run.GamePanel;
import Utility.ImagesAudio;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import Entity.*;

/**
 * Created by abhishek on 08-07-2017.
 */
public class Stage1State extends Stage {
    //variablesss
    private static final int CLOUD_SEP=200;
    private static final int Block_Separate=425;
    private static Entity array[]={new Cloud(Game.GAME_WIDTH), new Cloud(Game.GAME_WIDTH + 200)
            , new Block(Game.GAME_WIDTH), new Block(Game.GAME_WIDTH+Stage1State.Block_Separate),
            Stage.player};
    private static Entity blockArray[]={Stage1State.array[2],Stage1State.array[3]};

    ////constructor
    /*default*/ Stage1State(){
        GamePanel.time=50;
      Stage.background_colour=Color.CYAN;
      Stage.Stage_notify="Stage 1";
      Block.BLOCK_X_VELOCITY=12;
      Player.plyerAccValue=2;
      Player.plyerVelValue=30;
      Stage.array=Stage1State.array;
      Stage.blockArray=Stage1State.blockArray;


    }

    //////methods
    @Override
    public void render(Graphics g1) {
       super.render(g1);

    }
      @Override
    public void update() {
          super.update();
          if(Stage.score==20){
              Stage.player.PlayerYCord=Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT);
              Stage.player.PlayerXCord=350;

             GamePanel.time=1000;
             GamePanel.currentState=new Stage2ResumeState();
          ImagesAudio.gameAudio.stop();
           ImagesAudio.gamePauseAudio.loop();
          }
            if (Stage.player.PlayerXCord<-72){
                GamePanel.currentState=new GameTerminateState();
                GamePanel.time=50;
                ImagesAudio.gameAudio.stop();

            }

        }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        super.keyPressed(e);
      }
    }

