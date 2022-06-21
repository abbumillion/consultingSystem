package Tabs.Search;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class SearchTab extends SubView {
    //
    Button searchButton;
    TextField searchTextField;
    Label companyNameLabel;

    @Override
    public void init() {
        searchButton = new Button("Search");
        searchTextField = new TextField("Search something in here!!!");
        companyNameLabel = new Label("Consulting System");
        companyNameLabel.setId("font-20");
        h1 = new HBox(0);
        h2 = new HBox(80);
    }

    @Override
    public void addChildren() {
        //
        h1.getChildren().addAll(companyNameLabel);
        h2.getChildren().addAll(searchTextField, searchButton);
        v1.getChildren().addAll(h1, h2);
        getChildren().addAll(v1);
        //
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty());
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h2.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.4));
        //--------------------------------------------------------------------//
        companyNameLabel.prefWidthProperty().bind(h1.widthProperty());
        companyNameLabel.prefHeightProperty().bind(h1.heightProperty());
        searchTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.45));
        searchTextField.prefHeightProperty().bind(h2.heightProperty().multiply(0.15));
        searchButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.15));
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        titleLabel.setAlignment(Pos.CENTER);
        companyNameLabel.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        titleLabel.setId("font-26");
        //--------------------------------------------------------------------//
    }

}
