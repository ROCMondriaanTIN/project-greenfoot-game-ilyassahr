
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Mover extends Actor {

    public int screenX;
    public int screenY;
    public double velocityX;
    public double velocityY;
    protected Camera camera;
    private Vector movement = new Vector();
    
    private double x = 0;
    private double y = 0;

    private int worldX;
    private int worldY;
    private boolean firstLocation = true;
    private boolean hasCamera;

    /**
     * Methode to set the camera a Mover can have
     *
     * @param camera A Camera class
     */
    public void setCamera(Camera camera) {
        this.camera = camera;
        hasCamera = true;
    }
    public void move() 
    {
        x = x + movement.getX();
        y = y + movement.getY();
        if(x >= getWorld().getWidth()) {
            x = 0;
        }
        if(x < 0) {
            x = getWorld().getWidth() - 1;
        }
        if(y >= getWorld().getHeight()) {
            y = 0;
        }
        if(y < 0) {
            y = getWorld().getHeight() - 1;
        }
        setLocation(x, y);
    }
    public Vector getMovement() 
    {
        return movement;
    }
    public void increaseSpeed(Vector s) 
    {
        movement.add(s);
    }
public boolean atWorldEdge()
    {
        if(getX() < 0) {
            setLocation(0, getY());
            return true;
        }
        if(getX() > TileEngine.MAP_WIDTH * TileEngine.TILE_WIDTH){
            setLocation(TileEngine.MAP_WIDTH * TileEngine.TILE_WIDTH , getY());
            return true;
        }
        else
            return false;
    }

    
    /**
     * Removes the camera if a camera has been set
     */
    public void removeCamera() {
        if (hasCamera) {
            this.camera = null;
            hasCamera = false;
        }
    }

    /**
     * Apply change in position based on velocityX and velocityY
     */
    public void applyVelocity() {
        if (Math.abs(velocityX) < 0.01) {
            velocityX = 0;
        }
        if (Math.abs(velocityY) < 0.01) {
            velocityY = 0;
        }
        setLocation((int) (getX() + .5 + velocityX), (int) (getY() + .5 + velocityY));
    }

    @Override
    public void setLocation(int x, int y) {
        if (firstLocation == true) {
            firstLocation = false;
            screenX = x;
            screenY = y;
        }
        super.setLocation(screenX, screenY);
        this.worldX = x;
        this.worldY = y;
    }
    public void setLocation(double x, double y) 
    {
        this.x = x;
        this.y = y;
        super.setLocation((int) x, (int) y);
    }
    @Override
    public int getX() {
        return this.worldX;
    }

    @Override
    public int getY() {
        return this.worldY;
    }

    /**
     * Returns the x position based on the screen
     *
     * @return
     */
    public int getScreenX() {
        return this.screenX;
    }

    /**
     * Returns the y position based on the screen
     *
     * @return
     */
    public int getScreenY() {
        return this.screenY;
    }

    @Override
    public String toString() {
        return "X: " + getX() + "\n"
                + "Y: " + getY() + "\n"
                + "screenX: " + getScreenX() + "\n"
                + "screenY: " + getScreenY() + "\n"
                + "velocityX: " + velocityX + "\n"
                + "velocityY: " + velocityY + "\n";
    }
}
