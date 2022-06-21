package ViewsBase;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class SystemUserLoginInformationRegistrationView extends RegistrationView {

    Label addressLabel, companyTypeLabel, cityLabel, stateLabel, countryLabel;
    TextField cityTextField, stateTextField, countryTextField;

    @Override
    public void init() {
        addressLabel = new Label("please enter the exact city,state and country of your location\n"
                + " .This will be helpfull for your experiance of the system\n"
                + "");
        cityLabel = new Label("City:");
        stateLabel = new Label("State:");
        countryLabel = new Label("Country:");
        //
        cityTextField = new TextField();
        stateTextField = new TextField();
        countryTextField = new TextField();
        //
        addressLabel.setId("font-12");
        cityLabel.setId("font-14");
        stateLabel.setId("font-14");
        countryLabel.setId("font-14");
        logininfoLabel.setId("font-18");
        //
        h9 = new HBox(80);
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(logininfoLabel);
        h2.getChildren().addAll(usernameLabel, usernameTextField);
        h3.getChildren().addAll(passwordLabel, passwordTextField);
        h4.getChildren().addAll(confrimpasswordLabel, confrimpasswordTextField);
        h5.getChildren().addAll(addressLabel);
        h6.getChildren().addAll(countryLabel, countryTextField);
        h7.getChildren().addAll(stateLabel, stateTextField);
        h8.getChildren().addAll(cityLabel, cityTextField);
        h9.getChildren().addAll(backButton, nextButton, resetButton);
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6, h7, h8, h9);
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
        //
        usernameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        usernameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.4));
        passwordLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        passwordTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        confrimpasswordLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        confrimpasswordTextField.prefWidthProperty().bind(h4.widthProperty().multiply(0.4));

        addressLabel.prefWidthProperty().bind(h5.widthProperty());
        cityLabel.prefWidthProperty().bind(h8.widthProperty().multiply(0.2));
        cityTextField.prefWidthProperty().bind(h8.widthProperty().multiply(0.4));
        stateLabel.prefWidthProperty().bind(h6.widthProperty().multiply(0.2));
        stateTextField.prefWidthProperty().bind(h6.widthProperty().multiply(0.4));
        countryLabel.prefWidthProperty().bind(h6.widthProperty().multiply(0.2));
        //--------------------------------------------------------------------//
        countryTextField.prefWidthProperty().bind(h6.widthProperty().multiply(0.4));
        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefWidthProperty().bind(v1.widthProperty());
        h8.prefWidthProperty().bind(v1.widthProperty());
        h9.prefWidthProperty().bind(v1.widthProperty().multiply(0.5));
        h10.prefWidthProperty().bind(v1.widthProperty());
        ////
        //
        ///
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //
        backButton.prefWidthProperty().bind(h9.widthProperty().multiply(0.1));
        nextButton.prefWidthProperty().bind(h9.widthProperty().multiply(0.1));
        resetButton.prefWidthProperty().bind(h9.widthProperty().multiply(0.1));
    }

    @Override
    public void alignElements() {
        //
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        h9.setAlignment(Pos.CENTER);
        //
        v1.setAlignment(Pos.CENTER);
        v1.setSpacing(30);
        addressLabel.setAlignment(Pos.CENTER);

        //
    }

    public TextField getCityTextField() {
        return cityTextField;
    }

    public TextField getStateTextField() {
        return stateTextField;
    }

    public TextField getCountryTextField() {
        return countryTextField;
    }

}
