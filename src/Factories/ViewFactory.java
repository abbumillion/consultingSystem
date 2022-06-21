package Factories;

import ViewsBase.LoaderView;
import Views.Admin.AdminHomeView;
import Views.Applicant.ApplicantHomeView;
import ViewsBase.LoginView;
import Views.Applicant.ApplicantPersonalInformationRegistrationView;
import Views.Applicant.ApplicantSkillInformationView;
import ViewsBase.SystemUserLoginInformationRegistrationView;
import Views.Company.CompanyHomeView;
import Views.Company.CompanyInformationRegistrationView;
import Views.Company.CompanyRegistrationIntroductionView;
import ViewsBase.ResetPasswordView;
import ViewsBase.View;
import ViewsBase.ViewType;

public class ViewFactory {

    static View v;

    public static View getView(ViewType type) {
        if (null != type) {
            switch (type) {
                case SYSTEMLOGINVIEW:
                    v = new LoginView();
                    break;
                case ADMINHOMEVIEW:
                    v = new AdminHomeView();
                    break;
                case APPLICANTHOMEVIEW:
                    v = new ApplicantHomeView();
                    break;
                case APPLICANTPERSONALINFORMATIONREGISTRATIONVIEW:
                    v = new ApplicantPersonalInformationRegistrationView();
                    break;
                case SYSTEMUSERLOGININFORMATIONVIEW:
                    v = new SystemUserLoginInformationRegistrationView();
                    break;
                case COMPANYHOMEVIEW:
                    v = new CompanyHomeView();
                    break;
                case COMPANYREGISTRATIONINTRODUCTIONVIEW:
                    v = new CompanyRegistrationIntroductionView();
                    break;
                case COMPANYINFORMATIONREGISTRATIONVIEW:
                    v = new CompanyInformationRegistrationView();
                    break;
                case FORGETPASSWORDVIEW:
                    v = new ResetPasswordView();
                    break;
                case LOADERVIEW:
                    v = new LoaderView();
                    break;
                case APPLICANTSKILLINFORMATIONVIEW:
                    v=new ApplicantSkillInformationView();
                    break;
                default:
                    break;
            }
        }
        v.getReady();
        return v;
    }

}
