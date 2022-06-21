package Tabs.Listviews;

import DomainObjects.JobApplication;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class JobApplicationCell extends ListCell {

    @Override
    protected void updateItem(Object item, boolean empty) {
        super.updateItem(item, empty);

        Label applicantNameLabel, applicantSkillCategoryLabel, jobTitleLabel, emailLabel;
        HBox h1;
        //--------------------------------------------------------------------//
        applicantNameLabel = new Label("applicant Label");
        applicantSkillCategoryLabel = new Label("skill information");
        jobTitleLabel = new Label("job title");
        //  websiteLabel = new Label("Website");
        h1 = new HBox(10);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(applicantNameLabel, applicantSkillCategoryLabel);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        //  companyNameLabel.setAlignment(Pos.CENTER);
        //  companyTypeLabel.setAlignment(Pos.CENTER);
       // emailLabel.setAlignment(Pos.CENTER);
        //   websiteLabel.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(widthProperty());
        //--------------------------------------------------------------------//
        //  companyNameLabel.prefWidthProperty().bind(widthProperty());
        //   companyTypeLabel.prefWidthProperty().bind(widthProperty());
       // emailLabel.prefWidthProperty().bind(widthProperty());
        // websiteLabel.prefWidthProperty().bind(widthProperty());

        if (item != null) {
            //
            //
            //
            JobApplication jobApplication = (JobApplication) item;
            String firstname = jobApplication.getApplicant().getFirstName();
            String lastname = jobApplication.getApplicant().getLastName();
            String email = jobApplication.getApplicant().getEmail();
            String gender = jobApplication.getApplicant().getFirstName();
            //   String firstname = jobApplication.getApplicant().getFirstName();
            //   String firstname = jobApplication.getApplicant().getFirstName();
            // String firstname = jobApplication.getApplicant().getFirstName();
            //String firstname = jobApplication.getApplicant().getFirstName();

            //
            applicantNameLabel.setText(firstname);
            applicantSkillCategoryLabel.setText(lastname);
            // emailLabel.setText(jobApplication);
            //  websiteLabel.setText(Pos.CENTER);
        }
        //--------------------------------------------------------------------//
        setGraphic(h1);
    }

}
