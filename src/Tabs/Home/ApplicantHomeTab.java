package Tabs.Home;

import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class ApplicantHomeTab extends HomeTab {

    Button findJobButton, myEmployersButton, myjobExperianceButton, myJobContractsButton, myjobApplicationsButton;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        findJobButton = new Button("Find Job");
        myEmployersButton = new Button("My Ex-Employers");
        myjobExperianceButton = new Button("My Job Experiancies");
        myjobApplicationsButton = new Button("My Job Applications");
        myJobContractsButton = new Button("My Job Contracts");
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        //--------------------------------------------------------------------//
        h1.getChildren().addAll(findJobButton, myEmployersButton, myJobContractsButton);
        h2.getChildren().addAll(myjobExperianceButton, myjobApplicationsButton, historyButton);
        h3.getChildren().addAll(feedbackButton, aboutusButton, contactusButton);
        v1.getChildren().addAll(h1, h2, h3);
        sp.setContent(v1);
        getChildren().addAll(sp);
        //--------------------------------------------------------------------//
    }

    @Override
    public void bindings() {
        //--------------------------------------------------------------------//
        h1.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        h1.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h2.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        h2.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        h3.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));
        h3.prefHeightProperty().bind(v1.heightProperty().multiply(0.2));
        //--------------------------------------------------------------------//
        v1.prefWidthProperty().bind(widthProperty());
        v1.prefHeightProperty().bind(heightProperty());
        //--------------------------------------------------------------------//
        findJobButton.prefHeightProperty().bind(h1.heightProperty());
        findJobButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));

        myEmployersButton.prefHeightProperty().bind(h1.heightProperty());
        myEmployersButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));

        myJobContractsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        myJobContractsButton.prefHeightProperty().bind(h1.heightProperty());

        myjobExperianceButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        myjobExperianceButton.prefHeightProperty().bind(h1.heightProperty());

        myjobApplicationsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        myjobApplicationsButton.prefHeightProperty().bind(h1.heightProperty());

        historyButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        historyButton.prefHeightProperty().bind(h1.heightProperty());

        aboutusButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        aboutusButton.prefHeightProperty().bind(h1.heightProperty());

        contactusButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        contactusButton.prefHeightProperty().bind(h1.heightProperty());

        feedbackButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.3));
        feedbackButton.prefHeightProperty().bind(h1.heightProperty());
        //--------------------------------------------------------------------//
    }

    @Override
    public void alignElements() {
        //--------------------------------------------------------------------//
        v1.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        //--------------------------------------------------------------------//
    }

}
