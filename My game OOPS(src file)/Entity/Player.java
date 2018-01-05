package Entity;

import Run.Game;
import Stage.Stage1State;
import Utility.ImagesAudio;

import java.applet.AudioClip;
import java.awt.*;

/**
 * Created by abhishek on 10-07-2017.
 */
public class Player extends Entity {
    private AudioClip jumpAudio = ImagesAudio.jumpAudio;
    public int duck = 0;
    public int playerYVel = 0;
    public int playerYAcc = 0;
    public static int plyerVelValue;
    public static int plyerAccValue;

    public static final int PLAYER_HEIGHT = 92;
    public int PlayerXCord;
    public Image jumpImage = ImagesAudio.jumpImage;
    public Image duckImage = ImagesAudio.duckImage;
    public Image playerImage = null;
    public static int currentIndex = 0;
    public int PlayerYCord = Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT);
    public Image array[] = {ImagesAudio.playerImage1, ImagesAudio.playerImage2, ImagesAudio.playerImage3, ImagesAudio.playerImage4
            , ImagesAudio.playerImage5, ImagesAudio.playerImage4, ImagesAudio.playerImage3, ImagesAudio.playerImage2, ImagesAudio.playerImage1};


    public Player(int x) {
        this.PlayerXCord = x;
        this.r=new Rectangle(72,92);



    }

    @Override
    public void update() {

        if (this.PlayerYCord < Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT)) {
            this.playerYVel += this.playerYAcc;
            this.playerImage = this.jumpImage;
            this.r.setBounds(this.PlayerXCord,this.PlayerYCord,72,92);
        } else if (this.duck > 0) {
            this.playerImage = this.duckImage;
            this.duck -= 2;
            this.r.setBounds(this.PlayerXCord,this.PlayerYCord+30,72,92);
        } else if (this.PlayerYCord >= Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT)) {
            this.PlayerYCord = Game.GAME_HEIGHT - (Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT);
            this.jumpAudio.stop();
            this.playerYAcc = 0;
            this.playerYVel = 0;
            if (Player.currentIndex < 8)
                this.playerImage = this.array[currentIndex++];
            else
                this.playerImage = this.array[currentIndex = currentIndex % 8];
             this.r.setBounds(this.PlayerXCord,this.PlayerYCord,72,92);
        }
    }

    @Override
    public void render(Graphics g) {
        if (this.PlayerYCord <= (Game.GAME_HEIGHT - (
                Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT))){
            g.drawImage(this.playerImage, this.PlayerXCord, this.PlayerYCord += this.playerYVel, null);}
        else {
            g.drawImage(this.playerImage, this.PlayerXCord, (Game.GAME_HEIGHT - (
                    Stage1State.GRASS_HEIGHT + Player.PLAYER_HEIGHT)), null);

        }

    }

    public void jump() {

        this.playerYAcc = Player.plyerAccValue;
        this.playerYVel = -Player.plyerVelValue;
        this.jumpAudio.play();

    }

    public void duck() {
      if(this.duck==0)
        this.duck = 30;
    }


    }





