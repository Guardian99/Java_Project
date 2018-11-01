import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.scene.layout.Pane;
public class Test extends Application {

	    @Override
	    public void start (Stage stage)
	    {
	        Pane root = new Pane();
	        Scene scene = new Scene(root, 800, 800, Color.WHITE);
	        stage.setScene(scene);
	        stage.show();

	        Circle circle = new Circle(10, Color.BLUE);
	        circle.relocate(100, 100);
	        root.getChildren().add(circle);
	        Snake snake1=new Snake(root);
	        double ycord=snake1.gety();
	        double xcord=snake1.getx();
	        while(ycord>0)
	        {
	        	Circle y = new Circle(10,Color.RED);
	        	y.relocate(xcord,ycord);
	        	root.getChildren().add(y);
	        	ycord-=10;
	        }
	        KeyValue xCoord = new KeyValue (circle.centerYProperty(), scene.getWidth());
	        KeyFrame f = new KeyFrame (Duration.seconds(3), xCoord);
	        Timeline animation = new Timeline(f);
	        animation.play();
	    }

}