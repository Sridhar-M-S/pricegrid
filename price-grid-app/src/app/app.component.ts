import { Component } from '@angular/core';
import { PriceGridComponent } from './component/price-grid.component';

@Component({
  selector: 'app-root',
  imports: [PriceGridComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'price-grid-app';
}
