package Controllers;

import Controllers.SubView.SubViewController;
import Models.Model;
import ViewsBase.View;

public abstract class ViewController implements Controller {

    //model database object
    protected Model model;
    //view user interface
    protected View view;

    public ViewController(View v, Model m) {
        model = m;
        view = v;

    }

    public void StartController(Controller controller) {
        //
        //
        //
        //
        //
        //
        //
        controller.RegisterEvents();
        controller.StartController();
    }

    public void StartController(SubViewController controller) {
        //
        //
        //
        //
        //
        //
        //
        controller.RegisterEvents();
        controller.StartController();
    }

}

interface Controller {

    //for registering all action events fired  from the user interface
    void RegisterEvents();

    //starting controller
    void StartController();

}
