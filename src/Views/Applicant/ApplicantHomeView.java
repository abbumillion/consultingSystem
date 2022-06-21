package Views.Applicant;

import Factories.TabFactory;
import Tabs.Account.ApplicantAccountTab;
import Tabs.Home.ApplicantHomeTab;
import Tabs.Listviews.ListViewTab;
import ViewsBase.HomeView;
import ViewsBase.TabType;

public class ApplicantHomeView extends HomeView {
      //
    ListViewTab jobs;
    ApplicantHomeTab applicantHomeTab;
    ApplicantAccountTab applicantAccountTab;

    @Override
    public void init() {
        //
        title = "Applicant Home";
        //
        //
        applicantHomeTab = (ApplicantHomeTab) TabFactory.getTab(TabType.APPLICANTHOMETAB);
        jobs = (Tabs.Listviews.ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        applicantAccountTab=new ApplicantAccountTab();
        
        applicantAccountTab.getReady();
        
        
        super.init();
        super.addChildren();
        super.alignElements();
        super.bindings();
    }

    @Override
    public void addChildren() {
        HomeTab.setContent(applicantHomeTab);
        JobsTab.setContent(jobs);
        myAccountTab.setContent(applicantAccountTab);
        tabPane.getTabs().addAll(HomeTab, JobsTab, InterviewsTab, EvaluationsTab,SearchTab, StatisticsTab, SettingsTab, HelpTab, myAccountTab);
    }

    @Override
    public void bindings() {

    }

    @Override
    public void alignElements() {
    }
    
    
}
