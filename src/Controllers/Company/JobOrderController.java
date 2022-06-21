package Controllers.Company;

import Models.Model;
import Navigations.AddJobOrderSubView;

public class JobOrderController {

    private AddJobOrderSubView view;
    private Model model;

    public JobOrderController(AddJobOrderSubView view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void StartController() {
        RegisterEvents();
    }

    private void RegisterEvents() {
        view.getResetButton().setOnAction(e -> {
            view.getJobdescriptionTextArea().setText("");
            view.getJobtitleTextField().setText("");
        });
        view.getSubmitButton().setOnAction(e -> {
        });

    }

}
