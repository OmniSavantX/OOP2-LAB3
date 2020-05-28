/**
 * @author Bill Glinton
 * @author Mandy Achieng
 * @author Dennis Gikunju
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Movies extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Adding label names
        Text text1 = new Text("Genres");
        Text text2 = new Text("Name");
        Text text3 = new Text("Registered");

        //Adding TextFields
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        //Adding Combo Boxes
        ComboBox comboBox1 = new ComboBox();
        comboBox1.setMinSize(300,30);
        ComboBox comboBox2 = new ComboBox();
        comboBox2.setMinSize(300,30);

        //Adding Buttons
        Button button1 = new Button("Save Movie");
        button1.setMinSize(300,30);
        Button button2 = new Button("Remove Movie");
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
        gridPane.add(comboBox1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField1, 1, 1);
        gridPane.add(button1, 1, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(comboBox2, 1, 3);
        gridPane.add(button2, 1, 4);

        //Create a scene object
        Scene scene = new Scene(gridPane);

        //Adding Styles to the nodes
        scene.getStylesheets().add("stylesheets/style.css");
        AnchorPane anchorpane = new AnchorPane();
        anchorpane.getStyleClass().add("pane");
        gridPane.getStyleClass().addAll("pane","grid");

        //Setting title to the stage
        stage.setTitle("Movies");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }
}
