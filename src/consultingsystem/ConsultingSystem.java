package consultingsystem;

import Controllers.LoaderController;
import Factories.ViewFactory;
import Models.Model;
import ViewsBase.View;
import ViewsBase.ViewType;
import javafx.application.Application;
import javafx.stage.Stage;

public class ConsultingSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //--------------------------------------------------------------------//
        //---------------------THESTARTINGPOINTOFTHEAPPLICTION----------------//
        //--------------------------------------------------------------------//
        View view = ViewFactory.getView(ViewType.LOADERVIEW);
        Model model = new Model();
         LoaderController lc = new LoaderController(view,model);
         lc.RegisterEvents();
         lc.StartController();
    }
    
    public static void main(String[] args) {
        System.out.println(".......................APP_STARTED..........................");
        launch(args);
        System.out.println(".......................APP_FINISHED.........................");
    }
}
