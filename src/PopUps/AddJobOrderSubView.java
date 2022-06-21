package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AddJobOrderSubView extends SubView {

    //labels
    Label newjoborderLabel, jobtitleLabel, genderLabel, skillLabel, enddateLabel, experiancerequiredLabel, salaryLabel, educationlevelLabel, numberofvacanciesLabel, jobdescriptionLabel;
    //textfields
    TextField jobtitleTextField, salaryTextField;
    //choice boxes
    ComboBox SkillCategoryChoiceBox, educationlevelChoiceBox;
    //datepicker
    DatePicker enddatepicker;
    //spinner
    Spinner experianceSpinner, numberofvacanciesSpinner;
    //textarea
    TextArea jobdescriptionTextArea;
    ToggleGroup radioGroup;
    RadioButton maleRadioButton, femaleRadioButton;

    @Override
    public void init() {
        title = "Add Job Order";
        //--------------------------------------------------------------------//
        newjoborderLabel = new Label("New Job Order");
        newjoborderLabel.setId("font-26");
        jobtitleLabel = new Label("Job Title:");
        skillLabel = new Label("Skill Category:");
        genderLabel = new Label("Gender:");
        enddateLabel = new Label("End Date:");
        salaryLabel = new Label("Salary:");
        experiancerequiredLabel = new Label("Experiance:");
        educationlevelLabel = new Label("Education Level:");
        numberofvacanciesLabel = new Label("Number of Vacancies:");
        jobdescriptionLabel = new Label("Job Description:");
        //--------------------------------------------------------------------//
        jobtitleTextField = new TextField();
        salaryTextField = new TextField();
        //--------------------------------------------------------------------//
        maleRadioButton = new RadioButton("Male");
        femaleRadioButton = new RadioButton("Female");
        radioGroup = new ToggleGroup();
        //--------------------------------------------------------------------//
        educationlevelChoiceBox = new ComboBox();
        SkillCategoryChoiceBox = new ComboBox();
        //--------------------------------------------------------------------//
        experianceSpinner = new Spinner(1, 10, 1);
        numberofvacanciesSpinner = new Spinner(1, 100, 1);
        //--------------------------------------------------------------------//
        jobdescriptionTextArea = new TextArea();
        //--------------------------------------------------------------------//
        enddatepicker = new DatePicker();
        //--------------------------------------------------------------------//
        v1.setSpacing(20);
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(newjoborderLabel);
        h2.getChildren().addAll(jobtitleLabel, jobtitleTextField);
        h3.getChildren().addAll(skillLabel, SkillCategoryChoiceBox);
        h4.getChildren().addAll(enddateLabel, enddatepicker);
        radioGroup.getToggles().addAll(maleRadioButton, femaleRadioButton);
        h5.getChildren().addAll(genderLabel, maleRadioButton, femaleRadioButton);
        h6.getChildren().addAll(experiancerequiredLabel, experianceSpinner);
        h7.getChildren().addAll(educationlevelLabel, educationlevelChoiceBox);
        h8.getChildren().addAll(numberofvacanciesLabel, numberofvacanciesSpinner);
        h9.getChildren().addAll(salaryLabel, salaryTextField);
        h10.getChildren().addAll(jobdescriptionLabel, jobdescriptionTextArea);
        h11.getChildren().addAll(submitButton, resetButton, closeButton);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        getChildren().addAll(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11);
        //--------------------------------------------------------------------//

    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        newjoborderLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        //--------------------------------------------------------------------//
        jobtitleLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        jobtitleTextField.prefWidthProperty().bind(widthProperty().multiply(0.6));
        skillLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        SkillCategoryChoiceBox.prefWidthProperty().bind(widthProperty().multiply(0.6));
        enddateLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        enddatepicker.prefWidthProperty().bind(widthProperty().multiply(0.6));
        genderLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        maleRadioButton.prefWidthProperty().bind(widthProperty().multiply(0.3));
        femaleRadioButton.prefWidthProperty().bind(widthProperty().multiply(0.3));
        experianceSpinner.prefWidthProperty().bind(widthProperty().multiply(0.6));
        experiancerequiredLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        educationlevelLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        educationlevelChoiceBox.prefWidthProperty().bind(widthProperty().multiply(0.6));
        numberofvacanciesLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        numberofvacanciesSpinner.prefWidthProperty().bind(widthProperty().multiply(0.6));
        salaryLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        salaryTextField.prefWidthProperty().bind(widthProperty().multiply(0.6));
        jobdescriptionLabel.prefWidthProperty().bind(widthProperty().multiply(0.15));
        jobdescriptionTextArea.prefWidthProperty().bind(widthProperty().multiply(0.6));
        jobdescriptionTextArea.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(widthProperty());
        h2.prefWidthProperty().bind(widthProperty());
        h3.prefWidthProperty().bind(widthProperty());
        h4.prefWidthProperty().bind(widthProperty());
        h5.prefWidthProperty().bind(widthProperty());
        h6.prefWidthProperty().bind(widthProperty());
        h7.prefWidthProperty().bind(widthProperty());
        h8.prefWidthProperty().bind(widthProperty());
        h9.prefWidthProperty().bind(widthProperty());
        h10.prefHeightProperty().bind(heightProperty().multiply(0.3));
        h10.prefWidthProperty().bind(widthProperty());
        h11.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        jobtitleLabel.setAlignment(Pos.CENTER);
        skillLabel.setAlignment(Pos.CENTER);
        enddateLabel.setAlignment(Pos.CENTER);
        genderLabel.setAlignment(Pos.CENTER);
        experiancerequiredLabel.setAlignment(Pos.CENTER);
        educationlevelLabel.setAlignment(Pos.CENTER);
        numberofvacanciesLabel.setAlignment(Pos.CENTER);
        salaryLabel.setAlignment(Pos.CENTER);
        jobdescriptionLabel.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);

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

    public ComboBox getSkillCategoryChoiceBox() {
        return SkillCategoryChoiceBox;
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

    public TextField getSalaryTextField() {
        return salaryTextField;
    }

    public ToggleGroup getGenderRadioGroup() {
        return radioGroup;
    }

}
