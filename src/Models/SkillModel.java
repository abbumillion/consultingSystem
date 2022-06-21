package Models;

import DomainObjects.Skill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SkillModel extends TableModel {

    public boolean InsertSkill(Skill skill) {
        initModel();
        try {
            preparedStatement = connection.prepareStatement("insert into skill"
                    + "(id,skillname,skillinformation,skillcategoryid)"
                    + "values(?,?,?,?)");

            preparedStatement.setInt(1, skill.getSkillId());
            preparedStatement.setString(2, skill.getSkillName());
            preparedStatement.setString(3, skill.getSkillInformation());
            preparedStatement.setInt(4, skill.getSkillCategory().getId());
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Skill getSkill(int SkillId) {
        initModel();
        Skill.SkillBuilder skillBuilder = new Skill.SkillBuilder();
        String skillName = "none", skillInformation = "none";
        int id = 0;
        try {
            preparedStatement = connection.prepareStatement("select from skill where id=" + SkillId);
            ResultSet resultSet = preparedStatement.executeQuery();
            skillName = resultSet.getString("skillname");
            skillInformation = resultSet.getString("skillinformation");
            id = resultSet.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return skillBuilder.SkillId(id).SkillName(skillName).SkillInformation(skillInformation).build();
    }

    public List getSkills() {
        initModel();
        List<Skill> skills;
        skills = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from skill");

            ResultSet resultSet = preparedStatement.executeQuery();
            Skill.SkillBuilder skillBuilder = new Skill.SkillBuilder();
            while (resultSet.next()) {
                String skillName = resultSet.getString("skillname");
                String skillInformation = resultSet.getString("skillinformation");
                int id = resultSet.getInt("id");
                skills.add(skillBuilder.SkillId(id).SkillName(skillName).SkillInformation(skillInformation).build());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return skills;
    }

}
