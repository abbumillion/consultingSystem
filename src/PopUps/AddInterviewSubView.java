package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class AddInterviewSubView extends SubView {

    //labels
    Label jobApplicationsLabel, dateandtimeLabel, interviewtypeLabel;
    //
    ComboBox jobapplicationsChoiceBox, interviewtypeChoiceBox;
    //------------------------------------------------------------------------//
    DatePicker datepicker;
    //------------------------------------------------------------------------//

    //------------------------------------------------------------------------//
    @Override
    public void init() {
        title = "Add Interview";
        //--------------------------------------------------------------------//
        //
        datepicker = new DatePicker();
        //--------------------------------------------------------------------//
        titleLabel = new Label("Interview Schedule");
        titleLabel.setId("titleLabel");
        jobApplicationsLabel = new Label("Job Applications:");
        interviewtypeLabel = new Label("Interview Type:");
        dateandtimeLabel = new Label("Interview Date:");
        //--------------------------------------------------------------------//
        jobapplicationsChoiceBox = new ComboBox();
        interviewtypeChoiceBox = new ComboBox();
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(jobApplicationsLabel, jobapplicationsChoiceBox);
        h3.getChildren().addAll(dateandtimeLabel, datepicker);
        h4.getChildren().addAll(interviewtypeLabel, interviewtypeChoiceBox);
        h5.getChildren().addAll(submitButton, resetButton, closeButton);
        v1.getChildren().addAll(h1, h2, h3, h4, h5);
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty().multiply(0.7));

        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h5.prefWidthProperty().bind(v1.widthProperty());

        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        jobApplicationsLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        jobapplicationsChoiceBox.prefWidthProperty().bind(h2.widthProperty().multiply(0.5));
        dateandtimeLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        datepicker.prefWidthProperty().bind(h3.widthProperty().multiply(0.5));
        interviewtypeLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        interviewtypeChoiceBox.prefWidthProperty().bind(h3.widthProperty().multiply(0.5));
        submitButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.15));
        resetButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.15));
        closeButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.15));

    }

    @Override
    public void alignElements() {
        titleLabel.setAlignment(Pos.CENTER);
        jobApplicationsLabel.setAlignment(Pos.CENTER_LEFT);
        dateandtimeLabel.setAlignment(Pos.CENTER_LEFT);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);
    }

    public ComboBox getJobapplicationsChoiceBox() {
        return jobapplicationsChoiceBox;
    }

    public DatePicker getDatepicker() {
        return datepicker;
    }

    public ComboBox getInterviewTypeChoiceBox() {
        return interviewtypeChoiceBox;
    }

}
