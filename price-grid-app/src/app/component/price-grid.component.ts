import { Component, OnInit } from '@angular/core';
import { PriceGrid } from '../models/price-grid.interface';
import { CommonModule } from '@angular/common';
import { PriceGridService } from '../service/price-grid.service';

@Component({
  selector: 'app-price-grid',
  imports: [CommonModule],
  standalone: true,
  templateUrl: './price-grid.component.html',
  styleUrl: './price-grid.component.css'
})
export class PriceGridComponent implements OnInit{
  priceGrid?: PriceGrid | null;
  hasErrorOccured : boolean= false;
    
  constructor(private priceGridService: PriceGridService){}

  ngOnInit(): void {
    this.getPriceGrid();
  }

  getPriceGrid(){
    this.priceGridService.getPricesGrid().subscribe(e=>{
      if(e){
        this.priceGrid = e;
      } else{
        this.priceGrid = null;
      }
    },(error)=>{
      this.hasErrorOccured = true;
        this.priceGrid = null;
        console.error('Fetching error while getting the request ', error);
    });
  }


}
