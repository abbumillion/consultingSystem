package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import DomainObjects.Skill;
import DomainObjects.SkillCategory;
import Tabs.Listviews.SkillCategoryCell;
import Models.Model;
import PopUps.AddSkillSubView;
import ViewsBase.SubView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class AddSkillController extends SubViewController {
    //
    //
    //this class is for registring all events fired from addskill
    //popup view 
    //
    //
    //
    //
    //
    //

    final AddSkillSubView view;

    public AddSkillController(SubView subView, Model model) {
        //
        super(subView, model);
        view = (AddSkillSubView) subView;
        //
    }

    @Override
    public void RegisterEvents() {
        ///
        view.getSkillCategoryChoiceBox().getItems().addAll(model.getSkillCategoryModel().getSkillCategories());
        view.getSkillCategoryChoiceBox().setCellFactory(new Callback<ListView<SkillCategory>, ListCell<SkillCategory>>() {
            @Override
            public ListCell<SkillCategory> call(ListView<SkillCategory> param) {
                SkillCategoryCell skillcategoryCell = new SkillCategoryCell();
                return skillcategoryCell;
            }
        });

        view.getResetButton().setOnAction(e -> {
            //empty everything here
            view.getSkillNameTextField().setText("");
            view.getSkillInformationTextArea().setText("");
        });
        view.getSubmitButton().setOnAction(e -> {
            //
            //add skill data to the database here
            if (view.getSkillNameTextField().getText().isEmpty() | view.getSkillInformationTextArea().getText().isEmpty()) {
                //do nothing here
            } else {
                //
                String skillName = view.getSkillNameTextField().getText();
                String skillInformation = view.getSkillInformationTextArea().getText();
                Skill.SkillBuilder scb = new Skill.SkillBuilder();
                SkillCategory skillCategory=(SkillCategory) view.getSkillCategoryChoiceBox().getSelectionModel().getSelectedItem();
                Skill skill = scb.SkillInformation(skillInformation).skillCategory(skillCategory).SkillName(skillName).build();
                //
                if (model.getSkillModel().InsertSkill(skill)) {
                    //
                    System.out.println("Skill Successfully Inserted...");
                    view.getScene().getWindow().hide();
                    //
                } else {
                    //
                    System.out.println("Skill Insertion Failed....");
                    //
                }
            }
            //
        });
    }

    @Override
    public void StartController() {
        //
        view.showView();
        //
    }

}
