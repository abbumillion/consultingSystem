package Models;

import DomainObjects.Address;
import DomainObjects.Company;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompanyModel extends TableModel {

    List<Company> employerCompanies;

    public CompanyModel() {
        employerCompanies = new ArrayList();
    }

    public List getCompanies() {
        initModel();
        try {
            preparedStatement = connection.prepareStatement("select * from company");

            ResultSet resultSet = preparedStatement.executeQuery();
            Company.CompanyBuilder companyBuilder = new Company.CompanyBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String companyname = resultSet.getString("Companyname");
                String companytype = resultSet.getString("Companytype");
                String website = resultSet.getString("website");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                employerCompanies.add(companyBuilder.id(id).Email(email).Password(password).Userrole("company").Website(website)
                        .UserName(username).PhoneNumber(phonenumber).CompanyName(companyname).CompanyType(companytype).build());

            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employerCompanies;
    }

    public boolean InsertCompany(Company company) throws SQLException {
        initModel();
        preparedStatement = connection.prepareStatement("insert into company"
                + "(id,companyname,companytype,email,phonenumber,website,"
                + "addressid,username,password)"
                + "values(?,?,?,?,?,?,?,?,?)");
        //--------------------------------------------------------------------//
        //---------------INSERTCOMPANYADDRESSINFORMATION----------------------//
        Address address = company.getAddress();

        if (new AddressModel().InsertAddress(address)) {
            System.out.println("Address Inserted Successfully...");
        } else {
            System.out.println("Address Insertion Failed...");
        }
        //--------------------------------------------------------------------//
        //--------------------------------------------------------------------//
        //------------INSERTCOMPANYINFORMATIONTODATABASE----------------------//
        //--------------------------------------------------------------------//
        preparedStatement.setInt(1, company.getId());
        preparedStatement.setString(2, company.getCompanyName());
        preparedStatement.setString(3, company.getCompanyType());
        preparedStatement.setString(4, company.getEmail());
        preparedStatement.setString(5, company.getCellPhone());
        preparedStatement.setString(6, company.getWebsite());
        preparedStatement.setInt(7, address.getAddressId());
        preparedStatement.setString(8, company.getUserName());
        preparedStatement.setString(9, company.getPassword());
        return preparedStatement.execute();

    }

    public Company getCompany(int companyId) throws SQLException {
        initModel();
        Company.CompanyBuilder companyBuilder = new Company.CompanyBuilder();
        preparedStatement = connection.prepareStatement("select from company where id=" + companyId);
        ResultSet resultSet = preparedStatement.executeQuery();
        //----------------------------------------------------------------------
        String companyname = resultSet.getString("Companyname");
        String companytype = resultSet.getString("Companytype");
        String website = resultSet.getString("website");
        String phonenumber = resultSet.getString("phonenumber");
        String email = resultSet.getString("email");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        int addressid = resultSet.getInt("addressid");
        int id = resultSet.getInt("id");
        //----------------------------------------------------------------------
        return companyBuilder.id(id).Email(email).Address(new AddressModel().getAddress(addressid)).Password(password).Userrole("company").Website(website)
                .UserName(username).PhoneNumber(phonenumber).CompanyName(companyname).CompanyType(companytype).build();
    }

    public Company getCompany(String un) throws SQLException {
        initModel();
        Company.CompanyBuilder companyBuilder = new Company.CompanyBuilder();
        preparedStatement = connection.prepareStatement("select from company where username=" + un);
        ResultSet resultSet = preparedStatement.executeQuery();
        //----------------------------------------------------------------------
        String companyname = resultSet.getString("Companyname");
        String companytype = resultSet.getString("Companytype");
        String website = resultSet.getString("website");
        String phonenumber = resultSet.getString("phonenumber");
        String email = resultSet.getString("email");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        int addressid = resultSet.getInt("addressid");
        int id = resultSet.getInt("id");
        //----------------------------------------------------------------------
        return companyBuilder.id(id).Email(email).Address(new AddressModel().getAddress(addressid)).Password(password).Userrole("company").Website(website)
                .UserName(username).PhoneNumber(phonenumber).CompanyName(companyname).CompanyType(companytype).build();
        ////////////------------------------------------------------------------
    }
}
