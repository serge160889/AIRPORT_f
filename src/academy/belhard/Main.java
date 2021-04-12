package academy.belhard;

import academy.belhard.database.reader.FullDataReader;
import academy.belhard.database.writer.AirplaneDbWriter;
import academy.belhard.database.writer.FlightDbWriter;
import academy.belhard.database.writer.PilotDbWriter;
import academy.belhard.entity.Airplane;
import academy.belhard.entity.Flight;
import academy.belhard.entity.FullData;
import academy.belhard.entity.Pilot;
import academy.belhard.reader.AirplaneDataReader;
import academy.belhard.reader.FlightDataReader;
import academy.belhard.reader.PilotDataReader;
import academy.belhard.writer.JoinedDataWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PilotDataReader pilotDataReader = new PilotDataReader("C:\\Users\\serge\\IdeaProjects\\AIRPORT_f\\db\\data\\Pilots.csv");
        List<Pilot> pilots = pilotDataReader.read();
        pilots.forEach(System.out::println);
        System.out.println();
        System.out.println();
        AirplaneDataReader airplaneDataReader = new AirplaneDataReader("C:\\Users\\serge\\IdeaProjects\\AIRPORT_f\\db\\data\\Airplanes.csv");
        List<Airplane> airplanes = airplaneDataReader.read();
        airplanes.forEach(System.out::println);
        System.out.println();
        System.out.println();

        FlightDataReader flightDataReader = new FlightDataReader("C:\\Users\\serge\\IdeaProjects\\AIRPORT_f\\db\\data\\Flights.csv");
        List<Flight> flights = flightDataReader.read();
        flights.forEach(System.out::println);


        PilotDbWriter.writePilots(pilots);
        AirplaneDbWriter.writeAirplane(airplanes);
        FlightDbWriter.writeFlight(flights);

        FullDataReader.read().forEach(System.out::println);
        System.out.println();

        List<FullData> joinedData = FullDataReader.read();

        JoinedDataWriter.write("result\\result.csv", joinedData);
    }

}