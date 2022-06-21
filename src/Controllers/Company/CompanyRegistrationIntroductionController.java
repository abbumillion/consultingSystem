package Controllers.Company;

import Controllers.LoginController;
import Controllers.ViewController;
import Factories.ViewFactory;
import Models.Model;
import Views.Company.CompanyRegistrationIntroductionView;
import ViewsBase.LoginView;
import ViewsBase.View;
import ViewsBase.ViewType;

public class CompanyRegistrationIntroductionController extends ViewController {

    CompanyRegistrationIntroductionView v;

    public CompanyRegistrationIntroductionController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {
        //----------------------------------------------------------------------
        v = (CompanyRegistrationIntroductionView) view;
        v.getBackButton().setOnAction(e -> {
            LoginController landingController = new LoginController((LoginView) ViewFactory.getView(ViewType.SYSTEMLOGINVIEW), model);
            StartController(landingController);
            v.close();
        });
        v.getNextButton().setOnAction(e -> {
            CompanyInformationRegistrationController ecrc = new CompanyInformationRegistrationController(ViewFactory.getView(ViewType.COMPANYINFORMATIONREGISTRATIONVIEW), model);
            StartController(ecrc);
            v.close();
        });

        //----------------------------------------------------------------------
    }

    @Override
    public void StartController() {
        v.showView();
    }

}
