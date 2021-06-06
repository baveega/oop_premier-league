package entities;

import java.util.Objects;

public class SchoolFootballClub extends FootballClub{
    private String schoolClubName;
    private String schoolClubLocation;
    private int schoolClubContactNumber;

    //Parameter Constructor
    public SchoolFootballClub(String clubName, String clubLocation, int numberOfWins, int numberOfDraws, int numberOfDefeats, int numberOfGoalsReceived, int numberOfGoalsScored, int numberOfPoints, int numberOfMatchesPlayed, int goalsDifferent, String schoolClubName, String schoolClubLocation, int schoolClubContactNumber) {
        super(clubName, clubLocation, numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoalsReceived, numberOfGoalsScored, numberOfPoints, numberOfMatchesPlayed, goalsDifferent);
        this.schoolClubName = schoolClubName;
        this.schoolClubLocation = schoolClubLocation;
        this.schoolClubContactNumber = schoolClubContactNumber;
    }

    //Setter and getter
    public String getSchoolClubName() {
        return schoolClubName;
    }

    public void setSchoolClubName(String schoolClubName) {
        this.schoolClubName = schoolClubName;
    }

    public String getSchoolClubLocation() {
        return schoolClubLocation;
    }

    public void setSchoolClubLocation(String schoolClubLocation) {
        this.schoolClubLocation = schoolClubLocation;
    }

    public int getSchoolClubContactNumber() {
        return schoolClubContactNumber;
    }

    public void setSchoolClubContactNumber(int schoolClubContactNumber) {
        this.schoolClubContactNumber = schoolClubContactNumber;
    }

    //To string method
    @Override
    public String toString() {
        return "SchoolClub Name='" + schoolClubName + '\'' +
                ", SchoolClub Location='" + schoolClubLocation + '\'' +
                ", SchoolClub ContactNumber=" + schoolClubContactNumber +
                '}';
    }

    //Equals and hashcode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolFootballClub that = (SchoolFootballClub) o;
        return schoolClubContactNumber == that.schoolClubContactNumber &&
                Objects.equals(schoolClubName, that.schoolClubName) &&
                Objects.equals(schoolClubLocation, that.schoolClubLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolClubName, schoolClubLocation, schoolClubContactNumber);
    }
}

