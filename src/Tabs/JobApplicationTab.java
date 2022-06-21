/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabs;

import Views.SubView;
import javafx.scene.control.ListView;

/**
 *
 * @author Milla
 */
public class JobApplicationTab extends SubView {
    //
    ListView jobApplicationListView;
    //
    @Override
    public void init() {
        //
        jobApplicationListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(jobApplicationListView);
        //
    }

    @Override
    public void bindings() {
        jobApplicationListView.prefHeightProperty().bind(widthProperty());
        jobApplicationListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getJobApplicationsListView() {
        //
        return jobApplicationListView;
        //
    }

}
