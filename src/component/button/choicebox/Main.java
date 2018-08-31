package component.button.choicebox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setItems(FXCollections.observableArrayList("one", "two", "three"));
        root.getChildren().add(choiceBox);

        Label label = new Label();
        root.getChildren().add(label);

        choiceBox.setOnAction(event -> label.setText(choiceBox.getSelectionModel().getSelectedItem()));

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("choice box");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
