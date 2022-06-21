package Controllers.Applicant;

import DomainObjects.Job;
import Models.Model;
import Tabs.JobCell;
import Tabs.JobsTab;
import java.sql.SQLException;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class JobsController {
    
    JobsTab view;
    Model model;
    
    public JobsController(JobsTab v, Model m) {
        model = m;
        view = v;
    }
    
    public void RegisterEvents() throws SQLException {
        //----------------------------------------------------------------------
        view.getJobListView().getItems().addAll(model.getJobModel().getJobs());
        
        view.getJobListView().setCellFactory(new Callback<ListView<Job>, ListCell<Job>>() {
            @Override
            public ListCell<Job> call(ListView<Job> param) {
                JobCell jobCell = new JobCell();
                return jobCell;
            }
        });

        //----------------------------------------------------------------------
    }
    
    public void StartController() {
    }
    
    public void UpdateView() {
    }
    
}
