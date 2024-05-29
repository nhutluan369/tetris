package com.example.newfxproject;



import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;

        switch (name) {
            case "j":
                color = Color.rgb(0,0,128);
                break;
            case "l":
                color = Color.rgb(255,140,0);
                break;
            case "o":
                color = Color.rgb(255,255,0);
                break;
            case "s":
                color = Color.rgb(255,0,0);
                break;
            case "t":
                color = Color.rgb(128,0,128);
                break;
            case "z":
                color = Color.rgb(0,255,0);
                break;
            case "i":
                color = Color.rgb(0,255,255);
                break;

        }
        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }


    public String getName() {
        return name;
    }


    public void changeForm() {
        if (form != 4) {
            form++;
        } else {
            form = 1;
        }
    }
}