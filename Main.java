import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPaneBuilder;
import javafx.stage.Stage;

public class ToggleButtonImage extends Application {
  public static void main(String[] args) throws Exception { launch(args); }
  @Override public void start(final Stage stage) throws Exception 
  {
    final ToggleButton toggle = new ToggleButton();
    toggle.getStylesheets().add(this.getClass().getResource(
      "imagetogglebutton.css"
    ).toExternalForm());
    toggle.setMinSize(148, 148); toggle.setMaxSize(148, 148);
    stage.setScene(new Scene(
      StackPaneBuilder.create()
        .children(toggle)
        .style("-fx-padding:10; -fx-background-color: cornsilk;")
        .build()
    ));
    stage.show();
  }
}
