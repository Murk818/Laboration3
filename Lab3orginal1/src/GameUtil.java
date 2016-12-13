import java.awt.*;

/**
 * Created by Murk on 2016-12-13.
 */
public class GameUtil{
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    static void setGameboardState(final Position pos, final GameTile tile, GameTile[][] gameboardState) {
        setGameboardState(pos.getX(), pos.getY(), tile, gameboardState);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    static void setGameboardState(final int x, final int y,
                                     final GameTile tile, GameTile[][] gameboardState) {
        gameboardState[x][y] = tile;
    }

    static Dimension getGameboardSize(){
        Dimension gameboardSize = Constants.getGameSize();
        return gameboardSize;
    }

}
