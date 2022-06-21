/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import Models.Model;
import PopUps.AboutUsSubView;
import ViewsBase.SubView;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AboutUsController extends SubViewController{

    AboutUsSubView v;
    public AboutUsController(SubView subView, Model model) {
        super(subView, model);
        v=(AboutUsSubView)subView;
    }



    @Override
    public void RegisterEvents() {
        
        
        
        
        
    }
    

    @Override
    public void StartController() {
        v.showView();
        
    }

}
