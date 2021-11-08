package com.feneksquad.game.core.world;

public class Map {
    Tile[][][] map = new Tile[100][100][5];

    public Map() {
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                for (int z = 0; z < map[x][y].length; z++) {
                    map[x][y][z] = new Tile();
                    Tile tile = map[x][y][z];
                    tile.id = 1;
                    tile.x = x;
                    tile.y = y;
                    tile.z = z;
                }
            }
        }
    }

    public void setMap(Tile[][][] map) {
        this.map = map;
    }
}