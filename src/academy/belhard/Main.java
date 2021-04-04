package academy.belhard;

import academy.belhard.entity.Airplane;
import academy.belhard.entity.Pilot;
import academy.belhard.reader.AirplaneDataReader;
import academy.belhard.reader.PilotDataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AirplaneDataReader airplaneDataReader = new AirplaneDataReader("C:\\Users\\serge\\IdeaProjects\\AIRPORT_f\\db\\data\\Airplanes.csv");
        List<Airplane> airplanes = airplaneDataReader.read();
        airplanes.forEach(System.out::println);
    }
}