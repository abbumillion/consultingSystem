package Tabs;

import javafx.scene.control.Button;

public class AdminHomeTab extends HomeTab {

    //
    Button addNewAdminButton, addNewApplicantButton, addNewEmployerButton, addNewInterviewButton, addinterviewScheduleButton, systemSettingsButton;
    //

    @Override
    public void init() {
        //----------------------------------------------------------------------
        addinterviewScheduleButton = new Button("Add Interview Schedule");
        addNewAdminButton = new Button("Add New Admin");
        addNewApplicantButton = new Button("Add New Applicant");
        addNewEmployerButton = new Button("Add New Employer");
        addNewInterviewButton = new Button("Add New Interview");
        systemSettingsButton = new Button("System Settings");
        //----------------------------------------------------------------------
    }

    @Override
    public void addChildren() {
        //----------------------------------------------------------------------
        v1.getChildren().addAll(addNewAdminButton, addNewApplicantButton, addNewEmployerButton,
                addNewInterviewButton, addinterviewScheduleButton, systemSettingsButton);
        h1.getChildren().addAll(v1, subScene);
        getChildren().addAll(h1);
        //----------------------------------------------------------------------
    }

    @Override
    public void bindings() {
        //----------------------------------------------------------------------
        addNewAdminButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        addNewAdminButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        addNewApplicantButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        addNewApplicantButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        addNewEmployerButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        addNewEmployerButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        addNewInterviewButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        addNewInterviewButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        addinterviewScheduleButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        addinterviewScheduleButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        systemSettingsButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        systemSettingsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        //----------------------------------------------------------------------
    }

    @Override
    public void alignElements() {
        //----------------------------------------------------------------------

        //----------------------------------------------------------------------
    }

    public Button getAddNewAdminButton() {
        return addNewAdminButton;
    }

    public Button getAddNewApplicantButton() {
        return addNewApplicantButton;
    }

    public Button getAddNewEmployerButton() {
        return addNewEmployerButton;
    }

    public Button getAddNewInterviewButtonButton() {
        return addNewInterviewButton;
    }

    public Button getAddinterviewScheduleButton() {
        return addinterviewScheduleButton;
    }

    public Button getSystemSettingsButton() {
        return systemSettingsButton;
    }
}
