package application;

import javafx.application.Application;
import javafx.stage.Stage;
import utils.ConsoleInput;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        int countOfCircles = ConsoleInput.readInt("Введите кол-во кругов");

        primaryStage.setScene(new CircleScene(countOfCircles));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
