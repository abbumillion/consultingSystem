package Views;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public abstract class RegistrationView extends View {
    //
    protected Label personalinfoLabel, logininfoLabel, firstnameLabel, lastnameLabel,
            emailLabel, dateofbirthLabel,
            genderLabel,
            cellphoneLabel, usernameLabel, passwordLabel, confrimpasswordLabel;
    //
    protected ToggleGroup radioGroup;
    protected RadioButton maleRadioButton, femaleRadioButton;
    //
    protected TextField fnTextField, lnTextField, cellphoneTextField,
            emailTextField, usernameTextField, passwordTextField, confrimpasswordTextField;
    protected Button submitButton, nextButton, resetButton;
    protected DatePicker dateofbirth;
    //
    protected HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, genderHBox;
    protected VBox v1, v2, v3, v4, v5;
    //
    public RegistrationView() {

        //labels
        personalinfoLabel = new Label("Personal Info");
        logininfoLabel = new Label("Login Info");

        firstnameLabel = new Label("First Name:");
        lastnameLabel = new Label("Last Name:");
        emailLabel = new Label("Email:");
        dateofbirthLabel = new Label("Date Of Birth:");
        genderLabel = new Label("Gender:");

        cellphoneLabel = new Label("Cell Phone Number:");
        usernameLabel = new Label("UserName:");
        passwordLabel = new Label("Password:");
        confrimpasswordLabel = new Label("Confrim Password:");
        //
        //buttons
        submitButton = new Button("Submit");
        resetButton = new Button("reset");
        nextButton = new Button("Next");
        //textfields
        dateofbirth = new DatePicker();
        fnTextField = new TextField();
        lnTextField = new TextField();
        //
        emailTextField = new TextField();
        cellphoneTextField = new TextField();
        usernameTextField = new TextField();
        passwordTextField = new PasswordField();
        confrimpasswordTextField = new PasswordField();
        //
        maleRadioButton = new RadioButton("Male");
        femaleRadioButton = new RadioButton("Female");
        radioGroup = new ToggleGroup();
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        //
        h6 = new HBox(10);
        h7 = new HBox(10);
        h8 = new HBox(10);
        h9 = new HBox(10);
        h10 = new HBox(10);
        h11 = new HBox(10);
        //
        h11 = new HBox(10);
        h12 = new HBox(10);
        h13 = new HBox(10);
        h14 = new HBox(10);
        h15 = new HBox(10);
        //
        h16 = new HBox(10);
        h17 = new HBox(10);
        h18 = new HBox(10);
        h19 = new HBox(10);
        h20 = new HBox(10);
        h21 = new HBox(10);
        //
        v1 = new VBox(10);
        v2 = new VBox(10);
        v3 = new VBox(10);
        v4 = new VBox(10);
        v5 = new VBox(10);
        genderHBox = new HBox(15);
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
        h10.setAlignment(Pos.CENTER);
        h11.setAlignment(Pos.CENTER);
        h12.setAlignment(Pos.CENTER);
        h13.setAlignment(Pos.CENTER);
        h14.setAlignment(Pos.CENTER);
        h15.setAlignment(Pos.CENTER);
        h16.setAlignment(Pos.CENTER);
        h17.setAlignment(Pos.CENTER);
        h18.setAlignment(Pos.CENTER);
        h19.setAlignment(Pos.CENTER);
        h20.setAlignment(Pos.CENTER);
        h21.setAlignment(Pos.BASELINE_CENTER);
        //
        v1.setAlignment(Pos.CENTER_LEFT);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER_RIGHT);
        //
        searchHBox.setVisible(false);

    }

    public TextField getFnTextField() {
        return fnTextField;
    }

    public TextField getLnTextField() {
        return lnTextField;
    }

    public TextField getCellphoneTextField() {
        return cellphoneTextField;
    }

    public TextField getEmailTextField() {
        return emailTextField;
    }

    public TextField getUsernameTextField() {
        return usernameTextField;
    }

    public TextField getPasswordTextField() {
        return passwordTextField;
    }

    public TextField getConfrimpasswordTextField() {
        return confrimpasswordTextField;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public DatePicker getDateofbirth() {
        return dateofbirth;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public ToggleGroup getRadioGroup() {
        return radioGroup;
    }
    
    

}
