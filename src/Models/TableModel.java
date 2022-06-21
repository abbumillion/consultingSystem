package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class TableModel {

    Connection connection;
    PreparedStatement preparedStatement;

    public void initModel() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/cs", "root", "");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database." + ex.getLocalizedMessage());
        }
    }

    public void close() throws SQLException {
        preparedStatement.close();
        connection.close();

    }

    /* public boolean InsertAddress(Address address) {
        try {
            //
            //
            //
            //
            //
            preparedStatement = connection.prepareStatement("insert into company"
                    + "(id,companyname,companytype,email,phonenumber,website,"
                    + "addressid,username,password)"
                    + "values(?,?,?,?,?,?,?,?,?,?)");
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        return false;
    }*/
}
