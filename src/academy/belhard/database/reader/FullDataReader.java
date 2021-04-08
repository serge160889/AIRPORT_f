package academy.belhard.database.reader;

import academy.belhard.database.ConnectionUtil;
import academy.belhard.entity.FullData;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FullDataReader {
    private static final String SELECT_FULL_DATA = "SELECT fl.flight_number, fl.take_off_date, fl.take_off_time, ai.board_number, CONCAT_WS(' ', ai.brand_planes,ai.model_planes), ai.capasity,"+
        "CONCAT_WS(' ', pi.first_name, pi.last_name), CONCAT_WS(' ', pi.code_pilot, pi.pilot_rank) FROM flights AS fl INNER JOIN airplanes AS ai ON fl.airplane_id = ai.id " +
            " INNER JOIN pilots AS pi ON fl.pilot_id = pi.id";

//      Объединение строк для считывания с SQL и записи в файл
    private static final String BRANDMODELPLANES="CONCAT_WS(' ', ai.brand_planes,ai.model_planes)";
    private static final String FIRSTNAMELAST=    "CONCAT_WS(' ', pi.first_name, pi.last_name)";
    private static final String CODEPILOTRANK=    "CONCAT_WS(' ', pi.code_pilot, pi.pilot_rank)";




    public static List<FullData> read() {
        List<FullData> result = new ArrayList<>();

        Connection connection = ConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_FULL_DATA)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String flightNumber = resultSet.getString("flight_number");
                Date takeOffDate = resultSet.getDate("take_off_date");
                Time takeOffTime = resultSet.getTime("take_off_time");
                String boardNumber= resultSet.getString("board_number");
                String brandPlanes = resultSet.getString(BRANDMODELPLANES);
                int capasity = resultSet.getInt("capasity");
                String firstName= resultSet.getString(FIRSTNAMELAST);
                String codePilot= resultSet.getString(CODEPILOTRANK);

                result.add(new FullData(flightNumber, takeOffDate, takeOffTime, boardNumber, brandPlanes,capasity,firstName,codePilot));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
