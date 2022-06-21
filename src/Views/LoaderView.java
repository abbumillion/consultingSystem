package Views;

import Views.View;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class LoaderView extends View {

    Label messageLabel, messageLabel1, titleLabel;
    ProgressIndicator progressBar;
    VBox v1, v2;
    HBox h1, h2;

    @Override
    public void init() {
        //----------------------------------------------------------------------
        messageLabel = new Label("Well Come to Our New Consultion System\n"
                + "This system was built during our internship period.\n");
        messageLabel1 = new Label("Starting");
        titleLabel = new Label("Consulting System");
        titleLabel.setId("sysTitle");
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        progressBar = new ProgressBar();
        progressBar.setVisible(false);
        v1 = new VBox(10);
        //----------------------------------------------------------------------
    }

    @Override
    public void addChildren() {
        //----------------------------------------------------------------------
        v1.getChildren().addAll(titleLabel, messageLabel, progressBar, messageLabel1);
        //----------------------------------------------------------------------
        getChildren().addAll(v1);
        //----------------------------------------------------------------------
    }

    @Override
    public void bindings() {
        //----------------------------------------------------------------------
        v1.prefHeightProperty().bind(heightProperty());
        v1.prefWidthProperty().bind(widthProperty());
        //----------------------------------------------------------------------
        messageLabel.setId("loader");
        messageLabel.prefHeightProperty().bind(v1.heightProperty().multiply(0.4));
        messageLabel.prefWidthProperty().bind(v1.widthProperty());
        //----------------------------------------------------------------------
        progressBar.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        progressBar.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        //----------------------------------------------------------------------
    }

    @Override
    public void showView() {

        scene = new Scene(this, W * 0.6, H * 0.4);
        scene.getStylesheets().add("StyleSheets/dark.css");
        STAGE.setScene(scene);
        STAGE.setFullScreenExitHint("");
        STAGE.setTitle(title);
        //  STAGE.setFullScreen(true);
        STAGE.show();
    }

    @Override
    public void alignElements() {
        //----------------------------------------------------------------------
        v1.setAlignment(Pos.CENTER);
        messageLabel.setAlignment(Pos.CENTER);
        searchHBox.setVisible(false);
        //----------------------------------------------------------------------
    }

    public Label getMessageLabel() {
        return messageLabel;
    }

    public Label getMessageLabel1() {
        return messageLabel1;
    }

    public ProgressIndicator getProgressBar() {
        return progressBar;
    }

}
