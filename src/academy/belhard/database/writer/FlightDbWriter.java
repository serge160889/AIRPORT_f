package academy.belhard.database.writer;

import academy.belhard.database.ConnectionUtil;
import academy.belhard.entity.Airplane;
import academy.belhard.entity.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightDbWriter {
    private static final String ADD = "INSERT INTO flights (id, airplane_id, pilot_id, take_off_date, take_off_time,flight_number) VALUES(?, ?, ?, ?, ?, ?)";

    public static void writeFlight(List<Flight> flights) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Старт записи в таблицу[flights]");
        for (Flight flight : flights) {
            try (PreparedStatement statement = connection.prepareStatement(ADD)) {
                statement.setInt(1, flight.getId());
                statement.setInt(2, flight.getAirplaneId());
                statement.setInt(3, flight.getPilotId());
                statement.setString(4, String.valueOf(flight.getTakeOffDate()));
                statement.setString(5, String.valueOf(flight.getTakeOffTime()));
                statement.setString(6, flight.getFlightNumber());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в таблицу[flights] завершена");
    }
}
