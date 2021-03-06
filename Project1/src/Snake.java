import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;
import java.util.ArrayList;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Snake {
	private ArrayList<Ball> snake;
	private int length;
	private int speed;
	private double x;
	private double y;
	private double direction;
	public Snake(Pane root) {
		snake = new ArrayList<Ball>();
		this.length = 6;
		this.speed = 3;
		this.x=(root.getWidth())/2;
		this.y=(root.getHeight())/2;
		this.direction=0;
	}
	
	public int getlength()
	{
		return length;
	}
	
	public int getspeed()
	{
		return speed;
	}
	
	public double getx()
	{
		return x;
	}
	
	public double gety()
	{
		return y;
	}

}
