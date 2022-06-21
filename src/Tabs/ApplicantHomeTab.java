package Tabs;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ApplicantHomeTab extends HomeTab {

    //
    Button findJobButton, myEmployersButton, myjobExperianceButton, myJobContractsButton, systemSettingsButton;

    //
    @Override
    public void init() {
        //----------------------------------------------------------------------

        //----------------------------------------------------------------------
        findJobButton = new Button("Find Job");
        myEmployersButton = new Button("My Employers");
        myjobExperianceButton = new Button("My Job Experiance");
        systemSettingsButton = new Button("System Settings");
        myJobContractsButton = new Button("My Job Contracts");
        //----------------------------------------------------------------------

    }

    @Override
    public void addChildren() {
        //
        v1.setId("nav");
        v1.getChildren().addAll(menuButton, findJobButton, myEmployersButton, myJobContractsButton, myjobExperianceButton, systemSettingsButton);
        //
        h1.getChildren().addAll(v1, subScene);
        getChildren().addAll(h1);
        //
        subScene.setRoot(new HBox());
    }

    @Override
    public void bindings() {
        //-------

        menuButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        menuButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        findJobButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        findJobButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        myEmployersButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        myEmployersButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        myJobContractsButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        myJobContractsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        myjobExperianceButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        myjobExperianceButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        systemSettingsButton.prefHeightProperty().bind(v1.heightProperty().multiply(0.1));
        systemSettingsButton.prefWidthProperty().bind(v1.widthProperty().multiply(0.8));

        //------
    }

    @Override
    public void alignElements() {
    }

}
