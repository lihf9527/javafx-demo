package component.button.checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        CheckBox run = new CheckBox("跑步");
        run.setSelected(true);
        root.getChildren().add(run);
        CheckBox swim = new CheckBox("游泳");
        swim.setIndeterminate(true);
        root.getChildren().add(swim);
        CheckBox read = new CheckBox("阅读");
        root.getChildren().add(read);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("checkbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
