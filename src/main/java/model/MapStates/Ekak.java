package model.MapStates;

import model.Orientation;
import model.PlayerModel;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * Creates an enum for one map piece which holds the specific methods for just that map.
 * This map is for the tiled map Ekak.
 */
public enum Ekak implements MapState{
    EKAK;

    private String dPath = "data/maps/ekak.tmx";

    @Override
    public MapState nextMap(Orientation orientation) throws SlickException {
        switch (orientation){
            case RIGHT:
                return Rannan.RANNAN;
            case LEFT:
                return Sandladan.SANDLADAN;
            default:
                return Ekak.EKAK;

        }
    }

    @Override
    public void setPosition(PlayerModel player) {

    }

    @Override
    public TiledMap loadMap() throws SlickException {
        return new TiledMap(dPath);
    }

    @Override
    public MapState map(){
        return this;
    }

    @Override
    public int getTopLayers(){
        return 1;
    }
}
