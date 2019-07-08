import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Mine {
    private int mine[][];
    private int row;
    private int col;
    private int oo;

    public Mine() {
        this(8, 8, 10);
    }

    /*
    public Mine(int row, int col) {
        Mine(row, col, row * col / 4);
    }
    */

    public Mine(int row, int col, int oo) {
        if(row < 8)
        this.row = row;
        this.col = col;
        this.oo = oo;
        create();
    }
    
    public void create() {
        mine = new int[row][col];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                mine[i][j] = -1;

    }
            
}

