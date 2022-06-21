package Models;
import DomainObjects.SkillCategory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SkillCategoryModel extends TableModel {

    public boolean InsertSkillCategory(SkillCategory skillCategory) {
        //
        //
        //
        initModel();
        try {
            //
            //
            preparedStatement = connection.prepareStatement("insert into skillcategory"
                    + "(id,skillcategoryname,skillcategoryinformation)"
                    + "values(?,?,?)");
            preparedStatement.setInt(1, skillCategory.hashCode());
            preparedStatement.setString(2, skillCategory.getSkillCategoryName());
            preparedStatement.setString(3, skillCategory.getSkillCategoryInformation());
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        //
        //
    }

    public SkillCategory getSkillCategory(int SkillCategoryId) {
        //
        //
        initModel();
        SkillCategory.SkillCategoryBuilder skillCategoryBuilder = new SkillCategory.SkillCategoryBuilder();
        String skillName = "none", skillInformation = "none";
        int id = 0;
        try {
            //
            //
            preparedStatement = connection.prepareStatement("select from skillcategory where id=" + SkillCategoryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            skillName = resultSet.getString("skillcategoryname");
            skillInformation = resultSet.getString("skillcategoryinformation");
            id = resultSet.getInt("id");
            //
            //
        } catch (SQLException ex) {
            //
            //throw exptions here
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
            //
            //
        }
        return skillCategoryBuilder.Id(id).SkillCategoryName(skillName).SkillCategoryInformation(skillInformation).build();
        //
        //
    }

    public List getSkillCategories() {
        //
        //
        initModel();
        List<SkillCategory> skillCategories;
        skillCategories = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from skillcategory");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //
                //
                String skillName = resultSet.getString("skillcategoryname");
                String skillInformation = resultSet.getString("skillcategoryinformation");
                int id = resultSet.getInt("id");
                SkillCategory.SkillCategoryBuilder skillCategoryBuilder = new SkillCategory.SkillCategoryBuilder();
                skillCategories.add(skillCategoryBuilder.Id(id).SkillCategoryName(skillName).SkillCategoryInformation(skillInformation).build());
                //
                //
            }
        } catch (SQLException ex) {
            Logger.getLogger(SkillModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Some bullshit error occured");
        }
        return skillCategories;
        //
    }

}
