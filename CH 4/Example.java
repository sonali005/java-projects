import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Example extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("My Label");
        
        StackPane root = new StackPane(label);  // Use StackPane as the root node
        Scene scene = new Scene(root, 300, 200); // Set width and height

        stage.setTitle("Watership Down");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
