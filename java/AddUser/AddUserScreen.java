package AddUser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Commanstage.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUserScreen {
	
	public static void show()  {
		// TODO Auto-generated method stub
		
		URL fxmllink;
		try {
			fxmllink = Paths
					.get("C:\\Users\\archa\\eclipse-workspace\\Ecommerce_javaFX\\src\\AddUser\\AddUserXml.fxml")
					.toUri().toURL();
		Parent actorGroup = FXMLLoader.load(fxmllink);
		Scene scene = new Scene(actorGroup);
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
