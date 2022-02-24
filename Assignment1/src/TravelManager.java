import exception.BadParameterException;
import exception.NullParameterException;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TravelManager {

    private static AirlineFactory AirLineFactory;

    public static void main(String args[]) throws NullParameterException, Exception {
        try {
            Airline airliner = AirlineFactory.getAirlineName("United");
            Airport airportOrigin = AirportFactory.getAirport("ORD");
            Airport airportDestination = AirportFactory.getAirport("JFK");
            Date date = new Date();
            int passengerCapacity = 0;
            //CommercialFlight flight = new CommercialFlight(airliner, airportOrigin, airportDestination, "78de", date);
            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airliner, airportOrigin, airportDestination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

            String flightNumber2 = FlightManager.getInstance().createFlight("passengerFlight", airliner, airportOrigin, airportDestination, 10 );
            Optional<Flight> flight1 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);

            System.out.println(flight.get());
            System.out.println(flight1.get());
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
    }
}
