package Tabs.Home;

import ViewsBase.SubView;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public abstract class HomeTab extends SubView {

    Button feedbackButton, aboutusButton, contactusButton, historyButton;
    ScrollPane sp;

    public HomeTab() {
        //--------------------------------------------------------------------//
        feedbackButton = new Button("Feedback");
        aboutusButton = new Button("About us");
        contactusButton = new Button("Contact us");
        historyButton = new Button("History");
        //
        sp = new ScrollPane();

        //--------------------------------------------------------------------//
    }

    public Button getFeedbackButton() {
        return feedbackButton;
    }

    public Button getAboutusButton() {
        return aboutusButton;
    }

    public Button getContactusButton() {
        return contactusButton;
    }

}
