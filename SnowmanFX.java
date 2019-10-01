import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SnowmanFX extends Application {

  public void start(Stage stage){
    Rectangle box = new Rectangle(0, 185, 550,230);
      box.setStroke(Color.WHITE);
      box.setFill(Color.WHITE);

    Circle round = new Circle(200, 175, 50);
      round.setStroke(Color.WHITE);
      round.setFill(Color.WHITE);
    Circle round1 = new Circle(200, 100, 30);
        round1.setStroke(Color.WHITE);
        round1.setFill(Color.WHITE);

    Circle round2 = new Circle(200, 50, 20);
          round2.setStroke(Color.WHITE);
          round2.setFill(Color.WHITE);

    Line line = new Line(200, 70, 100, 220);
      line.setStroke(Color.BROWN);
    Line line1 = new Line(260, 70, 210, 220);
        line1.setStroke(Color.BROWN);

      Polygon polygon = new Polygon(200,50 ,50,50);
        polygon.setStroke(Color.ORANGE);
        polygon.setFill(Color.ORANGE);

      Rectangle box1 = new Rectangle(210,7,25,25);
        box1.setStroke(Color.BLACK);
        box1.setFill(Color.BLACK);
        Rectangle box2 = new Rectangle(200,7,35,25);
          box2.setStroke(Color.BLACK);
          box2.setFill(Color.BLACK);

          Circle round3 = new Circle(195, 35, 1);
                round3.setStroke(Color.BLACK);
                round3.setFill(Color.BLACK);
          Circle round4 = new Circle(205, 35, 1);
                      round4.setStroke(Color.BLACK);
                      round4.setFill(Color.BLACK);


        Group root = new Group(box,round, round1, round2, line, line1, polygon, box1, box2, round3, round4);
        Scene scene = new Scene(root, 400, 400, Color.LIGHTBLUE);

        stage.setTitle("SnowmanFX");
        stage.setScene(scene);
        stage.show();
      }

      public static void main(String[] args){
        launch(args);
      }
    }
