package component.button.base;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(getClass().getResourceAsStream("decline-button.png"));
        Button ok = new Button("确认");
        Button error = new Button();
        error.setGraphic(new ImageView(image));
        Button cancel = new Button("取消", new ImageView(image));

        FlowPane root = new FlowPane();
        root.getChildren().add(ok);
        root.getChildren().add(error);
        root.getChildren().add(cancel);

        DropShadow shadow = new DropShadow();
        ok.setOnMouseEntered(event -> ok.setEffect(shadow));
        ok.setOnMouseExited(event -> ok.setEffect(null));

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
