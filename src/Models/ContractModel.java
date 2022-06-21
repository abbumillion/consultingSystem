package Models;

import DomainObjects.Contract;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContractModel extends TableModel {

    public boolean InsertContract(Contract contract) {

        //
        //
        System.out.println(contract.getEndDate());
        System.out.println(contract.getStartDate());
        System.out.println(contract.getNegotiatedTerms());
        //
        //

        initModel();
        try {
            preparedStatement = connection.prepareStatement("insert in to contract"
                    + "(id,City,State,Country,"
                    + "values(?,?,?,?)");
            preparedStatement.setInt(1, contract.getId());
            preparedStatement.setString(2, contract.getStartDate());
            preparedStatement.setString(3, contract.getEndDate());
            preparedStatement.setString(4, contract.getNegotiatedTerms());
              return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ContractModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    public Contract getContract(int Id) {
        initModel();
        Contract.ContractBuilder contractBuilder = new Contract.ContractBuilder();
        try {
            preparedStatement = connection.prepareStatement("select from contract where id=" + Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            String country = resultSet.getString("country");
            int id = resultSet.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(ContractModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contractBuilder.build();
    }

    public List getContracts() {

        initModel();
        List<Contract> contracts;
        contracts = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("select * from contract");

            ResultSet resultSet = preparedStatement.executeQuery();
            Contract.ContractBuilder contractBuilder = new Contract.ContractBuilder();
            while (resultSet.next()) {
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                String country = resultSet.getString("country");
                int id = resultSet.getInt("id");
                contracts.add(contractBuilder.build());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContractModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contracts;
    }

}
