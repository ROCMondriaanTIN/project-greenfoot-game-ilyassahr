import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    public static int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText(""+score, 35, 135);
        if(Counter.score == 200)
        {
            Greenfoot.setWorld(new MyWorld2());
            score += 1;
        }
        
    }    
     
    public void addScore()
    {
        score++;
    }
}