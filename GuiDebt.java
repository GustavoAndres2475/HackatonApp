import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import java.util.*;

import java.io.*;

// Class creates the GUI
public class GuiDebt extends Application{

	private final int COL_LOWER = 0;
	private final int COL_UPPER = 4;
	private final int INDEX = 0;
	private final int SPAN = 1;
	private final int HALF = 2;


	private GridPane pane;
	private Scene scene;
	private Stage stage;

	private static int[][] gridArray;
	private static Text[] label;
	public static final Color COLOR_LETTER = Color.rgb(255,255,255);

	@Override
	public void start(Stage primaryStage){
		
		// Create the pane that will hold all of the visual objects
		pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setStyle("-fx-background-color: rgb(135,206,250)");
		pane.setHgap(15);
		pane.setVgap(10);

		/* Add GUI code here */
		scene = new Scene(pane);
		stage = primaryStage;
		primaryStage.setTitle("Debt Tracker");
		primaryStage.setScene(scene);
		primaryStage.show();
		//gridArray = this.gridArray();
		
		updateGUI();
		return;

		//scene.setOnKeyPressed(new KeyHandler());
	}


	public void updateGUI() {
		label[0] = new Text("Name");
		label[1] = new Text("Quantity");
		label[2] = new Text("Interest");
		label[3] = new Text("# Payments");

		for ( int i = 0; i < COL_UPPER; i++){
			//(label[i]).setFont(Font.font("Helvetica Neue", FontWeight.BOLD, Color.BLACK));
			pane.add(label[i], INDEX, INDEX, HALF, SPAN);
			pane.setHalignment(label[i], HPos.CENTER);
		}

		
	}


}

