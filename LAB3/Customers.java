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


public class Customers extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Adding Label names
        Text text1 = new Text("Name");
        Text text2 = new Text("Phone");
        Text text3 = new Text("Email");
        Text text4 = new Text("Registered");

        //Adding Text Fields
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();

        //Adding Combo Box
        ComboBox comboBox = new ComboBox();
        comboBox.setMinSize(300,30);

        //Adding Buttons
        Button button1 = new Button("Save Customer");
        button1.setMinSize(300,30);
        Button button2 = new Button("Remove Customer");
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

        //Arranging all the nodes in the Grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);
        gridPane.add(button1, 1, 3);
        gridPane.add(text4, 0, 4);
        gridPane.add(comboBox, 1, 4);
        gridPane.add(button2, 1, 5);

        //Create a scene object
        Scene scene = new Scene(gridPane);

        //Adding Styles to the nodes
        scene.getStylesheets().add("stylesheets/style.css");
        AnchorPane anchorpane = new AnchorPane();
        anchorpane.getStyleClass().add("pane");
        gridPane.getStyleClass().addAll("pane","grid");

        //Setting title to the stage
        stage.setTitle("Customers");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }
}
