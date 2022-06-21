package Tabs.Account;

import javafx.scene.control.Label;

public class AdminAccountTab extends UserAccountTab {

    Label AdminLevelLabel;

    @Override
    public void init() {
        AdminLevelLabel = new Label("Admin Level");
    }

    @Override
    public void addChildren() {
        h1.getChildren().addAll(titleLabel);
        h2.getChildren().addAll(firstnameLabel, lastnameLabel);
        h3.getChildren().addAll(emailLabel, dateofbirthLabel);
        h4.getChildren().addAll(genderLabel);
        //
        v1.getChildren().addAll(h1,h2,h3,h4);
        //
        
        getChildren().addAll(v1);
    }

    @Override
    public void bindings() {
    }

    @Override
    public void alignElements() {
    }

    
    
}
