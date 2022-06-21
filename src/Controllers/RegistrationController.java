package Controllers;

import Models.Model;
import ViewsBase.RegistrationView;
import ViewsBase.View;

public abstract class RegistrationController extends ViewController {
    
    public RegistrationController(View v, Model m) {
        super(v, m);
    }
    
    @Override
    public void RegisterEvents() {
        RegistrationView v = (RegistrationView) view;
        v.getResetButton().setOnAction(e -> {
            v.getEmailTextField().setText("");
            v.getFnTextField().setText("");
            v.getLnTextField().setText("");
            v.getUsernameTextField().setText("");
            v.getPasswordTextField().setText("");
            v.getConfrimpasswordTextField().setText("");
            v.getCellphoneTextField().setText("");
            v.getDateofbirth().setValue(null);
            
        });
    }
    
    @Override
    public void StartController() {
    }

    
}
