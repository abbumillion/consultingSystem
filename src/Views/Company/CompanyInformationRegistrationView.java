package Views.Company;

import ViewsBase.RegistrationView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class CompanyInformationRegistrationView extends RegistrationView {

    Label titleLabel, companyNameLabel, companyWebsiteLabel, companyTypeLabel;
    TextField companyNameTextField, companyWebsiteTextField;
    ComboBox companyTypeComboBox;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        titleLabel = new Label("Company Information");
        companyNameLabel = new Label("Company Name:");
        companyTypeLabel = new Label("Company Type");

        companyWebsiteLabel = new Label("Website:");
        //--------------------------------------------------------------------//
        resetButton = new Button("Reset");
        nextButton = new Button("Next");
        //--------------------------------------------------------------------//
        companyNameTextField = new TextField();
        companyTypeComboBox = new ComboBox();
        companyNameTextField = new TextField();
        companyWebsiteTextField = new TextField();
        //--------------------------------------------------------------------//
        titleLabel.setId("font-18");
        companyNameLabel.setId("font-14");
        companyTypeLabel.setId("font-14");
        companyWebsiteLabel.setId("font-14");
        //--------------------------------------------------------------------//
        h7=new HBox(50);
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        //-----------------adding company types here---------------------------------//
        //--------------------------------------------------------------------//
        companyTypeComboBox.getItems().add("BORDER TRADE");
        companyTypeComboBox.getItems().add("BRANCH OF A FOREIGN CHAMBEROF COMMERCE");
        companyTypeComboBox.getItems().add("COMMERCIAL REPRESENTATIVE");
        companyTypeComboBox.getItems().add("FRANCHISING");
        companyTypeComboBox.getItems().add("GOVERNMENTAL ORGANIZATION");
        companyTypeComboBox.getItems().add("HOLDING COMPANY");
        companyTypeComboBox.getItems().add("INTERNATIONAL BID WINNERS FOREIGN COMPANIES");
        companyTypeComboBox.getItems().add("NON GOVERNMENTAL ORGANIZATION");
        companyTypeComboBox.getItems().add("NON PUBLIC ENTERPRISE");
        companyTypeComboBox.getItems().add("PARETNERSHIP");
        companyTypeComboBox.getItems().add("PRIVATE");
        companyTypeComboBox.getItems().add("PRIVATE LIMITED COMPANY");
        companyTypeComboBox.getItems().add("PUBLIC ENTERPRISE");
        companyTypeComboBox.getItems().add("SHARE COMPANY");
        companyTypeComboBox.getItems().add("TRADE SECTOR ALASSOCIATION");
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(companyNameLabel, companyNameTextField);
        h3.getChildren().addAll(companyTypeLabel, companyTypeComboBox);
        h4.getChildren().addAll(emailLabel, emailTextField);
        h5.getChildren().addAll(cellphoneLabel, cellphoneTextField);
        h6.getChildren().addAll(companyWebsiteLabel, companyWebsiteTextField);
        h7.getChildren().addAll(backButton, nextButton, resetButton);
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6, h7);
        //--------------------------------------------------------------------//
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        nextButton.prefWidthProperty().bind(h7.widthProperty().multiply(0.1));
        resetButton.prefWidthProperty().bind(h7.widthProperty().multiply(0.1));
        backButton.prefWidthProperty().bind(h7.widthProperty().multiply(0.1));
        //--------------------------------------------------------------------//
        emailLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        emailTextField.prefWidthProperty().bind(h4.widthProperty().multiply(0.4));
        cellphoneLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        cellphoneTextField.prefWidthProperty().bind(h5.widthProperty().multiply(0.4));
        companyWebsiteLabel.prefWidthProperty().bind(h6.widthProperty().multiply(0.2));
        companyWebsiteTextField.prefWidthProperty().bind(h6.widthProperty().multiply(0.4));
        //--------------------------------------------------------------------//
        companyNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        companyNameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.4));
        companyTypeLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        companyTypeComboBox.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefWidthProperty().bind(v1.widthProperty().multiply(0.5));
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        h9.setAlignment(Pos.CENTER);
        h10.setAlignment(Pos.CENTER);
        h11.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        v1.setSpacing(50);
        //--------------------------------------------------------------------//

    }
    public TextField getCompanyWebsiteTextField() {
        return companyWebsiteTextField;
    }

    public TextField getCompanyNameTextField() {
        return companyNameTextField;
    }

    public ComboBox getCompanyTypeComboBox() {
        return companyTypeComboBox;
    }

}
