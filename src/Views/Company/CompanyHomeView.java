package Views.Company;

import Factories.TabFactory;
import Tabs.Account.CompanyAccountTab;
import Tabs.Home.CompanyHomeTab;
import ViewsBase.HomeView;
import ViewsBase.TabType;

public class CompanyHomeView extends HomeView {

    CompanyHomeTab homeTab;
    CompanyAccountTab companyAccountTab;

    @Override
    public void init() {
        //--------------------------------------------------------------------//
        title = "Company Home View";
        homeTab = (CompanyHomeTab) TabFactory.getTab(TabType.COMPANYHOMETAB);
        companyAccountTab=new CompanyAccountTab();
        companyAccountTab.getReady();
        super.init();
        super.addChildren();
        super.alignElements();
        super.bindings();
        //--------------------------------------------------------------------//
    }

    @Override
    public void addChildren() {
        HomeTab.setContent(homeTab);
        myAccountTab.setContent(companyAccountTab);
        tabPane.getTabs().addAll(HomeTab,JobsTab,JobApplicationsTab,
                InterviewsTab, EvaluationsTab,SearchTab, StatisticsTab, SettingsTab, HelpTab, myAccountTab);
    }

    @Override
    public void bindings() {
        //
        //
        //
        //
    }


    @Override
    public void alignElements() {
        //
        //
        //
        //
        //

    }

    public CompanyHomeTab getHomeTab() {
        return homeTab;
    }

    public CompanyAccountTab getCompanyAccountTab() {
        return companyAccountTab;
    }

    
    
    
}
