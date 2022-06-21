package Controllers.Company;

import DomainObjects.Job;
import Models.Model;
import Navigations.AddJobContractSubView;
import java.time.LocalDate;

public class JobContractController {

    private Model model;
    private AddJobContractSubView view;

    public JobContractController(AddJobContractSubView view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void StartController() {
        RegisterEvents();

    }

    private void RegisterEvents() {
        view.getSubmitButton().setOnAction(e -> {
            if (view.getNegotiatedTermsTextArea().getText().isEmpty()) {
            } else {
                Job.JobBuilder jobBuilder = new Job.JobBuilder();
                Job job = jobBuilder.build();
                model.getJobModel().InsertJob(job);
            }
        });
        view.getResetButton().setOnAction(e -> {
            view.getNegotiatedTermsTextArea().setText("");
            view.getStartDate().setValue(LocalDate.now());
            view.getEndDate().setValue(LocalDate.now());
        });
    }

}
