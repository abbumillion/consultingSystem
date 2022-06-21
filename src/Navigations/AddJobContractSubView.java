package Navigations;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddJobContractSubView extends SubView {

    Label titleLabel, evaluationLabel, startDateLabel, endDateLabel, negotiatedTermsLabel;
    ComboBox evaluationChoiceBox;
    TextArea negotiatedTermsTextArea;
    DatePicker startDate, endDate;

    HBox h1, h2, h3, h4, h5, h6, h7;
    VBox v1, v2, v3, v4, v5;

    @Override
    public void init() {
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
        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        h6 = new HBox(20);
        h7 = new HBox(20);
        //--------------------------------------------------------------------//
        v1 = new VBox(30);
        v2 = new VBox(20);
        v3 = new VBox(20);
        v4 = new VBox(20);
        v5 = new VBox(20);
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
        h6.getChildren().addAll(submitButton, resetButton);
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
        evaluationLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.3));
        evaluationChoiceBox.prefWidthProperty().bind(h2.widthProperty().multiply(0.4));
        startDateLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));
        startDate.prefWidthProperty().bind(h3.widthProperty().multiply(0.4));
        endDateLabel.prefWidthProperty().bind(h4.widthProperty().multiply(0.3));
        endDate.prefWidthProperty().bind(h4.widthProperty().multiply(0.4));
        negotiatedTermsLabel.prefWidthProperty().bind(h5.widthProperty().multiply(0.3));
        negotiatedTermsTextArea.prefWidthProperty().bind(h5.widthProperty().multiply(0.4));
        negotiatedTermsTextArea.prefHeightProperty().bind(h5.heightProperty().multiply(0.2));
        //--------------------------------------------------------------------//
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
