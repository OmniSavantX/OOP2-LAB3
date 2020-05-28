/**
 * @author Bill Glinton
 * @author Mandy Achieng
 * @author Dennis Gikunju
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Parent Class
 */
public class Genres extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Create Label Name
        Text text1 = new Text("Name");

        //Create Label Registered
        Text text2 = new Text("Registered");

        //Create Text Field for name
        TextField textField1 = new TextField();

        //Create Combo Box for Registered
        ComboBox comboBox = new ComboBox();
        comboBox.setMinSize(300,30);

        //Create Buttons
        Button button1 = new Button("Save");
        button1.setMinSize(300,30);
        Button button2 = new Button("Remove");
        button2.setMinSize(300,30);

        //Creating Grid Pane and Import relevant Classes
        GridPane gridPane = new GridPane();

        //Set up size for the Pane
        gridPane.setMinSize(600, 400);

        //Set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Set the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //Set the Grid Alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arrange all the nodes in the Grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(comboBox, 1, 2);
        gridPane.add(button2, 1, 3);

        //Create a scene object
        Scene scene = new Scene(gridPane);

        //Adding styles to the Nodes
        scene.getStylesheets().add("stylesheets/style.css");
        AnchorPane anchorpane = new AnchorPane();
        anchorpane.getStyleClass().add("pane");
        gridPane.getStyleClass().addAll("pane","grid");

        //Setting title to the stage
        stage.setTitle("Movie library System");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }
}
