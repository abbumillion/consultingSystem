package Tabs;

import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;

public class CompanyHomeTab extends HomeTab {

    //
    Button addjoborderButton, updateJobContractButton, updateInterviewButton, addInterviewButton, newEvaluationButton,
            updateEvaluationButton, updateCompanyInfoButton, addNewJobContractButton, updatejoborderButton;
    //tabs    //

    Separator sp;

    @Override
    public void init() {

        sp = new Separator();
        addjoborderButton = new Button("New Job Order");
        updatejoborderButton = new Button("Update Job Order");
        addNewJobContractButton = new Button("New Job Contract");
        updateJobContractButton = new Button("Update Job Contract");
        addInterviewButton = new Button("Add Interview");
        updateInterviewButton = new Button("Update Interview");
        updateCompanyInfoButton = new Button("Update Company Info");
        newEvaluationButton = new Button("New Interview Evaluation");
        updateEvaluationButton = new Button("Update Interview Evaluation");
        //

    }

    @Override
    public void addChildren() {
        //
        v1.getChildren().addAll(addjoborderButton, updateJobContractButton,
                updateInterviewButton, addInterviewButton, newEvaluationButton,
                updateEvaluationButton, updateCompanyInfoButton, addNewJobContractButton, updatejoborderButton);
        h1.getChildren().addAll(v1, sp, subScene);
        //

        getChildren().addAll(h1);
        //
    }

    @Override
    public void bindings() {

        //and divide the total height for the buttons
        addjoborderButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        addjoborderButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        newEvaluationButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        newEvaluationButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        updateEvaluationButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        updateEvaluationButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        updateCompanyInfoButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        updateCompanyInfoButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        addNewJobContractButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        addNewJobContractButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        updatejoborderButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        updatejoborderButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        //
        addInterviewButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        addInterviewButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        updateInterviewButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        updateInterviewButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //
        updateJobContractButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.7));
        updateJobContractButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        //

    }

    @Override
    public void alignElements() {

        addNewJobContractButton.setGraphic(new ImageView("Assets/icons8-add-file-64.png"));
        updateEvaluationButton.setGraphic(new ImageView("Assets/icons8-update-48.png"));
        // v1.setAlignment(Pos.TOP_LEFT);
    }

    public Button getAddjoborderButton() {
        return addjoborderButton;
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
