package Views.Applicant;

import Views.RegistrationView;
import javafx.geometry.Pos;

public class SystemUserLoginInformationRegistrationView extends RegistrationView {

    @Override
    public void init() {
    }
    @Override
    public void addChildren() {
        h1.getChildren().addAll(logininfoLabel);
        h2.getChildren().addAll(usernameLabel, usernameTextField);
        h3.getChildren().addAll(passwordLabel, passwordTextField);
        h4.getChildren().addAll(confrimpasswordLabel, confrimpasswordTextField);
        h5.getChildren().addAll(backButton, nextButton, resetButton);
        v1.getChildren().addAll(h1, h2, h3, h4, h5);
        getChildren().addAll(topBox, v1, bottomBox);
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
        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        //
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        //
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty().multiply(0.7));
        //
    }
    @Override
    public void alignElements() {
        //
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        //
        v1.setAlignment(Pos.CENTER);
        v1.setSpacing(20);
        //
    }

}
