package Models;

import DomainObjects.Evaluation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvaluationModel extends TableModel {
    //
    //class for manipulatiing evaluation table on the database
    //
    //

    public boolean InsertEvaluation(Evaluation evaluation) throws SQLException {
        //
        //
        //
        initModel();
        preparedStatement = connection.prepareStatement("insert into evaluation"
                + "(AddressId,City,State,Country,"
                + "values(?,?,?,?)");
        preparedStatement.setInt(0, evaluation.getEvaluationId());
        preparedStatement.setString(1, evaluation.getEvaluationDate());
        preparedStatement.setString(2, evaluation.getRemarks());
        preparedStatement.setString(3, evaluation.getInterview().getInterviewDateAndTime());
        return preparedStatement.execute();
        //
        //
        //
    }

    public Evaluation getEvaluation(String EvaluationId) throws SQLException {
        //
        //
        //
        //
        initModel();
        Evaluation.EvaluationBuilder evaluationBuilder = new Evaluation.EvaluationBuilder();
        preparedStatement = connection.prepareStatement("select from evaluation where id=" + EvaluationId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String city = resultSet.getString("city");
        String state = resultSet.getString("state");
        String country = resultSet.getString("country");
        int id = resultSet.getInt("id");
        return evaluationBuilder.build();
        //
        //
        //
        //
    }

    public List getEvaluations() {
        //
        //
        //
        //
        //
        initModel();
        List<Evaluation> evaluations;
        evaluations = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("select * from evaluation");

            ResultSet resultSet = preparedStatement.executeQuery();
            Evaluation.EvaluationBuilder evaluationBuilder = new Evaluation.EvaluationBuilder();
            while (resultSet.next()) {
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                String country = resultSet.getString("country");
                int id = resultSet.getInt("id");
                evaluations.add(evaluationBuilder.build());
            }
        } catch (SQLException ex) {
            Logger.getLogger(EvaluationModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return evaluations;
        //
        //
        //
        //
    }

}
