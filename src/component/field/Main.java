package component.field;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();

        HBox panel = new HBox();
        panel.setSpacing(10);
        Label label = new Label("用户名:");
        TextField textField = new TextField();
        textField.setPromptText("请输入用户名");
        Button clear = new Button("清除");
        panel.getChildren().addAll(label, textField, clear);
        root.addRow(0, panel);

        HBox panel1 = new HBox();
        panel1.setSpacing(10);
        Label label1 = new Label("密码:");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("请输入密码");
        panel1.getChildren().addAll(label1, passwordField);
        root.addRow(1, panel1);

        clear.setOnAction(event -> textField.clear());

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("field");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
