package LoginPage;

import java.sql.ResultSet;
import java.sql.SQLException;

import JavaFXHomeScreen.ScreenView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogInScreenContoler {
	@FXML
	TextField UserName;
	@FXML
	TextField Password;
	@FXML
	Label errormessage;

	public void loginButtonClick() throws SQLException {
		System.out.println("Button Clicked..");
		String userName = UserName.getText();
		String passWord = Password.getText();
		
		String query1 = "Select * from user where User_Fname='" + userName + "' && User_Pass='" + passWord + "'";
		ResultSet result = DatabaseFx.ExecuteSelectQuery(query1);
		
		if (result.next()) {
			errormessage.setText("Login Succefully");
			ScreenView.show();
		} else {
			errormessage.setText("Login Succefully");
		}
	}
	
}
