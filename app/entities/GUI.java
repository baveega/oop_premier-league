package entities;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import services.PremierLeagueManager;

import java.io.IOException;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static PremierLeagueManager premierLeagueManager = new PremierLeagueManager();

    @Override
    public void start(Stage primaryStage) throws Exception {

        oUI();
    }

    private static void oUI() throws IOException, ClassNotFoundException {
        //Set Stage
        Stage stage = new Stage();


        //Set stage title
        stage.setTitle("Club Details");

        premierLeagueManager.readTheFile("File.txt");

        //Table starting
        TableView <FootballClub> table = new TableView <>();
        //ObservableList
        final ObservableList <FootballClub> observableList = FXCollections.observableList(premierLeagueManager.getArrayList());



        table.setEditable(false);

        //Table column c1
        TableColumn<FootballClub, String> c1 = new TableColumn<>("Name");
        c1.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        c1.setPrefWidth(100);

        //Table column c2
        TableColumn<FootballClub, String> c2 = new TableColumn<>("Location");
        c2.setCellValueFactory(new PropertyValueFactory<>("clubLocation"));
        c2.setPrefWidth(100);

        //Table column c3
        TableColumn<FootballClub, Integer> c3 = new TableColumn<>(" Wins");
        c3.setCellValueFactory(new PropertyValueFactory<>("numberOfWins"));
        c3.setPrefWidth(150);

        //Table column c4
        TableColumn<FootballClub, Integer> c4 = new TableColumn<>("Draws");
        c4.setCellValueFactory(new PropertyValueFactory<>("numberOfDraws"));
        c4.setPrefWidth(150);

        //Table column c5
        TableColumn<FootballClub, Integer> c5 = new TableColumn<>("Defeats");
        c5.setCellValueFactory(new PropertyValueFactory<>("numberOfDefeats"));
        c5.setPrefWidth(150);

        //Table column c6
        TableColumn<FootballClub, Integer> c6 = new TableColumn<>("Received");
        c6.setCellValueFactory(new PropertyValueFactory<>("numberOfGoalsReceived"));
        c6.setPrefWidth(150);

        //Table column c7
        TableColumn<FootballClub, Integer> c7 = new TableColumn<>("Scored");
        c7.setCellValueFactory(new PropertyValueFactory<>("numberOfGoalsScored"));
        c7.setPrefWidth(150);

        //Table column c8
        TableColumn<FootballClub, Integer> c8 = new TableColumn<>("GoalDifference");
        c8.setCellValueFactory(new PropertyValueFactory<>("goalsDifferent"));
        c8.setPrefWidth(150);

        //Table column c9
        TableColumn<FootballClub, Integer> c9 = new TableColumn<>("Points");
        c9.setCellValueFactory(new PropertyValueFactory<>("numberOfPoints"));
        c9.setPrefWidth(150);

        //Table column c10
        TableColumn<FootballClub, Integer> c10 = new TableColumn<>("Matches Played");
        c10.setCellValueFactory(new PropertyValueFactory<>("numberOfMatchesPlayed"));
        c10.setPrefWidth(150);

        table.getColumns().addAll(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        for (FootballClub footballClub : observableList) {
            FootballClub addData = new FootballClub(footballClub.getClubName(),footballClub.getClubLocation(),footballClub.getNumberOfWins(),footballClub.getNumberOfDraws(),footballClub.getNumberOfDefeats(),footballClub.getNumberOfGoalsReceived(),footballClub.getNumberOfGoalsScored(),footballClub.getNumberOfPoints(),footballClub.getNumberOfMatchesPlayed(),footballClub.getGoalsDifferent());
            table.getItems().addAll(addData);
        }

        //Button Starting
        Button bu1 = new Button("Sort by Wins");
        bu1.setLayoutY(800);
        bu1.setLayoutX(250);
        bu1.setStyle("-fx-background-color: #566D7E; -fx-text-fill: #FFFFFF;");
        Button bu2 = new Button("Sort by Points");
        bu2.setLayoutY(800);
        bu2.setLayoutX(400);
        bu2.setStyle("-fx-background-color: #566D7E; -fx-text-fill: #FFFFFF;");
        Button bu3 = new Button("Sort by Goals Scored");
        bu3.setLayoutY(800);
        bu3.setLayoutX(600);
        bu3.setStyle("-fx-background-color: #566D7E; -fx-text-fill: #FFFFFF;");






        //Button SetOnAction starting

        //bu1 setOnAction
        bu1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                c3.setSortType(TableColumn.SortType.DESCENDING);
                table.getSortOrder().setAll(c3);
            }
        });

        //bu2 setOnAction
        bu2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                c9.setSortType(TableColumn.SortType.DESCENDING);
                table.getSortOrder().setAll(c9);
            }
        });

        //bu3 setOnAction
        bu3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                c7.setSortType(TableColumn.SortType.DESCENDING);
                table.getSortOrder().setAll(c7);
            }
        });

        //Table style
        table.setPrefSize(1500,600);
        table.setLayoutX(100);
        table.setLayoutY(100);

        //Pane
        Pane pane = new Pane();
        pane.getChildren().addAll(table, bu1,bu2,bu3);
        pane.setStyle("-fx-background-color: #98AFC7;");

        //Scene
        Scene scene = new Scene (pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();
    }
}
