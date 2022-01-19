import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;

public class TravelManager {
    public static void main(String args[]) throws NullParameterException, BadParameterException {

        Airline airliner = new Airline("United");
        Airport airportOrigin = new Airport("ORD");
        Airport airportDestination = new Airport("JFK");
        Date date = new Date();
        Flight flight = new Flight(airliner, airportOrigin, airportDestination, "78de", date);

        System.out.println(flight);
    }
}
