import exception.BadParameterException;
import exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<>();
    private AirlineFactory(){}


    public static Airline getAirlineName(String airlineName){
        return airlineCache.computeIfAbsent(airlineName, newAirline -> {
            try {
                return new Airline(airlineName);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
