package Entity;

import Stage.Stage1State;

import java.awt.*;

/**
 * Created by abhishek on 10-07-2017.
 */
abstract public class Entity {
    public Boolean setVisible=true;
        public Rectangle r;

   abstract public void update();



    abstract public void render(Graphics g);



}
