package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			Scene scene = new Scene(root,400,400);

			root.getChildren().add(new Label("Mahira's label"));
			root.getChildren().add(new Label("Mahira's branch"));
			primaryStage.setTitle("Fairooz's Project");
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			root.getChildren().add(new Label("Fairooz's label"));
			root.getChildren().add(new Label("Fairooz's branch"));		

			primaryStage.setScene(scene);
			primaryStage.setTitle("Fairooz's Project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
