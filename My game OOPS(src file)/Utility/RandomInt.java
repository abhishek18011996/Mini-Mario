package Utility;

import Entity.Block;
import Entity.Player;
import Run.Game;
import Stage.Stage1State;

import java.util.Random;

/**
 * Created by abhishek on 08-07-2017.
 */
public class RandomInt {
    public static int randomInt(int lower,int upper){
        Random r=new Random();
        int x=r.nextInt(upper-lower);
        return x+lower;
    }
    public static int random(){
        Random r=new Random();
        int k= r.nextInt(2);
        if (k==0){
            return Game.GAME_HEIGHT- Block.BLOCK_HEIGHT- Stage1State.GRASS_HEIGHT;
        }
        else
            return Game.GAME_HEIGHT-(Block.BLOCK_HEIGHT+Stage1State.GRASS_HEIGHT+ Player.PLAYER_HEIGHT-20);
        //correction needed


    }
}
