package Tabs;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public abstract class HomeTab extends SubView {

    HBox h1, h2, h3, h4, h5;
    //
    VBox v1, v2;
    //
    Button menuButton;

    SubScene subScene;

    public HomeTab() {

        menuButton = new Button("=");

        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        //
        v1 = new VBox(0);
        v1.setId("nav");
        v1.setAlignment(Pos.TOP_LEFT);

        v2 = new VBox(10);
        //
        subScene = new SubScene(new HBox(10), W, H);

        h1.prefWidthProperty().bind(widthProperty());
        h1.prefHeightProperty().bind(heightProperty());

        v1.prefWidthProperty().bind(h1.widthProperty().multiply(0.3));
        v1.prefHeightProperty().bind(h1.heightProperty());

        subScene.widthProperty().bind(h1.widthProperty().multiply(0.7));
        subScene.heightProperty().bind(h1.heightProperty());
        //

    }

    public SubScene getSubScene() {
        return subScene;
    }
}
