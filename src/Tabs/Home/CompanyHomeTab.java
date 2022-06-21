package Tabs.Home;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import static javafx.scene.layout.BackgroundSize.AUTO;

public class CompanyHomeTab extends HomeTab {

    Button addjoborderButton, updateJobContractButton, updateInterviewButton, addInterviewButton, newEvaluationButton,
            updateEvaluationButton, updateCompanyInfoButton, addNewJobContractButton, updatejoborderButton;

    @Override
    public void init() {

        //--------------------------------------------------------------------//
        addjoborderButton = new Button("Add New Job");
        updatejoborderButton = new Button("Update Job");
        addNewJobContractButton = new Button("Add Job Contract");
        updateJobContractButton = new Button("Update Job Contract");
        addInterviewButton = new Button("Add Job Interview");
        updateInterviewButton = new Button("Update Job Interview");
        updateCompanyInfoButton = new Button("Update Company Information");
        newEvaluationButton = new Button("Add  Interview Evaluation");
        updateEvaluationButton = new Button("Update Interview Evaluation");
        //--------------------------------------------------------------------//

    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        v1.getChildren().addAll();
        h1.getChildren().addAll(addjoborderButton, updateJobContractButton, addInterviewButton);
        h2.getChildren().addAll(updateInterviewButton, newEvaluationButton, updateEvaluationButton);
        h3.getChildren().addAll(updateCompanyInfoButton, addNewJobContractButton, updatejoborderButton);
        h4.getChildren().addAll(aboutusButton, contactusButton, feedbackButton);
        v1.getChildren().addAll(h1, h2, h3, h4);
        BackgroundImage bm = new BackgroundImage(new Image("Assets/worldclockimage.png"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, new BackgroundSize(AUTO, AUTO, true, true, false, false));

        Background bg = new Background(bm);
        v1.setBackground(bg);
        sp.setContent(v1);
        getChildren().addAll(sp);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {

        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty());
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));

        h2.prefWidthProperty().bind(v1.widthProperty());
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));

        h3.prefWidthProperty().bind(v1.widthProperty());
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));

        h4.prefWidthProperty().bind(v1.widthProperty());
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));

        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());

        addjoborderButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        addjoborderButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));

        updateInterviewButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        updateInterviewButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));

        updateJobContractButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        updateJobContractButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));
        //
        newEvaluationButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        newEvaluationButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));
        //
        updateEvaluationButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        updateEvaluationButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));
        //
        updateCompanyInfoButton.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        updateCompanyInfoButton.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));
        //
        addNewJobContractButton.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        addNewJobContractButton.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));

        updatejoborderButton.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        updatejoborderButton.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));

        addInterviewButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        addInterviewButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));

        feedbackButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        feedbackButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));

        contactusButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        contactusButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));

        aboutusButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        aboutusButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//

        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);

        // addNewJobContractButton.setGraphic(new ImageView("Assets/icons8-add-file-64.png"));
        // updateEvaluationButton.setGraphic(new ImageView("Assets/icons8-update-48.png"));
        //--------------------------------------------------------------------//
    }

    public Button getAddjoborderButton() {
        return addjoborderButton;
    }

    public Button getUpdateJobContractButton() {
        return updateJobContractButton;
    }

    public Button getUpdateInterviewButton() {
        return updateInterviewButton;
    }

    public Button getAddInterviewButton() {
        return addInterviewButton;
    }

    
    public Button getNewEvaluationButton() {
        return newEvaluationButton;
    }

    public Button getUpdateEvaluationButton() {
        return updateEvaluationButton;
    }

    public Button getUpdateCompanyInfoButton() {
        return updateCompanyInfoButton;
    }

    public Button getAddNewJobContractButton() {
        return addNewJobContractButton;
    }

    public Button getUpdatejoborderButton() {
        return updatejoborderButton;
    }

}
