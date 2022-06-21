package Models;

import DomainObjects.Address;
import DomainObjects.Applicant;
import DomainObjects.ApplicantSkill;
import DomainObjects.Skill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicantSkillModel extends TableModel {

    public boolean InsertApplicantSkill(ApplicantSkill applicantSkill) throws SQLException {
        initModel();
        preparedStatement = connection.prepareStatement("insert into applicantskill"
                + "(id,applicantid,skillid)"
                + "values(?,?,?)");
        preparedStatement.setInt(1, applicantSkill.getId());
        preparedStatement.setInt(2, applicantSkill.getApplicant().getId());
        preparedStatement.setInt(3, applicantSkill.getSkill().getSkillId());
        return preparedStatement.execute();
    }

    public ApplicantSkill getAddress(int AddressId) throws SQLException {
        initModel();
        ApplicantSkill.ApplicantSkillBuilder applicantSkillBuilder = new ApplicantSkill.ApplicantSkillBuilder();
        preparedStatement = connection.prepareStatement("select from applicantskill where id=" + AddressId);
        ResultSet resultSet = preparedStatement.executeQuery();
        int id = resultSet.getInt("id");

        int applicantid = resultSet.getInt("applicantid");

        Applicant applicant = new UserModel().getApplicant(applicantid);

        int skillid = resultSet.getInt("id");
        Skill skill = new SkillModel().getSkill(skillid);

        return applicantSkillBuilder.Skill(skill).Applicant(applicant).build();
    }

    public List getAddress() throws SQLException {
        initModel();
        List<Address> addressess;
        addressess = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from address");
        ResultSet resultSet = preparedStatement.executeQuery();
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        while (resultSet.next()) {
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            String country = resultSet.getString("country");
            int id = resultSet.getInt("id");
            addressess.add(addressBuilder.City(city).State(state).Counrty(country).Id(id).build());
        }
        return addressess;
    }

}
