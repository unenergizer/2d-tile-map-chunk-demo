package demo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameMain extends ApplicationAdapter {
    SpriteBatch batch;
    Texture a;
    Texture b;
    Texture c;
    Texture d;

    private int tileSize = 32;
    private int chunkSize = 4;
    private Maps maps = new Maps();

    @Override
    public void create() {
        batch = new SpriteBatch();
        a = new Texture("0.png");
        b = new Texture("1.png");
        c = new Texture("2.png");
        d = new Texture("3.png");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                String mapName = Integer.toString(i) + Integer.toString(j);
                draw(i, j, maps.mapChunks.get(mapName));
            }
        }

        drawLocation(16, 16);

        batch.end();
    }

    private void drawLocation(int worldX, int worldY) {

        // first get chunk
        int chunkX = worldX * tileSize / chunkSize;
        int chunky = worldY * tileSize / chunkSize;

        // then get location on tile


        batch.draw(d, chunkX, chunky);
    }

    private void draw(int chunkX, int chunkY, int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                int x = (i * tileSize) + (chunkX * chunkSize * tileSize);
                int y = (j * tileSize) + (chunkY * chunkSize * tileSize);

                int tileType = map[i][j];

                if (tileType == 0) {
                    batch.draw(a, x, y);
                } else if (tileType == 1) {
                    batch.draw(b, x, y);
                } else {
                    batch.draw(c, x, y);
                }
            }
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        a.dispose();
        b.dispose();
        c.dispose();
        d.dispose();
    }
}
