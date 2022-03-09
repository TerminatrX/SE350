import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;
import java.util.Optional;

public class FlightManagerProxy implements NewFlightManager{
    private static FlightManager FlightManager;
    @Override
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity, Date date) throws NullParameterException, Exception {
        System.out.println("A flight is being created.");
        FlightManager = FlightManager.getInstance();
        String flight = FlightManager.createFlight(type, airline, origin, destination, passengerCapacity);
        return flight;
    }

    @Override
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, Date date) throws NullParameterException, Exception {
        System.out.println("A flight is being created.");
        FlightManager = FlightManager.getInstance();
        String flight = FlightManager.createFlight(type, airline, origin, destination);
        return flight;
    }

    @Override
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception {
        System.out.println("Flight Number: " + flightNumber + " is being retrieved");
        Optional<Flight> flight = null;
        FlightManager = FlightManager.getInstance();
        flight = FlightManager.getFlightByFlightNumber(flightNumber);
        return flight;
    }
}
