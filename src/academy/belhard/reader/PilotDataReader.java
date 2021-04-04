package academy.belhard.reader;

import academy.belhard.builder.PilotBuilder;
import academy.belhard.entity.Pilot;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotDataReader implements FileDataReader<Pilot> {
    private final String fileName;

    public PilotDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Pilot> read() {
        List<Pilot> pilots = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String pilotLine = null;
            while ((pilotLine = reader.readLine()) != null) {
                Pilot pilot = PilotBuilder.build(pilotLine);

                pilots.add(pilot);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pilots;
    }
}
