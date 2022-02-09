import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class Airport {
    //Instantiate class variables
    private String airportName;

    //helper class to check if Airport name is all Caps
    private boolean upperCase(String apName){
        for (char c : apName.toCharArray()){
            if(Character.isLetter(c) && Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }

    public Airport (String name) throws NullParameterException, BadParameterException {
        setAirportName(name);
    }

    public String getAirportName() {
        return airportName;
    }

    private void setAirportName(String apName) throws NullParameterException, BadParameterException {
        if (apName == null){
            throw new NullParameterException("Please enter a Airport Name");
        }
        if (upperCase(apName) == false){
            throw new BadParameterException("Please enter Airport name with all Caps");
        }
        if (apName.length() != 3){
            throw new BadParameterException("Please enter Airport Name that consists of 3 Characters");
        }
        airportName = apName;
    }

    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport Name:", getAirportName()));
        return sb.toString();
    }

    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirportName().equals(other.getAirportName())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName);
    }
}
