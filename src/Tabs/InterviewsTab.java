package Tabs;

import Views.SubView;
import javafx.scene.control.ListView;

public class InterviewsTab extends SubView {
    //
    ListView InterviewListView;
    //
    @Override
    public void init() {
        //
        InterviewListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(InterviewListView);
        //
    }

    @Override
    public void bindings() {
        InterviewListView.prefHeightProperty().bind(widthProperty());
        InterviewListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getInterviewListView() {
        //
        return InterviewListView;
        //
    }

}
