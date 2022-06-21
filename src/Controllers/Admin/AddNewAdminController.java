package Controllers.Admin;

import Controllers.ViewController;
import Models.Model;
import ViewsBase.View;

//
//
//this class is for controlling adminregistrationview 
//
//
//
//
public class AddNewAdminController extends ViewController {

    public AddNewAdminController(View v, Model m) {
        super(v, m);
    }

    @Override
    public void RegisterEvents() {

    }

    @Override
    public void StartController() {
        RegisterEvents();
        
    }



}
