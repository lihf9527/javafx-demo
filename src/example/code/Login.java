package example.code;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Text text = new Text("Welcome to the world of JavaFx!");
        text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        root.add(text, 0, 0, 2, 1);

        Label username = new Label("username:");
        root.add(username, 0, 1);

        Label password = new Label("password");
        root.add(password, 0, 2);

        TextField textField = new TextField();
        root.add(textField, 1, 1);

        PasswordField passwordField = new PasswordField();
        root.add(passwordField, 1, 2);

        Button button = new Button("登录");
        HBox hBox = new HBox(button);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        root.add(hBox, 1, 4);

        Text msg = new Text();
        root.add(msg, 1, 6);

        button.setOnAction(event -> {
            msg.setFill(Color.RED);
            msg.setText("username: " + textField.getText() + ", password: " + passwordField.getText());
        });

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Welcome!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
