package Controllers.SubView;

import Models.Model;
import ViewsBase.SubView;

public abstract class SubViewController {

    //database object model
    protected final Model model;
    //SubView sub-user interface
    protected final SubView subView;

    public SubViewController(SubView subView, Model model) {
        this.model = model;
        this.subView = subView;
        subView.getCloseButton().setOnAction(e -> {
            //
            //
            //
            subView.close();
        });
    }

    public void StartController(SubViewController sbvc) {

        sbvc.RegisterEvents();
        sbvc.StartController();

    }

    public abstract void RegisterEvents();

    public abstract void StartController();

}
