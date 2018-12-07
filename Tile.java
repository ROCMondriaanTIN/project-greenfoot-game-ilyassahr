
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
<<<<<<< HEAD
public class Tile extends Actor {

    public boolean isSolid;
    private static int id;
    public int _id;
=======
public class Tile extends BasicTile {
>>>>>>> 4372fff5ea53a9c16ee13c8083969eac7aeee2f9

    /**
     * Constructor of the tile. Creates a tile based on image, width and height
     *
     * @param image Path to the image file
     * @param width Width of the tile
     * @param heigth Height of the tile
     */
    public Tile(String image, int width, int heigth) {
<<<<<<< HEAD
        super();
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ÏD: " + id, 10, 10);
        }
        _id = id;
        id++;
        
=======
        super(image, width, heigth);
>>>>>>> 4372fff5ea53a9c16ee13c8083969eac7aeee2f9
    }

    /**
     * Constructor of the tile. Creates a tile based on image, width, height and
     * a tile type
     *
     * @param image Path to the image file
     * @param width Width of the tile
     * @param heigth Height of the tile
     * @param type
     */
    public Tile(String image, int width, int heigth, TileType type) {
        super(image, width, heigth, type);
    }
}
