package Views;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public abstract class SubView extends VBox implements Viewable {

    protected Label description;
    protected Button resetButton, submitButton;

    public SubView() {
        setAlignment(Pos.CENTER);
        setSpacing(10);
    }

    public void getReady() {
        init();
        addChildren();
        bindings();
        alignElements();
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

}
