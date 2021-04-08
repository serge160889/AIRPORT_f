package academy.belhard.database.writer;

import academy.belhard.database.ConnectionUtil;
import academy.belhard.entity.Airplane;
import academy.belhard.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AirplaneDbWriter {
    private static final String ADD = "INSERT INTO airplanes (id, brand_planes, model_planes, capasity, board_number) VALUES(?, ?, ?, ?, ?)";

    public static void writeAirplane(List<Airplane> airplanes) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Старт записи в таблицу[airplanes]");
        for (Airplane airplane : airplanes) {
            try (PreparedStatement statement = connection.prepareStatement(ADD)) {
                statement.setInt(1, airplane.getId());
                statement.setString(2, airplane.getBrandPlanes());
                statement.setString(3, airplane.getModelPlanes());
                statement.setInt(4, airplane.getCapasity());
                statement.setString(5, airplane.getBoardNumber());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в таблицу[airplanes] завершена");
    }
}
