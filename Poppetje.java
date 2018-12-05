import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poppetje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poppetje extends Actor
{
    /**
     * Act - do whatever the Poppetje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Poppetje()
    {
        if(Hero.player == 1)
        {
            setImage("hud_p1.png");
        }
        else if(Hero.player == 2)
        {
            setImage("hud_p2.png");
        }
        else if(Hero.player == 3)
        {
            setImage("hud_p3.png");
        }
        
    }
    public void act() 
    {
        // Add your action code here.
        
    }    
}
