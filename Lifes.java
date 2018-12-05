import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    /**
     * Act - do whatever the Lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int lifes = 3;
    public Lifes()
    {
        setImage("hud_heartFull.png");
        if(lifes == 0)
        {
            Greenfoot.setWorld(new MyWorld());
            lifes += 3;
        }
    }
    
    public void act() 
    {
        
    }    
}
