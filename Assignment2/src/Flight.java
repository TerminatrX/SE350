import java.util.Date;
import java.util.Objects;


public class Flight {

    private Airline airlineName;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public Flight (Airline name, Airport origin, Airport destination, String fNumber, Date dTime) {
        setAirlineName(name);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(fNumber);
        setDepartureTime(dTime);
    }

    public Airline getAirlineName(){
        return airlineName;
    }

    public Airport getOrigin(){
        return origin;
    }

    public Airport getDestination(){
        return destination;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public Date getDepartureTime(){
        return departureTime;
    }

    private void setAirlineName (Airline aName){
        airlineName = aName;
    }

    private void setOrigin (Airport originLoc){
        origin = originLoc;
    }

    private void setDestination(Airport destinationLoc){
        destination = destinationLoc;
    }

    private void setFlightNumber (String fNumber) {
        flightNumber = fNumber;
    }

    private void setDepartureTime (Date dTime) {
        departureTime = dTime;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline", getAirlineName()));
        sb.append(String.format("%-20s %s%n", "Origin", getOrigin()));
        sb.append(String.format("%-20s %s%n", "Destination", getDestination()));
        sb.append(String.format("%-20s %s%n", "FLight Number", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure Time", getDepartureTime()));
        return sb.toString();
    }

    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (!getAirlineName().equals(other.getAirlineName())){
            return false;
        }
        if (!getOrigin().equals(other.getOrigin())){
            return false;
        }
        if (!getDestination().equals(other.getDestination())){
            return false;
        }
        if (!getFlightNumber().equals(other.getFlightNumber())){
            return false;
        }
        if (!getDepartureTime().equals(other.getDepartureTime())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName, origin, destination, flightNumber, departureTime);
    }

}
