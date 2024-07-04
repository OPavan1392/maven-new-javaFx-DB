package LoginPage;

import java.net.URL;
import java.nio.file.Paths;

import Commanstage.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogInScreen extends Application{
	
	public static void main(String[] args) {
		 launch(args);
	}

	@Override
	public void start(Stage stagecreatebyjava) throws Exception {
		
		StageHolder.stage= stagecreatebyjava;
		// TODO Auto-generated method stub
		URL fxmlUrl = Paths.get("C:\\Users\\archa\\eclipse-workspace\\Ecommerce_javaFX\\src\\Loginpage1.fxml").toUri().toURL();
		Parent actorGroup = FXMLLoader.load(fxmlUrl);
					
		Scene scene = new Scene(actorGroup,600,400);
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
	}

}
 