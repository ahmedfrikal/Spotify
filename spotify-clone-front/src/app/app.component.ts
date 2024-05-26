import {Component, inject, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FaIconLibrary, FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {fontAwesomeIcons} from "./shared/font-awesome-icons";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FontAwesomeModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit{

  title = 'spotify-clone-front';

  private faIconLibrary=inject(FaIconLibrary);

  private initFontAwesome(){
    this.faIconLibrary.addIcons(...fontAwesomeIcons);
  }

  ngOnInit(): void {
    this.initFontAwesome();
  }
}
