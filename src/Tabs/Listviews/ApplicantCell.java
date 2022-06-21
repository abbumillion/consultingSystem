package Tabs.Listviews;

import DomainObjects.Applicant;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class ApplicantCell extends ListCell {

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);
        Label ApplicantNameLabel, CellPhoneLabel, EmailLabel, GenderLabel, SkillCategoryLabel, EducationLevelLabel, AddressLabel;
        HBox h1;
        //--------------------------------------------------------------------//
        ApplicantNameLabel = new Label("full name");
        CellPhoneLabel = new Label("Cell Phone");
        EmailLabel = new Label("Email");
        GenderLabel = new Label("Website");
        SkillCategoryLabel = new Label("Skill Category");
        EducationLevelLabel = new Label("Education level");
        AddressLabel = new Label("Address");
        h1 = new HBox(10);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(ApplicantNameLabel, CellPhoneLabel,
                EmailLabel, GenderLabel, SkillCategoryLabel, EducationLevelLabel, AddressLabel);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        ApplicantNameLabel.setAlignment(Pos.CENTER_LEFT);
        CellPhoneLabel.setAlignment(Pos.CENTER_LEFT);
        EmailLabel.setAlignment(Pos.CENTER_LEFT);
        GenderLabel.setAlignment(Pos.CENTER_LEFT);
        SkillCategoryLabel.setAlignment(Pos.CENTER_LEFT);
        EducationLevelLabel.setAlignment(Pos.CENTER_LEFT);
        AddressLabel.setAlignment(Pos.CENTER_LEFT);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        ApplicantNameLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.1));
        CellPhoneLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        EmailLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.1));
        GenderLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        SkillCategoryLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        EducationLevelLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.05));
        AddressLabel.prefWidthProperty().bind(h1.widthProperty().multiply(0.1));
        //--------------------------------------------------------------------//

        if (item != null) {
            Applicant ap = (Applicant) item;
            ApplicantNameLabel.setText(ap.getLastName() + "," + ap.getFirstName());
            CellPhoneLabel.setText(ap.getCellPhone());
            EmailLabel.setText(ap.getEmail());
            GenderLabel.setText(ap.getGender());
//            SkillCategoryLabel.setText(ap.getSkillCategory().getSkillCategoryName());
            EducationLevelLabel.setText(ap.getEducationLevel());
//            AddressLabel.setText(ap.getAddress().getCountry() + "," + ap.getAddress().getState() + "," + ap.getAddress().getCity());
        }

        setGraphic(h1);
    }

}
