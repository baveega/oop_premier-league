import {Component, OnInit, ViewChild} from '@angular/core';
import {UserService} from "./services/user.service";
import {Observable} from "rxjs";
import { DataSource } from "@angular/cdk/collections";
import { User} from "./models/user.model";
import { MatSort, MatSortable  } from "@angular/material/sort";


export interface PeriodicElement {
  name: string;
  clubLocation: string;
  numberOfWins: number;
  numberOfDraws: number;
  numberOfDefeats: number;
  received: number;
  scored: number;
  numberOfPoints: number;
  matchesPlayed: number;
  goalsDifferent: number;

}

const ELEMENT_DATA: PeriodicElement[] = [
  {name: 'moon', clubLocation: 'galle', numberOfWins: 0, numberOfDraws: 0, numberOfDefeats: 1, received: 30, scored:10, numberOfPoints:0, matchesPlayed:1, goalsDifferent:-20 },
  {name: 'tiger', clubLocation: 'jaffna', numberOfWins: 0, numberOfDraws: 0, numberOfDefeats: 1, received: 40, scored:30, numberOfPoints:0, matchesPlayed:1, goalsDifferent:-10 },
  {name: 'queen', clubLocation: 'batticaloa', numberOfWins: 0, numberOfDraws: 0, numberOfDefeats: 1, received: 60, scored:50, numberOfPoints:0, matchesPlayed:1, goalsDifferent:-10 },
  {name: 'rina', clubLocation: 'colombo', numberOfWins: 0, numberOfDraws: 0, numberOfDefeats: 1, received: 48, scored:39, numberOfPoints:0, matchesPlayed:1, goalsDifferent:-9 },
  {name: 'wind', clubLocation: 'galle', numberOfWins: 0, numberOfDraws: 0, numberOfDefeats: 1, received: 10, scored:13, numberOfPoints:0, matchesPlayed:1, goalsDifferent:-3},
  {name: 'snow', clubLocation: 'Jaffna', numberOfWins: 1, numberOfDraws: 2, numberOfDefeats: 0, received: 43, scored:40, numberOfPoints:3, matchesPlayed:1, goalsDifferent:3},
  {name: 'space', clubLocation: 'colombo', numberOfWins: 1, numberOfDraws: 2, numberOfDefeats: 0, received: 20, scored:11, numberOfPoints:3, matchesPlayed:1, goalsDifferent:9 },
  {name: 'lion', clubLocation: 'galle', numberOfWins: 1, numberOfDraws: 2, numberOfDefeats: 0, received: 40, scored:30, numberOfPoints:3, matchesPlayed:1, goalsDifferent:10},
  {name: 'king', clubLocation: 'batticaloa', numberOfWins: 1, numberOfDraws: 2, numberOfDefeats: 0, received: 60, scored:50, numberOfPoints:3, matchesPlayed:1, goalsDifferent:10},
  {name: 'master', clubLocation: 'colombo', numberOfWins: 1, numberOfDraws: 2, numberOfDefeats: 0, received: 80, scored:60, numberOfPoints:3, matchesPlayed:1, goalsDifferent:20 },



];


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'bavi';
  displayedColumns: string[] = ['name', 'clubLocation', 'numberOfWins', 'numberOfDraws', 'numberOfDefeats', 'received' ,'scored', 'numberOfPoints', 'matchesPlayed', 'goalsDifferent'];
  //dataSource = new UserDataSource(this.userService);
  dataSource = ELEMENT_DATA;

  //@ViewChild(MatSort) sort : MatSort;
  constructor(private userService: UserService) {}

  ngOnInit() {
    //this.dataSource.sort = this.sort;

  }
}

export class UserDataSource extends DataSource<any> {
  constructor(private userService: UserService) {
    super();
  }
  connect(): Observable<User[]> {
    return this.userService.getUser();
  }
  disconnect() {
  }
}
