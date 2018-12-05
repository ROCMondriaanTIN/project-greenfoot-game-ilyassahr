import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eindScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eindScherm extends Actor
{
    /**
     * Act - do whatever the eindScherm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Je hebt gewonnen!", 48, Color.WHITE, Color.BLACK));
    }    
}
