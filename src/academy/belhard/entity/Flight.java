package academy.belhard.entity;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;

public class Flight {
    private int id;
    private int airplaneId;
    private int pilotId;
    private Date takeOffDate;
    private  Time takeOffTime;
    private String flightNumber;

    public Flight(int id, int airplaneId, int pilotId, Date takeOffDate, Time takeOffTime, String flightNumber) {
        this.id = id;
        this.airplaneId = airplaneId;
        this.pilotId = pilotId;
        this.takeOffDate = takeOffDate;
        this.takeOffTime = takeOffTime;
        this.flightNumber = flightNumber;
    }

    public int getId() { return id; }

    public int getAirplaneId() { return airplaneId; }

    public int getPilotId() { return pilotId; }

    public Date getTakeOffDate() { return takeOffDate; }

    public Time getTakeOffTime() { return takeOffTime; }

    public String getFlightNumber() { return flightNumber; }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", airplaneId=" + airplaneId +
                ", pilotId=" + pilotId +
                ", takeOffDate=" + takeOffDate +
                ", takeOffTime=" + takeOffTime +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}
