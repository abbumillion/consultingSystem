package Tabs.Account;

import ViewsBase.SubView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;

public abstract class MyAccountTab extends SubView {

    //labels
    Label CellPhoneLabel, UserNameLabel, UserIdLabel, AddressLabel;
    //containers
    ImageView accountImageView;
    //
    Separator separator1, separator2, separator3, separator4, separator5, separator6, separator7;
    Button logoutButton;

    //
    public MyAccountTab() {
        //my account tab
        CellPhoneLabel = new Label("Cell Phone Number:");
        UserNameLabel = new Label("UserName:");
        UserIdLabel = new Label("UserName:");
        //image
        accountImageView = new ImageView("Assets/a.png");
        //
        separator1 = new Separator();
        separator2 = new Separator();
        separator3 = new Separator();
        separator4 = new Separator();
        separator5 = new Separator();
        separator6 = new Separator();
        separator7 = new Separator();

        //
        logoutButton = new Button("Logout");
    }

    public Label getCellphoneLabel() {
        return CellPhoneLabel;
    }

    public Label getUsernameLabel() {
        return UserNameLabel;
    }

    public Label getUserIdLabel() {
        return UserIdLabel;
    }

    public ImageView getAccountImageView() {
        return accountImageView;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }

}
