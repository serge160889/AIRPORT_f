package entity;

import java.sql.Time;
import java.util.Date;

public class FullData {
    private String flightNumber;
    private Date takeOffDate;
    private  Time takeOffTime;
    private String boardNumber;
    private String brandModelPlanes;
    private Integer capasity;
    private String firstNameLast;
    private String codePilotRank;

    public FullData(String flightNumber, Date takeOffDate, Time takeOffTime, String boardNumber,
                    String brandModelPlanes, Integer capasity, String firstNameLast, String codePilotRank) {
        this.flightNumber = flightNumber;
        this.takeOffDate = takeOffDate;
        this.takeOffTime = takeOffTime;
        this.boardNumber = boardNumber;
        this.brandModelPlanes = brandModelPlanes;
        this.capasity = capasity;
        this.firstNameLast = firstNameLast;
        this.codePilotRank = codePilotRank;
    }

    public String getFlightNumber() { return flightNumber; }

    public Date getTakeOffDate() { return takeOffDate; }

    public Time getTakeOffTime() { return takeOffTime; }

    public String getBoardNumber() { return boardNumber; }

    public String getBrandModelPlanes() { return brandModelPlanes; }

    public Integer getCapasity() { return capasity; }

    public String getFirstNameLast() { return firstNameLast; }

    public String getCodePilotRank() { return codePilotRank; }

    @Override
    public String toString() {
        return "FullData{" +
                "flightNumber='" + flightNumber + '\'' +
                ", takeOffDate=" + takeOffDate +
                ", takeOffTime=" + takeOffTime +
                ", boardNumber='" + boardNumber + '\'' +
                ", brandModelPlanes='" + brandModelPlanes + '\'' +
                ", capasity=" + capasity +
                ", firstNameLast='" + firstNameLast + '\'' +
                ", codePilotRank='" + codePilotRank + '\'' +
                '}';
    }
}
