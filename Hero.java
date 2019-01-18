        
        import greenfoot.*;
        import java.util.List;
        /**
        *
        * @author R. Springer
        */
        public class Hero extends Mover {
        
        private int gunReloadTime;              // The minimum delay between firing the gun.
        private double reloadDelayCount;           // How long ago we fired the gun the last time.
        private Vector acceleration;            // A vector used to accelerate when using booster.
        private int shotsFired; 
        private final double gravity;
        private final double acc;
        private final double drag;
        private boolean isOnGround;
        private boolean keyCollect;
        private boolean kijktNaarLinks;
        private int walkStatus;
        private int width;
        public static int player = 1;
        int status = 0;
        
        
        private GreenfootImage walk1w = new GreenfootImage("p" + player + "_walk1.png");
        private GreenfootImage walk2w = new GreenfootImage("p" + player + "_walk2.png");
        private GreenfootImage walk3w = new GreenfootImage("p" + player + "_walk3.png");
        private GreenfootImage walk4w = new GreenfootImage("p" + player + "_walk4.png");
        private GreenfootImage walk5w = new GreenfootImage("p" + player + "_walk5.png");
        private GreenfootImage walk6w = new GreenfootImage("p" + player + "_walk6.png");
        private GreenfootImage walk7w = new GreenfootImage("p" + player + "_walk7.png");
        private GreenfootImage walk8w = new GreenfootImage("p" + player + "_walk8.png");
        private GreenfootImage walk9w = new GreenfootImage("p" + player + "_walk9.png");
        private GreenfootImage walk10w = new GreenfootImage("p" + player + "_walk10.png");
        private GreenfootImage walk11w = new GreenfootImage("p" + player + "_walk11.png");
        
        eindScherm eindscherm = new eindScherm();
        public Hero() {
        super();
        
        gunReloadTime = 5;
        reloadDelayCount = 0;
        gravity = 10.0;
        acc = 0.6;
        drag = 0.8;
        setImage("p" + player + "_front.png");
        }
        
        @Override
        public void act() {
        
        atWorldEdge();
        
        handleInput();
        checkCollision();
        reloadDelayCount++;
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("coinGold")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Counter.score += 20;
                return;
        
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("gemYellow")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Greenfoot.setWorld(new MyWorld3());
                return;                
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("LiquidLavaTop_mid")) {
                getWorld().removeObject(this);
                Lifes.lifes -= 1;
                Greenfoot.setWorld(new MyWorld4());
                break;            
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("star")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                
                getWorld().addObject(eindscherm, 500, 500);
                return;                
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("gemBlue")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Counter.score += 500;
                return;                
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("gemGreen")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Greenfoot.setWorld(new MyWorld4());
                return;                
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("coinSilver")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Counter.score += 10;
                return;
        
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("letterB")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                
                return;
        
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("letterE")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                
                return;
        
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("letterS")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                
                return;
        
            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("letterT")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                
                return;
        
            }
        }
        for (Actor tot : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile)tot;
            if (tile.getImage().toString().contains("liquidWaterTop_mid")) {
                
                
                Lifes.lifes -= 1;
                if(Lifes.lifes <= 0)
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                else
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                getWorld().removeObject(this);
                break;
            
            }
        }
        for (Actor tot : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile)tot;
            if (tile.getImage().toString().contains("liquidLavaTop_mid")) {
                
                
                Lifes.lifes -= 1;
                if(Lifes.lifes <= 0)
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                else
                {
                    Greenfoot.setWorld(new MyWorld4());
                }
                getWorld().removeObject(this);
                break;
            
            }
        }
        for (Actor teleporter : getIntersectingObjects(teleporter.class)){
        if(teleporter != null)
        {
            
            setLocation(2500, 390);
        }
        }
        for (Actor Wolkje : getIntersectingObjects(Wolkje.class)){
        if(Wolkje != null)
        {
            Greenfoot.setWorld(new MyWorld5());
            
        }
        }
        for (Actor l : getIntersectingObjects(lift.class)) {
            if (l != null) {
                getWorld().removeObject(this);
                Lifes.lifes -= 1;
                if(Lifes.lifes <= 0)
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                else
                {
                    Greenfoot.setWorld(new MyWorld2());
                }
                break;
            }
        }
        
        for (Actor enemy2 : getIntersectingObjects(Enemy2.class)) {
            if (enemy2 != null) {
                getWorld().removeObject(this);
                Lifes.lifes -= 1;
                if(Lifes.lifes <= 0)
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                else
                {
                    Greenfoot.setWorld(new MyWorld2());
                }
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                Lifes.lifes -= 1;
                if(Lifes.lifes <= 0)
                {
                    Greenfoot.setWorld(new MyWorld());
                }
                else
                {
                    Greenfoot.setWorld(new MyWorld2());
                }
                break;
            }
        }
        
        
        }
        private void checkCollision() 
        {
        
        }
        public void handleInput() 
        {
        //on ground check and handling
        
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
        if(Greenfoot.isKeyDown("space"))
        {
            fire();            
            
            
         
            }
        
        
        if (Greenfoot.isKeyDown("w")) {
            if(isOnGround){
            velocityY = -16;
            animationJump(getWidth(), getHeight());
        }
        } 
        else if (Greenfoot.isKeyDown("s")) 
        {
            velocityY = 35;
            
        
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            velocityX = -5;
            animationWalk(getWidth(), getHeight(), false);
        }
        else if (Greenfoot.isKeyDown("d")) 
        {
            velocityX = 5;
            animationWalk(getWidth(), getHeight(), true);
        }else{
            animationStand(getWidth(), getHeight());
        }
        }
        private void fire() 
        {
        if (reloadDelayCount >= gunReloadTime) {
            Fireball f = new Fireball(getMovement().copy(), getRotation());
            getWorld().addObject(f, this.getX(), this.getY());
            f.move();
            shotsFired++;
            reloadDelayCount = -15;   // time since last shot fired
            if(velocityX < 0)
            {
                f.velocityX = -15;
            }
        }

            

        }
    
    public void animationWalk(int width, int heigth, boolean right) {

        if (status == 3) {
            if (walkStatus >= 11) {
                walkStatus = 1;
            }

            if (isOnGround){
                setImage("p" + player +"_walk"
                    + walkStatus + ".png");
            }else if(velocityX == 0){
                setImage("p"+ player + "_front.png");
            }
            else if(velocityX > 0 || velocityX < 0)
            {
                setImage("p" + player + "_jump.png");
            }
            if (right){
                right = false;

            }else if (!right){
                right = true;
                getImage().mirrorHorizontally();
            }
            walkStatus++;
            status = 0;
        } else {

            status++;
        }

        getImage().scale(width, heigth);
    }
    
    public void animationJump(int width, int heigth) {
        if(velocityX < 0)
        {
            kijktNaarLinks = true;
        }
        else
        {
            kijktNaarLinks = false;
        }
        if(kijktNaarLinks = false)
        {
            setImage("p" + player + "_jump.png");
            getImage().scale(width, heigth);
        }
        
        }
        public void animationDuck(int width, int heigth, int player) {
        if(isOnGround)
        {
            setImage("p" + player + "_duck.png");
            getImage().scale(width, heigth);
        }
    }

    public void animationStand(int width, int heigth) {
        if (isOnGround) {
            setImage("p" + player + "_front.png");
            getImage().scale(width, heigth);
            walkStatus = 1;
        
        getImage().scale(width, heigth);
    }
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

