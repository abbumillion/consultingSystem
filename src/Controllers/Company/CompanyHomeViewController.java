package Controllers.Company;

import Controllers.HomeController;
import Controllers.PopUps.AddInterviewController;
import Controllers.PopUps.AddSkillCategoryController;
import Controllers.PopUps.AddSkillController;
import Controllers.PopUps.EvaluationController;
import Controllers.PopUps.JobContractController;
import Controllers.PopUps.JobOrderController;
import Controllers.SubView.SubViewController;
import DomainObjects.Company;
import Factories.SubViewFactory;
import Models.Model;
import Views.Company.CompanyHomeView;
import ViewsBase.PopUpType;
import ViewsBase.View;

public class CompanyHomeViewController extends HomeController {

    public CompanyHomeViewController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {
        super.RegisterEvents();
        CompanyHomeView v = (CompanyHomeView) view;
        v.getHomeTab().getAddNewJobContractButton().setOnAction(e -> {
            startSubViewController(new JobContractController(SubViewFactory.getSubView(PopUpType.ADDJOBCONTRACTSUBVIEW), model));
        });
        v.getHomeTab().getAddjoborderButton().setOnAction(e -> {
            //
            //send company name here to job order subviewcontroller
            JobOrderController jobOrderController = new JobOrderController(SubViewFactory.getSubView(PopUpType.ADDJOBORDERSUBVIEW), model);
            Company company = (Company) getUser();
            System.out.println("username:" + company.getUserName());
            System.out.println("password:" + company.getPassword());
            jobOrderController.setCompany(company);
            startSubViewController(jobOrderController);
        });
        v.getHomeTab().getNewEvaluationButton().setOnAction(e -> {
            //
            //
            //
            startSubViewController(new EvaluationController(SubViewFactory.getSubView(PopUpType.ADDEVALUATIONSUBVIEW), model));
        });
        v.getHomeTab().getUpdateCompanyInfoButton().setOnAction(e -> {
            //  startSubViewController(new JobContractController(SubViewFactory.getSubView(NavType.COMPANYINFONAV), model));
        });
        v.getHomeTab().getUpdatejoborderButton().setOnAction(e -> {
            startSubViewController(new AddSkillController(SubViewFactory.getSubView(PopUpType.ADDNEWSKILLSUBVIEW), model));
        });
        v.getHomeTab().getUpdateCompanyInfoButton().setOnAction(e -> {
            //
            startSubViewController(new AddSkillCategoryController(SubViewFactory.getSubView(PopUpType.ADDSKILLCATEGORYSUBVIEW), model));
        });

        v.getHomeTab().getUpdateCompanyInfoButton().setOnAction(e -> {
            //
            startSubViewController(new AddSkillCategoryController(SubViewFactory.getSubView(PopUpType.ADDSKILLCATEGORYSUBVIEW), model));
        });

        v.getHomeTab().getUpdateCompanyInfoButton().setOnAction(e -> {
            //
            startSubViewController(new AddSkillCategoryController(SubViewFactory.getSubView(PopUpType.ADDSKILLCATEGORYSUBVIEW), model));
        });

        v.getHomeTab().getAddInterviewButton().setOnAction(e -> {
            //
            startSubViewController(new AddInterviewController(SubViewFactory.getSubView(PopUpType.ADDINTERVIEWSUBVIEW), model));
        });

        v.getHomeTab().getUpdateInterviewButton().setOnAction(e -> {
            //
            startSubViewController(new AddSkillCategoryController(SubViewFactory.getSubView(PopUpType.ADDSKILLCATEGORYSUBVIEW), model));
        });

    }

    @Override
    public void StartController() {
        //
        //
        //
        //
        view.showView();
        //
        //
        //
    }

    //method for starting popup subviews of the company
    //homeview
    private void startSubViewController(SubViewController svc) {
        //
        //
        //
        //
        svc.RegisterEvents();
        svc.StartController();
        //
        //
        //
    }

}
