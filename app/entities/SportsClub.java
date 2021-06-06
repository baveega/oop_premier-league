package entities;

import java.io.Serializable;
import java.util.Objects;

public class SportsClub implements Serializable {
    private String clubName;
    private String clubLocation;

    //Parameter Constructor
    public SportsClub(String clubName, String clubLocation) {

        this.clubName = clubName;
        this.clubLocation = clubLocation;
    }

    //Default Constructor
    public SportsClub() {

    }

    //Getter and Setter
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    //To string method
    @Override
    public String toString() {
        return "Club Name='" + clubName + '\'' +
                ", Club Location='" + clubLocation + '\'' +
                '}';
    }

    //Hashcode and equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsClub that = (SportsClub) o;
        return Objects.equals(clubName, that.clubName) &&
                Objects.equals(clubLocation, that.clubLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName, clubLocation);
    }
}

