package PopUps;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class AboutUsSubView extends SubView {
    
    @Override
    public void init() {
        titleLabel = new Label("About Us");
    }
    
    @Override
    public void addChildren() {
        getChildren().addAll(titleLabel);
    }
    
    @Override
    public void bindings() {
        
    }
    
    @Override
    public void alignElements() {
        titleLabel.setAlignment(Pos.TOP_CENTER);
    }
    
}
