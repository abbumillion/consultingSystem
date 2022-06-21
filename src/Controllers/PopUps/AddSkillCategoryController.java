package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import DomainObjects.SkillCategory;
import Models.Model;
import PopUps.AddSkillCategorySubView;
import ViewsBase.SubView;

public class AddSkillCategoryController extends SubViewController {

    AddSkillCategorySubView view;

    public AddSkillCategoryController(SubView subView, Model model) {
        super(subView, model);
        view = (AddSkillCategorySubView) subView;
    }

    @Override
    public void RegisterEvents() {

        view.getResetButton().setOnAction(e -> {
            view.getSkillCategoryInformationTextArea().setText("");
            view.getSkillCategoryNameTextField().setText("");
        });
        view.getSubmitButton().setOnAction(e -> {
            if (view.getSkillCategoryInformationTextArea().getText().isEmpty()
                    | view.getSkillCategoryNameTextField().getText().isEmpty()) {
                //do nothin here
            } else {
                //
                String skillcategoryname = view.getSkillCategoryNameTextField().getText();
                String skillcategoryinformation = view.getSkillCategoryInformationTextArea().getText();
                //
                SkillCategory.SkillCategoryBuilder scb = new SkillCategory.SkillCategoryBuilder();
                SkillCategory skillCategory = scb.SkillCategoryInformation(skillcategoryinformation).SkillCategoryName(skillcategoryname).build();
                //
                if (model.getSkillCategoryModel().InsertSkillCategory(skillCategory)) {
                    //
                    //
                    //
                    System.out.println("SkillCategory inserted successfully");
                    view.getScene().getWindow().hide();
                } else {
                    //
                    //
                    //
                    System.out.println("SkillCategory insertion failed ");
                    //
                }
            }
        });

    }

    @Override
    public void StartController() {
        view.showView();
    }

}
