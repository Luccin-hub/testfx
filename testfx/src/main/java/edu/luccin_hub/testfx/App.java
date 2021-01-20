package edu.luccin_hub.testfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
/**
*Stage
|
Scene
|
`HBox`
|--- `Button`
|--- `TextField`

*/
public class App extends Application {

    

	@SuppressWarnings("exports")
	@Override
    public void start(Stage stage) {
		
    	var button = new Button();
    	var text = new TextField();
    	var hbox = new HBox(button,text);
    	var scene = new Scene(hbox, 600, 200); 
    	stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}