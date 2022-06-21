package Navigations;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddSkillSubView extends SubView {

    //labels
    Label titleLabel, SkillNameLabel, SkillInformationLabel;
    //textfields and textareas
    TextField SkillNameTextField;
    TextArea SkillInformationTextArea;

    //buttons
    HBox h1, h2, h3, h4, h5;
    VBox v1;

    @Override
    public void init() {
        //
        h1 = new HBox(20);
        h2 = new HBox(20);
        h3 = new HBox(20);
        h4 = new HBox(20);
        h5 = new HBox(20);
        //
        v1 = new VBox(30);
        //
        titleLabel = new Label("New Skill");
        titleLabel.setId("titleLabel");
        SkillNameLabel = new Label("Skill Name:");
        SkillInformationLabel = new Label("Skill Information:");
        //
        SkillNameTextField = new TextField();
        SkillInformationTextArea = new TextArea();
        //
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(SkillNameLabel, SkillNameTextField);
        h3.getChildren().addAll(SkillInformationLabel, SkillInformationTextArea);
        h4.getChildren().addAll(submitButton, resetButton);
        v1.getChildren().addAll(h1, h2, h3, h4);
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty().multiply(0.7));

        h1.prefWidthProperty().bind(v1.widthProperty());
        h2.prefWidthProperty().bind(v1.widthProperty());
        h3.prefWidthProperty().bind(v1.widthProperty());
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.3));
        h4.prefWidthProperty().bind(v1.widthProperty());

        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        SkillNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.2));
        SkillNameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.3));
        SkillInformationLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.2));
        SkillInformationTextArea.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));

        submitButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.15));
        resetButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.15));

    }

    @Override
    public void alignElements() {
        titleLabel.setAlignment(Pos.CENTER);
        SkillNameLabel.setAlignment(Pos.CENTER_LEFT);
        SkillInformationLabel.setAlignment(Pos.CENTER_LEFT);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);

    }

    public TextField getSkillNameTextField() {
        return SkillNameTextField;
    }

    public TextArea getSkillInformationTextArea() {
        return SkillInformationTextArea;
    }

}
