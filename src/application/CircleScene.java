package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.Random;

public class CircleScene extends Scene {
    private static final float WIDTH = 900;
    private static final float HEIGHT = 825;

    private static final float PADDING = 100;

    private static final float MIN_X = PADDING;
    private static final float MAX_X = WIDTH - PADDING;

    private static final float MIN_Y = PADDING;
    private static final float MAX_Y = HEIGHT - PADDING;

    private static final float MIN_R = 10;
    private static final float MAX_R = 90;

    private static final Random random = new Random();

    private static float random(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    private static int random(int min, int max) {
        return random.nextInt((max-min)) + min;
    }

    private static Paint randomColor() {
        Color color = Color.color(
                random(0f, 1f),
                random(0f, 1f),
                random(0f, 1f),
                random(0.2f, 0.8f));

        return Paint.valueOf(color.toString());
    }

    private static Group createGroup(int countOfCircles) {
        return new Group(generateCircles(countOfCircles));
    }

    private static Circle[] generateCircles(int amount) {
        Circle[] circles = new Circle[amount];
        for(int i = 0; i < amount; i++) {
            float x  = random(MIN_X, MAX_X);
            float y  = random(MIN_Y, MAX_Y);
            float r  = random(MIN_R, MAX_R);
            circles[i] = new Circle(x, y, r, randomColor());
            // circles[i].setFill(Paint.valueOf(Color.color(1,0,0).toString()));
        }
        return circles;
    }

    public CircleScene(int countOfCircles) {
        super(createGroup(countOfCircles), WIDTH, HEIGHT);
    }
}
