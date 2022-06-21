package Tabs;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.StageStyle;
import org.controlsfx.control.Rating;
import org.controlsfx.control.ToggleSwitch;

public class SettingsTab extends SubView {

    Label  nightModeLabel, fullScreenLabel, stageStyleLabel, fontSizeLabel, ratingLabel;



    ComboBox stageStyleChoiceBox, fontSizeChoiceBox;

    ToggleSwitch nightMode, fullScreen;
    Rating rating;

    ScrollPane scrollPane;
    Button resetToDefaultButton;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        titleLabel = new Label("System Settings");
        nightModeLabel = new Label("Night mode for night use dark theme will be applied to \nthe whole application");
        fullScreenLabel = new Label("Fullscreen mode on off here.");
        stageStyleLabel = new Label("Change Stage Style here by selecting one of the choices.\n"
                + "Restarting will be required after the selection.");
        fontSizeLabel = new Label("Font size options");
        ratingLabel = new Label("Rate our application here");
        //--------------------------------------------------------------------//
        Object[] stageStyles = new Object[]{StageStyle.DECORATED, StageStyle.TRANSPARENT, StageStyle.UNDECORATED, StageStyle.UNIFIED, StageStyle.UTILITY};
        stageStyleChoiceBox = new ComboBox();
        stageStyleChoiceBox.getItems().addAll(stageStyles);
        Object fontSizes[] = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 32};
        fontSizeChoiceBox = new ComboBox();
        fontSizeChoiceBox.getItems().addAll(fontSizes);
        //--------------------------------------------------------------------//
        nightMode = new ToggleSwitch("Night Mode:");
        fullScreen = new ToggleSwitch("FullScreen Mode:");
        rating = new Rating();
        scrollPane = new ScrollPane();
        resetToDefaultButton = new Button("Reset to Default");
        //--------------------------------------------------------------------//
        titleLabel.setId("font-20");
        nightMode.setId("font-14");
        fullScreen.setId("font-14");
        nightModeLabel.setId("font-14");
        fullScreenLabel.setId("font-14");
        stageStyleLabel.setId("font-14");
        fontSizeLabel.setId("font-14");
        ratingLabel.setId("font-14");

    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(nightModeLabel);
        h3.getChildren().addAll(nightMode);
        h4.getChildren().addAll(fullScreenLabel);
        h5.getChildren().addAll(fullScreen);
        h6.getChildren().addAll(stageStyleLabel);
        h7.getChildren().addAll(stageStyleChoiceBox);
        h8.getChildren().addAll(fontSizeLabel);
        h9.getChildren().addAll(fontSizeChoiceBox);
        h10.getChildren().addAll(ratingLabel);
        h11.getChildren().addAll(rating);
       // h12.getChildren().addAll(resetToDefaultButton);
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11);
        //--------------------------------------------------------------------//
        scrollPane.setContent(v1);
        getChildren().add(scrollPane);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty());
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefWidthProperty().bind(v1.widthProperty());
        h8.prefWidthProperty().bind(v1.widthProperty());
        h9.prefWidthProperty().bind(v1.widthProperty());

        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h5.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h6.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h7.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h8.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h9.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));

        //--------------------------------------------------------------------//
        v1.prefHeightProperty().bind(heightProperty());
        v1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        nightModeLabel.prefWidthProperty().bind(h1.widthProperty());
        nightMode.prefWidthProperty().bind(h2.widthProperty().multiply(0.8));
        fullScreenLabel.prefWidthProperty().bind(h3.widthProperty());
        fullScreen.prefWidthProperty().bind(h4.widthProperty().multiply(0.8));
        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        titleLabel.prefHeightProperty().bind(h1.heightProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //----------------------------------------------------------------------
        titleLabel.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------

    }

    public ToggleSwitch getNightMode() {
        return nightMode;
    }

    public ToggleSwitch getFullScreen() {
        return fullScreen;
    }

    public ComboBox getStageStyleChoiceBox() {
        return stageStyleChoiceBox;
    }

    public ComboBox getFontSizeChoiceBox() {
        return fontSizeChoiceBox;
    }

    public Rating getRating() {
        return rating;
    }

    public Button getResetToDefaultButton() {
        return resetToDefaultButton;
    }

}
