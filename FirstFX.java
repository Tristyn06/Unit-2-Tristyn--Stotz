import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

  public void start(Stage stage){
    Text hello = new Text(170, 95, "SMILE PLEASE!");
    Rectangle box = new Rectangle(125, 100, 150, 200);
      box.setStroke(Color.PURPLE);
      box.setFill(null);

    Circle round = new Circle(200, 200, 50);
      round.setStroke(Color.YELLOW);
      round.setFill(Color.GREEN);

    Line line = new Line(175, 200, 190, 200);
      line.setStroke(Color.PINK);
    Line line1 = new Line(205, 200, 220, 200);
        line1.setStroke(Color.PINK);
    Line line2 = new Line(175, 210, 220, 210);
            line2.setStroke(Color.BLACK);

        Group root = new Group(hello, box, round, line, line1, line2);
        Scene scene = new Scene(root, 400, 400, Color.LIGHTBLUE);

        stage.setTitle("FXPractice");
        stage.setScene(scene);
        stage.show();
      }

      public static void main(String[] args){
        launch(args);
      }
    }
