package Controllers.Company;

import Controllers.Applicant.ApplicantPersonalInformationController;
import Controllers.ViewController;
import DomainObjects.Address;
import DomainObjects.Company;
import Factories.ViewFactory;
import Models.Model;
import ViewsBase.SystemUserLoginInformationRegistrationView;
import Views.Company.CompanyHomeView;
import ViewsBase.View;
import ViewsBase.ViewType;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompanyLoginInformationController extends ViewController {

    Company company;

    public CompanyLoginInformationController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void StartController() {
        RegisterEvents();
        view.showView();
    }

    @Override
    public void RegisterEvents() {
        SystemUserLoginInformationRegistrationView v = (SystemUserLoginInformationRegistrationView) view;
        v.getNextButton().setOnAction(e -> {
            String username, password, confrimpassword;
            username = v.getUsernameTextField().getText();
            password = v.getPasswordTextField().getText();
            confrimpassword = v.getConfrimpasswordTextField().getText();
            //------------------------------------------------------------------
            if (username.isEmpty() | password.isEmpty() | confrimpassword.isEmpty() | v.getCityTextField().getText().isEmpty()
                    | v.getStateTextField().getText().isEmpty() | v.getCountryTextField().getText().isEmpty()) {
                v.EmptyFieldAlert();
            } else {

                String city = v.getCityTextField().getText();
                String state = v.getStateTextField().getText();
                String country = v.getCountryTextField().getText();

                if (confrimpassword.equals(password)) {
                    //--------------------------------------------------------//
                    Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
                    Address address = addressBuilder.Id(0).Counrty(country).State(state).City(city).build();
                    company = getCompany();
                    company.setId(company.hashCode());
                    company.setAddress(address);
                    company.setPassword(password);
                    company.setUserName(username);
                    try {
                        //----------------------------------------------------//
                        AddCompany(company);
                        CompanyHomeViewController companyHomeViewController = new CompanyHomeViewController((CompanyHomeView) ViewFactory.getView(ViewType.COMPANYHOMEVIEW), model);
                        companyHomeViewController.setUser(company);
                            StartController(companyHomeViewController);
            v.close();
                        //----------------------------------------------------//
                    } catch (SQLException ex) {
                        Logger.getLogger(CompanyLoginInformationController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    //--------------------------------------------------------//
                    v.PasswordMisMatchAlert();
                    //--------------------------------------------------------//
                }
            }
        });

        v.getBackButton().setOnAction(e -> {
            ApplicantPersonalInformationController lc = new ApplicantPersonalInformationController(ViewFactory.getView(ViewType.APPLICANTPERSONALINFORMATIONREGISTRATIONVIEW), model);
              StartController(lc);
            v.close();
        });
    }

    private boolean AddCompany(Company company) throws SQLException {
        return model.getCompanyModel().InsertCompany(company);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }
}
