package Views;

import static Views.Viewable.W;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class LoginView extends View {

    //--------------------------------------------------------------------------
    Label loginLabel, userNameLabel, PasswordLabel;
    //--------------------------------------------------------------------------
    Hyperlink forgetPassword;
    TextField userNameTextField, PasswordField;
    //Buttons
    Button loginButton, applicantRegisterButton, companyRegisterButton;
    VBox v1;
    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9;

    //--------------------------------------------------------------------------
    //tabs
    @Override
    public void init() {
        title = "Sign in";
        //
        //
        loginLabel = new Label("We are fast growing information Technology firm\n"
                + "delivering customer-focused business solutions.we provide\n"
                + "innovative solutions that deliver superior quality,result and \n"
                + "value to our clients.Our depth of technical expertise,allows us to\n"
                + "deliver cost effective solutions to our clients.");
        loginLabel.setId("loginlabel");
        userNameLabel = new Label();
        PasswordLabel = new Label();
        forgetPassword = new Hyperlink("forget  password?");
        forgetPassword.setId("forgetPasswordLabel");
        //
        userNameTextField = new TextField();
        PasswordField = new PasswordField();
        //
        //
        loginButton = new Button("Sign In");
        applicantRegisterButton = new Button("Applicant Sign up");
        companyRegisterButton = new Button("Company Sign up");
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        h6 = new HBox(10);
        h7 = new HBox(0);
        h8 = new HBox(10);
        h9 = new HBox(10);
        //
        v1 = new VBox(20);
        //
        //
    }

    @Override
    public void addChildren() {
        //----------------------------------------------------------------------
        h1.getChildren().addAll(loginLabel);
        h2.getChildren().addAll(userNameLabel, userNameTextField);
        h3.getChildren().addAll(PasswordLabel, PasswordField);
        h4.getChildren().addAll(loginButton, forgetPassword);
        h5.getChildren().addAll(applicantRegisterButton, companyRegisterButton);
        //----------------------------------------------------------------------
        v1.getChildren().addAll(h2, h3, h4, h5);
        h7.getChildren().addAll(h1, v1);
        //----------------------------------------------------------------------
        getChildren().addAll(TitleLabel,h7);
        //----------------------------------------------------------------------
    }

    @Override
    public void bindings() {
        //----------------------------------------------------------------------
        // ImageView imageView = new ImageView("Assets/osu.jpg");
        // imageView.setPreserveRatio(true);
        // imageView.fitHeightProperty().bind(loginLabel.heightProperty().multiply(0.5));
        // imageView.fitWidthProperty().bind(loginLabel.widthProperty().multiply(0.5));
        //----------------------------------------------------------------------
        //  loginLabel.setGraphic(imageView);
        //----------------------------------------------------------------------
        userNameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.6));
        PasswordField.prefWidthProperty().bind(h3.widthProperty().multiply(0.6));
        userNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.35));
        PasswordLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.35));
        //----------------------------------------------------------------------
        loginButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        forgetPassword.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        applicantRegisterButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.25));
        // applicantRegisterButton.prefHeightProperty().bind(h5.heightProperty());
        companyRegisterButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.25));

        // employerContactRegisterButton.prefHeightProperty().bind(h6.heightProperty());
        //----------------------------------------------------------------------
        h7.prefHeightProperty().bind(heightProperty().multiply(0.8));
        h7.prefWidthProperty().bind(widthProperty());
        //----------------------------------------------------------------------
        h2.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h3.prefWidthProperty().bind(v1.widthProperty());
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h4.prefWidthProperty().bind(v1.widthProperty());
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h5.prefWidthProperty().bind(v1.widthProperty());
        h5.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));

        //----------------------------------------------------------------------
        loginLabel.prefHeightProperty().bind(h1.heightProperty());
        loginLabel.prefWidthProperty().bind(h1.widthProperty());
        //----------------------------------------------------------------------
        v1.prefHeightProperty().bind(h7.heightProperty());
        v1.prefWidthProperty().bind(h7.widthProperty().multiply(0.6));
        //----------------------------------------------------------------------
        h1.prefHeightProperty().bind(h7.heightProperty().multiply(0.5));
        h1.prefWidthProperty().bind(h7.widthProperty().multiply(0.4));
        //----------------------------------------------------------------------

    }

    @Override
    public void showView() {
        scene = new Scene(this, W, H * 0.6);
        scene.getStylesheets().add("StyleSheets/dark.css");
        STAGE.setScene(scene);
        STAGE.setFullScreenExitHint("");
        STAGE.setTitle(title);
        // STAGE.setFullScreen(true);
        STAGE.show();

    }

    @Override
    public void alignElements() {
        userNameTextField.setTooltip(new Tooltip("User Name"));
        PasswordField.setTooltip(new Tooltip("Password"));
        //----------------------------------------------------------------------
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        loginLabel.setAlignment(Pos.CENTER);
        userNameLabel.setAlignment(Pos.CENTER);
        PasswordLabel.setAlignment(Pos.CENTER);
        forgetPassword.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        PasswordLabel.setGraphic(new ImageView("Assets/icons8-password-window-48.png"));
        userNameLabel.setGraphic(new ImageView("Assets/icons8-username-48.png"));
        setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        // applicantRegisterButton.layoutXProperty().bind(userNameTextField.layoutXProperty());
        // employerContactRegisterButton.layoutXProperty().bind(userNameTextField.layoutXProperty());
        //----------------------------------------------------------------------
        applicantRegisterButton.setAlignment(Pos.CENTER);
        companyRegisterButton.setAlignment(Pos.CENTER);
        loginButton.setAlignment(Pos.CENTER);
    }

    public Hyperlink getForgetPasswordLabel() {
        return forgetPassword;
    }

    public TextField getUserNameTextField() {
        return userNameTextField;
    }

    public TextField getPasswordField() {
        return PasswordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Button getApplicantRegisterButton() {
        return applicantRegisterButton;
    }

    public Button getCompanyRegisterButton() {
        return companyRegisterButton;
    }

}
