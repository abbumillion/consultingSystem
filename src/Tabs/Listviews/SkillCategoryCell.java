package Tabs.Listviews;

import DomainObjects.SkillCategory;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class SkillCategoryCell extends ListCell {

    Label skillCategoryNameLabel;
    HBox h1;
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        skillCategoryNameLabel = new Label("Company Label");
        skillCategoryNameLabel.setId("font-12");
        h1 = new HBox(0);
        h1.getChildren().addAll(skillCategoryNameLabel);
        if (item != null) {
            //
            //
            //
            //
            SkillCategory skillCategory = (SkillCategory) item;
            skillCategoryNameLabel.setText(skillCategory.getSkillCategoryName());
            //
            //
            //
            //
        }
        //
        skillCategoryNameLabel.setAlignment(Pos.CENTER);
       // h1.prefWidthProperty().bind(widthProperty());
       // skillCategoryNameLabel.prefWidthProperty().bind(widthProperty().multiply(0.4));
        setGraphic(h1);
        //
    }
    
    

}
