package ViewsBase;

import Helpers.StringConstants;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoaderView extends View {

    //------------------------------------------------------------------------//
    Label messageLabel, messageLabel1, titleLabel;
    ImageView systemImage;
    ProgressIndicator progressBar;

    //------------------------------------------------------------------------//
    @Override
    public void init() {
        //--------------------------------------------------------------------//
        messageLabel = new Label("Well Come to Our New Consultion System "
                + "This system was built during our internship period.");
        messageLabel1 = new Label("Starting please wait.....");
        titleLabel = new Label(".............................................." + StringConstants.getSYSTEMTITLE() + "..................................................");
        titleLabel.setId("font-30");
        messageLabel.setId("font-14");
        messageLabel1.setId("font-14");
        systemImage = new ImageView("Assets/systemimage.png");
        //--------------------------------------------------------------------//
        progressBar = new ProgressBar();
        progressBar.setVisible(false);
        progressBar.setId("progressbar");
        v1 = new VBox(10);
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(titleLabel, systemImage, messageLabel, messageLabel1, bottomBox);
        getChildren().addAll(v1, progressBar);
        //  v1.setBackground(bg);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        v1.prefHeightProperty().bind(heightProperty().multiply(0.98));
        v1.prefWidthProperty().bind(widthProperty());
        v1.setId("black");
        //--------------------------------------------------------------------//
        titleLabel.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        titleLabel.prefWidthProperty().bind(v1.widthProperty());
        //--------------------------------------------------------------------//
        messageLabel.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        messageLabel.prefWidthProperty().bind(v1.widthProperty());
        //--------------------------------------------------------------------//
        messageLabel1.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        messageLabel1.prefWidthProperty().bind(v1.widthProperty());
        //
        systemImage.fitHeightProperty().bind(v1.heightProperty().multiply(0.6));
        systemImage.fitWidthProperty().bind(v1.widthProperty().multiply(0.8));
        //--------------------------------------------------------------------//
        progressBar.prefHeightProperty().bind(heightProperty().multiply(0.03));
        progressBar.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void showView() {
        scene = new Scene(this, W * 0.6, H * 0.6);
        scene.getStylesheets().add(theme);
        stage = new Stage();
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setFullScreenExitHint("");
        stage.setTitle(title);
        stage.show();
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        v1.setAlignment(Pos.CENTER);
        titleLabel.setAlignment(Pos.CENTER);
        messageLabel.setAlignment(Pos.CENTER);
        messageLabel1.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
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
