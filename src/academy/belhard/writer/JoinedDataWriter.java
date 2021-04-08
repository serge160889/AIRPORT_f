package academy.belhard.writer;

import academy.belhard.builder.FullDataBuilder;
import academy.belhard.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JoinedDataWriter {
    public  static void write(String fileName, List<FullData> joinedItems) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (FullData item : joinedItems) {
                String fullDataLine = FullDataBuilder.objectToString(item);

                writer.write(fullDataLine + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
