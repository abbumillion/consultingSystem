package Tabs.Account;

import javafx.scene.control.Label;

public abstract class UserAccountTab extends MyAccountTab {

    Label firstnameLabel, lastnameLabel,
            emailLabel, dateofbirthLabel,
            genderLabel;

    public UserAccountTab() {
        firstnameLabel = new Label("First Name:");
        lastnameLabel = new Label("Last Name:");
        emailLabel = new Label("Email:");
        dateofbirthLabel = new Label("Date Of Birth:");
        genderLabel = new Label("Gender:");
    }

    public Label getFirstnameLabel() {
        return firstnameLabel;
    }

    public Label getLastnameLabel() {
        return lastnameLabel;
    }

    public Label getEmailLabel() {
        return emailLabel;
    }

    public Label getDateofbirthLabel() {
        return dateofbirthLabel;
    }

    public Label getGenderLabel() {
        return genderLabel;
    }

}
