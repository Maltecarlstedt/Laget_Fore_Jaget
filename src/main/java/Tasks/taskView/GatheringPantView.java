package Tasks.taskView;

import Tasks.taskController.GatheringPantController;
import Tasks.taskModel.GatheringPantModel;
import Tasks.taskModel.Pant;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GatheringPantView {

    /** Method to draw each pant.
     * @param g represents the graphics context to be used for rendering.
     * @param pm representing the model to get data from it.
     */
    public void render (Graphics g, GatheringPantModel pm) {
        pm.getBackground().render(0,0);

        // the mouse
        if(pm.isRunning){
            g.setColor(Color.cyan);
            g.fill(pm.mouseBall);

            g.setColor(Color.white);

            // Render our box that will have the timer inside of it.

        } else{
            g.drawString("Bra plockat!", 400, 400);
            g.drawString("Tryck F för att avsluta uppdraget.", 400, 440);
        }

        g.drawImage(pm.timerBox,820, 40);

        g.drawImage(pm.highScoreBox, 820, 140);

        g.drawString("Your score: ", 820, 20);
        g.drawString("Highscore: ", 820, 120);

        // Render the timer.
        g.drawString(String.valueOf(pm.getTaskTimer()), 835,55);
        g.drawString(String.valueOf(pm.getScore()), 835,75);
        for(int i = 0; i < pm.getPantHighscore().size(); i++){
            int number = pm.getPantHighscore().get(i).intValue();
            g.drawString(String.valueOf(number), 835, 155 + i*35);
        }

        for(Pant pant : pm.getPants()){
            g.drawImage(pant.getImage(), pant.getPantLocation().getX(), pant.getPantLocation().getY());

        }
    }



}
