package Navigations;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddJobOrderSubView extends SubView {

    //labels
    Label newjoborderLabel, jobtitleLabel, genderLabel, skillLabel, enddateLabel, experiancerequiredLabel, educationlevelLabel, numberofvacanciesLabel, jobdescriptionLabel;
    //textfields
    TextField jobtitleTextField;
    //choice boxes
    ComboBox skillChoiceBox, educationlevelChoiceBox;
    //datepicker
    DatePicker enddatepicker;
    //spinner
    Spinner experianceSpinner, numberofvacanciesSpinner;
    //textarea
    TextArea jobdescriptionTextArea;
    ToggleGroup radioGroup;
    RadioButton maleRadioButton, femaleRadioButton;
    //containers
    HBox h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11;
    VBox v1, v2;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        newjoborderLabel = new Label("New Job Order");
        jobtitleLabel = new Label("Job Title:");
        skillLabel = new Label("Skill:");
        genderLabel = new Label("Gender:");
        enddateLabel = new Label("End Date:");
        experiancerequiredLabel = new Label("Experiance:");
        educationlevelLabel = new Label("Education Level:");
        numberofvacanciesLabel = new Label("Number of Vacancies:");
        jobdescriptionLabel = new Label("Job Description:");
        //--------------------------------------------------------------------//
        jobtitleTextField = new TextField();
        //--------------------------------------------------------------------//
        maleRadioButton = new RadioButton("Male");
        femaleRadioButton = new RadioButton("Female");
        radioGroup = new ToggleGroup();
        //--------------------------------------------------------------------//
        educationlevelChoiceBox = new ComboBox();
        skillChoiceBox = new ComboBox();
        //--------------------------------------------------------------------//
        experianceSpinner = new Spinner(1, 10, 1);
        numberofvacanciesSpinner = new Spinner(1, 100, 1);
        //--------------------------------------------------------------------//
        jobdescriptionTextArea = new TextArea();
        //--------------------------------------------------------------------//
        enddatepicker = new DatePicker();
        //--------------------------------------------------------------------//
        h1 = new HBox(10);
        h2 = new HBox(10);
        h3 = new HBox(10);
        h4 = new HBox(10);
        h5 = new HBox(10);
        h6 = new HBox(10);
        h7 = new HBox(10);
        h8 = new HBox(10);
        h9 = new HBox(10);
        h10 = new HBox(10);
        h11 = new HBox(0);
        v1 = new VBox(10);
        v2 = new VBox(10);
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(newjoborderLabel);
        h2.getChildren().addAll(jobtitleLabel, jobtitleTextField);
        h3.getChildren().addAll(skillLabel, skillChoiceBox);
        h4.getChildren().addAll(enddateLabel, enddatepicker);
        radioGroup.getToggles().addAll(maleRadioButton,femaleRadioButton);
        h5.getChildren().addAll(genderLabel, maleRadioButton, femaleRadioButton);
        h6.getChildren().addAll(experiancerequiredLabel, experianceSpinner);
        h7.getChildren().addAll(educationlevelLabel, educationlevelChoiceBox);
        h8.getChildren().addAll(numberofvacanciesLabel, numberofvacanciesSpinner);
        h9.getChildren().addAll(jobdescriptionLabel, jobdescriptionTextArea);
        h10.getChildren().addAll(submitButton, resetButton);
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(h2, h3, h4, h5);
        v2.getChildren().addAll(h6, h7, h8, h9);
        h11.getChildren().addAll(v1, v2);
        //--------------------------------------------------------------------//
        getChildren().addAll(h1, h11, h10);
        //--------------------------------------------------------------------//

    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        newjoborderLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        //--------------------------------------------------------------------//
        jobtitleLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.15));
        jobtitleTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.35));
        skillLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.15));
        skillChoiceBox.prefWidthProperty().bind(h3.widthProperty().multiply(0.35));
        enddateLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.15));
        enddatepicker.prefWidthProperty().bind(h4.widthProperty().multiply(0.35));
        genderLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        maleRadioButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.15));
        femaleRadioButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.15));
        experianceSpinner.prefWidthProperty().bind(h6.widthProperty().multiply(0.35));
        experiancerequiredLabel.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        educationlevelLabel.prefWidthProperty().bind(h7.widthProperty().multiply(0.15));
        educationlevelChoiceBox.prefWidthProperty().bind(h7.widthProperty().multiply(0.35));
        numberofvacanciesLabel.prefWidthProperty().bind(h8.widthProperty().multiply(0.15));
        numberofvacanciesSpinner.prefWidthProperty().bind(h8.widthProperty().multiply(0.35));
        jobdescriptionLabel.prefWidthProperty().bind(h9.widthProperty().multiply(0.15));
        jobdescriptionTextArea.prefWidthProperty().bind(h9.widthProperty().multiply(0.35));
        jobdescriptionTextArea.prefHeightProperty().bind(h9.heightProperty());
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(h11.widthProperty().multiply(0.5));
        v1.prefHeightProperty().bind(h11.heightProperty());
        v2.prefWidthProperty().bind(h11.widthProperty().multiply(0.5));
        v2.prefHeightProperty().bind(h11.heightProperty());
        //--------------------------------------------------------------------//
        h11.prefHeightProperty().bind(heightProperty().multiply(0.5));
        h11.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h6.prefWidthProperty().bind(v2.widthProperty());
        h7.prefWidthProperty().bind(v2.widthProperty());
        h8.prefWidthProperty().bind(v2.widthProperty());
        h9.prefWidthProperty().bind(v2.widthProperty());
        h9.prefHeightProperty().bind(v2.heightProperty().multiply(0.2));
        h10.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        h8.setAlignment(Pos.CENTER);
        h9.setAlignment(Pos.CENTER);
        h10.setAlignment(Pos.CENTER);
        h11.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
    }

    public TextField getJobtitleTextField() {
        return jobtitleTextField;
    }

    public ComboBox getSkillChoiceBox() {
        return skillChoiceBox;
    }

    public ComboBox getEducationlevelChoiceBox() {
        return educationlevelChoiceBox;
    }

    public DatePicker getEnddatepicker() {
        return enddatepicker;
    }

    public Spinner getExperianceSpinner() {
        return experianceSpinner;
    }

    public Spinner getNumberofvacanciesSpinner() {
        return numberofvacanciesSpinner;
    }

    public TextArea getJobdescriptionTextArea() {
        return jobdescriptionTextArea;
    }

}
