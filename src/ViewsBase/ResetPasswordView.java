package ViewsBase;

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

    @Override
    public void init() {
        userNameTextField = new TextField();
        newPasswordTextField = new TextField();
        //
        newPasswordLabel = new Label("New Password");
        titleLabel = new Label("Reset Password");
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
        h5 = new HBox(40);
        //
        v1 = new VBox(50);
        v2 = new VBox(0);

        titleLabel.setId("font-20");
        enteruserNameLabel.setId("font-16");
        descriptionLabel.setId("font-12");
        newPasswordLabel.setId("font-16");

    }

    @Override
    public void addChildren() {

        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(descriptionLabel);
        h3.getChildren().addAll(enteruserNameLabel, userNameTextField);
        h4.getChildren().addAll(newPasswordLabel, newPasswordTextField);
        h5.getChildren().addAll(findmyAccountButton, backButton, saveNewPasswordButton);
        //
        v1.getChildren().addAll(h1, h2, h3, h4, h5);
        //
        getChildren().addAll(v1, bottomBox);
    }

    @Override
    public void bindings() {

        //
        v1.prefHeightProperty().bind(heightProperty().multiply(0.95));
        v1.prefWidthProperty().bind(widthProperty());
        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));

        //
        //
        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        enteruserNameLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        userNameTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));
        newPasswordLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        newPasswordTextField.prefWidthProperty().bind(h3.widthProperty().multiply(0.5));
        descriptionLabel.prefWidthProperty().bind(h2.widthProperty());
        findmyAccountButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        saveNewPasswordButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        backButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        //
        //
    }

    @Override
    public void alignElements() {

        //
        h4.setVisible(false);
        saveNewPasswordButton.setVisible(false);
        //
        titleLabel.setAlignment(Pos.TOP_CENTER);
        enteruserNameLabel.setAlignment(Pos.CENTER);
        descriptionLabel.setAlignment(Pos.CENTER);
        findmyAccountButton.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
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
