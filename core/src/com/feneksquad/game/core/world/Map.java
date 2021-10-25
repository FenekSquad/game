package com.feneksquad.game.core.world;

public class Map {
    int[][][] map = new int[100][100][5];

    public Map() {
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                for (int z = 0; z < map[x][y].length; z++) {
                    map[x][y][z] = 1;
                }
            }
        }
    }

    public void setMap(int[][][] map) {
        this.map = map;
    }
}