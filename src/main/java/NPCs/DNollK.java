package NPCs;

import model.MapStates.DeltaP;
import model.MapStates.MapState;
import model.MapStates.Markena;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.awt.*;

public class DNollK extends NPC {
    public DNollK() throws SlickException {
        width = 64;
        height = 128;
        state = 0;
        current = DeltaP.DELTAP;
        location = new Point(500, 179);
        initNPC();
    }

    @Override
    void spriteSetup() throws SlickException {
        character = new SpriteSheet("data/NPC/dnollk128x128TASK.png", 64, 128);
        animation = new Animation();
        animation.addFrame(character.getSubImage(0, 0), 200);
        animation.addFrame(character.getSubImage(1, 0), 200);
    }

    @Override
    void initNPC() throws SlickException {
        spriteSetup();
    }

    @Override
    public void render(GameContainer gc, Graphics g) {
        if(isShowing) {
            g.drawAnimation(animation, getLocation().x, getLocation().y);
        }
    }

    @Override
    void setLocation(int x, int y) {
        location.x = x;
        location.y = y;
    }

    @Override
    public MapState getCurrent() {
        return current;
    }

    @Override
    Point getLocation() {
        return location;
    }

    @Override
    public void setShowing(boolean isItShowing) {
        isShowing = isItShowing;
    }
}
