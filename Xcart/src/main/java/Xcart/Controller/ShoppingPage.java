package Xcart.Controller;
import java.util.ArrayList;
import java.util.List;
import Xcart.Fruit;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ShoppingPage {
	@FXML
    private Label fruitName;

    @FXML
    private Label fruitPrice;

    @FXML
    private ImageView fruitImg;

    @FXML
    private Button addToCartBtn;

    @FXML
    private Label cartCount;
    
    private List<Fruit> fruits = new ArrayList<>();
    private List<Fruit> getData(){
    	Fruit fruit;
    	for(int i=0 ; i<15 ; i++) {
    		fruit = new Fruit();
    		fruit.setName("Kiwi");
    	}
		return fruits;
    }
    }
