package component.button.radio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        // 单选按钮
        RadioButton radioButton = new RadioButton("游泳");
        radioButton.setSelected(true);
//        root.getChildren().add(radioButton);

        // 带图片的单选按钮
        Image image = new Image(getClass().getResourceAsStream("cancel.png"));
        RadioButton imgRadioButton = new RadioButton("取消");
        imgRadioButton.setGraphic(new ImageView(image));
//        root.getChildren().add(imgRadioButton);

        // 单选按钮组
        ToggleGroup sex = new ToggleGroup();
        RadioButton man = new RadioButton("男");
        man.setUserData(1);
        man.setToggleGroup(sex);
        root.getChildren().add(man);
        RadioButton woman = new RadioButton("女");
        woman.setUserData(0);
        woman.setToggleGroup(sex);
        root.getChildren().add(woman);

        sex.selectedToggleProperty().addListener((a, b, c) -> {
            System.out.println(sex.getSelectedToggle().getUserData());
        });

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("radio button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
