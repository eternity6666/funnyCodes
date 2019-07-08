import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Button;
import javafx.scene.BorderPane;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Button btNewGame = new Button("New Game");
        BorderPane pane = new BorderPane();
        pane.setCenter(btNewGame);

        btNewGame.setOnPressed

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("扫蛋");
        primaryStage.show();
    }
}

