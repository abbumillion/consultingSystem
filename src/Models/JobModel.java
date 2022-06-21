package Models;

import DomainObjects.Job;
import DomainObjects.Skill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobModel extends TableModel {
    //
    //
    //model class for manipulating job table onthe database
    //
    //

    public boolean InsertJob(Job job) {
        //
        //
        //
        //
        //
        System.out.println("Jobtitle:"+job.getJobTitle());
        System.out.println("JobDescription:"+job.getJobDescription());
        System.out.println("Experiance:"+job.getExperianceReq());
        System.out.println("Vacancy:"+job.getNumberOfVacancies());
        System.out.println("EmployerCompany:"+job.getEmployerCompany().getCompanyName());
        System.out.println("Gender:"+job.getGender());
        System.out.println("Salary:"+job.getSalary());
        
        initModel();
        try {
            preparedStatement = connection.prepareStatement("insert into job"
                    + "(id,title,posteddate,gender,companyid,skillid,salary,educationlevel,enddate,jobdescription"
                    + "values(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, job.getJobId());
            preparedStatement.setString(2, job.getJobTitle());
            preparedStatement.setString(3, job.getStartDate());
            preparedStatement.setString(4, job.getGender());
            preparedStatement.setInt(5, job.getEmployerCompany().getId());
            //  preparedStatement.setInt(6, job.getRequiredSkills().);
            preparedStatement.setString(7, job.getStartDate());
            preparedStatement.setString(8, job.getEducationalLevel());
            preparedStatement.setString(9, job.getEndDate());
            preparedStatement.setString(10, job.getJobDescription());
            //
            //
            //
            //
            return preparedStatement.execute();
        } catch (Exception exp) {
            
            System.out.println("job insertion failed.");

        }
        return false;
    }

    public Job getJob(int jobId) throws SQLException {
        //
        //
        //
        //
        //
        initModel();
        Job.JobBuilder jobbuilder = new Job.JobBuilder();
        Skill.SkillBuilder skillBuilder = new Skill.SkillBuilder();
        preparedStatement = connection.prepareStatement("select  from job where id=" + jobId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            String startdate = resultSet.getString("startdate");
            String enddate = resultSet.getString("enddate");
            int skillid = resultSet.getInt("skillid");
            return jobbuilder.JobId(id).JobTitle(title).build();
        }
        //
        //
        //
        //
        //
        return null;
    }

    public List getJobs() {
        //
        //
        //
        //
        //
        initModel();
        List<Job> jobs;
        jobs = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("select * from Job");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //
                //
                Job job = null;
                // job.setJobId(resultSet.getString("AddressId"));
                //job.setStartDate(resultSet.getString("City"));
                //  job.setState(resultSet.getString("State"));
                //  job.setCountry(resultSet.getString("Country"));
                jobs.add(job);
                //
                //
            }

        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jobs;
        //
        //
        //
        //
    }

}
