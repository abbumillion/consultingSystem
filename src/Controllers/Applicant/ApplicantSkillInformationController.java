package Controllers.Applicant;

import Controllers.ViewController;
import DomainObjects.Applicant;
import DomainObjects.Authenticable;
import DomainObjects.SkillCategory;
import Factories.ViewFactory;
import Tabs.Listviews.SkillCategoryCell;
import Models.Model;
import Views.Applicant.ApplicantSkillInformationView;
import ViewsBase.View;
import ViewsBase.ViewType;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ApplicantSkillInformationController extends ViewController {

    Authenticable authenticable;

    ApplicantSkillInformationView v;

    public ApplicantSkillInformationController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {
        v = (ApplicantSkillInformationView) view;
        PrepareChoiceBoxs();
        //
        //
        //
        //
        v.getNextButton().setOnAction(e -> {
            //

            if (v.getSkillCategoryChoiceBox().getSelectionModel().getSelectedItem() == null
                    | v.getEducationlevelChoiceBox().getSelectionModel().getSelectedItem() == null) {
                v.EmptyFieldAlert();
            } else {
                SkillCategory skillCategory = (SkillCategory) v.getSkillCategoryChoiceBox().getSelectionModel().getSelectedItem();
                String educationlevel = v.getEducationlevelChoiceBox().getSelectionModel().getSelectedItem().toString();
                Applicant applicant = (Applicant) getAuthenticable();
                ApplicantHomeController ahc = new ApplicantHomeController(ViewFactory.getView(ViewType.APPLICANTHOMEVIEW), model);
                ahc.setUser(applicant);
                StartController(ahc);
                v.close();

            }

        });
        v.getBackButton().setOnAction(e -> {
            StartController(new ApplicantPersonalInformationController(ViewFactory.getView(ViewType.APPLICANTPERSONALINFORMATIONREGISTRATIONVIEW), model));
            v.close();
        });
        v.getResetButton().setOnAction(e -> {
        });

    }

    @Override
    public void StartController() {
        view.showView();
    }

    private void PrepareChoiceBoxs() {
        v.getSkillCategoryChoiceBox().getItems().addAll(model.getSkillCategoryModel().getSkillCategories());
        v.getSkillCategoryChoiceBox().setCellFactory(new Callback<ListView<SkillCategory>, ListCell<SkillCategory>>() {
            @Override
            public ListCell<SkillCategory> call(ListView<SkillCategory> param) {
                SkillCategoryCell skillcategoryCell = new SkillCategoryCell();
                return skillcategoryCell;
            }
        });
        v.getEducationlevelChoiceBox().getItems().add("University or College Degree ");
        v.getEducationlevelChoiceBox().getItems().add("Masters degree");
        v.getEducationlevelChoiceBox().getItems().add("PHD");
        v.getEducationlevelChoiceBox().getItems().add("Grade 10");
        v.getEducationlevelChoiceBox().getItems().add("Grade 12");
        v.getEducationlevelChoiceBox().getItems().add("Professor");
        v.getEducationlevelChoiceBox().getItems().add("Doctrate");
        v.getEducationlevelChoiceBox().getItems().add("Assistant Professor");
        //
    }

    public Authenticable getAuthenticable() {
        return authenticable;
    }

    public void setAuthenticable(Authenticable authenticable) {
        this.authenticable = authenticable;
    }

}
