package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddSkillCategorySubView extends SubView {
    Label skillCategoryNameLabel, skillCategoryInformationLabel;
    TextArea skillCategoryInformationTextArea;
    TextField skillCategoryNameTextField;

    @Override
    public void init() {
        title = "Add Skill Category";
        titleLabel = new Label("New Skill Category");
        skillCategoryNameLabel = new Label("Skill Category Name:");
        skillCategoryInformationLabel = new Label("Skill Category Information:");
        skillCategoryNameTextField = new TextField();
        skillCategoryInformationTextArea = new TextArea();

    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(skillCategoryNameLabel, skillCategoryNameTextField);
        h3.getChildren().addAll(skillCategoryInformationLabel, skillCategoryInformationTextArea);
        h4.getChildren().addAll(submitButton, resetButton, closeButton);
        //--------------------------------------------------------------------//
        v1.getChildren().addAll(h1, h2, h3, h4);
        //--------------------------------------------------------------------//
        getChildren().addAll(v1);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        titleLabel.prefHeightProperty().bind(h1.heightProperty());
        titleLabel.prefWidthProperty().bind(h1.widthProperty());
        //
        skillCategoryNameLabel.prefHeightProperty().bind(h2.heightProperty().multiply(0.5));
        skillCategoryNameLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.3));
        //
        skillCategoryNameTextField.prefHeightProperty().bind(h2.heightProperty().multiply(0.3));
        skillCategoryNameTextField.prefWidthProperty().bind(h2.widthProperty().multiply(0.5));
        //
        skillCategoryInformationLabel.prefHeightProperty().bind(h3.heightProperty().multiply(0.5));
        skillCategoryInformationLabel.prefWidthProperty().bind(h3.widthProperty().multiply(0.3));
        //
        skillCategoryInformationTextArea.prefHeightProperty().bind(h3.heightProperty());
        skillCategoryInformationTextArea.prefWidthProperty().bind(h3.widthProperty().multiply(0.5));
        //
        submitButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.2));
        submitButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        //
        resetButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.2));
        resetButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        //
        closeButton.prefHeightProperty().bind(h4.heightProperty().multiply(0.2));
        closeButton.prefWidthProperty().bind(h4.widthProperty().multiply(0.2));
        //
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        h1.prefWidthProperty().bind(v1.widthProperty());
        //
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h2.prefWidthProperty().bind(v1.widthProperty());
        //
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.4));
        h3.prefWidthProperty().bind(v1.widthProperty());
        //
        h4.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h4.prefWidthProperty().bind(v1.widthProperty());
        //
        v1.prefHeightProperty().bind(heightProperty());
        v1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);
        //
        titleLabel.setAlignment(Pos.CENTER);
        skillCategoryNameLabel.setAlignment(Pos.CENTER_LEFT);
        skillCategoryInformationLabel.setAlignment(Pos.CENTER_LEFT);
        h1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);

        titleLabel.setId("font-20");
        skillCategoryNameLabel.setId("font-14");
        skillCategoryInformationLabel.setId("font-14");

    }

    public TextArea getSkillCategoryInformationTextArea() {
        return skillCategoryInformationTextArea;
    }

    public TextField getSkillCategoryNameTextField() {
        return skillCategoryNameTextField;
    }

}
