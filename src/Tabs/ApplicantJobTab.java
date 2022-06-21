package Tabs;

import Views.SubView;
import javafx.scene.control.ListView;

public class ApplicantJobTab extends SubView {

    //--------------------------------------------------------------------------
    ListView jobslistView;
    //--------------------------------------------------------------------------

    @Override
    public void init() {
        //
        jobslistView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        getChildren().addAll(jobslistView);
        //
    }

    @Override
    public void bindings() {
        //
        jobslistView.prefHeightProperty().bind(heightProperty());
        jobslistView.prefWidthProperty().bind(widthProperty());
        //
    }

    @Override
    public void alignElements() {
    }

    public ListView getJobslistView() {
        return jobslistView;
    }
    
    

}
