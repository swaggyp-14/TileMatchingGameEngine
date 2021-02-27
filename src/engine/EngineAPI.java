package engine;

import GameData.TileMap;
import game.Game;

import javax.swing.*;

public class EngineAPI {
    private TileMap tileMap;
    private Game game;
    public EngineAPI() {

    }
    public void setTileDimensions(int rows, int cols) {
        this.tileMap = new TileMap(rows, cols);
    }
    public void initGame(String gameName) throws Exception {
        this.game = new Game(gameName, tileMap);
    }
    public void setScorePerClear(int score) {
        this.game.setScorePerClear(score);
    }
    public void launchGame() {
        JFrame frame = game;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    // TODO - Add more interfaces that the game needs to implement
}
