import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;
import java.util.Optional;

public interface NewFlightManager {
    String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity,Date date) throws NullParameterException, BadParameterException;
    String createFlight(String type, Airline airline, Airport origin, Airport destination, Date date) throws NullParameterException, BadParameterException;
    Optional<Flight> getFlightByFlightNumber(String flightNumber);
}

