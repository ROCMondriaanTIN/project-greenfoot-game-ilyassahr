import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Mover
{
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball(Vector speed, int rotation)
    {
        
        setRotation(rotation);
        
        
    }
    public void act() 
    {
        // Add your action code here.
        
            Enemy enemy1 = (Enemy) getOneIntersectingObject(Enemy.class);
            if (enemy1 != null) {
                getWorld().removeObject(this);
                
            }
            
    }    
}
