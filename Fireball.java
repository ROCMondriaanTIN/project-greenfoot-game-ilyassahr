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
    private final double gravity;
    
    private boolean isOnGround;
    private int width;
    
    
    public Fireball(Vector speed, int rotation)
    {
        setImage("fireball.png");
        setRotation(rotation);
        increaseSpeed(new Vector(rotation, 5));
        gravity = 10.0;
        
        velocityY = 2;
        velocityX = 15;
    
    }
    public void act() 
    {
        // Add your action code here.
        move();
        
        for (Actor enemy2 : getIntersectingObjects(Enemy2.class)) {                
                getWorld().removeObject(enemy2);
                break;            
        }    
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {            
                if(enemy != null)
                {
                getWorld().removeObject(enemy);
                break; 
            }
        }
        
        width = getImage().getWidth() / 2;
        
        Tile tile = (Tile) getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Tile.class);
        if (tile == null) {
            tile = (Tile) getOneObjectAtOffset(this.width - 3, getImage().getHeight() / 2 + 1, Tile.class);
        }
        if (tile == null) {
            tile = (Tile) getOneObjectAtOffset((int) posToNeg(this.width) + 3, getImage().getHeight() / 2 + 1, Tile.class);
        }
        if (tile != null && tile.isSolid) {
            isOnGround = true;
        } else {
            isOnGround = false;
        }
        
        applyVelocity();    
    } 
    private double posToNeg(double x){
        return(x-(x*2));
    }

    public int getWidth()
    {
        return getImage().getWidth();
    }

    public int getHeight() 
    {
        return getImage().getHeight();
    }
}
