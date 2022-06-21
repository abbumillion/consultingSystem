package Navigations;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddEvaluationSubView extends SubView {

    //labels
    Label titleLabel, interviewsLabel, remarksLabel, dateandtimeLabel;
    //textfields and textareas
    TextArea remarksTextArea;
    ComboBox interviewsChoiceBox;
    DatePicker datepicker;
    //------------------------------------------------------------------------//
    HBox h1, h2, h3, h4, h5;
    VBox v1, v2, v3, v4, v5;
    //------------------------------------------------------------------------//

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        //--------------------------------------------------------------------//
        v1 = new VBox(30);
        v2 = new VBox(20);
        v3 = new VBox(20);
        v4 = new VBox(20);
        v5 = new VBox(20);
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
        h5.getChildren().addAll(submitButton, resetButton);
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
