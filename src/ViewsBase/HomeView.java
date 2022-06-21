package ViewsBase;

import Factories.TabFactory;
import Tabs.HelpTab;
import Tabs.Listviews.ListViewTab;
import Tabs.Account.MyAccountTab;
import Tabs.Search.SearchTab;
import Tabs.SettingsTab;
import Tabs.StatisticsTab;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;

public abstract class HomeView extends View {

    protected TabPane tabPane;
    protected Tab HomeTab, ApplicantsTab, CompaniesTab, JobApplicationsTab, JobsTab, EvaluationsTab, InterviewsTab, SearchTab, StatisticsTab, HelpTab, SettingsTab, myAccountTab;
    protected MyAccountTab myaccountTab;
    protected ListViewTab applicantsTab, interviewsTab, jobApplicationsTab, evaluationTab, companiesTab, jobsTab;
    protected StatisticsTab statisticsTab;
    protected HelpTab helpTab;
    protected SearchTab searchTab;
    protected SettingsTab settingsTab;

    @Override
    public void init() {

        tabPane = new TabPane();
        //
        HomeTab = new Tab("Home");
        JobsTab = new Tab("Posted Jobs");
        JobApplicationsTab = new Tab("Job Applications");
        ApplicantsTab = new Tab("Applicants");
        EvaluationsTab = new Tab("Interview Evaluations");
        SearchTab = new Tab("Search");
        SettingsTab = new Tab("Settings");
        CompaniesTab = new Tab("Companies");
        HelpTab = new Tab("Help");
        StatisticsTab = new Tab("Statistics");
        InterviewsTab = new Tab("Job Interviews");
        myAccountTab = new Tab("My Account");

        applicantsTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        jobsTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        companiesTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
//        myaccountTab = (MyAccountTab) TabFactory.getTab(TabType.MYACCOUNTTAB);
        jobApplicationsTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        statisticsTab = (StatisticsTab) TabFactory.getTab(TabType.STATISTICSTAB);
        interviewsTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        searchTab = (SearchTab) TabFactory.getTab(TabType.SEARCHTAB);
        companiesTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        evaluationTab = (ListViewTab) TabFactory.getTab(TabType.LISTVIEWTAB);
        settingsTab = (SettingsTab) TabFactory.getTab(TabType.SETTINGSTAB);
        helpTab = (HelpTab) TabFactory.getTab(TabType.HELPTAB);

    }

    @Override
    public void addChildren() {
        ApplicantsTab.setContent(applicantsTab);
        InterviewsTab.setContent(interviewsTab);
        JobsTab.setContent(jobsTab);
        CompaniesTab.setContent(companiesTab);
        EvaluationsTab.setContent(evaluationTab);
        SettingsTab.setContent(settingsTab);
        StatisticsTab.setContent(statisticsTab);
        JobApplicationsTab.setContent(jobApplicationsTab);
        HelpTab.setContent(helpTab);
        myAccountTab.setContent(myaccountTab);
        SearchTab.setContent(searchTab);
        getChildren().addAll(tabPane, bottomBox);

    }

    @Override
    public void bindings() {
        tabPane.prefWidthProperty().bind(widthProperty());
        tabPane.prefHeightProperty().bind(heightProperty().multiply(0.95));
    }

    @Override
    public void alignElements() {
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        //
        HomeTab.setGraphic(new ImageView("Assets/icons8-home-48.png"));
        ApplicantsTab.setGraphic(new ImageView("Assets/icons8-applicant-48.png"));
        CompaniesTab.setGraphic(new ImageView("Assets/icons8-related-companies-48.png"));
        EvaluationsTab.setGraphic(new ImageView("Assets/icons8-test-48.png"));
        InterviewsTab.setGraphic(new ImageView("Assets/icons8-interview-48.png"));
        StatisticsTab.setGraphic(new ImageView("Assets/icons8-statistics-48.png"));
        JobsTab.setGraphic(new ImageView("Assets/icons8-job-48.png"));
        HelpTab.setGraphic(new ImageView("Assets/icons8-help-48.png"));
        JobApplicationsTab.setGraphic(new ImageView("Assets/jobapplications.png"));
        SettingsTab.setGraphic(new ImageView("Assets/icons8-settings-48.png"));
        SearchTab.setGraphic(new ImageView("Assets/icons8-search-48.png"));
        // myAccountTab.setGraphic(new ImageView("Assets/a.png"));
        //
    }

    public TabPane getTabPane() {
        return tabPane;
    }

    public MyAccountTab getMyAccountTab() {
        return myaccountTab;
    }

    public ListViewTab getApplicantsTab() {
        return applicantsTab;
    }

    public ListViewTab getInterviewsTab() {
        return interviewsTab;
    }

    public ListViewTab getEvaluationTab() {
        return evaluationTab;
    }

    public ListViewTab getJobsTab() {
        return jobsTab;
    }

    public ListViewTab getCompaniesTab() {
        return companiesTab;
    }

    public StatisticsTab getStatisticsTab() {
        return statisticsTab;
    }

    public HelpTab getHelpTab() {
        return helpTab;
    }

    public SettingsTab getSettingsTab() {
        return settingsTab;
    }

    public ListViewTab getJobApplications() {
        return jobApplicationsTab;
    }

}
