package academy.belhard.reader;

import academy.belhard.builder.FlightBuilder;
import academy.belhard.entity.Flight;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightDataReader implements FileDataReader<Flight>{
    private final String fileName;

    public FlightDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Flight> read() {
        List<Flight> flights = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String flightLine = null;
            while ((flightLine = reader.readLine()) != null) {
                Flight flight = FlightBuilder.build(flightLine);

                flights.add(flight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flights;
    }
}
