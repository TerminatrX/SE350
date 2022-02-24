import exception.NullParameterException;


public class FlightFactory {
    private FlightFactory() {

    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            return new CommercialFlight(airline, origin, destination);
            //try {

            //} catch(NullParameterException e) {
            //    return null;
            //}
        }

        else return null;
    }
}
