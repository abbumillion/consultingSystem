package Views;

import static Views.Viewable.STAGE;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;

public abstract class View extends VBox implements Viewable {

    protected String title;
    protected Label footerLabel, descLabel, TitleLabel;
    protected Scene scene;
    protected Button backButton, searchButton;
    protected TextField searchTextField;
    protected HBox Box1, bottomBox, searchHBox;
    protected VBox topBox;

    public View() {
        //----------------------------------------------------------------------
        backButton = new Button("Back");
        backButton.setAlignment(Pos.CENTER);
        Box1 = new HBox(20);
        topBox = new VBox(10);
        topBox.setId("topBox");
        //----------------------------------------------------------------------
        bottomBox = new HBox(20);
        searchHBox = new HBox(10);
        searchButton = new Button("Search");
        searchTextField = new TextField("Search something here!!!");
        TitleLabel = new Label("<\\>CONSULTING SYSTEM...");
        descLabel = new Label("This project was built during our internship period\n"
                + "We are 4th year software engineering student at\n Bahir Dar University,Ethiopia");
        //(new ImageView("Assets/black.png"));
        TitleLabel.setId("titleLabel");
        TitleLabel.setAlignment(Pos.TOP_LEFT);
        searchHBox.setId("searchHBox");
        searchHBox.setAlignment(Pos.TOP_CENTER);
        topBox.setAlignment(Pos.TOP_LEFT);
        TitleLabel.prefWidthProperty().bind(widthProperty());

        topBox.prefWidthProperty().bind(widthProperty());

        topBox.prefWidthProperty().bind(heightProperty().multiply(0.3));
        bottomBox.prefHeightProperty().bind(heightProperty().multiply(0.06));

        searchTextField.prefWidthProperty().bind(searchHBox.widthProperty().multiply(0.35));
        searchTextField.prefHeightProperty().bind(searchHBox.heightProperty().multiply(0.7));

        searchHBox.prefWidthProperty().bind(topBox.widthProperty());
        searchHBox.prefHeightProperty().bind(topBox.heightProperty().multiply(0.2));
        searchHBox.setVisible(false);

        footerLabel = new Label("Content@ Copyright 2021,Million Sharbe and Mintesinot Desta."
                + "All Rights Reserved.\nAug 31 2021");
        footerLabel.setId("footerLabel");
        footerLabel.setAlignment(Pos.BOTTOM_CENTER);
        Box1.getChildren().addAll(TitleLabel);
        searchHBox.getChildren().addAll(searchTextField, searchButton);
        topBox.getChildren().addAll(Box1, searchHBox);
        bottomBox.getChildren().add(footerLabel);
        bottomBox.setAlignment(Pos.BOTTOM_CENTER);
        topBox.setAlignment(Pos.TOP_LEFT);
        setSpacing(0);
        setOnKeyPressed(e -> {
            setFullScreenEvent(e);
        });
        //  this.setEffect(value);

    }

    public void getReady() {
        init();
        addChildren();
        bindings();
        alignElements();
    }

    public void showView() {
        scene = new Scene(this, W, H);
        scene.getStylesheets().add("StyleSheets/dark.css");
        STAGE.setScene(scene);
        STAGE.setFullScreenExitHint("");
        STAGE.setTitle(title);
        // STAGE.initStyle(StageStyle.UNDECORATED);
        STAGE.setFullScreen(true);
        STAGE.show();
    }

    public void setFullScreenEvent(KeyEvent e) {
        if (e.getCode() == ENTER) {
            if (STAGE.isFullScreen()) {
                STAGE.setFullScreen(false);
            } else {
                STAGE.setFullScreen(true);
            }
        }
    }

    public void SuccessAlert() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Registered");
        alert.setContentText("Submitted Successfully");
        alert.show();
    }

    public void SuccessLogin(String name) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logged in Successfully");
        alert.setContentText("Well Come \n" + name);
        alert.show();
    }

    public void FailedLogin() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("login failed");
        alert.setContentText("Please Enter Correct\nUsername and Password");
        alert.show();
    }

    public void FailerAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Error Occured!!");
        alert.show();
    }

    public void WarningAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setContentText("Warrning!!!");
        alert.show();
    }

    public void EmptyFieldAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Empty Field");
        alert.setContentText("Please Enter the fields!!!");
        alert.show();
    }

    public void PasswordMisMatchAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Password Mismatch");
        alert.setContentText("Please enter the same password.");
        alert.show();
    }

    public void NotFoundAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("No Result Found");
        alert.setContentText("Please enter another string to search.");
        alert.show();
    }

    public Button getBackButton() {
        return backButton;
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public TextField getSearchTextField() {
        return searchTextField;
    }

}

interface Viewable {

    //stage
    Stage STAGE = new Stage();

    //this interface is for all views
    //used as user interface through out 
    //the entire system
    //pop up
    Popup POPUP = new Popup();

    //width and height of the computer screen
    double W = Screen.getPrimary().getBounds().getWidth() * 0.9;
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
