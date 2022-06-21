package Views.Company;

import ViewsBase.View;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

//this window will show before starting employer
//company registration page
public class CompanyRegistrationIntroductionView extends View {

    //------------------------------------------------------------------------//
    Label titleLabel, descriptionLabel, l1, l2, l3, l4, l5;
    Button nextButton;
    ImageView imageview;

    @Override
    public void init() {
        title = "Create New Company - Introduction";
        titleLabel = new Label("Create New Company");
        titleLabel.setId("font-20");
        descriptionLabel = new Label("This wizard will walk you through creating a new company.\n"
                + "You will be asked about your:");
        descriptionLabel.setId("font-16");
        l1 = new Label("Company name");
        l1.setId("font-16");
        l2 = new Label("Business type");
        l2.setId("font-14");
        l3 = new Label("Login Information");
        l3.setId("font-14");
        l4 = new Label("Company address");
        l4.setId("font-14");
        l5 = new Label("Login information");
        l5.setId("font-14");
        h7 = new HBox(40);

        //----------------------------------------------------------------------
        imageview = new ImageView("Assets/osu.jpg");
        //----------------------------------------------------------------------
        nextButton = new Button("Next");
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------

    }

    @Override
    public void addChildren() {
        //----------------------------------------------------------------------
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(descriptionLabel);
        h3.getChildren().addAll(l1);
        h4.getChildren().addAll(l2);
        h5.getChildren().addAll(l3);
        h6.getChildren().addAll(l4);
        h7.getChildren().addAll(backButton, nextButton);
        //----------------------------------------------------------------------
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6, h7);
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        h8.getChildren().addAll(imageview, v1);
        //----------------------------------------------------------------------
        getChildren().addAll(h8, bottomBox);
        //----------------------------------------------------------------------
    }

    @Override
    public void bindings() {
        //----------------------------------------------------------------------
        h8.prefHeightProperty().bind(heightProperty());
        h8.prefWidthProperty().bind(widthProperty());
        //----------------------------------------------------------------------
        imageview.fitHeightProperty().bind(h8.heightProperty().multiply(0.4));
        imageview.fitWidthProperty().bind(h8.widthProperty().multiply(0.6));
        //----------------------------------------------------------------------
        v1.prefHeightProperty().bind(h8.heightProperty().multiply(0.8));
        v1.prefWidthProperty().bind(h8.widthProperty().multiply(0.5));
        //----------------------------------------------------------------------
        backButton.prefHeightProperty().bind(h7.heightProperty().multiply(0.1));
        backButton.prefWidthProperty().bind(h7.widthProperty().multiply(0.2));
        //
        nextButton.prefHeightProperty().bind(h7.heightProperty().multiply(0.1));
        nextButton.prefWidthProperty().bind(h7.widthProperty().multiply(0.2));
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h6.prefWidthProperty().bind(v1.widthProperty());
        h7.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h7.prefWidthProperty().bind(v1.widthProperty());
        //----------------------------------------------------------------------
    }

    @Override
    public void alignElements() {
        //----------------------------------------------------------------------
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.TOP_CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        //----------------------------------------------------------------------
        titleLabel.setAlignment(Pos.CENTER);
        descriptionLabel.setAlignment(Pos.CENTER);
        l1.setAlignment(Pos.CENTER);
        l2.setAlignment(Pos.CENTER);
        l3.setAlignment(Pos.CENTER);
        imageview.setPreserveRatio(true);
        //----------------------------------------------------------------------
    }

    public Button getNextButton() {
        return nextButton;
    }

}
