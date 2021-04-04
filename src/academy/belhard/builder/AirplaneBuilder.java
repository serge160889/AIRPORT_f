package academy.belhard.builder;

import academy.belhard.entity.Airplane;


public class AirplaneBuilder {
    public static Airplane build(String airplaneLine) {
            String[] airplaneData = airplaneLine.split(CsvConstants.CSV_DELIMITER);

            int id = Integer.parseInt(airplaneData[0]);
            String brandPlanes = airplaneData[1];
            String modelPlanes=airplaneData[2];
            int capasity=Integer.parseInt(airplaneData[3]);
            String boardNumber=airplaneData[4];

            return new Airplane(id, brandPlanes,modelPlanes,capasity,boardNumber);
        }
    }

