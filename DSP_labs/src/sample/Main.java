package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
//        stage.setTitle("Digital Signals Processing - labs");
//
//        Group root = new Group();
//        Text text = new Text(170, 50, "Digital Signals Processing\n\t\tlabs");
//        text.setScaleX(3);
//        text.setScaleY(3);
//        Button l1 = new Button("Lab #1");
//        l1.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                Lab_1 lab1 = new Lab_1();
//                lab1.start(stage);
//            }
//        });
//        root.getChildren().addAll(text, l1);
//        Scene scene = new Scene(root, 480, 520);
        Lab_2 lab2 = new Lab_2();
        lab2.start(stage);
//        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

