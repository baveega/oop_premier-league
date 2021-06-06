package entities;

import java.util.Date;

//PlayedMatch class
public class PlayedMatch {
    private FootballClub club1;
    private FootballClub club2;
    private int club1Score;
    private int club2Score;
    private Date date;


// Getter and Setter

    public FootballClub getClub1() {
        return club1;
    }

    public void setClub1(FootballClub club1) {
        this.club1 = club1;
    }

    public FootballClub getClub2() {
        return club2;
    }

    public void setClub2(FootballClub club2) {
        this.club2 = club2;
    }

    public int getClub1Score() {
        return club1Score;
    }

    public void setClub1Score(int club1Score) {
        this.club1Score = club1Score;
    }

    public int getClub2Score() {
        return club2Score;
    }

    public void setClub2Score(int club2Score) {
        this.club2Score = club2Score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}

