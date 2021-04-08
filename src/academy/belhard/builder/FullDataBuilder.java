package academy.belhard.builder;

import academy.belhard.entity.FullData;

import java.sql.Date;

public class FullDataBuilder {
    public static String objectToString(FullData item) {
        return String.join(CsvConstants.CSV_DELIMITER,
                item.getNumber(),
////                item.getFlightDate()),
//                item.getLandingTime(),
                item.getBoardNumber(),
                item.getBrandModelPlanes(),
                Integer.toString(item.getCapasity()),
                item.getFirstNameLast(),
                item.getCodePilotRank());
    }
}
