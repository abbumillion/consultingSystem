package Tabs;

import ViewsBase.SubView;
import java.util.Date;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;

public class StatisticsTab extends SubView {

    //
    NumberAxis yAxis1;
    CategoryAxis xAxis1;
    //
    NumberAxis Axis1;
    NumberAxis Axis2;
    //
    PieChart.Data applicants, jobs, employers;
    //
    LineChart lineChart;
    //
    PieChart pieChart;
    BarChart<String, Number> applicantsChart;
    //
    XYChart.Series s1, s2, s3;
    //
    XYChart.Series applicantsSeries, jobsSeries, clientsSeries;
    //
    Label descLabel;

    //
    @Override
    public void init() {
        //this class represent 
        //a statistics representation or simulation of
        //joblist,userlist and applicant list
        //
        descLabel = new Label("This User interface shows the platform  data simulation\n"
                + "applicant jobs employer companies statistics.it's based on real time data\n"
                + "that is collected during system operation.");
        descLabel.setId("font-16");
        //
        yAxis1 = new NumberAxis();
        xAxis1 = new CategoryAxis();
        //
        Axis1 = new NumberAxis();
        Axis2 = new NumberAxis();
        //
        lineChart = new LineChart(Axis1, Axis2);
        //
        applicants = new PieChart.Data("Applicants", 0.63335);
        jobs = new PieChart.Data("Jobs", 0.23335);
        employers = new PieChart.Data("Employers", 0.22225);

        pieChart = new PieChart();
        applicantsChart = new BarChart<>(xAxis1, yAxis1);
        applicantsChart.setTitle("System Statistics");

        //defining a series        
        applicantsSeries = new XYChart.Series();
        applicantsSeries.setName("Applicant Statistics");

        jobsSeries = new XYChart.Series();
        jobsSeries.setName("Job Statistics");

        clientsSeries = new XYChart.Series();
        clientsSeries.setName("Client Statistics");
        //
        s1 = new XYChart.Series();
        s2 = new XYChart.Series();
        s3 = new XYChart.Series();
    }

    @Override
    public void addChildren() {
        pieChart.getData().addAll(applicants, jobs, employers);
        applicantsChart.getData().addAll(applicantsSeries, jobsSeries, clientsSeries);
        lineChart.getData().addAll(s1, s2, s3);
        v1.getChildren().addAll(pieChart, lineChart);
        h1.getChildren().addAll(descLabel);
        h2.getChildren().addAll(applicantsChart, v1);
        v2.getChildren().addAll(h1, h2);
        getChildren().addAll(v2);

    }

    @Override
    public void bindings() {
        applicantsChart.prefHeightProperty().bind(h1.heightProperty().multiply(0.9));
        applicantsChart.prefWidthProperty().bind(h1.widthProperty().multiply(0.65));

        pieChart.prefHeightProperty().bind(v1.heightProperty().multiply(0.5));
        pieChart.prefWidthProperty().bind(v1.widthProperty());

        lineChart.prefHeightProperty().bind(v1.heightProperty().multiply(0.5));
        lineChart.prefWidthProperty().bind(v1.widthProperty());

        v1.prefHeightProperty().bind(h1.heightProperty());
        v1.prefWidthProperty().bind(h1.widthProperty().multiply(0.35));

        h2.prefHeightProperty().bind(v2.heightProperty().multiply(0.9));
        h2.prefWidthProperty().bind(v2.widthProperty());

        h1.prefHeightProperty().bind(v2.heightProperty().multiply(0.1));
        h1.prefWidthProperty().bind(v2.widthProperty());

        descLabel.prefWidthProperty().bind(h2.widthProperty().multiply(0.6));

        v2.prefHeightProperty().bind(heightProperty());
        v2.prefWidthProperty().bind(widthProperty());

    }

    @Override
    public void alignElements() {

        pieChart.setAnimated(true);
        pieChart.setLabelsVisible(true);
        applicantsSeries.setName("Applicants");
        jobsSeries.setName("Jobs");
        clientsSeries.setName("Clients");
        xAxis1.setLabel(new Date().getYear() + "");
        yAxis1.setLabel("Number in Millions ");
        applicantsChart.setAnimated(true);
        descLabel.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        v1.setAlignment(Pos.CENTER);

        descLabel.setId("font-11");

    }

    public Series getApplicantsSeries() {
        return applicantsSeries;
    }

    public Series getJobsSeries() {
        return jobsSeries;
    }

    public Series getClientsSeries() {
        return clientsSeries;
    }

    public PieChart.Data getApplicants() {
        return applicants;
    }

    public PieChart.Data getJobs() {
        return jobs;
    }

    public PieChart.Data getEmployers() {
        return employers;
    }

    public Series getS1() {
        return s1;
    }

    public Series getS2() {
        return s2;
    }

    public Series getS3() {
        return s3;
    }

}
