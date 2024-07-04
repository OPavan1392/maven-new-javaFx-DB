package AddUser;

import java.sql.ResultSet;
import java.sql.SQLException;

import LoginPage.DatabaseFx;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ScreenAddController {

	@FXML
	TextField FirstName;
	@FXML
	TextField LastName;
	@FXML
	TextField Gender;
	@FXML
	TextField Age;
	@FXML
	TextField Email;
	@FXML
	TextField Password;
	@FXML
	TextField ConfirmPassword;

	public void Adduser() throws SQLException {
		String fname1 = FirstName.getText();
		String lname1 = LastName.getText();
		String gender1 = Gender.getText();
		String age1 = Age.getText();
		String email = Email.getText();
		String pass1 = Password.getText();
		String confirmedpass1 = ConfirmPassword.getText();
		if(pass1.equals(confirmedpass1)) { 
			
			String query = "INSERT INTO user (User_Fname, User_Lname, User_Gender, User_age,User_Email, User_pass, User_conpas) VALUES	('"
					+ fname1 + "','" + lname1 + "', '" + gender1 + "','" + age1 + "','" + email + "','" + pass1 + "','"
					+ confirmedpass1 + "')";

			DatabaseFx.ExecuteQuery(query);
System.out.println("Added suceefully");
			
			
		}
		
		
	}
}
