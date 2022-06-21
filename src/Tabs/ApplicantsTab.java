package Tabs;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;

public class ApplicantsTab extends SubView {

    ListView ApplicantListView;

    @Override
    public void init() {
        ApplicantListView = new ListView();
        //
    }

    @Override
    public void addChildren() {

        getChildren().addAll(ApplicantListView);
    }

    @Override
    public void bindings() {
        ApplicantListView.prefHeightProperty().bind(heightProperty());
        ApplicantListView.prefWidthProperty().bind(widthProperty());
    }

    @Override
    public void alignElements() {
        setAlignment(Pos.CENTER);
    }

    public ListView getApplicantListView() {
        return ApplicantListView;
    }

}
