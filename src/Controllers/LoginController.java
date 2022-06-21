package Controllers;

import Controllers.Applicant.ApplicantPersonalInformationController;
import Controllers.Applicant.ApplicantHomeController;
import Controllers.Admin.AdminHomeController;
import Controllers.Company.CompanyHomeViewController;
import Controllers.Company.CompanyRegistrationIntroductionController;
import DomainObjects.Admin;
import DomainObjects.Applicant;
import DomainObjects.Authenticable;
import DomainObjects.Company;
import Factories.ViewFactory;
import Models.AuthenticationModel;
import Models.Model;
import Views.Admin.AdminHomeView;
import Views.Applicant.ApplicantHomeView;
import ViewsBase.LoginView;
import Views.Applicant.ApplicantPersonalInformationRegistrationView;
import Views.Company.CompanyHomeView;
import ViewsBase.ViewType;

public class LoginController extends ViewController {

    public LoginController(LoginView view, Model model) {
        super(view, model);

    }

    @Override
    public void StartController() {
        view.showView();
    }

    private void VerifyUser() {

        LoginView v = (LoginView) view;
        if (v.getUserNameTextField().getText().isEmpty() || v.getPasswordField().getText().isEmpty()) {
            //shake the textfields
            v.EmptyFieldAlert();
            //
            //
            //
        } else {
            //----------------------------------------------------------------//
            String userName = v.getUserNameTextField().getText();
            String password = v.getPasswordField().getText();
            //----------------------------------------------------------------//
            Authenticable verifiedUser = model.Auth(userName, password);
            //----------------------------------------------------------------//
            if (verifiedUser == null) {
                view.FailedLogin();
                //
                //throw exception
            } else {
                //
                //
                EnterUser(verifiedUser);
                //
                //
            }
            //----------------------------------------------------------------//
        }

    }

    @Override
    public void RegisterEvents() {
        LoginView v = (LoginView) view;
        v.getLoginButton().setOnAction(e -> {
            //
            //
            VerifyUser();
            //
            //
        });
        v.getApplicantRegisterButton().setOnAction(e -> {
            StartController(new ApplicantPersonalInformationController((ApplicantPersonalInformationRegistrationView) ViewFactory.getView(ViewType.APPLICANTPERSONALINFORMATIONREGISTRATIONVIEW), model));
            v.close();
        });
        v.getCompanyRegisterButton().setOnAction(e -> {
            StartController(new CompanyRegistrationIntroductionController(ViewFactory.getView(ViewType.COMPANYREGISTRATIONINTRODUCTIONVIEW), model));
            v.close();
        });
        v.getForgetPasswordLabel().setOnAction(e -> {
            StartController(new ResetPasswordController(ViewFactory.getView(ViewType.FORGETPASSWORDVIEW), model));
            v.close();
        });
    }

    private void EnterUser(Authenticable authenticable) {
        //Enter user to the system here..
        view.close();
        if (authenticable instanceof Admin) {
            //admin subsystem
            AdminHomeController ac = new AdminHomeController((AdminHomeView) ViewFactory.getView(ViewType.ADMINHOMEVIEW), model);
            ac.setUser(authenticable);
            StartController(ac);
        } else if (authenticable instanceof Applicant) {
            //applicant subsystem
            ApplicantHomeController applicantHomeController = new ApplicantHomeController((ApplicantHomeView) ViewFactory.getView(ViewType.APPLICANTHOMEVIEW), model);
            applicantHomeController.setUser(authenticable);
            StartController(applicantHomeController);
        } else if (authenticable instanceof Company) {
            //company subsystem
            CompanyHomeViewController echc = new CompanyHomeViewController((CompanyHomeView) ViewFactory.getView(ViewType.COMPANYHOMEVIEW), model);
            echc.setUser(authenticable);
            StartController(echc);
        }
    }

}
