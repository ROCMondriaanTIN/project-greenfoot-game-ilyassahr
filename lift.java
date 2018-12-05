import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lift extends Mover
{
    private int walkrange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    public boolean isSolid = true;
    
    lift lift;
    TileEngine tile;
    public lift() {
        super();
        setImage("bridge.png");
        tile.isSolid = true;
        walkrange = 1000;
        firstAct = true;
        speed = 5;
    }
    public void act()
    {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkrange / 2;
            xMax = x + walkrange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            
        }
    }    
}
