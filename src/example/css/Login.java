package example.css;

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

        Text text = new Text("welcome");
        text.setId("code-text");
        root.add(text, 0, 0, 2, 1);

        Label username = new Label("用户名:");
        root.add(username, 0, 1);

        TextField userField = new TextField();
        root.add(userField, 1, 1);

        Label password = new Label("密码:");
        root.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        root.add(passwordField, 1, 2);

        Button button = new Button("登录");
        HBox hBox = new HBox(button);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        root.add(hBox, 1, 3);

        button.setOnAction(event -> System.out.println("welcome"));

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());

        primaryStage.setTitle("welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
