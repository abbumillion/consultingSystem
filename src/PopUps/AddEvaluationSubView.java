package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AddEvaluationSubView extends SubView {

    //labels
    Label interviewsLabel, remarksLabel, dateandtimeLabel;
    //textfields and textareas
    TextArea remarksTextArea;
    ComboBox interviewsChoiceBox;
    DatePicker datepicker;
    //------------------------------------------------------------------------//-----------------------------------------------//

    @Override
    public void init() {
        title = "Add Evaluation";
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        titleLabel = new Label("Interview Evalution");
        titleLabel.setId("titleLabel");
        interviewsLabel = new Label("Interviews:");
        dateandtimeLabel = new Label("Date:");
        remarksLabel = new Label("Remarks:");
        //--------------------------------------------------------------------//
        interviewsChoiceBox = new ComboBox();
        //
        datepicker = new DatePicker();
        //--------------------------------------------------------------------//
        remarksTextArea = new TextArea();
        //--------------------------------------------------------------------//

    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(interviewsLabel, interviewsChoiceBox);
        h3.getChildren().addAll(dateandtimeLabel, datepicker);
        h4.getChildren().addAll(remarksLabel, remarksTextArea);
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
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.3));
        h5.prefWidthProperty().bind(v1.widthProperty());
        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        interviewsLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        interviewsChoiceBox.prefWidthProperty().bind(h2.widthProperty().multiply(0.3));
        dateandtimeLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        datepicker.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));
        remarksLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        remarksTextArea.prefHeightProperty().bind(h4.heightProperty());
        remarksTextArea.prefWidthProperty().bind(h4.widthProperty().multiply(0.3));
        submitButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.1));
        resetButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.1));
        closeButton.prefWidthProperty().bind(h5.widthProperty().multiply(0.1));
    }

    @Override
    public void alignElements() {
        titleLabel.setAlignment(Pos.CENTER);
        interviewsLabel.setAlignment(Pos.CENTER_LEFT);
        dateandtimeLabel.setAlignment(Pos.CENTER_LEFT);
        remarksLabel.setAlignment(Pos.CENTER_LEFT);

        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        v3.setAlignment(Pos.CENTER);

    }

    public ComboBox getInterviewsChoiceBox() {
        return interviewsChoiceBox;
    }

    public DatePicker getDatepicker() {
        return datepicker;
    }

    public TextArea getRemarksTextArea() {
        return remarksTextArea;
    }

}
