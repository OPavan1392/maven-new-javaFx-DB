package JavaFXHomeScreen;

import AddProducts.AddProductScreen;
import AddUser.AddUserScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeScreenController {

	@FXML
	Button adduser;
	@FXML
	Button AddProduct;
	@FXML
	Button logOut;

	public void AddUserButton() {
		System.out.println("User Add");
		AddUserScreen.show();

	}

	public void AddProductButton() {
		System.out.println("Product Add");
		AddProductScreen.show();
	}

	public void Logout() {
		System.out.println("LogOut");
		logOut.getScene().getWindow().hide();
	}

}
