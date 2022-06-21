package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AddJobContractSubView extends SubView {

    Label evaluationLabel, startDateLabel, endDateLabel, negotiatedTermsLabel;
    ComboBox evaluationChoiceBox;
    TextArea negotiatedTermsTextArea;
    DatePicker startDate, endDate;

    @Override
    public void init() {
        title = "Add Job Contract";
        //--------------------------------------------------------------------//
        titleLabel = new Label("New Job Contract");
        titleLabel.setId("titleLabel");
        evaluationLabel = new Label("Evaluation:");
        startDateLabel = new Label("Start Date:");
        endDateLabel = new Label("End Date:");
        negotiatedTermsLabel = new Label("Negotiated Terms:");
        //--------------------------------------------------------------------//
        evaluationChoiceBox = new ComboBox();
        //--------------------------------------------------------------------//
        negotiatedTermsTextArea = new TextArea();
        //--------------------------------------------------------------------//
        startDate = new DatePicker();
        endDate = new DatePicker();
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(evaluationLabel, evaluationChoiceBox);
        h3.getChildren().addAll(startDateLabel, startDate);
        h4.getChildren().addAll(endDateLabel, endDate);
        h5.getChildren().addAll(negotiatedTermsLabel, negotiatedTermsTextArea);
        h6.getChildren().addAll(submitButton, resetButton, closeButton);
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6);
        //--------------------------------------------------------------------//
        getChildren().addAll(v1);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        evaluationLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        evaluationChoiceBox.prefWidthProperty().bind(h2.widthProperty().multiply(0.5));
        startDateLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        startDate.prefWidthProperty().bind(h3.widthProperty().multiply(0.5));
        endDateLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        endDate.prefWidthProperty().bind(h4.widthProperty().multiply(0.5));
        negotiatedTermsLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.2));
        negotiatedTermsTextArea.prefWidthProperty().bind(h5.widthProperty().multiply(0.5));
        negotiatedTermsTextArea.prefHeightProperty().bind(h5.heightProperty().multiply(0.2));
        //--------------------------------------------------------------------//
        //
        submitButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        resetButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));
        closeButton.prefWidthProperty().bind(h6.widthProperty().multiply(0.15));

        //
        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h4.prefWidthProperty().bind(v1.widthProperty());
        h5.prefWidthProperty().bind(v1.widthProperty());
        h5.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h6.prefWidthProperty().bind(v1.widthProperty());
        //--------------------------------------------------------------------//
        v1.prefHeightProperty().bind(heightProperty());
        v1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        v1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        h6.setAlignment(Pos.CENTER);
        h7.setAlignment(Pos.CENTER);
        evaluationLabel.setAlignment(Pos.CENTER_LEFT);
        titleLabel.setAlignment(Pos.CENTER);
        startDateLabel.setAlignment(Pos.CENTER_LEFT);
        endDateLabel.setAlignment(Pos.CENTER_LEFT);
        negotiatedTermsLabel.setAlignment(Pos.CENTER_LEFT);
        setAlignment(Pos.CENTER);

    }

    public ComboBox getEvaluationChoiceBox() {
        return evaluationChoiceBox;
    }

    public TextArea getNegotiatedTermsTextArea() {
        return negotiatedTermsTextArea;
    }

    public DatePicker getStartDate() {
        return startDate;
    }

    public DatePicker getEndDate() {
        return endDate;
    }

}
