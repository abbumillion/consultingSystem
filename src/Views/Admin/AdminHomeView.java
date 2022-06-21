package Views.Admin;

import Factories.TabFactory;
import Tabs.Account.AdminAccountTab;
import Tabs.Home.AdminHomeTab;
import ViewsBase.HomeView;
import ViewsBase.TabType;

public class AdminHomeView extends HomeView {

    AdminHomeTab adminHomeTab;
    AdminAccountTab adminAccountTab;

    @Override
    public void init() {
        //title for the window
        title = "Admin Home";
        adminHomeTab = (AdminHomeTab) TabFactory.getTab(TabType.ADMINHOMETAB);
        adminAccountTab=new AdminAccountTab();
        adminAccountTab.getReady();
        //
        //this class super class calling
        super.init();
        super.addChildren();
        super.alignElements();
        super.bindings();
        //
        //

    }

    @Override
    public void addChildren() {

        //tables setup      
        HomeTab.setContent(adminHomeTab);
        myAccountTab.setContent(adminAccountTab);
        //set contents to the tab
        tabPane.getTabs().addAll(HomeTab, ApplicantsTab, CompaniesTab, JobsTab, InterviewsTab, EvaluationsTab,SearchTab, StatisticsTab, SettingsTab, HelpTab, myAccountTab);
    }

    @Override
    public void bindings() {
    }

    @Override
    public void alignElements() {

    }

    public AdminHomeTab getAdminHomeTab() {
        return adminHomeTab;
    }

}
