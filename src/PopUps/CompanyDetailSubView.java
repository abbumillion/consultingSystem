package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CompanyDetailSubView extends SubView {

    //labels
    Label companyNameLabel;
    //tesxtfields
    TextField companyNameTextField;
    //containers

    //

    @Override
    public void init() {
        title="Company Detail";
        //
        companyNameLabel = new Label("Company Name:");
        titleLabel = new Label("Company Information");
        //

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
