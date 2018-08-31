package component.button.toggle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        ToggleGroup group = new ToggleGroup();
        ToggleButton btn1 = new ToggleButton("按钮1");
        btn1.setToggleGroup(group);
        root.getChildren().add(btn1);
        ToggleButton btn2 = new ToggleButton("按钮2");
        btn2.setToggleGroup(group);
        btn2.setSelected(true);
        root.getChildren().add(btn2);
        ToggleButton btn3 = new ToggleButton("按钮3");
        btn3.setToggleGroup(group);
        root.getChildren().add(btn3);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("toggle button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
