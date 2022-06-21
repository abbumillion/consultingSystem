package Controllers.Company;

import Models.Model;
import Navigations.AddEvaluationSubView;

public class EvaluationController {

    private AddEvaluationSubView view;
    private Model model;

    public EvaluationController(AddEvaluationSubView view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void StartController() {
        RegisterEvents();
    }

    private void RegisterEvents() {
        view.getSubmitButton().setOnAction(e -> {
        });
        view.getResetButton().setOnAction(e -> {
        });

    }

}
