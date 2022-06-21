package Models;

import DomainObjects.Job;
import DomainObjects.JobSkill;
import DomainObjects.Skill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobSkillModel extends TableModel {

    public boolean InsertJob(JobSkill jobSkill) {
        //
        //
        //
        //
        //
        initModel();
        try {
            preparedStatement = connection.prepareStatement("insert into jobskill"
                    + "(id,jobid,skillid"
                    + "values(?,?,?)");
            preparedStatement.setInt(1, jobSkill.getJobskillid());
            preparedStatement.setInt(2, jobSkill.getJob().getJobId());
            preparedStatement.setInt(3, jobSkill.getSkill().getSkillId());
            //
            //
            //
            //
            return preparedStatement.execute();
        } catch (Exception ex) {
        }
        return false;
    }

    public JobSkill getJobSkill(String jobskillId) {
        //
        //
        //
        //
        //
        initModel();
        try {

            JobSkill.JobSkillBuilder jobskillbuilder = new JobSkill.JobSkillBuilder();
            Skill.SkillBuilder skillBuilder = new Skill.SkillBuilder();
            preparedStatement = connection.prepareStatement("select  from job where id=" + jobskillId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //
                //
                int id = resultSet.getInt("id");
                int jobid = resultSet.getInt("jobid");
                int skillid = resultSet.getInt("skillid");
                Skill skill = new SkillModel().getSkill(skillid);
                Job job=new JobModel().getJob(jobid);
                return jobskillbuilder.id(id).Skill(skill).Job(job).build();
                //
                //
            }
            //
            //
            //
        } catch (Exception ex) {
            System.out.println("error occured");
        }
        return null;
    }

    public List getJobSkills() {
        //
        //
        //
        //
        //
        initModel();
        List<JobSkill> jobs;
        jobs = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("select * from Job");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //
                //
                JobSkill jobskill = null;
                // job.setJobId(resultSet.getString("AddressId"));
                //job.setStartDate(resultSet.getString("City"));
                //  job.setState(resultSet.getString("State"));
                //  job.setCountry(resultSet.getString("Country"));
                jobs.add(jobskill);
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
