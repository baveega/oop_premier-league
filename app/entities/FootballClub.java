package entities;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportsClub implements Serializable {
    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;
    private int numberOfGoalsReceived;
    private int numberOfGoalsScored;
    private int numberOfPoints;
    private int numberOfMatchesPlayed;
    private int goalsDifferent;




    //Parameter Constructor
    public FootballClub(String clubName, String clubLocation, int numberOfWins, int numberOfDraws, int numberOfDefeats,int numberOfGoalsReceived, int numberOfGoalsScored, int numberOfPoints, int numberOfMatchesPlayed, int goalsDifferent) {
        super(clubName, clubLocation);
        this.numberOfWins = numberOfWins;
        this.numberOfDraws = numberOfDraws;
        this.numberOfDefeats = numberOfDefeats;
        this.numberOfGoalsReceived = numberOfGoalsReceived;
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.numberOfPoints = numberOfPoints;
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
        this.goalsDifferent = goalsDifferent;
    }

    //Help to det data sample
    public FootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }


    //Default Constructor
    public FootballClub() {

    }

    //Getter and Setter
    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public void setNumberOfDraws(int numberOfDraws) {
        this.numberOfDraws = numberOfDraws;
    }

    public int getNumberOfDefeats() {
        return numberOfDefeats;
    }

    public void setNumberOfDefeats(int numberOfDefeats) {
        this.numberOfDefeats = numberOfDefeats;
    }

    public int getNumberOfGoalsReceived() {
        return numberOfGoalsReceived;
    }

    public void setNumberOfGoalsReceived(int numberOfGoalsReceived) {
        this.numberOfGoalsReceived = numberOfGoalsReceived;
    }

    public int getNumberOfGoalsScored() {
        return numberOfGoalsScored;
    }

    public void setNumberOfGoalsScored(int numberOfGoalsScored) {
        this.numberOfGoalsScored = numberOfGoalsScored;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfMatchesPlayed() {
        return numberOfMatchesPlayed;
    }

    public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
    }

    public int getGoalsDifferent() {
        return goalsDifferent;
    }

    public void setGoalsDifferent(int goalsDifferent) {
        this.goalsDifferent = goalsDifferent;
    }

    //To string method
    @Override
    public String toString() {
        return super.toString() +
                "Number Of Wins=" + numberOfWins +
                ", Number Of Draws=" + numberOfDraws +
                ", Number Of Defeats=" + numberOfDefeats +
                ", Number Of Goals Received=" + numberOfGoalsReceived +
                ", Number Of Goals Scored=" + numberOfGoalsScored +
                ", Number Of Points=" + numberOfPoints +
                ", Number Of Matches Played=" + numberOfMatchesPlayed +
                ", Goals Different=" + goalsDifferent +
                '}';
    }

    //Equals and Hashcode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballClub that = (FootballClub) o;
        return numberOfWins == that.numberOfWins &&
                numberOfDraws == that.numberOfDraws &&
                numberOfDefeats == that.numberOfDefeats &&
                numberOfGoalsReceived == that.numberOfGoalsReceived &&
                numberOfGoalsScored == that.numberOfGoalsScored &&
                numberOfPoints == that.numberOfPoints &&
                numberOfMatchesPlayed == that.numberOfMatchesPlayed &&
                goalsDifferent == that.goalsDifferent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoalsReceived, numberOfGoalsScored, numberOfPoints, numberOfMatchesPlayed, goalsDifferent);
    }
}

