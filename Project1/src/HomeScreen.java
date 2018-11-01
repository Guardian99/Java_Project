import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView; 
import java.io.File;
public class HomeScreen extends Application
{
// testing github
	public static void main(String[] args) {
		Application.launch(args);
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage firststage) throws Exception {
		firststage.setTitle("Home Screen");
		Button button1=new Button("Play Game");
		
		String path="C:/Users/Kanishk/Desktop/moss/tune.mp3";
		// AudioClip clip=new AudioClip(path);
		// clip.setCycleCount(AudioClip.INDEFINITE); 
  		//       clip.play(); 
		 //Instantiating Media class  
		Media media = new Media(new File(path).toURI().toString());  

		// Instantiating MediaPlayer class   
		MediaPlayer mediaPlayer = new MediaPlayer(media);  

		//by setting this property to true, the audio will be played   
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();
		{
		mediaPlayer.setOnEndOfMedia(new Runnable() 
		{
		public void run() 
		{
		    mediaPlayer.seek(Duration.ZERO);
		    mediaPlayer.play();
		}
		});

		}
		
		button1.setOnAction(e -> { Test test=new Test();
		test.start(firststage);
		});
		Button button2=new Button("Resume");
		button2.setOnAction(e -> { Test test=new Test();
		test.start(firststage);
		});
		Button button3=new Button("Leader Board");
		Button button4=new Button("Exit");
		VBox vbox=new VBox(20,button1,button2,button3,button4);
		button4.setOnAction(e -> Platform.exit());
		Scene firstscene = new Scene(vbox,200,200);
		//firstscene = new Scene(button1,button2,200,100);
		//Button button2=new Button("Second Button");
		firststage.setScene(firstscene);
		firststage.show();
		// TODO Auto-generated method stub
		
	}

}
