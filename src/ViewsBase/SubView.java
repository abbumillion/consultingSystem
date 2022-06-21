package ViewsBase;

import static ViewsBase.Viewable.W;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class SubView extends VBox implements Viewable {

    protected Label description, titleLabel;
    protected Button resetButton, submitButton, closeButton;
    protected String title, theme;
    Stage popup;
    protected HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
    protected VBox v1, v2, v3, v4, v5;

    public SubView() {
        title = "window title";
        theme = "StyleSheets/light.css";
        resetButton = new Button("Reset");
        submitButton = new Button("Submit");
        closeButton = new Button("Close");
        titleLabel = new Label("title Label");
        setAlignment(Pos.CENTER);
        setSpacing(10);
        //

        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        h6 = new HBox(20);
        h7 = new HBox(20);
        h8 = new HBox(20);
        h9 = new HBox(20);
        h10 = new HBox(20);
        h11 = new HBox(20);
        //
        v1 = new VBox(20);
        v2 = new VBox(20);
        v3 = new VBox(20);
        v4 = new VBox(20);
        v5 = new VBox(20);
        //
        //
    }

    public void getReady() {
        init();
        addChildren();
        bindings();
        alignElements();
    }

    public void showView() {
        popup = new Stage();
        Scene scene = new Scene(this, W * 0.5, H * 0.8);
        scene.getStylesheets().add(theme);
        popup.setScene(scene);
        popup.initStyle(StageStyle.UNDECORATED);
        popup.setFullScreenExitHint("");
        popup.setTitle(title);
        popup.show();
    }

    public void close() {
        popup.close();
    }

    public Label getDescription() {
        return description;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getCloseButton() {
        return closeButton;
    }

}
