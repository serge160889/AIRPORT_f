package academy.belhard.entity;

import java.sql.Time;
import java.util.Date;

public class FullData {
    private String Number;
    private Date flightDate;
    private  Time landingTime;
    private String boardNumber;
    private String brandModelPlanes;
    private Integer capasity;
    private String firstNameLast;
    private String codePilotRank;

    public FullData(String Number, Date flightDate, Time landingTime, String boardNumber,
                    String brandModelPlanes, Integer capasity, String firstNameLast, String codePilotRank) {
        this.Number = Number;
        this.flightDate = flightDate;
        this.landingTime = landingTime;
        this.boardNumber = boardNumber;
        this.brandModelPlanes = brandModelPlanes;
        this.capasity = capasity;
        this.firstNameLast = firstNameLast;
        this.codePilotRank = codePilotRank;
    }

    public String getNumber() { return Number; }

    public Date getFlightDate() { return flightDate; }

    public Time getLandingTime() { return landingTime; }

    public String getBoardNumber() { return boardNumber; }

    public String getBrandModelPlanes() { return brandModelPlanes; }

    public Integer getCapasity() { return capasity; }

    public String getFirstNameLast() { return firstNameLast; }

    public String getCodePilotRank() { return codePilotRank; }

    @Override
    public String toString() {
        return "FullData{" +
                "Number='" + Number + '\'' +
                ", flightDate=" + flightDate +
                ", landingTime=" + landingTime +
                ", boardNumber='" + boardNumber + '\'' +
                ", brandModelPlanes='" + brandModelPlanes + '\'' +
                ", capasity=" + capasity +
                ", firstNameLast='" + firstNameLast + '\'' +
                ", codePilotRank='" + codePilotRank + '\'' +
                '}';
    }
}
