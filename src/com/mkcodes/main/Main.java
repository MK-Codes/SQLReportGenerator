package com.mkcodes.main;

import java.util.Map;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

	private Scene scene;
	private String title = "SQL Runner v0.0.1";
	private FlowPane flowPaneRoot;
	private Button startButton;
	private Map<Integer, String> sqlReturns;

	@Override
	public void start(Stage primaryStage) {

		startButton = new Button("Run the SQL!");
		startButton.setOnAction(this);

		// Set up stage and add all the bumfs
		flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
		flowPaneRoot.setAlignment(Pos.CENTER);
		flowPaneRoot.getChildren().add(startButton);
		scene = new Scene(flowPaneRoot, 500, 500);
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void handle(Event arg0) {

		// spin up threads

		//
	}

}
