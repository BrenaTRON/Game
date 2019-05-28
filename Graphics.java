package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
public class Main extends Application {

    @Override
    public void start (Stage primaryStage )
    {
        primaryStage.setTitle("JavaFx Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment( Pos.CENTER );
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding( new Insets(25,25,25,25));
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        reposition( grid );
        primaryStage.show();
    }
    public static void reposition( GridPane grid )
    {
        Button btn = new Button();
        btn.setStyle(
                "-fx-background-radius: 20em; " +
                        "-fx-min-width: 200px; " +
                        "-fx-min-height: 200px; " +
                        "-fx-max-width: 200px; " +
                        "-fx-max-height: 200px;" +
                        "-fx-background-color: #ff0000;"

        );
        grid.add(btn, 1, 2);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                grid.getChildren().removeAll(btn);
            }
        });
    }



   // public static void main(String[] args) {
        //launch(args);
   // }
}
