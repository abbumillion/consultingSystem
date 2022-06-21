package Controllers.Company;

import Controllers.RegistrationController;
import DomainObjects.Company;
import Factories.ViewFactory;
import Models.Model;
import Views.Company.CompanyInformationRegistrationView;
import ViewsBase.View;
import ViewsBase.ViewType;

public class CompanyInformationRegistrationController extends RegistrationController {

    public CompanyInformationRegistrationController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {
        //----------------------------------------------------------------------
        super.RegisterEvents();
        CompanyInformationRegistrationView v = (CompanyInformationRegistrationView) view;

        v.getNextButton().setOnAction(e -> {
            if (v.getCompanyNameTextField().getText().isEmpty() | v.getCompanyTypeComboBox().getSelectionModel().isEmpty()
                    | v.getCellphoneTextField().getText().isEmpty() | v.getCompanyWebsiteTextField().getText().isEmpty()
                    | v.getEmailTextField().getText().isEmpty()) {
                v.EmptyFieldAlert();
            } else {
                //--------------------------------------------------------------
                String companyname = v.getCompanyNameTextField().getText();
                String website = v.getCompanyWebsiteTextField().getText();
                String phonenumber = v.getCellphoneTextField().getText();
                String email = v.getEmailTextField().getText();
                String companyType = v.getCompanyTypeComboBox().getSelectionModel().getSelectedItem().toString();
                //--------------------------------------------------------------
                Company.CompanyBuilder companyBuilder = new Company.CompanyBuilder();
                Company company = companyBuilder.CompanyName(companyname).Email(email).Website(website).PhoneNumber(phonenumber).CompanyType(companyType).Userrole("Company").build();
                CompanyLoginInformationController ecrc = new CompanyLoginInformationController(ViewFactory.getView(ViewType.SYSTEMUSERLOGININFORMATIONVIEW), model);
                ecrc.setCompany(company);
                 StartController(ecrc);
            v.close();
            }
        });
        //--------------------------------------------------------------------//
        v.getBackButton().setOnAction(e -> {

            CompanyRegistrationIntroductionController ecrc = new CompanyRegistrationIntroductionController(ViewFactory.getView(ViewType.COMPANYREGISTRATIONINTRODUCTIONVIEW), model);
             StartController(ecrc);
            v.close();
        });
    }

    @Override
    public void StartController() {
        view.showView();
    }

}
