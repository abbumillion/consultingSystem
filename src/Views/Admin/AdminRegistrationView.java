package Views.Admin;

import ViewsBase.RegistrationView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class AdminRegistrationView extends RegistrationView {

    @Override
    public void init() {
        title = "Admin Registration";
        TitleLabel = new Label("New Admin");
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(TitleLabel);
        h2.getChildren().addAll(personalinfoLabel);
        h3.getChildren().addAll(firstnameLabel, fnTextField);
        h4.getChildren().addAll(lastnameLabel, lnTextField);
        h5.getChildren().addAll(dateofbirthLabel, dateofbirth);
        genderHBox.getChildren().addAll(maleRadioButton, femaleRadioButton);
        radioGroup.getToggles().addAll(maleRadioButton, femaleRadioButton);
        h6.getChildren().addAll(genderLabel, genderHBox);
        h7.getChildren().addAll(cellphoneLabel, cellphoneTextField);
        h8.getChildren().addAll(emailLabel, emailTextField);
        h11.getChildren().addAll(backButton, nextButton, resetButton);
        v1.getChildren().addAll(h2, h3, h4, h5, h6, h7, h8, h9, h10, h11);
        getChildren().addAll(h1, v1);
        //--------------------------------------------------------------------//

    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        firstnameLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        fnTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        lastnameLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        lnTextField.prefWidthProperty().bind(h4.widthProperty().multiply(0.4));
        dateofbirthLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        dateofbirth.prefWidthProperty().bind(h5.widthProperty().multiply(0.4));
        cellphoneLabel.prefWidthProperty().bind(h7.widthProperty().multiply(0.2));
        cellphoneTextField.prefWidthProperty().bind(h7.widthProperty().multiply(0.4));
        emailLabel.prefWidthProperty().bind(h8.widthProperty().multiply(0.2));
        emailTextField.prefWidthProperty().bind(h8.widthProperty().multiply(0.4));
        genderLabel.prefWidthProperty().bind(h6.widthProperty().multiply(0.2));
        genderHBox.prefWidthProperty().bind(h6.widthProperty().multiply(0.4));
        h1.prefWidthProperty().bind(widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefWidthProperty().bind(v1.widthProperty());
        h8.prefWidthProperty().bind(v1.widthProperty());
        h9.prefWidthProperty().bind(v1.widthProperty());
        h10.prefWidthProperty().bind(v1.widthProperty());
        h11.prefWidthProperty().bind(v1.widthProperty());
        v1.prefWidthProperty().bind(h19.widthProperty());
        v1.prefHeightProperty().bind(heightProperty().multiply(0.7));
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        firstnameLabel.setAlignment(Pos.CENTER_LEFT);
        lastnameLabel.setAlignment(Pos.CENTER_LEFT);
        emailLabel.setAlignment(Pos.CENTER_LEFT);
        dateofbirthLabel.setAlignment(Pos.CENTER_LEFT);
        genderLabel.setAlignment(Pos.CENTER_LEFT);
        cellphoneLabel.setAlignment(Pos.CENTER_LEFT);
        usernameLabel.setAlignment(Pos.CENTER_LEFT);
        passwordLabel.setAlignment(Pos.CENTER_LEFT);
        confrimpasswordLabel.setAlignment(Pos.CENTER_LEFT);
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
        v1.setSpacing(10);
        //--------------------------------------------------------------------//
    }
}
