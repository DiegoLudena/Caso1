import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
    	//Indico la ruta de la vista
        Parent root = FXMLLoader.load(getClass().getResource("Vista/DICaso1.fxml"));
        //Creo la escena
    	primaryStage.setTitle("Caso Práctico 1");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    //el programa lanza la escena
    public static void main(String[] args) {
        launch(args);
    }

}
