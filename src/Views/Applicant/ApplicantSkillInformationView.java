package Views.Applicant;

import ViewsBase.View;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ApplicantSkillInformationView extends View {

    Label skillInformationLabel, skillCategoryLabel, skillsLabel, skillcategorydescription, educationalLevelDescLabel, educationalLevelLabel;
    ComboBox skillCategoryChoiceBox, educationlevelChoiceBox;
    Button nextButton, resetButton;

    @Override
    public void init() {
        //
        title = "Applicant Skill Information";
        skillInformationLabel = new Label("Applicant Skill Information");
        skillCategoryLabel = new Label("Skill Category:");
        skillsLabel = new Label("Skills:");
        educationalLevelLabel = new Label("Education Level:");
        skillcategorydescription = new Label("please choose your skill category down below.this will\n"
                + "your major based on what you can do..");
        educationalLevelDescLabel = new Label("please choose your educational level down below.this will\n"
                + "your acedemic information...");
        //
        skillCategoryChoiceBox = new ComboBox();
        educationlevelChoiceBox = new ComboBox();
        //
        skillInformationLabel.setId("font-20");
        educationalLevelLabel.setId("font-14");
        skillCategoryLabel.setId("font-14");
        skillcategorydescription.setId("font-14");
        educationalLevelDescLabel.setId("font-14");
        //
        nextButton = new Button("Next");
        resetButton = new Button("Reset");
        //
        h6=new HBox(50);
        //

    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(skillInformationLabel);
        h2.getChildren().addAll(skillcategorydescription);
        h3.getChildren().addAll(skillCategoryLabel, skillCategoryChoiceBox);
        h4.getChildren().addAll(educationalLevelDescLabel);
        h5.getChildren().addAll(educationalLevelLabel, educationlevelChoiceBox);
        h6.getChildren().addAll(backButton, nextButton, resetButton);
        //
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6);
        //
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {

        //
        skillCategoryLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        skillCategoryChoiceBox.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        educationalLevelDescLabel.prefWidthProperty().bind(h4.widthProperty());
        educationalLevelLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        educationlevelChoiceBox.prefWidthProperty().bind(h5.widthProperty().multiply(0.4));
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        backButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        nextButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        resetButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v1.widthProperty());
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        //
        v1.setAlignment(Pos.CENTER);
        //
        skillcategorydescription.setAlignment(Pos.CENTER);
        skillCategoryLabel.setAlignment(Pos.CENTER_LEFT);
        educationalLevelLabel.setAlignment(Pos.CENTER_LEFT);
        educationalLevelDescLabel.setAlignment(Pos.CENTER);
        educationalLevelLabel.setAlignment(Pos.CENTER_LEFT);
        
        v1.setSpacing(40);

        //
    }

    public ComboBox getSkillCategoryChoiceBox() {
        return skillCategoryChoiceBox;
    }

    public ComboBox getEducationlevelChoiceBox() {
        return educationlevelChoiceBox;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Button getResetButton() {
        return resetButton;
    }

}
