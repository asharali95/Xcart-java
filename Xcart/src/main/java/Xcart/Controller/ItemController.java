package Xcart.Controller;
import Xcart.Fruit;
import Xcart.Main;
import Xcart.MyListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ItemController {

	@FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private ImageView img;


    private Fruit fruit;
    
    public void setData(Fruit fruit) {
        this.fruit = fruit;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(Main.CURRENCY + fruit.getPrice());
        Image image = new Image(getClass().getResourceAsStream(fruit.getImgSrc()));
        img.setImage(image);
    }
}
