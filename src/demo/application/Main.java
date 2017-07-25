package demo.application;

import demo.application.scene.CircleScene;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static final float WIDTH = 900;
    public static final float HEIGHT = 825;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);

        CircleScene circleScene = new CircleScene(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
