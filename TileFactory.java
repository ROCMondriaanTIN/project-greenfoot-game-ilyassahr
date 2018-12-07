
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 3:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 18:
                tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 19:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 20:
                tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 31:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 33:
                tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 35:
                tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 37:
                tile = new Tile("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 48:
                tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 50:
                tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 51:
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 55:
                tile = new Tile("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 56:
                tile = new Tile("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 96:
                tile = new Tile("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 97:
                tile = new Tile("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 99:
                tile = new Tile("gemYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 100:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 101:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 103:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 104:
                tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 105:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 106:
                tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 107:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 111:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 112:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 113:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 114:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 117:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 119:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 131:
                tile = new Tile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 133:
                tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 134:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 136:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 141:
                tile = new Tile("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 165:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 194:
                tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 195:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 196:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 197:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 52:
                tile = new Tile("cloud2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 53:
                tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 223:
                tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 252:
                tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
