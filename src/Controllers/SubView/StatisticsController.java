package Controllers.SubView;

import Models.Model;
import Tabs.StatisticsTab;
import ViewsBase.SubView;
import java.sql.SQLException;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class StatisticsController extends SubViewController {

    StatisticsTab v;

    public StatisticsController(SubView subView, Model model) {
        super(subView, model);
    }

    @Override
    public void StartController() {
        v = (StatisticsTab) subView;
        setSeriesData(v.getApplicantsSeries());
        setSeriesData(v.getClientsSeries());
        setSeriesData(v.getJobsSeries());

    }

    @Override
    public void RegisterEvents() {
        v = (StatisticsTab) subView;
        v.getS1().getData().clear();
        v.getS2().getData().clear();
        v.getS3().getData().clear();
        v.getApplicantsSeries().getData().clear();
        v.getClientsSeries().getData().clear();
        v.getJobsSeries().getData().clear();
        v.getApplicants().setPieValue(0.0);
        v.getEmployers().setPieValue(0.0);
        v.getJobs().setPieValue(0.0);
        setSeriesData(v.getApplicantsSeries());
        setSeriesData(v.getClientsSeries());
        setSeriesData(v.getJobsSeries());
        setLineChartData(v.getS1());
        setLineChartData(v.getS2());
        setLineChartData(v.getS3());
        v.getS1().setName("Applicants");
        v.getS2().setName("Jobs");
        v.getS3().setName("Employers");
        setLineChartData(v.getS1());
        setLineChartData(v.getS2());
        setLineChartData(v.getS3());
        setPieChart();

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

    private void setLineChartData(Series s) {

        s.getData().clear();
        s.getData().add(new XYChart.Data<>(1, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(1, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(10, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(20, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(30, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(40, Math.random() * 10));
        s.getData().add(new XYChart.Data<>(50, Math.random() * 10));
    }

    private void setPieChart()  {
        // applicants = new PieChart.Data("Applicants", 0.63335);
        // jobs = new PieChart.Data("Jobs", 0.23335);
        //employers = new PieChart.Data("Employers", 0.22225);
        int numberOfCompanies = 0, numberOfApplicants = 0, numberOfJobs = 0, Total = 0;
//        numberOfCompanies = model.getCompanyModel().getCompanies().size();
        //  numberOfApplicants = model.getUsers().getApplicants().size();
        // numberOfJobs = model.getJobModel().getJobs().size();
        //  Total = numberOfJobs + numberOfApplicants + numberOfCompanies;
        //
        //
//        double companyPercent = (double) (numberOfCompanies / Total);
        //      double applicantPercent = (double) (numberOfApplicants / Total);
        //    double jobPercent = (double) (numberOfJobs / Total);

        //
        v.getApplicants().setName("Applicant");
        v.getApplicants().setPieValue(Math.random());
        v.getEmployers().setName("Employer");
        v.getEmployers().setPieValue(Math.random());
        v.getJobs().setName("Jobs");
        v.getJobs().setPieValue(Math.random());
        //
    }

}
