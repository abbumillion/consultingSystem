package Models;

import DomainObjects.Interview;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterviewModel extends TableModel {
    //
    //model class for manipulating interview table on the database
    //
    public boolean InsertInterview(Interview interview) throws SQLException {
        //
        initModel();
        preparedStatement = connection.prepareStatement("insert into interview"
                + "(id,jobapplicationid,dateandtime,addressid,type"
                + "values(?,?,?,?,?)");
        preparedStatement.setInt(1, interview.getInterviewId());
        preparedStatement.setInt(2, interview.getJobApplication().getId());
        preparedStatement.setString(3, interview.getInterviewDateAndTime());
        preparedStatement.setInt(4, interview.getAddress().getAddressId());
        preparedStatement.setString(5, interview.getInterviewType());
        //
        return preparedStatement.execute();
    }

    public Interview getInterview(String interviewid) throws SQLException {
        //
        //
        initModel();
        //  Job.JobBuilder jobbuilder = new Job.JobBuilder();
        // Skill.SkillBuilder skillBuilder = new Skill.SkillBuilder();
        //
        Interview.InterviewBuilder interviewBuilder = new Interview.InterviewBuilder();

        preparedStatement = connection.prepareStatement("select  from job where id=" + interviewid);
        ResultSet resultSet = preparedStatement.executeQuery();
        int id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String startdate = resultSet.getString("startdate");
        String enddate = resultSet.getString("enddate");
        int skillid = resultSet.getInt("skillid");
        return interviewBuilder.build();
        //
    }

    public List getJobs() {
        //
        initModel();
        List<Interview> interviews;
        interviews = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("select * from Job");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //
                //
                Interview.InterviewBuilder interviewBuilder = new Interview.InterviewBuilder();
                // job.setJobId(resultSet.getString("AddressId"));
                //job.setStartDate(resultSet.getString("City"));
                //  job.setState(resultSet.getString("State"));
                //  job.setCountry(resultSet.getString("Country"));
                Interview interview = interviewBuilder.build();
                interviews.add(interview);
                //
            }

        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return interviews;
        //
        //
    }

}
