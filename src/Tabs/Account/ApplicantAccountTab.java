package Tabs.Account;

import javafx.scene.control.Label;

public class ApplicantAccountTab extends UserAccountTab {

    Label SkillCategoryLabel, EducationalInformationLabel;

    


    @Override
    public void init() {
        titleLabel = new Label("Applicant Account");
        SkillCategoryLabel = new Label("Skill Category");
        EducationalInformationLabel = new Label("Educational Information");

    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll( firstnameLabel, lastnameLabel);
        h3.getChildren().addAll( emailLabel, dateofbirthLabel);
        h4.getChildren().addAll(genderLabel);
        h5.getChildren().addAll(SkillCategoryLabel);
        h6.getChildren().addAll(EducationalInformationLabel);
        //
        v1.getChildren().addAll(h1, h2, h3, h4, h5, h6);
        //
        getChildren().addAll(v1);
        //
    }

    @Override
    public void bindings() {
    }

    @Override
    public void alignElements() {
    }

}
