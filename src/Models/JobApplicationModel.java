package Models;

import DomainObjects.JobApplication;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobApplicationModel extends TableModel {
    ///
    //class for manipulating jobapplication table on the database
    //inserting 
    //

    public boolean InsertJobApplication(JobApplication jobApplication) throws SQLException {
        //
        //
        //
        //
        //
        //
        initModel();
        //insert statement
        preparedStatement = connection.prepareStatement("insert into jobapplication"
                + "(id,applicantid,jobid,accepted)"
                + "values(?,?,?,?)");
        //
        //
        //
        //insert variables here
        preparedStatement.setInt(0, jobApplication.getId());
        preparedStatement.setInt(1, jobApplication.getApplicant().getId());
        preparedStatement.setInt(2, jobApplication.getJob().getJobId());
        preparedStatement.setBoolean(3, jobApplication.getAccepted());
        return preparedStatement.execute();
        //
        //
        //
        //
    }

    public JobApplication getJobApplication(String jobaplicationid) throws SQLException {
        //
        //
        //
        //
        //method for getting a single job application
        initModel();
        JobApplication.JobApplicationBuilder jobApplicationBuilder = new JobApplication.JobApplicationBuilder();
        preparedStatement = connection.prepareStatement("select from jobapplication where id=" + jobaplicationid);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            //
            //
            //
            int id = resultSet.getInt("id");
            int jobid = resultSet.getInt("jobid");
            int applicantid = resultSet.getInt("applicantid");
            boolean accepted = resultSet.getBoolean("accepted");
            return jobApplicationBuilder.build();

        }

        return null;
        //
        //
        //
        //
        //
        //
    }

    public List getJobApplications() throws SQLException {

        //
        //
        //
        //
        //
        //
        //
        initModel();
        List<JobApplication> jobApplications;
        jobApplications = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from JobApplication");
        ResultSet resultSet = preparedStatement.executeQuery();
        JobApplication.JobApplicationBuilder jobApplicationBuilder = new JobApplication.JobApplicationBuilder();
        while (resultSet.next()) {
            //
            //
            //
            //
            //
            int id = resultSet.getInt("id");
            int jobid = resultSet.getInt("jobid");
            int applicantid = resultSet.getInt("applicantid");
            boolean accepted = resultSet.getBoolean("accepted");
            //
            //
            //
            //
            //
            JobApplication jobApplication = jobApplicationBuilder.build();
            //
            //
            jobApplications.add(jobApplication);
        }

        return jobApplications;
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
    }

}
