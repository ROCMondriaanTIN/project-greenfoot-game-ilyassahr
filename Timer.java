import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 2500;

    public Timer()
    {
        
    }
public void act() {
    timer--;
    getWorld().showText(""+timer, 500, 35);
    if (timer <= 0) {
        Greenfoot.stop();
        Greenfoot.setWorld(new MyWorld());
        // pause the execution of the program if 'timer' is less than or equal to 0
    }
}  
}
