package Models;

import DomainObjects.Address;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressModel extends TableModel {

    public boolean InsertAddress(Address address) throws SQLException {
        initModel();
        preparedStatement = connection.prepareStatement("insert into address"
                + "(id,city,state,country)"
                + "values(?,?,?,?)");
        preparedStatement.setInt(1, address.getAddressId());
        preparedStatement.setString(2, address.getCity());
        preparedStatement.setString(3, address.getState());
        preparedStatement.setString(4, address.getCountry());
        return preparedStatement.execute();
    }

    public Address getAddress(int AddressId) throws SQLException {
        System.out.println(AddressId);
        initModel();
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        preparedStatement = connection.prepareStatement("select * from address where id=" + AddressId);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            //---------------------------------------------------------------------------------------//
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            String country = resultSet.getString("country");
            int id = resultSet.getInt("id");
            return addressBuilder.City(city).State(state).Counrty(country).Id(id).build();
            //---------------------------------------------------------------------------------------//
        }
        return null;

    }

    public List getAddress() throws SQLException {
        initModel();
        List<Address> addressess;
        addressess = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from address");
        ResultSet resultSet = preparedStatement.executeQuery();
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        while (resultSet.next()) {
            //
            //
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            String country = resultSet.getString("country");
            int id = resultSet.getInt("id");
            addressess.add(addressBuilder.City(city).State(state).Counrty(country).Id(id).build());
            //
            //
        }
        return addressess;
    }
}
//
//
