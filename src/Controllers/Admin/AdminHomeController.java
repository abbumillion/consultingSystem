package Controllers.Admin;

import Controllers.HomeController;
import Controllers.PopUps.AddSkillCategoryController;
import Controllers.PopUps.AddSkillController;
import Factories.SubViewFactory;
import Models.Model;
import Views.Admin.AdminHomeView;
import ViewsBase.PopUpType;
import ViewsBase.View;

public class AdminHomeController extends HomeController {

    AdminHomeView v;

    public AdminHomeController(View view, Model m) {
        super(view, m);
    }

    @Override
    public void RegisterEvents() {
        super.RegisterEvents();
        //admin home tab button event registration
        v = (AdminHomeView) view;
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
        });
        v.getAdminHomeTab().getAddSkillButtonButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddSkillcategoryButton().setOnAction(e -> {
            //
            //
            AddSkillCategoryController addSkillCategoryController = new AddSkillCategoryController(SubViewFactory.getSubView(PopUpType.ADDSKILLCATEGORYSUBVIEW), model);
            StartController(addSkillCategoryController);
        });
        v.getAdminHomeTab().getAddNewInterviewButtonButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });
        v.getAdminHomeTab().getAddNewAdminButton().setOnAction(e -> {
            //
            //
            AddSkillController addSkillController = new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model);
            StartController(addSkillController);
        });

    }

    @Override
    public void StartController() {

        v = (AdminHomeView) view;
        v.showView();

    }

}
