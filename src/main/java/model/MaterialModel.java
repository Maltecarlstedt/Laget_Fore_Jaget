package model;

import model.MapStates.Karhuset;
import model.MapStates.MapState;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MaterialModel {
    public Image scissor;
    private Rectangle scissorLocation;

    public Image scissorUf;
    private Rectangle scissorUfLocation;

    public Image karkort;
    private Rectangle karkortLocation;

    public Image karkortUf;
    private Rectangle karkortUfLocation;

    public Image cardboard;
    private Rectangle cardboardLocation;

    public Image cardboardUf;
    private Rectangle cardboardUfLocation;

    public Image rope;
    private Rectangle ropeLocation;

    public Image ropeUf;
    private Rectangle ropeUfLocation;

    public Image blackColor;
    private Rectangle blackColorLocation;

    public Image blackColorUf;
    private Rectangle blackColorUfLocation;

    public Image turqoiseColor;
    private Rectangle turqoiseColorLocation;

    public Image turqoiseColorUf;
    private Rectangle turqoiseColorUfLocation;

    public Rectangle rect;

  //  ArrayList<Rectangle> materialsFilled = new ArrayList<>();
  //  ArrayList<Object> materialsUnfilled = new ArrayList<>();

    HashMap<Rectangle, Image> materialsFilled = new HashMap<>();
    HashMap<Rectangle, Image> materialsUnfilled = new HashMap<>();

   // public ArrayList<Rectangle> getMaterialsFilled() {return materialsFilled;}
   // public ArrayList<Object> getMaterialsUnfilled() {return materialsUnfilled;}

    public HashMap<Rectangle, Image> getMaterialsF(){ return materialsFilled;}
    public HashMap<Rectangle, Image> getMaterialsUf(){ return materialsUnfilled;}


    public MaterialModel() throws SlickException {
        initScissorUf();
        initKarkortUf();
        initCardboardUf();
        initRopeUf();
        initBlackColorUf();
        initTurqoiseColorUf();

        initScissor();
        initKarkort();
        initCardboard();
        initRope();
        initBlackColor();
        initTurqoiseColor();

        initRect();

        /*
        materialsF.put(scissorLocation, scissor);
        materialsF.put(karkortLocation, karkort);
        materialsF.put(cardboardLocation, cardboard);

        materialsUf.put(karkortUfLocation, karkortUf);

         */


        materialsFilled.put(scissorLocation, scissor);
        materialsFilled.put(karkortLocation, karkort);
        materialsFilled.put(cardboardLocation, cardboard);
        materialsFilled.put(ropeLocation, rope);
        materialsFilled.put(blackColorLocation, blackColor);
        materialsFilled.put(turqoiseColorLocation, turqoiseColor);

        materialsUnfilled.put(scissorUfLocation, scissorUf);
        materialsUnfilled.put(karkortUfLocation, karkortUf);
        materialsUnfilled.put(cardboardUfLocation, cardboardUf);
        materialsUnfilled.put(ropeUfLocation, ropeUf);
        materialsUnfilled.put(blackColorUfLocation, blackColorUf);
        materialsUnfilled.put(turqoiseColorUfLocation, turqoiseColorUf);

    }


    public void initScissor() throws SlickException {
        scissor = new Image("data/material/scissor.png");
        scissor.setName("scissor");
        scissorLocation = new Rectangle(200,200,32,32);
    }

    public void initKarkort() throws SlickException {
        karkort = new Image("data/material/karkortet.png");
        karkort.setName("karkort");
        karkortLocation = new Rectangle(250,250,32,32);
    }

    public void initCardboard() throws SlickException {
        cardboard = new Image("data/material/cardboard.png");
        cardboardLocation = new Rectangle(350, 350,32,32);
    }

    public void initRope() throws SlickException {
        rope = new Image("data/material/rope.png");
        ropeLocation = new Rectangle(400, 400,32,32);
    }

    public void initBlackColor() throws SlickException {
        blackColor = new Image("data/material/black_color.png");
        blackColorLocation = new Rectangle(450, 450,32,32);
    }

    public void initTurqoiseColor() throws SlickException {
        turqoiseColor = new Image("data/material/turqoise_color.png");
        turqoiseColorLocation = new Rectangle(500, 500,32,32);
    }

    public void initScissorUf() throws SlickException {
        scissorUf = new Image("data/material/scissor_uf.png");
        scissorUf.setName("scissorUf");
        scissorUfLocation = new Rectangle(getStartX(), getStartY(),32,32);
    }

    public void initKarkortUf() throws SlickException {
        karkortUf = new Image("data/material/karkortet_uf.png");
        karkortUf.setName("karkortUf");
        karkortUfLocation = new Rectangle(getStartX()+50,getStartY(),32,32);
    }

    public void initCardboardUf() throws SlickException {
        cardboardUf = new Image("data/material/cardboard_uf.png");
        cardboardUfLocation = new Rectangle(getStartX()+100,getStartY(),32,32);
    }

    public void initRopeUf() throws SlickException {
        ropeUf = new Image("data/material/rope_uf.png");
        ropeUfLocation = new Rectangle(getStartX()+150,getStartY(),32,32);
    }

    public void initBlackColorUf() throws SlickException {
        blackColorUf = new Image("data/material/black_color_uf.png");
        blackColorUfLocation = new Rectangle(getStartX()+200,getStartY(),32,32);
    }

    public void initTurqoiseColorUf() throws SlickException {
        turqoiseColorUf = new Image("data/material/turqoise_color_uf.png");
        turqoiseColorUfLocation = new Rectangle(getStartX()+250,getStartY(),32,32);
    }

    public void initRect(){
        rect = new Rectangle(700,710, 350, 70);
    }

    private int getStartX(){
        return 710;
    }
    private int getStartY(){
        return 725;
    }
}
