package Controllers;

import Controllers.SubView.StatisticsController;
import DomainObjects.Applicant;
import DomainObjects.Authenticable;
import DomainObjects.Company;
import DomainObjects.Job;
import DomainObjects.JobApplication;
import Models.Model;
import Tabs.Listviews.ApplicantCell;
import Tabs.Listviews.CompanyCell;
import Tabs.Listviews.JobApplicationCell;
import Tabs.Listviews.JobCell;
import ViewsBase.HomeView;
import ViewsBase.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public abstract class HomeController extends ViewController {

    private Authenticable user;
    private HomeView v;

    public HomeController(View v, Model m) {
        super(v, m);

    }

    @Override
    public void RegisterEvents() {
        v = (HomeView) view;

        v.getSettingsTab().getFullScreen().selectedProperty().addListener((obsr, oldv, nvl) -> {
            if (nvl != null) {
                v.setFullScreenEvent();
            }
        });
        StatisticsController statisticsController = new StatisticsController(v.getStatisticsTab(), model);
        StartController(statisticsController);
        setUpAccountUserInformation();
        setUpListViews();
        getRandomData();
        // getDataFromDatabase();
        //
    }

    private void setUpAccountUserInformation() {
        v = (HomeView) view;
        /// v.getMyAccountTab().getUserIdLabel().setText("ID:" + user.getId());
        //  v.getMyAccountTab().getUsernameLabel().setText("UserName:" + user.getUserName());
        //  v.getMyAccountTab().getFirstnameLabel().setVisible(false);
        //  v.getMyAccountTab().getLastnameLabel().setVisible(false);
        //  v.getMyAccountTab().getGenderLabel().setVisible(false);
        //  v.getMyAccountTab().getEmailLabel().setText("Email:" + user.getEmail());
        //  v.getMyAccountTab().getCellphoneLabel().setText("PhoneNumber:" + user.getCellPhone());
        //  v.getMyAccountTab().getDateofbirthLabel().setVisible(false);

    }

    public Authenticable getUser() {
        return user;
    }

    public void setUser(Authenticable user) {
        this.user = user;
    }

    private void setUpListViews() {

        v.getApplicantsTab().getListView().setCellFactory(new Callback<ListView<Applicant>, ListCell<Applicant>>() {
            @Override
            public ListCell<Applicant> call(ListView<Applicant> param) {
                return new ApplicantCell();
            }
        });

        v.getJobsTab().getListView().setCellFactory(new Callback<ListView<Job>, ListCell<Job>>() {
            @Override
            public ListCell<Job> call(ListView<Job> param) {
                JobCell jobCell = new JobCell();
                return jobCell;
            }
        });
        //
        v.getCompaniesTab().getListView().setCellFactory(new Callback<ListView<Company>, ListCell<Company>>() {
            @Override
            public ListCell<Company> call(ListView<Company> param) {
                return new CompanyCell();
            }
        });
        //
        v.getJobApplications().getListView().setCellFactory(new Callback<ListView<JobApplication>, ListCell<JobApplication>>() {
            @Override
            public ListCell<JobApplication> call(ListView<JobApplication> param) {
                JobApplicationCell jobCell = new JobApplicationCell();
                return jobCell;
            }
        });
        //

        //
    }

    private void SearchSubSystem() {
        v.EmptyFieldAlert();
        String selectedItem = v.getTabPane().getSelectionModel().getSelectedItem().textProperty().get();
        if (selectedItem.equalsIgnoreCase("Home")) {
            //
            //
            //
        } else if (selectedItem.equalsIgnoreCase("Applicants")) {
            //
            //
            //
        } else if (selectedItem.equalsIgnoreCase("companies")) {
            //
            //
            //
        } else if (selectedItem.equalsIgnoreCase("jobs")) {
            //
            //
            // 
        } else if (selectedItem.equalsIgnoreCase("interviews")) {
            //
            //
            //
        } else if (selectedItem.equalsIgnoreCase("evaluations")) {
            //
            //
            //
        } else if (selectedItem.equalsIgnoreCase("statistics")) {
            //
        } else {
            //
        }
    }

    public void getRandomData() {
        //add some random data here
        List applicants = new ArrayList<>();
        List companies = new ArrayList<>();

        List jobs = new ArrayList<>();
        List admins = new ArrayList<>();
        List jobapplications = new ArrayList<>();
        List interviews = new ArrayList<>();
        List evaluations = new ArrayList<>();
        List contracts = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            //
            //
            Applicant.ApplicantBuilder ab = new Applicant.ApplicantBuilder();
            Applicant applicant = ab.FirstName("Million").LastName("Sharbe").UserName("milli").Password("2724").build();
            applicants.add(applicant);
            //
            Company.CompanyBuilder cb = new Company.CompanyBuilder();
            Company company = cb.CompanyName("Million Software Solutions").CompanyType("NGO").UserName("mss").Password("1234").build();
            //
            companies.add(company);
            //
            Job.JobBuilder jb = new Job.JobBuilder();
            Job job = jb.EmployerCompany(company).JobTitle("Designer").JobDescription("any designing related job").EndDate(new Date().toString()).build();
            //
            jobs.add(job);
            //
            JobApplication.JobApplicationBuilder jab = new JobApplication.JobApplicationBuilder();
            JobApplication jobapplication = jab.Job(job).ID(i).Applicant(applicant).build();
            //
            jobapplications.add(jobapplication);
            //
            //
        }

        v.getApplicantsTab().getListView().getItems().addAll(applicants);
        v.getCompaniesTab().getListView().getItems().addAll(companies);
        v.getEvaluationTab().getListView().getItems().addAll(evaluations);
        v.getJobsTab().getListView().getItems().addAll(jobs);
        v.getInterviewsTab().getListView().getItems().addAll(interviews);
        v.getJobApplications().getListView().getItems().addAll(jobapplications);
    }

    public void getDataFromDatabase() {
        v = (HomeView) view;
        v.getApplicantsTab().getListView().getItems().addAll(model.getUserModel().getApplicants());
        v.getCompaniesTab().getListView().getItems().addAll(model.getCompanyModel().getCompanies());
        v.getEvaluationTab().getListView().getItems().addAll(model.getEvaluationModel().getEvaluations());
        v.getJobsTab().getListView().getItems().addAll(model.getJobModel().getJobs());
        // v.getInterviewsTab().getListView().getItems().addAll(model.);
        //  v.getJobApplications().getListView().getItems().addAll(model.);
        //
        //  v.getApplicantsTab().getListView().setCellFactory(value);
    }

}
