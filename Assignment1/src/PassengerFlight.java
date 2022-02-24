import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;


public class PassengerFlight implements Flight{

    private int passengerCapacity;
    private Airline airlineName;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public PassengerFlight(Airline name, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException {
        setAirlineName(name);
        setOrigin(origin);
        setDestination(destination );
        setFlightNumber();
        setDepartureTime();
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
        return flightNumber.toString();
    }

    public Date getDepartureTime(){
        return departureTime;
    }

    public Integer getPassengerCapacity () {
        return this.passengerCapacity;
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

    private void setFlightNumber () {
        flightNumber = UUID.randomUUID();
    }

    private void setDepartureTime () {
        departureTime = new Date(2022, 01, 01, 14, 00);
    }

    private void setPassengerCapacity(Integer passengerCapacity){
        this.passengerCapacity = passengerCapacity;
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
        final CommercialFlight other = (CommercialFlight) obj;
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
