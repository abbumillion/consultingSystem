package Tabs.Listviews;

import DomainObjects.Company;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class CompanyCell extends ListCell {

    Label companyNameLabel, companyTypeLabel, emailLabel, websiteLabel;
    HBox h1;

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        //--------------------------------------------------------------------//
        companyNameLabel = new Label("Company Label");
        companyTypeLabel = new Label("Company Type");
        emailLabel = new Label("Email");
        websiteLabel = new Label("Website");
        h1 = new HBox(10);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(companyNameLabel, companyTypeLabel,
                emailLabel, websiteLabel);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        companyNameLabel.setAlignment(Pos.CENTER);
        companyTypeLabel.setAlignment(Pos.CENTER);
        emailLabel.setAlignment(Pos.CENTER);
        websiteLabel.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
      //  companyNameLabel.prefWidthProperty().bind(widthProperty());
      //  companyTypeLabel.prefWidthProperty().bind(widthProperty());
      //  emailLabel.prefWidthProperty().bind(widthProperty());
      //  websiteLabel.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        if (item != null) {
            Company cpy = (Company) item;
            companyNameLabel.setText(cpy.getCompanyName());
            companyTypeLabel.setText(cpy.getCompanyType());
            emailLabel.setText(cpy.getEmail());
            websiteLabel.setText(cpy.getWebsite());
        }
        setGraphic(h1);
    }

}
