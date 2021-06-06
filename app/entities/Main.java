package entities;

import javafx.application.Application;
import services.PremierLeagueManager;

import java.util.Scanner;



//Main class
public class Main {

    private static PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
    private static Scanner scanner = new Scanner(System.in);
    public static int MaxClub = 0;






    public static void main(String []args) throws Exception {
        //Read the file and Table data adding function calling part
        try {
            premierLeagueManager.readTheFile("File.txt");
            premierLeagueManager.getArrayList();


        } catch (Exception e) {

        }


        CMLoop:
        while (true) {
            consoleMenu();
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "A":
                case "a":
                    addFootballClub();
                    break;


                case "D":
                case "d":
                    deleteTheClub();
                    break;

                case "DS":
                case "ds":
                    displayTheStatistics();
                    break;

                case "DT":
                case "dt":
                    displayTheTable();
                    break;

                case "AM":
                case "am":
                    addPlayedMatch();
                    break;

                case "S":
                case "s":
                    //Save the file calling part
                    premierLeagueManager.saveTheFile("File.txt");

                    break;
                case "O":
                case "o":
                    //Gui part calling function
                    Application.launch(GUI.class);
                    break;

                case "E":
                case "e":
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break CMLoop;

                default:
                    System.out.print("Invalid input!!! Try again: ");
                    consoleMenu();
                    break;

            }
        }

    }

    //Console Function
    private static void consoleMenu()  {
        System.out.println("---------------Welcome to the ConsoleMenu---------------");
        System.out.println("Enter \"A\" to AddFootballClub: ");
        System.out.println("Enter \"D\" to DeleteTheClub: ");
        System.out.println("Enter \"DS\" to DisplayTheStatistics: ");
        System.out.println("Enter \"DT\" to DisplayTheTable: ");
        System.out.println("Enter \"S\" to SaveFile: ");
        System.out.println("Enter \"AM\" to AddPlayedMatch: ");
        System.out.println("Enter \"O\" to OpenAGraphicalUserInterface: ");
        System.out.println("Enter \"E\" to Exit the program: ");


        System.out.println();
        System.out.println("Choose the letters: ");
    }

    //Adding
    private static void addFootballClub() {
        if (PremierLeagueManager.MaxClub < 20) {
            System.out.println("Registered your club");
            return;
        }

        FootballClub footballClub = new FootballClub();
        System.out.println("Enter the club name: ");
        String clubName = scanner.nextLine();
        footballClub.setClubName(clubName);

        System.out.println("Enter the club location: ");
        String clubLocation = scanner.nextLine();
        footballClub.setClubLocation(clubLocation);

        premierLeagueManager.ClubList.add(footballClub);
        System.out.println("Thank You!, Your club is successfully entered");

    }

    //Deleting
    private static void deleteTheClub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the club name: ");
        String clubName = scanner.nextLine();
        premierLeagueManager.deleteTheClub(clubName);
    }


    //AddPlayedMatch
    private static void addPlayedMatch() {

        premierLeagueManager.addPlayedMatch();
    }

    //Display table
    private static void displayTheTable() {
        premierLeagueManager.displayTheTable();

    }

    //Display statistics
    private static void displayTheStatistics() {
        premierLeagueManager.displayTheStatistics();

    }




}
