package academy.belhard.builder;


import academy.belhard.entity.Flight;

import java.sql.Date;
import java.sql.Time;

public class FlightBuilder {
    public static Flight build(String flightLine) {
        String[] flightData = flightLine.split(CsvConstants.CSV_DELIMITER);

        int id = Integer.parseInt(flightData[0]);
        int airplaneId = Integer.parseInt(flightData[1]);
        int pilotId = Integer.parseInt(flightData[2]);
        Date takeOffDate = Date.valueOf(flightData[3]);
        Time takeOffTime = Time.valueOf(flightData[4]);
        String flightNumber = flightData[5];

        return new Flight(id, airplaneId, pilotId, takeOffDate, takeOffTime, flightNumber);
    }
}