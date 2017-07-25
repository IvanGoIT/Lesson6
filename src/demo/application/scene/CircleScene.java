package demo.application.scene;

import demo.application.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import demo.application.utils.ConsoleInput;
import demo.application.utils.RandomUtils;

public class CircleScene {
    private static final float PADDING = 100;

    private static final float MIN_X = PADDING;
    private static final float MAX_X = Main.WIDTH - PADDING;

    private static final float MIN_Y = PADDING;
    private static final float MAX_Y = Main.HEIGHT - PADDING;

    private static final float MIN_R = 10;
    private static final float MAX_R = PADDING - 10;

    private Circle[] circles;
    private Pane root = new Pane();

    public CircleScene(Stage primaryStage) {
        //consoleInterface();
        graphicInterface();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void consoleInterface() {
        int circlesAmount = ConsoleInput.readInt("Введите кол-во кругов");
        generateCircles(circlesAmount);
    }

    private void graphicInterface() {
        TextField countField = new TextField();
        countField.setTranslateX(10);
        countField.setTranslateY(10);
        countField.setText("50");

        Button generateButton = new Button();
        generateButton.setTranslateX(10);
        generateButton.setTranslateY(40);
        generateButton.setText("Generate");
        generateButton.setOnMouseClicked(event -> {
            int count = Integer.parseInt(countField.getText());
            generateCircles(count);
        });

        Button redPaintAll = new Button();
        redPaintAll.setTranslateX(10);
        redPaintAll.setTranslateY(80);
        redPaintAll.setText("Paint red");
        redPaintAll.setOnMouseClicked(event -> {
            paintAll(Color.color(1,0,0));
        });

        root.getChildren().addAll(countField, generateButton, redPaintAll);
    }

    private Paint randomColor() {
        Color color = Color.color(
                RandomUtils.range(0f, 1f),
                RandomUtils.range(0f, 1f),
                RandomUtils.range(0f, 1f),
                RandomUtils.range(0.2f, 0.8f));

        return Paint.valueOf(color.toString());
    }

    private void clearCircles() {
        if (circles != null && circles.length > 0) {
            root.getChildren().removeAll(circles);
        }
    }

    private void generateCircles(int amount) {
        clearCircles();
        circles = new Circle[amount];
        for(int i = 0; i < circles.length; i++) {
            float x  = RandomUtils.range(MIN_X, MAX_X);
            float y  = RandomUtils.range(MIN_Y, MAX_Y);
            float r  = RandomUtils.range(MIN_R, MAX_R);
            circles[i] = new Circle(x, y, r, randomColor());
        }
        root.getChildren().addAll(circles);
    }

    private void paintAll(Color color) {
        if (circles == null) return;

        for(int i = 0; i < circles.length; i++)
            circles[i].setFill(Paint.valueOf(color.toString()));
    }
}
