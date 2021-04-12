package academy.belhard.writer;

import academy.belhard.builder.CsvConstants;
import academy.belhard.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JoinedDataWriter {
    public static void write(String fileName, List<FullData> joinedItems) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (FullData item : joinedItems)

                writer.write(item.getNumber() + CsvConstants.CSV_DELIMITER +
                        item.getFlightDate() + CsvConstants.CSV_DELIMITER +
                        item.getLandingTime() + CsvConstants.CSV_DELIMITER +
                        item.getBoardNumber() + CsvConstants.CSV_DELIMITER +
                        item.getBrandModelPlanes() + CsvConstants.CSV_DELIMITER +
                        item.getCapasity() + CsvConstants.CSV_DELIMITER +
                        item.getFirstNameLast() + CsvConstants.CSV_DELIMITER +
                        item.getCodePilotRank() + CsvConstants.CSV_DELIMITER + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

