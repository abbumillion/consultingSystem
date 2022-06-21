package Navigations;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CompanyDetailSubView extends SubView {

    //labels
    Label companyNameLabel, titleLabel;
    //tesxtfields
    TextField companyNameTextField;
    //containers
    HBox h1, h2, h3, h4, h5;
    VBox v1, v2, v3, v4, v5;
    //

    @Override
    public void init() {
        //
        companyNameLabel = new Label("Company Name:");
        titleLabel = new Label("New Company Registration Page");
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        //
        v1 = new VBox(30);
        v2 = new VBox(10);
        v3 = new VBox(10);
        v4 = new VBox(10);
        v5 = new VBox(10);
        //
        companyNameTextField = new TextField();
        //
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(companyNameLabel, companyNameTextField);
        h3.getChildren().addAll();
        h4.getChildren().addAll(submitButton, resetButton);
        v1.getChildren().addAll(h1, h2, h3, h4, h5);
        v2.getChildren().addAll();
        v3.getChildren().addAll();
        v4.getChildren().addAll();
        v5.getChildren().addAll();
        getChildren().addAll(v1);

    }

    @Override
    public void bindings() {

    }

    @Override
    public void alignElements() {
        h1.setAlignment(Pos.TOP_CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.BOTTOM_CENTER);
        v1.setAlignment(Pos.CENTER);

    }

}
