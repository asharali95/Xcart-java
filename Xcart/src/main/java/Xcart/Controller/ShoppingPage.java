package Xcart.Controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Xcart.Fruit;
import Xcart.Main;
import Xcart.MyListener;

public class ShoppingPage implements Initializable {
	@FXML
    private Label fruitNameLabel;

    @FXML
    private Label fruitPriceLabel;

    @FXML
    private ImageView fruitImg;

    @FXML
    private Button addToCartBtn;

    @FXML
    private Label cartCount;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;

    private List<Fruit> fruits = new ArrayList<>();
    
    private List<Fruit> getData(){
    	List<Fruit> Fruits = new ArrayList<>();
    	Fruit fruit;
    	for (int i =0 ; i<16 ; i++) {
    		fruit = new Fruit();
    		fruit.setName("Kiwi");
    		fruit.setPrice(400);
    		fruit.setImgSrc("/img/kiwi.png");
    		fruits.add(fruit);
    	}
    	return fruits;
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		fruits.addAll(getData());
		int column = 0, row = 0;
		try {
		for(int i = 0 ; i<fruits.size(); i++) {
			FXMLLoader fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(getClass().getResource("../ShoppingPage.fxml"));
			
				AnchorPane anchorPane = fxmlloader.load();
			
			ItemController itemcontroller = fxmlloader.getController();
//			itemcontroller.setData(fruits.get(i));
			
			if(column ==3) {
				column = 0;
				row++;
			}
			grid.add(anchorPane, column++, row);
			GridPane.setMargin(anchorPane, new Insets(10));
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

 