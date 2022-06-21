package ViewsBase;

import java.util.Date;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public abstract class View extends VBox implements Viewable {

    protected String title, theme;
    protected Label footerLabel, descLabel, TitleLabel;
    protected Scene scene;
    protected Button backButton;
    protected HBox bottomBox;
    protected Notifications notification;
    protected Stage stage;
    //
    protected HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21;
    protected VBox v1, v2, v3, v4, v5;
    //

    public View() {
        //----------------------------------------------------------------------
        theme = "StyleSheets/light.css";
        backButton = new Button("Back");
        backButton.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        bottomBox = new HBox(20);
        TitleLabel = new Label("CONSULTING SYSTEM");
        descLabel = new Label("This project was built during our internship period\n"
                + "We are 4th year software engineering student at\n Bahir Dar University,Ethiopia");
        TitleLabel.setId("font-24");
        TitleLabel.setAlignment(Pos.TOP_LEFT);
        TitleLabel.prefWidthProperty().bind(widthProperty());
        bottomBox.prefHeightProperty().bind(heightProperty().multiply(0.01));
        footerLabel = new Label("Content @ Copyright 2021,Million Sharbe and Mintesinot Desta."
                + "All Rights Reserved." + new Date().toGMTString());
        footerLabel.setId("footerLabel");
        footerLabel.setAlignment(Pos.BOTTOM_CENTER);

        bottomBox.getChildren().add(footerLabel);
        bottomBox.setAlignment(Pos.BOTTOM_CENTER);
        setSpacing(0);
        setOnKeyPressed(e -> {
            setFullScreenEvent(e);
        });
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
    }

    public void getReady() {
        init();
        addChildren();
        bindings();
        alignElements();
    }

    public void showView() {
        scene = new Scene(this, W, H);
        stage = new Stage();
        scene.getStylesheets().add(theme);
        stage.setScene(scene);
        stage.setFullScreenExitHint("");
        stage.setTitle(title);
        stage.initStyle(StageStyle.UNDECORATED);
       // stage.setFullScreen(true);
        stage.show();
    }

    public void close() {
        if (stage != null) {
            stage.close();
        }
    }

    public void setFullScreenEvent(KeyEvent e) {
        if (e.getCode() == ENTER) {
            if (stage.isFullScreen()) {
                stage.setFullScreen(false);
            } else {
                stage.setFullScreen(true);
            }
        }
    }

    public void setFullScreenEvent() {
        if (stage.isFullScreen()) {
            stage.setFullScreen(false);
        } else {
            stage.setFullScreen(true);
        }
    }

    public void SuccessAlert() {
        notification = Notifications.create()
                .text("Action Completed Successfully.")
                .title("Success Alert")
                .hideAfter(Duration.seconds(3))
                .graphic(new ImageView("success.png"))
                .position(Pos.CENTER);
        notification.showConfirm();
    }

    public void SuccessLogin(String name) {
        notification = Notifications.create()
                .text("Wellcome to Consulting System \n" + name)
                .title("Successfully logged in")
                .hideAfter(Duration.seconds(3))
                .graphic(new ImageView("success.png"))
                .position(Pos.CENTER);
        notification.showConfirm();
    }

    public void FailedLogin() {
        notification = Notifications.create()
                .text("please use correct username and\n password")
                .title("Login Failed")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showConfirm();
    }

    public void FailedAlert() {
        notification = Notifications.create()
                .text("Action Failed.")
                .title("Failed")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showError();
    }

    public void WarningAlert() {
        notification = Notifications.create()
                .text("Warning Alert.")
                .title("Warning")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showError();
    }

    public void EmptyFieldAlert() {
        notification = Notifications.create()
                .text("please enter all fields")
                .title("Empty Field Alert")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showError();
    }

    public void PasswordMisMatchAlert() {
        notification = Notifications.create()
                .text("use the same password please.")
                .title("Password Mis-Match")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showWarning();
    }

    public void NotFoundAlert() {
        notification = Notifications.create()
                .text("Action Completed Successfully.")
                .title("Success Alert")
                .hideAfter(Duration.seconds(3))
                .position(Pos.CENTER);
        notification.showConfirm();
    }

    public Button getBackButton() {
        return backButton;
    }
}

interface Viewable {

    double W = Screen.getPrimary().getBounds().getWidth();
    double H = Screen.getPrimary().getBounds().getHeight() * 0.8;

    //initialize every thing here
    void init();

    //add nodes to containers to create layout
    void addChildren();

    //binding operations
    void bindings();

    //align elements
    void alignElements();

}
