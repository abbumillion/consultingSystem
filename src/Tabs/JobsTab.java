package Tabs;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;

public class JobsTab extends SubView {

    ListView jobsListView;

    //
    @Override
    public void init() {
        jobsListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(jobsListView);
        //
    }

    @Override
    public void bindings() {
        jobsListView.prefHeightProperty().bind(widthProperty());
        jobsListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
        setAlignment(Pos.CENTER);
    }

    public ListView getJobListView() {
        return jobsListView;
    }



}
