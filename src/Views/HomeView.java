package Views;

import Factories.TabFactory;
import Tabs.ApplicantsTab;
import Tabs.CompaniesTab;
import Tabs.EvaluationsTab;
import Tabs.HelpTab;
import Tabs.InterviewsTab;
import Tabs.JobApplicationTab;
import Tabs.JobsTab;
import Tabs.MyAccountTab;
import Tabs.SettingsTab;
import Tabs.StatisticsTab;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;

public abstract class HomeView extends View {

    protected TabPane tabPane;
    protected Tab HomeTab, ApplicantsTab, CompaniesTab, JobApplicationsTab, JobsTab, EvaluationsTab, InterviewsTab, StatisticsTab, HelpTab, SettingsTab, myAccountTab;
    protected MyAccountTab myaccountTab;
    protected ApplicantsTab applicantsTab;
    protected InterviewsTab interviewsTab;
    protected JobApplicationTab jobApplicationsTab;
    protected EvaluationsTab evaluationTab;
    protected JobsTab jobsTab;
    protected CompaniesTab companiesTab;
    protected StatisticsTab statisticsTab;
    protected HelpTab helpTab;
    protected SettingsTab settingsTab;

    @Override
    public void init() {

        tabPane = new TabPane();
        //
        HomeTab = new Tab("Home");
        JobsTab = new Tab("Jobs");
        JobApplicationsTab = new Tab("Job Applications");
        ApplicantsTab = new Tab("Applicants");
        EvaluationsTab = new Tab("Evaluations");
        SettingsTab = new Tab("Settings");
        CompaniesTab = new Tab("Companies");
        HelpTab = new Tab("Help");
        StatisticsTab = new Tab("Statistics");
        InterviewsTab = new Tab("Interviews");
        myAccountTab = new Tab("My Account");

        applicantsTab = (ApplicantsTab) TabFactory.getTab(TabType.APPLICANTSTAB);
        jobsTab = (JobsTab) TabFactory.getTab(TabType.JOBSTAB);
        companiesTab = (CompaniesTab) TabFactory.getTab(TabType.COMPANIESTAB);
        myaccountTab = (MyAccountTab) TabFactory.getTab(TabType.MYACCOUNTTAB);
        jobApplicationsTab=(JobApplicationTab) TabFactory.getTab(TabType.JOBAPPLICATIONTAB);
        statisticsTab = (StatisticsTab) TabFactory.getTab(TabType.STATISTICSTAB);
        interviewsTab = (InterviewsTab) TabFactory.getTab(TabType.INTERVIEWSTAB);
        companiesTab = (CompaniesTab) TabFactory.getTab(TabType.COMPANIESTAB);
        evaluationTab = (EvaluationsTab) TabFactory.getTab(TabType.EVALUATIONSTAB);
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
        getChildren().addAll(topBox, tabPane, bottomBox);

    }

    @Override
    public void bindings() {
        tabPane.prefWidthProperty().bind(widthProperty());
        tabPane.prefHeightProperty().bind(heightProperty().multiply(0.8));
    }

    @Override
    public void alignElements() {
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        searchHBox.setVisible(true);
        //
        HomeTab.setGraphic(new ImageView("Assets/icons8-home-48.png"));
        ApplicantsTab.setGraphic(new ImageView("Assets/icons8-applicant-48.png"));
        CompaniesTab.setGraphic(new ImageView("Assets/icons8-related-companies-48.png"));
        EvaluationsTab.setGraphic(new ImageView("Assets/icons8-test-48.png"));
        InterviewsTab.setGraphic(new ImageView("Assets/icons8-interview-48.png"));
        StatisticsTab.setGraphic(new ImageView("Assets/icons8-statistics-48.png"));
        JobsTab.setGraphic(new ImageView("Assets/icons8-job-48.png"));
        HelpTab.setGraphic(new ImageView("Assets/icons8-help-48.png"));
        SettingsTab.setGraphic(new ImageView("Assets/icons8-settings-48.png"));
        myAccountTab.setGraphic(new ImageView("Assets/AccountSmallLogo.png"));
        //
        searchHBox.setVisible(true);
    }

    public TabPane getTabPane() {
        return tabPane;
    }

    public MyAccountTab getMyAccountTab() {
        return myaccountTab;
    }

    public ApplicantsTab getApplicantsTab() {
        return applicantsTab;
    }

    public InterviewsTab getInterviewsTab() {
        return interviewsTab;
    }

    public EvaluationsTab getEvaluationTab() {
        return evaluationTab;
    }

    public JobsTab getJobsTab() {
        return jobsTab;
    }

    public CompaniesTab getCompaniesTab() {
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

    public JobApplicationTab getJobApplicationsTab() {
        return jobApplicationsTab;
    }
    

}
