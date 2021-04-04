package academy.belhard.builder;

import academy.belhard.entity.Pilot;
import academy.belhard.entity.RangPilot;

public class PilotBuilder {
    public static Pilot build(String pilotLine) {
        String[] pilotData = pilotLine.split(CsvConstants.CSV_DELIMITER);

        int id = Integer.parseInt(pilotData[0]);
        String firstName = pilotData[1];
        String lastName=pilotData[2];
        RangPilot pilotRank=RangPilot.valueOf(pilotData[3]);
        String codePilot=pilotData[4];

        return new Pilot(id, firstName, lastName,pilotRank,codePilot);
    }
}
