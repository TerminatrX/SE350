import exception.NullParameterException;


public class FlightFactory {
    private FlightFactory() {

    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {

            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }



        else return null;
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        if (type.equals("passengerFlight")) {

            try {
                return new PassengerFlight(airline, origin, destination, passengerCapacity);
            } catch(NullParameterException e) {
                return null;
            }
        }

        else return null;
    }
}
