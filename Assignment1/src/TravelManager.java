import exception.BadParameterException;
import exception.NullParameterException;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TravelManager {

    private static AirlineFactory AirLineFactory;

    public static void main(String args[]) throws NullParameterException, Exception {
        try {
            NewFlightManager FlightManager = new FlightManagerProxy();

            Airline airliner = AirlineFactory.getAirlineName("United");
            Airport airportOrigin = AirportFactory.getAirport("ORD");
            Airport airportDestination = AirportFactory.getAirport("JFK");
            Date date = new Date();
            int passengerCapacity = 10;


            //CommercialFlight flight = new CommercialFlight(airliner, airportOrigin, airportDestination, "78de", date);
            String flightNumber = FlightManager.createFlight("commercialFlight", airliner, airportOrigin, airportDestination, date);
            Optional<Flight> flight = FlightManager.getFlightByFlightNumber(flightNumber);

            String flightNumber2 = FlightManager.createFlight("passengerFlight", airliner, airportOrigin, airportDestination, passengerCapacity, date);
            Optional<Flight> flight1 = FlightManager.getFlightByFlightNumber(flightNumber2);

            System.out.println("Commercial Flight\n"+ flight.get());
            System.out.println("Passenger Flight\n" + flight1.get());
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
    }
}
