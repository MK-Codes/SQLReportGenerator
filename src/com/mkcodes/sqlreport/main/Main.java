package com.mkcodes.sqlreport.main;

import java.util.Map;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

	private Scene scene;
	private String title = "SQL Runner v0.0.1";
	private BorderPane paneRoot;
	private Button startButton;
	private Map<Integer, String> sqlReturns;
	private TextArea textArea;

	@Override
	public void start(Stage primaryStage) {

		startButton = new Button("Run the SQL!");
		startButton.setOnAction(this);

		textArea = new TextArea();

		// Set up stage and add all the bumfs
//		flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
		paneRoot = new BorderPane();
//		paneRoot.setAlignment(Pos.CENTER);
//		paneRoot.getChildren().add(textArea);
//		paneRoot.setAlignment(textArea, Pos.CENTER);
//		paneRoot.setCenter(startButton);
		paneRoot.setTop(startButton);
		paneRoot.setCenter(textArea);
		textArea.setPrefSize(450, 450);
		BorderPane.setAlignment(startButton, Pos.TOP_CENTER);
		paneRoot.setPrefSize(500, 500);

		scene = new Scene(paneRoot, 500, 500);
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

//		setUpSQLParams();

		launch(args);
	}

	@Override
	public void handle(Event arg0) {

		textArea.setText("Running. Please wait.");
		// spin up threads
//		sqlReturns = runSQL();
		//
	}

}
