import java.awt.*;

/**
 * Created by Murk on 2016-12-13.
 */
public interface IGameModel {

        GameTile getGameboardState(final Position pos);
        GameTile getGameboardState(final int x, final int y);
        Dimension getGameboardSize();
        void gameUpdate(int lastKey) throws GameOverException;

}
