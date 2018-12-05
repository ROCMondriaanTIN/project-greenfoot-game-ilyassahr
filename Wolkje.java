import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolkje extends Mover
{
    private int walkrange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    
    
    public Wolkje() {
        super();
        setImage("cloud3.png");
        walkrange = 0;
        firstAct = true;
        speed = 0;
        
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