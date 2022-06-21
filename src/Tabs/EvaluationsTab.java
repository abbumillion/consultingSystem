package Tabs;

import Views.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;

public class EvaluationsTab extends SubView {

    ListView EvaluationListView;

    //
    @Override
    public void init() {
        EvaluationListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(EvaluationListView);
        //
    }

    @Override
    public void bindings() {
        EvaluationListView.prefHeightProperty().bind(widthProperty());
        EvaluationListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
        setAlignment(Pos.CENTER);
    }

    public ListView getEvaluationListView() {
        return EvaluationListView;
    }

}
