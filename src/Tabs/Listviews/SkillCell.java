package Tabs.Listviews;

import DomainObjects.Skill;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class SkillCell extends ListCell {

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        //
        Label skillNameLabel, skillCategoryLabel, skillInformationLabel;
        skillNameLabel = new Label("Skill Name");
        skillCategoryLabel = new Label("Skill Category");
        skillInformationLabel = new Label("Skill Information");
        HBox h = new HBox(10);
        //
        h.prefWidthProperty().bind(widthProperty());
        skillCategoryLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        skillNameLabel.prefWidthProperty().bind(widthProperty().multiply(0.2));
        skillInformationLabel.prefWidthProperty().bind(widthProperty().multiply(0.55));
        //
        skillNameLabel.setAlignment(Pos.CENTER);
        skillCategoryLabel.setAlignment(Pos.CENTER);
        skillInformationLabel.setAlignment(Pos.CENTER);
        //
        h.getChildren().addAll(skillNameLabel, skillCategoryLabel, skillInformationLabel);
        if (item != null) {
            //
            Skill skill = (Skill) item;
            skillNameLabel.setText(skill.getSkillName());
            skillCategoryLabel.setText(skill.getSkillCategory().getSkillCategoryName());
            skillInformationLabel.setText(skill.getSkillInformation());
            //
        }
    }

}
