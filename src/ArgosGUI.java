import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ArgosGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Argos");
        stage.setWidth(775D);
        stage.setHeight(500D);
        stage.centerOnScreen();

        Label labelArgos = new Label("Argos");
        labelArgos.setLayoutX(10);
        labelArgos.setLayoutY(10);

        group.getChildren().addAll(labelArgos);
        stage.show();
    }
}
