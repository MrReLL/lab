package sportstestr;
/*
This class creates a button for the Sports betting program
*
Author: Christopher Jackson Last Updated: 2/17/2020
*/
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 //class that implements interface to handle user events
public class SportsTestR extends Application implements EventHandler<ActionEvent> {

 //created button object
  private Button rulesButton;
  private Stage window;
  //create different scenes
  private Scene scene1,scene2;

  //method for main javafx code
   @Override
    public void start(Stage _primaryStage)throws Exception {
      //set title
        _primaryStage.setTitle("Sports Test");
        window = _primaryStage;

        Label lable1 = new Label("Sports Page");
        //initialized button
        rulesButton = new Button();
        // set button name
        rulesButton.setText("Rules");
        // changes view for scenes
        rulesButton.setOnAction(e -> window.setScene(scene2));

        // create layout to stack objects; 20 pixles
        VBox layout = new VBox(20);
        layout.getChildren().addAll(lable1,rulesButton);
        scene1 = new Scene(layout,600,300);

        Label lable2 = new Label(("\n\n\nRules:\n 1.User must place bet\n 2.User chooses team\n 3."
                    + "When game is over if the user won money will be gained, if not "
                    + "the user will lose the money betted."));

       //button 2
       Button returnButton = new Button("Return");
       returnButton.setOnAction(e -> window.setScene(scene1));

       //create layout to position button
      StackPane layout2 = new StackPane();
      layout2.getChildren().addAll(lable2,returnButton);

      window.setScene(scene1);
      window.setTitle("Rules Page");
      //display
      window.show();

      //create scene and size for contents in window
        scene2 = new Scene(layout2,600,300);
        //displays scene to the user
        _primaryStage.setScene(scene1);
        _primaryStage.show();
    }

  public static void main(String[] args) {
        //calls application to set up program as JavaFX application
        launch(args);
    }

    //method thats called when the user clicks the button
    @Override
   public void handle(ActionEvent _event) {
       //if statement identify button
      if(_event.getSource() == rulesButton)
           System.out.println("Rules:\n 1.User must place bet\n 2.User Chooses team\n 3."
                   + "when game is over if the user won money will be gained, if not "
                    + "the user will lose the money betted.  ");
    }

    //=================  GETTERS ===============

    //=================  SETTERS ===============
}
