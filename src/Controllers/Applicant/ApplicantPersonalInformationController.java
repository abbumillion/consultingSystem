package Controllers.Applicant;

import Controllers.LoginController;
import Controllers.RegistrationController;
import DomainObjects.Applicant;
import Factories.ViewFactory;
import Models.Model;
import Views.Applicant.ApplicantPersonalInformationRegistrationView;
import ViewsBase.LoginView;
import ViewsBase.View;
import ViewsBase.ViewType;
import com.sun.media.jfxmedia.logging.Logger;

public class ApplicantPersonalInformationController extends RegistrationController {

    ApplicantPersonalInformationRegistrationView v;

    public ApplicantPersonalInformationController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void StartController() {
        view.showView();
    }

    @Override
    public void RegisterEvents() {
        //prepare the super class
        super.RegisterEvents();
        v = (ApplicantPersonalInformationRegistrationView) view;
        v.getNextButton().setOnAction(e -> {
            //----------------------------------------------------------------//
            //collect the forms in to local variables for clarity
            //----------------------------------------------------------------//
            String firstname, lastname, dateofbirth, gender, phonenumber, email;
            firstname = v.getFnTextField().getText();
            lastname = v.getLnTextField().getText();
            dateofbirth = v.getDateofbirth().getValue().toString();
            phonenumber = v.getCellphoneTextField().getText();
            email = v.getEmailTextField().getText();
            gender = "none";
            //
            if (firstname.isEmpty() | lastname.isEmpty() | phonenumber.isEmpty() | email.isEmpty()) {
                v.EmptyFieldAlert();
            } else {
                //------------------------------------------------------------//
                try {
                    if (v.getRadioGroup().getSelectedToggle().toString().contains("Male")) {
                        gender = "Male";
                    } else if (v.getRadioGroup().getSelectedToggle().toString().contains("Female")) {
                        gender = "Female";
                    }
                } catch (Exception ex) {
                    Logger.logMsg(Logger.ERROR, ex.getLocalizedMessage());
                }
                //applicant data
                Applicant.ApplicantBuilder applicantBuilder = new Applicant.ApplicantBuilder();
                Applicant applicant = applicantBuilder.DateOfBirth(dateofbirth).FirstName(firstname)
                        .LastName(lastname).Email(email)
                        .Gender(gender).PhoneNumber(phonenumber).UserRole("Applicant").build();
                //-------------------------------------------------------------//
                ApplicantSkillInformationController asic = new ApplicantSkillInformationController(ViewFactory.getView(ViewType.APPLICANTSKILLINFORMATIONVIEW), model);
                asic.setAuthenticable(applicant);
                StartController(asic);
                v.close();
                //-------------------------------------------------------------//
            }
        });
        v.getBackButton().setOnAction(e -> {
            StartController(new LoginController((LoginView) ViewFactory.getView(ViewType.SYSTEMLOGINVIEW), model));
            v.close();
        });
    }

}
