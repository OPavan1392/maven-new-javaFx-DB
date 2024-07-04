package AddProducts;

import java.sql.SQLException;

import LoginPage.DatabaseFx;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddProductController {
	
	@FXML
	TextField PName;
	@FXML
	TextField PQuantity;
	@FXML
	TextField pPrice;
	
	
	
	public void ProductAdd() throws SQLException {
		
		String productName = PName.getText();
		int productPrice = pPrice.getLength();
		int ProductQuantity = PQuantity.getLength();
		String query="INSERT INTO product (product_name, quantity, price) VALUES	('"+productName+",'"+	productPrice+"','"+ProductQuantity+"')";
		DatabaseFx.ExecuteQuery(query);	}
	

}
