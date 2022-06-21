package Tabs.Home;

import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class AdminHomeTab extends HomeTab {

    Button addNewAdminButton, addSkillButton, addSkillCategoryButton,
            addNewInterviewButton, addinterviewScheduleButton, b1, b2, b3, systemSettingsButton;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        addinterviewScheduleButton = new Button("Add Interview Schedule");
        addNewAdminButton = new Button("Add  Admin");
        addSkillButton = new Button("Add  Skill");
        addSkillCategoryButton = new Button("Add  Skill Category");
        addNewInterviewButton = new Button("Add  Interview");
        systemSettingsButton = new Button("System Settings");
        b1 = new Button("Add New Employer");
        b2 = new Button("Add New Interview");
        b3 = new Button("System Settings");
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        //
        h1.getChildren().addAll(addNewAdminButton, addSkillButton, addSkillCategoryButton);
        h2.getChildren().addAll(addNewInterviewButton, addinterviewScheduleButton, systemSettingsButton);
        h3.getChildren().addAll(b1, b2, b3);
        h4.getChildren().addAll(aboutusButton, contactusButton, feedbackButton);
        v1.getChildren().addAll(h1, h2, h3, h4);

        sp.setContent(v1);
        getChildren().addAll(sp);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        addNewAdminButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        addNewAdminButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));

        addSkillButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        addSkillButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));

        addSkillCategoryButton.prefWidthProperty().bind(h1.widthProperty().multiply(0.25));
        addSkillCategoryButton.prefHeightProperty().bind(h1.heightProperty().multiply(0.7));
        //
        addNewInterviewButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        addNewInterviewButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));
        //
        addinterviewScheduleButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        addinterviewScheduleButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));
        //
        systemSettingsButton.prefWidthProperty().bind(h2.widthProperty().multiply(0.25));
        systemSettingsButton.prefHeightProperty().bind(h2.heightProperty().multiply(0.7));
        //
        b1.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        b1.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));

        b2.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        b2.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));

        b3.prefWidthProperty().bind(h3.widthProperty().multiply(0.25));
        b3.prefHeightProperty().bind(h3.heightProperty().multiply(0.7));

        feedbackButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        feedbackButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));

        contactusButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        contactusButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));

        aboutusButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.25));
        aboutusButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.7));

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
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        v1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);

        //--------------------------------------------------------------------//
    }

    public Button getAddNewAdminButton() {
        return addNewAdminButton;
    }

    public Button getAddSkillButtonButton() {
        return addSkillButton;
    }

    public Button getAddSkillcategoryButton() {
        return addSkillCategoryButton;
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
