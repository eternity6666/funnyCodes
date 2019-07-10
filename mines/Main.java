import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Button bt88 = new Button("8 * 8\n10 ");
        Button bt1616 = new Button("16 * 16\n40");
        Button bt3016 = new Button("30 * 16\n99");
        Button btUsr = new Button("?\n
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("扫蛋");
        primaryStage.show();
    }
}

