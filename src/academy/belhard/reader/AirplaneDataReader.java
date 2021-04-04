package academy.belhard.reader;

import academy.belhard.builder.AirplaneBuilder;
import academy.belhard.builder.PilotBuilder;
import academy.belhard.entity.Airplane;
import academy.belhard.entity.Pilot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirplaneDataReader implements FileDataReader<Airplane> {
    private final String fileName;

    public AirplaneDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Airplane> read() {
        List<Airplane> airplanes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String airplaneLine = null;
            while ((airplaneLine = reader.readLine()) != null) {
                Airplane airplane = AirplaneBuilder.build(airplaneLine);

                airplanes.add(airplane);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return airplanes;

    }
}

