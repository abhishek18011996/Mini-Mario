package Utility;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * Created by abhishek on 08-07-2017.
 */
public class ImagesAudio {

    public static Image WelcomeImage = null;
    public static Image SelectorImage = null;
    public static Image grassImage = null;
    public static Image playerImage1 = null;
    public static Image playerImage2 = null;
    public static Image playerImage3 = null;
    public static Image playerImage4 = null;
    public static Image playerImage5 = null;
    public static Image jumpImage = null;
    public static Image duckImage = null;
    public static Image cloudImage1 = null;
    public static Image cloudImage2 = null;
    public static Image blockImage1 = null;
    public static Image baloonImage = null;
    public static Image bombImage = null;
    public static Image boomImage = null;
    public static Image pauseImage = null;



    public static AudioClip jumpAudio;
    public static AudioClip hitAudio;
    public static AudioClip gameAudio;
    public static AudioClip gamePauseAudio;




    public static void load() {

        URL WelcomeImageUrl = ImagesAudio.class.getResource("../resources/welcome.png");
        URL SelectorImageUrl = ImagesAudio.class.getResource("../resources/selector.png");
        URL grassImageUrl = ImagesAudio.class.getResource("../resources/grass.png");
        URL playerImageUrl1 = ImagesAudio.class.getResource("../resources/run_anim1.png");
        URL playerImageUrl2 = ImagesAudio.class.getResource("../resources/run_anim2.png");
        URL playerImageUrl3 = ImagesAudio.class.getResource("../resources/run_anim3.png");
        URL playerImageUrl4 = ImagesAudio.class.getResource("../resources/run_anim4.png");
        URL playerImageUrl5 = ImagesAudio.class.getResource("../resources/run_anim5.png");
        URL jumpImageUrl = ImagesAudio.class.getResource("../resources/jump.png");
        URL duckImageUrl = ImagesAudio.class.getResource("../resources/duck.png");
        URL cloudImageUrl1 = ImagesAudio.class.getResource("../resources/cloud1.png");
        URL cloudImageUrl2 = ImagesAudio.class.getResource("../resources/cloud2.png");
        URL baloonImageUrl = ImagesAudio.class.getResource("../resources/ballon.png");
        URL bombImageUrl = ImagesAudio.class.getResource("../resources/bomb.png");
        URL boomImageUrl = ImagesAudio.class.getResource("../resources/boom.png");
        URL blockImageUrl1 = ImagesAudio.class.getResource("../resources/block.png");
        URL pauseImageUrl = ImagesAudio.class.getResource("../resources/gamepause.png");
        URL jumpAudioUrl = ImagesAudio.class.getResource("../resources/onjump.wav");
        URL hitAudioUrl = ImagesAudio.class.getResource("../resources/hit.wav");
        URL gameAudioUrl = ImagesAudio.class.getResource("../resources/music.wav");
        URL gamePauseAudioUrl = ImagesAudio.class.getResource("../resources/abhisound.wav");



            try {
                grassImage = ImageIO.read(grassImageUrl);
                playerImage1 = ImageIO.read(playerImageUrl1);
                playerImage2 = ImageIO.read(playerImageUrl2);
                playerImage3 = ImageIO.read(playerImageUrl3);
                playerImage4 = ImageIO.read(playerImageUrl4);
                playerImage5 = ImageIO.read(playerImageUrl5);
                jumpImage = ImageIO.read(jumpImageUrl);
                duckImage = ImageIO.read(duckImageUrl);
                baloonImage = ImageIO.read(baloonImageUrl);
                boomImage = ImageIO.read(boomImageUrl);
                bombImage = ImageIO.read(bombImageUrl);
                blockImage1 = ImageIO.read(blockImageUrl1);
                cloudImage1 = ImageIO.read(cloudImageUrl1);
                cloudImage2 = ImageIO.read(cloudImageUrl2);
                jumpAudio = Applet.newAudioClip(jumpAudioUrl);
                hitAudio = Applet.newAudioClip(hitAudioUrl);
                gamePauseAudio = Applet.newAudioClip(gamePauseAudioUrl);
                gameAudio=Applet.newAudioClip(gameAudioUrl);
                WelcomeImage = ImageIO.read(WelcomeImageUrl);
                SelectorImage = ImageIO.read(SelectorImageUrl);
                pauseImage = ImageIO.read(pauseImageUrl);

            } catch (IOException e) {

            }


    }
}
