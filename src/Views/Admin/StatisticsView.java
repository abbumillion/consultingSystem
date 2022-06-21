package Views.Admin;

import Views.SubView;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;

public class StatisticsView extends SubView {

    NumberAxis xAxis1,yAxis1;
     
    LineChart<Number, Number> applicantsChart;
    XYChart.Series applicantsSeries, jobsSeries, clientsSeries;
    Button refreshButton;

    @Override
    public void init() {
        
        //this class represent 
        //a statistics representation or simulation of
        //joblist,userlist and applicant list

        refreshButton = new Button("Refresh");

        xAxis1 = new NumberAxis();
        yAxis1 = new NumberAxis();

        applicantsChart = new LineChart<>(xAxis1,yAxis1);
        applicantsChart.setTitle("Applicant Statistics");

        //defining a series        
        applicantsSeries = new XYChart.Series();
        applicantsSeries.setName("Applicant Statistics");

        jobsSeries = new XYChart.Series();
        jobsSeries.setName("Job Statistics");

        clientsSeries = new XYChart.Series();
        clientsSeries.setName("Client Statistics");
    }

    @Override
    public void addChildren() {
        applicantsChart.getData().addAll(applicantsSeries, jobsSeries, clientsSeries);
        getChildren().addAll(refreshButton, applicantsChart);

    }

    @Override
    public void bindings() {
        applicantsChart.prefHeightProperty().bind(heightProperty());
        applicantsChart.prefWidthProperty().bind(widthProperty());

    }

    @Override
    public void alignElements() {

        applicantsSeries.setName("Applicants");
        jobsSeries.setName("Jobs");
        clientsSeries.setName("Clients");
        xAxis1.setLabel("Date");
        yAxis1.setLabel("Number of Applicant");
        applicantsChart.setAnimated(true);

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

    public Button getRefreshButton() {
        return refreshButton;
    }

}
