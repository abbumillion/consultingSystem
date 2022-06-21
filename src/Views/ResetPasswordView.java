package Views;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ResetPasswordView extends View {

    Label titleLabel, enteruserNameLabel, descriptionLabel, newPasswordLabel;

    TextField userNameTextField, newPasswordTextField;

    Button findmyAccountButton, saveNewPasswordButton;
    //
    HBox h1, h2, h3, h4, h5;
    VBox v1, v2;

    @Override
    public void init() {
        userNameTextField = new TextField();
        newPasswordTextField = new TextField();
        //
        newPasswordLabel = new Label("New Password");
        titleLabel = new Label("Reset Password");
        titleLabel.setId("titleLabel");
        enteruserNameLabel = new Label("Enter UserName Here:");
        descriptionLabel = new Label("Please Enter your User Name here\n to reset your password.");
        //
        findmyAccountButton = new Button("Find My Account");
        saveNewPasswordButton = new Button("Save New Password");
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        //
        v1 = new VBox(30);
        v2 = new VBox(0);

    }

    @Override
    public void addChildren() {

        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(descriptionLabel);
        h3.getChildren().addAll(enteruserNameLabel, userNameTextField);
        h5.getChildren().addAll(findmyAccountButton, backButton, saveNewPasswordButton);
        h4.getChildren().addAll(newPasswordLabel, newPasswordTextField);
        //
        v1.getChildren().addAll(h1, h2, h3, h4, h5);
        //
        getChildren().addAll(topBox, v1, bottomBox);
    }

    @Override
    public void bindings() {

        //
        v1.prefHeightProperty().bind(widthProperty().multiply(0.7));
        v1.prefWidthProperty().bind(widthProperty());
        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());

        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        enteruserNameLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        userNameTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        newPasswordLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        newPasswordTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        descriptionLabel.prefWidthProperty().bind(h2.widthProperty());
        findmyAccountButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.25));
        saveNewPasswordButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.25));
        backButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.25));
    }

    @Override
    public void alignElements() {

        //
        h4.setVisible(false);
        //

        titleLabel.setAlignment(Pos.TOP_CENTER);
        enteruserNameLabel.setAlignment(Pos.CENTER_LEFT);
        descriptionLabel.setAlignment(Pos.CENTER);
        findmyAccountButton.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);

    }

    public TextField getUserNameTextField() {
        return userNameTextField;
    }

    public Button getFindmyAccountButton() {
        return findmyAccountButton;
    }

    public TextField getNewPasswordTextField() {
        return newPasswordTextField;
    }

    public HBox getHBox() {
        return h4;
    }

    public Button getSaveNewPasswordButton() {
        return saveNewPasswordButton;
    }

}
