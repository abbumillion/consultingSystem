package Controllers.Applicant;

import Controllers.RegistrationController;
import DomainObjects.Address;
import DomainObjects.Applicant;
import Factories.ViewFactory;
import Models.Model;
import Views.Applicant.ApplicantHomeView;
import ViewsBase.SystemUserLoginInformationRegistrationView;
import ViewsBase.View;
import ViewsBase.ViewType;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicantLoginInformationController extends RegistrationController {

    Applicant applicant;

    public ApplicantLoginInformationController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void StartController() {
        RegisterEvents();
        view.showView();

    }

    @Override
    public void RegisterEvents() {
        super.RegisterEvents();
        SystemUserLoginInformationRegistrationView v = (SystemUserLoginInformationRegistrationView) view;
        v.getNextButton().setOnAction(e -> {
            //------------------------------------------------------------------
            String username, password, confrimpassword;
            username = v.getUsernameTextField().getText();
            password = v.getPasswordTextField().getText();
            confrimpassword = v.getConfrimpasswordTextField().getText();
            //------------------------------------------------------------------
            if (username.isEmpty() | password.isEmpty() | confrimpassword.isEmpty() | v.getCityTextField().getText().isEmpty()
                    | v.getStateTextField().getText().isEmpty() | v.getCountryTextField().getText().isEmpty()) {
                //------------------------------------------------------------//
                //------------------------------------------------------------//
                //if all fields are empty
                v.EmptyFieldAlert();
            } else {
                //if not empty check the password
                if (confrimpassword.equals(password)) {
                    //password matches
                    //----------------------------------------------------------
                    String city = v.getCityTextField().getText();
                    String state = v.getStateTextField().getText();
                    String country = v.getCountryTextField().getText();

                    Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
                    Address address = addressBuilder.Id(1).City(city).State(state).Counrty(country).build();
                    applicant = getApplicant();
                    applicant.setId(applicant.hashCode());
                    applicant.setPassword(password);
                    applicant.setUserName(username);
                    applicant.setAddress(address);
                    try {
                        //----------------------------------------------------------
                        //adding applicant to the model
                        AddApplicant(applicant);
                        ApplicantHomeController applicantHomeController = new ApplicantHomeController((ApplicantHomeView) ViewFactory.getView(ViewType.APPLICANTHOMEVIEW), model);
                        applicantHomeController.setUser(applicant);
                        applicantHomeController.RegisterEvents();
                        applicantHomeController.StartController();
                        //----------------------------------------------------------
                    } catch (SQLException ex) {
                        Logger.getLogger(ApplicantLoginInformationController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    //
                    v.PasswordMisMatchAlert();
                    //
                }
            }
        });

        v.getBackButton().setOnAction(e -> {
            ApplicantPersonalInformationController lc = new ApplicantPersonalInformationController(ViewFactory.getView(ViewType.APPLICANTPERSONALINFORMATIONREGISTRATIONVIEW), model);
            lc.RegisterEvents();
            lc.StartController();
        });
    }

    private boolean AddApplicant(Applicant applicant) throws SQLException {
        return model.getUserModel().InsertUser(applicant);

    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

}
