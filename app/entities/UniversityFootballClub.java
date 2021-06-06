package entities;

import java.util.Objects;

public class UniversityFootballClub extends FootballClub{
    private String universityClubName;
    private String universityClubLocation;
    private int universityClubContactNumber;

    //Parameter Constructor
    public UniversityFootballClub(String clubName, String clubLocation, int numberOfWins, int numberOfDraws, int numberOfDefeats, int numberOfGoalsReceived, int numberOfGoalsScored, int numberOfPoints, int numberOfMatchesPlayed, int goalsDifferent, String universityClubName, String universityClubLocation, int universityClubContactNumber) {
        super(clubName, clubLocation, numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoalsReceived, numberOfGoalsScored, numberOfPoints, numberOfMatchesPlayed, goalsDifferent);
        this.universityClubName = universityClubName;
        this.universityClubLocation = universityClubLocation;
        this.universityClubContactNumber = universityClubContactNumber;
    }

    //Setter and Getter
    public String getUniversityClubName() {
        return universityClubName;
    }

    public void setUniversityClubName(String universityClubName) {
        this.universityClubName = universityClubName;
    }

    public String getUniversityClubLocation() {
        return universityClubLocation;
    }

    public void setUniversityClubLocation(String universityClubLocation) {
        this.universityClubLocation = universityClubLocation;
    }

    public int getUniversityClubContactNumber() {
        return universityClubContactNumber;
    }

    public void setUniversityClubContactNumber(int universityClubContactNumber) {
        this.universityClubContactNumber = universityClubContactNumber;
    }

    //T string method
    @Override
    public String toString() {
        return "University ClubName='" + universityClubName + '\'' +
                ", University ClubLocation='" + universityClubLocation + '\'' +
                ", University ClubContactNumber=" + universityClubContactNumber +
                '}';
    }

    //Equals and hashcode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UniversityFootballClub that = (UniversityFootballClub) o;
        return universityClubContactNumber == that.universityClubContactNumber &&
                Objects.equals(universityClubName, that.universityClubName) &&
                Objects.equals(universityClubLocation, that.universityClubLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), universityClubName, universityClubLocation, universityClubContactNumber);
    }
}
