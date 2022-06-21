package PopUps;

import ViewsBase.SubView;
import javafx.scene.control.Label;

public class FeedBackSubView extends SubView {

    
    
    Label feedbackLabel;
    
    
    
    @Override
    public void init() {
        feedbackLabel=new Label("Feedback");
    }

    @Override
    public void addChildren() {
        h1.getChildren().add(feedbackLabel);
    }

    @Override
    public void bindings() {
    }

    @Override
    public void alignElements() {
    }

}
