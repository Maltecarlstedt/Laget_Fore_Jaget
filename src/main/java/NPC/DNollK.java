package NPC;

import model.MapModel;
import model.MapStates.DeltaP;
import model.MapStates.MapState;
import org.newdawn.slick.Animation;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.awt.*;

public class DNollK extends TaskHoldingNPC {
    public DNollK(MapModel mp) throws SlickException {
        width = 64;
        height = 128;
        state = 0;
        current = DeltaP.DELTAP;
        location = new Point(500, 179);
        initNPC(mp);
    }

    @Override
    void spriteSetupTask() throws SlickException {
        taskCharacter = new SpriteSheet("data/NPC/dnollk128x128TASK.png", 64, 128);
        animation = new Animation();
        animation.addFrame(taskCharacter.getSubImage(0, 0), 200);
        animation.addFrame(taskCharacter.getSubImage(1, 0), 200);
    }

    @Override
    void spriteSetup() throws SlickException{
        character = new SpriteSheet("data/NPC/dnollk64x64.png", 64, 128);
        animation = new Animation();
        animation.addFrame(character.getSubImage(0, 0), 1);
    }



    @Override
    void initNPC(MapModel mp) throws SlickException {
        if (!mp.taskDone) {
            spriteSetupTask();
        } else {
            spriteSetup();

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
