package academy.belhard.database.writer;

import academy.belhard.database.ConnectionUtil;
import academy.belhard.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotDbWriter {
    private static final String ADD = "INSERT INTO pilots (id, first_name, last_name, pilot_rank, code_pilot) VALUES(?, ?, ?, ?, ?)";

    public static void writePilots(List<Pilot> pilots) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Старт записи в таблицу[pilots]");
        for (Pilot pilot : pilots) {
            try (PreparedStatement statement = connection.prepareStatement(ADD)) {
                statement.setInt(1, pilot.getId());
                statement.setString(2, pilot.getFirstName());
                statement.setString(3, pilot.getLastName());
                statement.setString(4, String.valueOf(pilot.getPilotRank()));
                statement.setString(5, pilot.getCodePilot());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в таблицу[pilots] завершена");
    }
}
