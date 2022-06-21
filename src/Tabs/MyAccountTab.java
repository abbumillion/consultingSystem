package Tabs;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyAccountTab extends SubView {

    //labels
    Label firstnameLabel, lastnameLabel,
            emailLabel, dateofbirthLabel,
            genderLabel, qualificationLabel,
            cellphoneLabel, usernameLabel, userIdLabel;
    //containers
    ImageView accountImageView;
    //
    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10;
    //
    VBox v1, v2;
    //
    Separator separator;
    Button logoutButton;

    //
    @Override
    public void init() {
        //my account tab
        firstnameLabel = new Label("First Name:");
        lastnameLabel = new Label("Last Name:");
        emailLabel = new Label("Email:");
        dateofbirthLabel = new Label("Date Of Birth:");
        genderLabel = new Label("Gender:");
        qualificationLabel = new Label("Qualification:");
        cellphoneLabel = new Label("Cell Phone Number:");
        usernameLabel = new Label("UserName:");
        userIdLabel = new Label("UserName:");
        //image
        accountImageView = new ImageView("Assets/Account.png");
        //
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        h6 = new HBox(10);
        h7 = new HBox(10);
        h8 = new HBox(10);
        h9 = new HBox(10);
        h10 = new HBox(10);
        //
        v1 = new VBox(10);
        v2 = new VBox(10);
        //
        separator = new Separator();
        //
        logoutButton = new Button("Logout");
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(userIdLabel);
        h2.getChildren().addAll(usernameLabel);
        h3.getChildren().addAll(lastnameLabel, firstnameLabel);
        h4.getChildren().addAll(emailLabel);
        h5.getChildren().addAll(cellphoneLabel);
        h6.getChildren().addAll(emailLabel);
        h7.getChildren().addAll(genderLabel);
        h8.getChildren().addAll(dateofbirthLabel);
        //
        v2.getChildren().addAll(h1, h2, h3, h4, h5, h6, h7, h8, logoutButton);
        v1.getChildren().addAll(accountImageView);
        h9.getChildren().addAll(v1, separator, v2);
        //
        getChildren().addAll(h9);
    }

    @Override
    public void bindings() {
        //
        accountImageView.fitHeightProperty().bind(v1.heightProperty().multiply(0.6));
        accountImageView.fitWidthProperty().bind(v1.widthProperty().multiply(0.4));
        //
        h1.prefWidthProperty().bind(v2.widthProperty());
        h2.prefWidthProperty().bind(v2.widthProperty());
        h3.prefWidthProperty().bind(v2.widthProperty());
        h4.prefWidthProperty().bind(v2.widthProperty());
        h5.prefWidthProperty().bind(v2.widthProperty());
        h6.prefWidthProperty().bind(v2.widthProperty());
        h7.prefWidthProperty().bind(v2.widthProperty());
        h8.prefWidthProperty().bind(v2.widthProperty());
        //
        v1.prefHeightProperty().bind(h9.heightProperty());
        v1.prefWidthProperty().bind(h9.widthProperty().multiply(0.4));
        //
        v2.prefHeightProperty().bind(h9.heightProperty());
        v2.prefWidthProperty().bind(h9.widthProperty().multiply(0.6));
        //
        h9.prefHeightProperty().bind(heightProperty());
        h9.prefWidthProperty().bind(widthProperty());
        //
    }

    @Override
    public void alignElements() {
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);

        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);

        //
        firstnameLabel.setAlignment(Pos.CENTER);
        lastnameLabel.setAlignment(Pos.CENTER);
        emailLabel.setAlignment(Pos.CENTER);
        dateofbirthLabel.setAlignment(Pos.CENTER);
        genderLabel.setAlignment(Pos.CENTER);
        qualificationLabel.setAlignment(Pos.CENTER);
        cellphoneLabel.setAlignment(Pos.CENTER);
        usernameLabel.setAlignment(Pos.CENTER);
        userIdLabel.setAlignment(Pos.CENTER);

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

    public Label getQualificationLabel() {
        return qualificationLabel;
    }

    public Label getCellphoneLabel() {
        return cellphoneLabel;
    }

    public Label getUsernameLabel() {
        return usernameLabel;
    }

    public Label getUserIdLabel() {
        return userIdLabel;
    }

    public ImageView getAccountImageView() {
        return accountImageView;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }

}
