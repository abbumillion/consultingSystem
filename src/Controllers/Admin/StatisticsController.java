package Controllers.Admin;

import Models.Model;
import Tabs.StatisticsTab;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class StatisticsController {

    StatisticsTab view;
    Model model;

    public StatisticsController(StatisticsTab view, Model model) {
        this.view = view;
        this.model = model;

    }

    public void StartController() {
        RegisterEvents();
        setSeriesData(view.getApplicantsSeries());
        setSeriesData(view.getClientsSeries());
        setSeriesData(view.getJobsSeries());

    }

    private void RegisterEvents() {

        view.getClearButton().setOnAction(e -> {
            view.getS1().getData().clear();
            view.getS2().getData().clear();
            view.getS3().getData().clear();
            view.getApplicantsSeries().getData().clear();
            view.getClientsSeries().getData().clear();
            view.getJobsSeries().getData().clear();

            view.getApplicants().setPieValue(0.0);
            view.getEmployers().setPieValue(0.0);
            view.getJobs().setPieValue(0.0);

        });
        view.getFillData().setOnAction(e -> {
            view.getRefreshButton().fire();
        });
        view.getSummaryButton().setOnAction(e -> {
        });

        view.getRefreshButton().setOnAction(e -> {

            setSeriesData(view.getApplicantsSeries());
            setSeriesData(view.getClientsSeries());
            setSeriesData(view.getJobsSeries());
            setLineChartData(view.getS1());
            setLineChartData(view.getS2());
            setLineChartData(view.getS3());
            try {
                setPieChart();
                //--------------------------------------
            } catch (SQLException ex) {
                Logger.getLogger(StatisticsController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        view.getS1().setName("Applicants");
        view.getS2().setName("Jobs");
        view.getS3().setName("Employers");
        setLineChartData(view.getS1());
        setLineChartData(view.getS2());
        setLineChartData(view.getS3());

    }

    private void setSeriesData(XYChart.Series series) {
        series.getData().clear();
        series.getData().add(new XYChart.Data("Jan,", Math.random() * 10));
        series.getData().add(new XYChart.Data("Feb ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Mar ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Apr ", Math.random() * 10));
        series.getData().add(new XYChart.Data("May ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Jun ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Jul ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Aug ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Sep ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Oct ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Nov ", Math.random() * 10));
        series.getData().add(new XYChart.Data("Dec ", Math.random() * 10));
    }

    public void setLineChartData(Series s) {

        s.getData().clear();
        s.getData().add(new XYChart.Data<>(1, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(1, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(10, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(20, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(30, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(40, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(50, Math.random() * 10));
    }

    public void setPieChart() throws SQLException {
        // applicants = new PieChart.Data("Applicants", 0.63335);
        // jobs = new PieChart.Data("Jobs", 0.23335);
        //employers = new PieChart.Data("Employers", 0.22225);
        int numberOfCompanies = 0, numberOfApplicants = 0, numberOfJobs = 0, Total = 0;
        numberOfCompanies = model.getCompanyModel().getCompanies().size();
      //  numberOfApplicants = model.getUsers().getApplicants().size();
        numberOfJobs = model.getJobModel().getJobs().size();
        Total = numberOfJobs + numberOfApplicants + numberOfCompanies;
        //
        //
        double companyPercent = (double) (numberOfCompanies / Total);
        double applicantPercent = (double) (numberOfApplicants / Total);
        double jobPercent = (double) (numberOfJobs / Total);
        //

        //
        view.getApplicants().setName("Applicant");
        view.getApplicants().setPieValue(Math.random());
        view.getEmployers().setName("Employer");
        view.getEmployers().setPieValue(Math.random());
        view.getJobs().setName("Jobs");
        view.getJobs().setPieValue(Math.random());
        //
    }

}
