package edu.luccin_hub.testfx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		var text = new TextField();
    	var button = new Button();
    	button.setOnAction(
    		    // interface passé comme argument à la méthode setOnAction
    		    //     son seul but est d'implémenter l'interface `EventHandler`
    		    new EventHandler<ActionEvent>() {
    		            
    		            @Override
    		            // implémentation de la méthode `handle` de l'interface
    		            public void handle(ActionEvent e) {
    		                System.out.println(text.getCharacters());
    		            }
    		        }
    		    );
    	
    	var hbox = new HBox(button,text);
    	var scene = new Scene(hbox, 600, 200); 
    	stage.setScene(scene);
        stage.show();
    }

	public static void main(String[] args) {
        launch();
    }

}