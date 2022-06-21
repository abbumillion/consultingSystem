package Tabs;

import Views.SubView;
import javafx.scene.control.ListView;

public class CompaniesTab extends SubView {

    ListView CompanyListView;

    //
    @Override
    public void init() {
        CompanyListView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(CompanyListView);
        //
    }

    @Override
    public void bindings() {
        CompanyListView.prefHeightProperty().bind(widthProperty());
        CompanyListView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getCompanyListView() {
        return CompanyListView;
    }

}
