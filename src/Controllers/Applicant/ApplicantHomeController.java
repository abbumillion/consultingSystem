package Controllers.Applicant;

import Controllers.HomeController;
import Models.Model;
import Views.Applicant.ApplicantHomeView;
import ViewsBase.View;

public class ApplicantHomeController extends HomeController {

    ApplicantHomeView v;

    public ApplicantHomeController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void StartController() {
        //-----
        super.RegisterEvents();
        //
        view.showView();
    }

    @Override
    public void RegisterEvents() {
        //---------------------

    }

}
