package Controllers;

import Factories.ViewFactory;
import Models.Model;
import ViewsBase.LoaderView;
import ViewsBase.LoginView;
import ViewsBase.View;
import ViewsBase.ViewType;
import javafx.concurrent.Task;

public class LoaderController extends ViewController {

    LoaderView loaderView;
    LoginController loginController;

    public LoaderController(View v, Model m) {
        //----------------------------------------------------------------------
        super(v, m);
        loaderView = (LoaderView) v;
        //----------------------------------------------------------------------
    }

    @Override
    public void RegisterEvents() {
        //----------------------------------------------------------------------
        Task task = new Task() {
            @Override
            protected Object call() throws Exception {
                loginController = new LoginController((LoginView) ViewFactory.getView(ViewType.SYSTEMLOGINVIEW), model);
                //----------------------------------------------------------
                int total = 100;
                for (int i = 0; i < total; i += 5) {
                    Thread.sleep(100);
                    updateProgress(i, total);
                    updateMessage("Initializing resources please wait for " + (total - i) + " seconds");
                }
                //----------------------------------------------------------
                return this;
            }
        };
        new Thread(task).start();
        //------------------------------------------------------------------
        loaderView.getProgressBar().setVisible(true);
        loaderView.getMessageLabel1().textProperty().bind(task.messageProperty());
        loaderView.getProgressBar().progressProperty().bind(task.progressProperty());
        //------------------------------------------------------------------
        task.setOnSucceeded(ee -> {
            loaderView.close();
            StartController(loginController);
        });
        //----------------------------------------------------------------------
    }

    @Override
    public void StartController() {
        //----------------------------------------------------------------------
        view.showView();
        //----------------------------------------------------------------------
    }

}
