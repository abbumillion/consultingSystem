/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabs.Listviews;

import ViewsBase.SubView;
import javafx.scene.control.ListView;

/**
 *
 * @author Milla
 */
public class ListViewTab extends SubView {
    //
    ListView listView;
    //
    @Override
    public void init() {
        //
        listView = new ListView();
        //
    }

    @Override
    public void addChildren() {
        //
        //
        getChildren().addAll(listView);
        //
    }

    @Override
    public void bindings() {
        listView.prefHeightProperty().bind(widthProperty());
        listView.prefWidthProperty().bind(heightProperty());
    }

    @Override
    public void alignElements() {
    }

    public ListView getListView() {
        //
        return listView;
        //
    }

}
