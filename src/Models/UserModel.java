package Models;

import DomainObjects.Address;
import DomainObjects.Admin;
import DomainObjects.Applicant;
import DomainObjects.Authenticable;
import DomainObjects.Company;
import DomainObjects.SkillCategory;
import DomainObjects.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserModel extends TableModel {

    public List getAdmins() {
        initModel();
        List admins = new ArrayList();
        try {
            preparedStatement = connection.prepareStatement("select * from admin");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //------------------------------------------------------------//
                //------------------------------------------------------------//
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String dateofbirth = resultSet.getString("dateofbirth");
                String gender = resultSet.getString("gender");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int addressId = resultSet.getInt("addressid");
                Address address = new AddressModel().getAddress(addressId);
                Admin.AdminBuilder adminBuilder = new Admin.AdminBuilder();
                Admin admin = adminBuilder.id(id).DateOfBirth(dateofbirth).Email(email)
                        .Password(password).LastName(lastname).PhoneNumber(phonenumber)
                        .UserName(username).Address(address).UserRole("admin")
                        .FirstName(firstname).Gender(gender).build();
                admins.add(admin);
                //------------------------------------------------------------//
                //------------------------------------------------------------//
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return admins;
    }

    public List getApplicants() {
        initModel();
        List applicants = new ArrayList();

        try {
            preparedStatement = connection.prepareStatement("select * from applicant");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //user data
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String dateofbirth = resultSet.getString("dateofbirth");
                String gender = resultSet.getString("gender");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                String educationLevel = resultSet.getString("educationlevel");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int addressId = resultSet.getInt("addressid");
                int skillcategoryId = resultSet.getInt("skillcategoryId");
                //address data
                Address address = new AddressModel().getAddress(addressId);
                //skill data
                SkillCategory skillcategory = new SkillCategory.SkillCategoryBuilder().build();
                //new SkillCategoryModel().getSkillCategory(skillcategoryId);
                Applicant.ApplicantBuilder applicantBuilder = new Applicant.ApplicantBuilder();
                Applicant applicant = applicantBuilder.Address(address)
                        .EduactionLevel(educationLevel).FirstName(firstname)
                        .DateOfBirth(dateofbirth).SkillCategory(skillcategory).Email(email)
                        .Password(password).LastName(lastname).PhoneNumber(phonenumber)
                        .UserName(username).UserRole("Applicant")
                        .FirstName(firstname).Gender(gender)
                        .build();
                applicants.add(applicant);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return applicants;
    }

    public boolean InsertUser(User user) {
        initModel();

        try {

            new AddressModel().InsertAddress(user.getAddress());

            if (user.getRole().equalsIgnoreCase("admin")) {
                preparedStatement = connection.prepareStatement("insert into admin"
                        + "(id,firstname,lastname,gender,email,phonenumber,dateofbirth,username,password"
                        + "values(?,?,?,?,?,?,?,?,?,?)");
                Admin admin = (Admin) user;
                preparedStatement.setInt(1, admin.getId());
                preparedStatement.setString(2, admin.getFirstName());
                preparedStatement.setString(3, admin.getLastName());
                preparedStatement.setString(4, admin.getGender());
                preparedStatement.setString(5, admin.getEmail());
                preparedStatement.setString(6, admin.getCellPhone());
                preparedStatement.setString(7, admin.getDateOfBirth());
                preparedStatement.setString(8, admin.getUserName());
                preparedStatement.setString(9, admin.getPassword());
            } else if (user.getRole().equalsIgnoreCase("applicant")) {
                preparedStatement = connection.prepareStatement("INSERT INTO applicant"
                        + "(id,firstname,lastname, gender,email,phonenumber,educationlevel,addressid,dateofbirth,username,password,skillcategoryid)"
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?)");
                Applicant applicant = (Applicant) user;
                preparedStatement.setInt(1, applicant.getId());
                preparedStatement.setString(2, applicant.getFirstName());
                preparedStatement.setString(3, applicant.getLastName());
                preparedStatement.setString(4, applicant.getGender());
                preparedStatement.setString(5, applicant.getEmail());
                preparedStatement.setString(6, applicant.getCellPhone());
                preparedStatement.setString(7, applicant.getEducationLevel());
                preparedStatement.setInt(8, applicant.getAddress().getAddressId());
                preparedStatement.setString(9, applicant.getDateOfBirth());
                preparedStatement.setString(10, applicant.getUserName());
                preparedStatement.setString(11, applicant.getPassword());
                preparedStatement.setInt(12, applicant.getSkillCategory().getId());
            }
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Applicant getApplicant(int applicantid) {
        initModel();
        try {
            preparedStatement = connection.prepareStatement("select * from applicant where id=" + applicantid);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //user data
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String dateofbirth = resultSet.getString("dateofbirth");
                String gender = resultSet.getString("gender");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                String educationLevel = resultSet.getString("educationlevel");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int addressId = resultSet.getInt("addressid");
                int skillId = resultSet.getInt("skillcategoryid");
                //address data
                Address address = new AddressModel().getAddress(addressId);
                //skill data
                SkillCategory skillcategory = new SkillCategoryModel().getSkillCategory(skillId);
                Applicant.ApplicantBuilder applicantBuilder = new Applicant.ApplicantBuilder();
                Applicant applicant = applicantBuilder.Address(address)
                        .EduactionLevel(educationLevel).FirstName(firstname)
                        .DateOfBirth(dateofbirth).Email(email)
                        .SkillCategory(skillcategory)
                        .Password(password).LastName(lastname).PhoneNumber(phonenumber)
                        .UserName(username).UserRole("Applicant")
                        .FirstName(firstname).Gender(gender)
                        .build();
                return applicant;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public List getApplicant(String un) {
        initModel();
        try {
            preparedStatement = connection.prepareStatement("select * from applicant where username=" + un);

            ResultSet resultSet = preparedStatement.executeQuery();
            List applicants = new ArrayList<>();
            while (resultSet.next()) {
                //user data
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String dateofbirth = resultSet.getString("dateofbirth");
                String gender = resultSet.getString("gender");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                String educationLevel = resultSet.getString("educationlevel");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int addressId = resultSet.getInt("addressid");
                int skillId = resultSet.getInt("skillcategoryid");
                //address data
                Address address = new AddressModel().getAddress(addressId);
                //skill data
                SkillCategory skillcategory = new SkillCategoryModel().getSkillCategory(skillId);
                Applicant.ApplicantBuilder applicantBuilder = new Applicant.ApplicantBuilder();
                Applicant applicant = applicantBuilder.Address(address)
                        .EduactionLevel(educationLevel).FirstName(firstname)
                        .DateOfBirth(dateofbirth).Email(email)
                        .SkillCategory(skillcategory)
                        .Password(password).LastName(lastname).PhoneNumber(phonenumber)
                        .UserName(username).UserRole("Applicant")
                        .FirstName(firstname).Gender(gender)
                        .build();
                applicants.add(applicant);
            }
            return applicants;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
