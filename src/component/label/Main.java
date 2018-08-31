package component.label;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("众里寻他千百度");
        label.setFont(Font.font("宋体", 20));

        label.setOnMouseEntered(event -> {
            label.setScaleX(1.5);
            label.setScaleY(1.5);
        });

        label.setOnMouseExited(event -> {
            label.setScaleX(1);
            label.setScaleY(1);
        });

        Parent root = new StackPane(label);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
