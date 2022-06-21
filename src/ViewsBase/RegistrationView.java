package ViewsBase;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

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
    protected HBox  genderHBox;

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
        emailTextField = new TextField("example@gmail.com");
        cellphoneTextField = new TextField("+251-");
        usernameTextField = new TextField();
        passwordTextField = new PasswordField();
        confrimpasswordTextField = new PasswordField();
        //
        maleRadioButton = new RadioButton("Male");
        femaleRadioButton = new RadioButton("Female");
        radioGroup = new ToggleGroup();
        //
        personalinfoLabel.setId("font-18");
        logininfoLabel.setId("font-18");
        firstnameLabel.setId("font-14");
        lastnameLabel.setId("font-14");
        emailLabel.setId("font-14");
        dateofbirthLabel.setId("font-14");
        genderLabel.setId("font-14");
        cellphoneLabel.setId("font-14");
        usernameLabel.setId("font-14");
        passwordLabel.setId("font-14");
        confrimpasswordLabel.setId("font-14");
        maleRadioButton.setId("font-14");
        femaleRadioButton.setId("font-14");

        //

        genderHBox = new HBox(70);
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
