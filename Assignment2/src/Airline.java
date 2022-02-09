import exception.NullParameterException;
import exception.BadParameterException;

import java.util.Objects;

public class Airline {


    //initialize variables for Airline
    private String airlineName;


    //constructor
    public Airline (String airlineName) throws NullParameterException, BadParameterException {
        setAirlineName(airlineName);
    }

    //getAirline method
    public String getAirlineName(){
        return airlineName;
    }


    //setAirline method
    private void setAirlineName (String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Please put down an airline name");
        }
        if (aName.length()> 8){
            throw new BadParameterException("Please put down an airline name less than 8 characters");
        }
        airlineName = aName;
    }

    //toString() method for Airline
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline", getAirlineName()));
        return sb.toString();
    }

    //equals() boolean method for Airline
    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getAirlineName().equals(other.getAirlineName())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName);
    }
}
