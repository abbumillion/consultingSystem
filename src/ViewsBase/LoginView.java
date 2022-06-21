package ViewsBase;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends View {

    //------------------------------------------------------------------------//
    Label loginLabel, userNameLabel, PasswordLabel;
    //------------------------------------------------------------------------//
    Hyperlink forgetPassword;
    TextField userNameTextField, PasswordField;
    //Buttons
    Button loginButton, applicantRegisterButton, companyRegisterButton;
    //------------------------------------------------------------------------//
    //tabs
    @Override
    public void init() {
        title = "Sign in";
        loginLabel = new Label("we are fast growing information technology services firm\n"
                + "delivering customer-focused business solutions.we provide\n"
                + "innovative solutions that deliver superioir quality,results and\n"
                + "value to our clients,Our depth of technical expertise,allows us to\n"
                + "deliver cost effective solutions to our clients.\n\n\n\n\n"
                + "We focus on working closely with our client to provide end-to-end\n"
                + "business and information technology solutions.we specialize in\n"
                + "solving business problems througn the application of information\n"
                + "technology.Through the exchange of usefull information and our\n"
                + "efforts.the best possible candidate and company match could be\n"
                + "acieved.");
        userNameLabel = new Label();
        PasswordLabel = new Label();
        forgetPassword = new Hyperlink("forget  password?");
        forgetPassword.setId("font-12");
        userNameLabel.setId("font-12");
        loginLabel.setId("font-16");
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
        h2 = new HBox(40);
        h3 = new HBox(40);
        h4 = new HBox(20);
        h5 = new HBox(10);
        h6 = new HBox(50);
        h7 = new HBox(0);
        h8 = new HBox(10);
        h9 = new HBox(10);
        //
        v1 = new VBox(40);
        //
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(loginLabel);
        h2.getChildren().addAll(userNameLabel, userNameTextField);
        h3.getChildren().addAll(PasswordLabel, PasswordField);
        h4.getChildren().addAll();
        h5.getChildren().addAll();
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(h2, h3, loginButton, forgetPassword, applicantRegisterButton, companyRegisterButton);
        h7.getChildren().addAll(h1, v1);
        //--------------------------------------------------------------------//
        getChildren().addAll(TitleLabel, h7, bottomBox);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        userNameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.7));
        userNameTextField.prefHeightProperty().bind(h2.heightProperty().multiply(0.5));
        //
        PasswordField.prefWidthProperty().bind(h3.widthProperty().multiply(0.7));
        PasswordField.prefHeightProperty().bind(h3.heightProperty().multiply(0.5));
        //
        userNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.1));
        PasswordLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.1));
        //--------------------------------------------------------------------//
        loginButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        forgetPassword.prefWidthProperty().bind(v1.widthProperty().multiply(0.6));
        applicantRegisterButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        companyRegisterButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        //--------------------------------------------------------------------//
        loginButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.05));
        forgetPassword.prefHeightProperty().bind(v1.heightProperty().multiply(0.07));
        applicantRegisterButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.05));
        companyRegisterButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.05));
        //--------------------------------------------------------------------//
        h7.prefHeightProperty().bind(heightProperty().multiply(0.95));
        h7.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        h2.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h3.prefWidthProperty().bind(v1.widthProperty());
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h4.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.07));
        h5.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        h5.prefHeightProperty().bind(v1.heightProperty().multiply(0.07));
        h6.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        h6.prefHeightProperty().bind(v1.heightProperty().multiply(0.07));

        //--------------------------------------------------------------------//
        loginLabel.prefHeightProperty().bind(h1.heightProperty());
        loginLabel.prefWidthProperty().bind(h1.widthProperty());
        //--------------------------------------------------------------------//
        v1.prefHeightProperty().bind(h7.heightProperty());
        v1.prefWidthProperty().bind(h7.widthProperty().multiply(0.6));
        //--------------------------------------------------------------------//
        h1.prefHeightProperty().bind(h7.heightProperty());
        h1.prefWidthProperty().bind(h7.widthProperty().multiply(0.4));
        //--------------------------------------------------------------------//

    }

    @Override
    public void alignElements() {
        userNameTextField.setTooltip(new Tooltip("User Name"));
        PasswordField.setTooltip(new Tooltip("Password"));
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER_LEFT);
        h3.setAlignment(Pos.CENTER_LEFT);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        loginLabel.setAlignment(Pos.CENTER);
        userNameLabel.setAlignment(Pos.CENTER);
        PasswordLabel.setAlignment(Pos.CENTER);
        forgetPassword.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        PasswordLabel.setGraphic(new ImageView("Assets/icons8-password-window-48.png"));
        userNameLabel.setGraphic(new ImageView("Assets/icons8-username-48.png"));
        setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        userNameTextField.setAlignment(Pos.CENTER);
        PasswordField.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        applicantRegisterButton.setAlignment(Pos.CENTER);
        companyRegisterButton.setAlignment(Pos.CENTER);
        loginButton.setAlignment(Pos.CENTER);
        TitleLabel.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
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
