package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import Models.Model;
import PopUps.AddEvaluationSubView;
import ViewsBase.SubView;

public class EvaluationController extends SubViewController {

    private final AddEvaluationSubView view;

    public EvaluationController(SubView subView, Model model) {
        super(subView, model);
        view = (AddEvaluationSubView) subView;

    }

    @Override
    public void StartController() {
        //
        //
        //
        //
        RegisterEvents();
        view.showView();
    }

    @Override
    public void RegisterEvents() {
        //
        //
        //
        //
        //
        view.getSubmitButton().setOnAction(e -> {
            view.getScene().getWindow().hide();
        });
        view.getResetButton().setOnAction(e -> {
            view.getRemarksTextArea().setText("");
            view.getInterviewsChoiceBox().getSelectionModel().clearSelection();
            view.getDatepicker().setValue(null);
        });

    }

}
