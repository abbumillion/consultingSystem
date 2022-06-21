package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import DomainObjects.Company;
import DomainObjects.Job;
import DomainObjects.SkillCategory;
import Models.Model;
import PopUps.AddJobOrderSubView;
import Tabs.Listviews.SkillCategoryCell;
import ViewsBase.SubView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class JobOrderController extends SubViewController {

    AddJobOrderSubView v;
    Company company;

    public JobOrderController(SubView subView, Model model) {
        super(subView, model);
        v = (AddJobOrderSubView) subView;
    }

    @Override
    public void RegisterEvents() {
        //
        //
        v.getEducationlevelChoiceBox().getItems().add("University or College Degree ");
        v.getEducationlevelChoiceBox().getItems().add("Masters degree");
        v.getEducationlevelChoiceBox().getItems().add("PHD");
        v.getEducationlevelChoiceBox().getItems().add("Grade 10");
        v.getEducationlevelChoiceBox().getItems().add("Grade 12");
        v.getEducationlevelChoiceBox().getItems().add("Professor");
        v.getEducationlevelChoiceBox().getItems().add("Doctrate");
        v.getEducationlevelChoiceBox().getItems().add("Assistant Professor");
        //
        //
        v.getSkillCategoryChoiceBox().getItems().addAll(model.getSkillCategoryModel().getSkillCategories());
        v.getSkillCategoryChoiceBox().setCellFactory(new Callback<ListView<SkillCategory>, ListCell<SkillCategory>>() {
            @Override
            public ListCell<SkillCategory> call(ListView<SkillCategory> param) {
                return new SkillCategoryCell();
                //
                //
            }
        });

        v.getResetButton().setOnAction(e -> {
            //
            //
            //
            //
            //
            v.getJobtitleTextField().setText("");
            v.getJobdescriptionTextArea().setText("");
            v.getSkillCategoryChoiceBox().getSelectionModel().select(null);
            v.getEducationlevelChoiceBox().getSelectionModel().select(null);
            v.getEnddatepicker().setValue(null);
          //  v.getNumberofvacanciesSpinner()
        });

        v.getSubmitButton().setOnAction(e -> {
            //
            if (v.getJobtitleTextField().getText().isEmpty() | v.getJobdescriptionTextArea().getText().isEmpty()|
                    v.getSalaryTextField().getText().isEmpty()|v.getSkillCategoryChoiceBox().getSelectionModel().getSelectedItem()==null|
                    v.getEducationlevelChoiceBox().getSelectionModel().getSelectedItem()==null) {
                //
                //
                //
                //
                //
                System.out.println("Empty Field please fill the fields first.");
                //
                //
                //

            } else {
                //add job to the database
                //
                String jobtitle = v.getJobtitleTextField().getText();
                String jobdescription = v.getJobtitleTextField().getText();
                String enddate = v.getEnddatepicker().getValue().toString();
                int vacancy = (int) v.getNumberofvacanciesSpinner().getValue();
                int experiance = (int) v.getExperianceSpinner().getValue();
                String educationlevel = v.getEducationlevelChoiceBox().getSelectionModel().getSelectedItem().toString();
                String salary = v.getSalaryTextField().getText();
                //
                //
                Job.JobBuilder jobBuilder = new Job.JobBuilder();
                //
                //
                Job build = jobBuilder.EducationalLevel(educationlevel).Salary(salary).EmployerCompany(company).EndDate(enddate).JobDescription(jobdescription).JobTitle(jobtitle).ExperianceReq(experiance).build();
              //  model.getJobModel().InsertJob(build);
                //
            }

        });

    }

    @Override
    public void StartController() {
        //
        //
        //
        v.showView();
        //
        //
        //
    }

    public void setCompany(Company cmpy) {
        company = cmpy;
    }

}
