import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class Leaderboard extends Application 
{

    Stage window;
    //Load user 
    public ObservableList<User> getUser()
    {
        ObservableList<User> leaderboard = FXCollections.observableArrayList();
        leaderboard.add(new User("Guest1", 2000));
        leaderboard.add(new User("Guest2", 3000));
        leaderboard.add(new User("Guest3", 4000));
        leaderboard.add(new User("Guest4", 5000));
        leaderboard.add(new User("Guest5", 6000));
        return leaderboard;
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        window = primaryStage;
        window.setTitle("Leaderboard");
        //Name column
        TableColumn<User,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
        //Hi-Score column
        TableColumn<User, Double> scoreColumn = new TableColumn<>("High Score");
        scoreColumn.setMinWidth(100);
        scoreColumn.setCellValueFactory(new PropertyValueFactory<User,Double>("highScore"));
        //Table
        TableView<User> table = new TableView<>();
        table.setItems(getUser());
        table.getColumns().addAll(nameColumn, scoreColumn);
        //Layout
        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);
        //Scene setting
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }


    
}
