package demo.game;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    Map<String, int[][]> mapChunks = new HashMap<String, int[][]>();

    public Maps() {
        mapChunks.put("00", map00);
        mapChunks.put("01", map01);
        mapChunks.put("02", map02);
        mapChunks.put("03", map03);
        mapChunks.put("04", map04);

        mapChunks.put("10", map10);
        mapChunks.put("11", map11);
        mapChunks.put("12", map12);
        mapChunks.put("13", map13);
        mapChunks.put("14", map14);

        mapChunks.put("20", map20);
        mapChunks.put("21", map21);
        mapChunks.put("22", map22);
        mapChunks.put("23", map23);
        mapChunks.put("24", map24);
    }

    private int map00[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map01[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };
    private int map02[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map03[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };
    private int map04[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };

    /////////////////////////////////


    private int map10[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };
    private int map11[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map12[][] = {
            {1, 1, 1, 1},
            {1, 3, 3, 1},
            {1, 3, 3, 1},
            {1, 1, 1, 1},
    };
    private int map13[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map14[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };

    /////////////////////////////////


    private int map20[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map21[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };
    private int map22[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
    private int map23[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
    };
    private int map24[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };
}
