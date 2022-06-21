package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import DomainObjects.JobApplication;
import Models.Model;
import PopUps.AddInterviewSubView;
import ViewsBase.SubView;

public class AddInterviewController extends SubViewController {

    //
    //
    AddInterviewSubView v;

    public AddInterviewController(SubView subView, Model model) {
        super(subView, model);
        v = (AddInterviewSubView) subView;
    }

    @Override
    public void RegisterEvents() {
        v.getSubmitButton().setOnAction(e -> {
            //
            //
            if (v.getJobapplicationsChoiceBox().getSelectionModel().isEmpty() | v.getInterviewTypeChoiceBox().getSelectionModel().isEmpty()
                    | v.getDatepicker().getValue() == null) {
                //
                //
                System.out.println("Empty field");
            } else {
                //
                //
                JobApplication jobapplication = (JobApplication) v.getJobapplicationsChoiceBox().getSelectionModel().getSelectedItem();
                String interviewtype = (String) v.getInterviewTypeChoiceBox().getSelectionModel().getSelectedItem();
                String date = v.getDatepicker().getValue().toString();
                //
                //
            }
        });
        v.getResetButton().setOnAction(e -> {
            //
            //
            v.getJobapplicationsChoiceBox().getSelectionModel().select(null);
            v.getDatepicker().setValue(null);
            v.getInterviewTypeChoiceBox().getSelectionModel().select(null);
            //
            //
        });
    }

    @Override
    public void StartController() {
        v.showView();
    }

}
