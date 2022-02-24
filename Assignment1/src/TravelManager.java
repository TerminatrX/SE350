import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;
import java.util.Optional;

public class TravelManager {
    public static void main(String args[]) throws NullParameterException, Exception {
        try {
            Airline airliner = new Airline("United");
            Airport airportOrigin = new Airport("ORD");
            Airport airportDestination = new Airport("JFK");
            Date date = new Date();
            int passengerCapacity = 0;
            //CommercialFlight flight = new CommercialFlight(airliner, airportOrigin, airportDestination, "78de", date);
            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airliner, airportOrigin, airportDestination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);
            System.out.println(flight.get());
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
    }
}
