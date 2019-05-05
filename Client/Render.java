package Client;

import Common.Grid;
import Common.Square;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.Serializable;

public class Render implements Serializable {


    public Render(){

    }

    public BorderPane render(Grid g) {
        BorderPane p = new BorderPane();
        for (Square square : g.getGrid()) {
            int x 			= square.getSquareX(),
                y 			= square.getSquareY(),
                size 		= square.getSquareSize();
            Rectangle rect 	= new Rectangle(x*size,y*size,size, size);
            String fill = square.getSquareFill();

            rect.setFill(Color.valueOf(fill));
            rect.setStroke(Color.valueOf("#f5f6fa"));

            p.getChildren().add(rect);
        }
        return p;
    }
}
