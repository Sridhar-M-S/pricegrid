import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { PriceGrid } from "../models/price-grid.interface";

@Injectable({
    providedIn: 'root'
})
export class PriceGridService{
    private apiUrl: string= "http://localhost:8080/api"

    constructor(private http:HttpClient){}

    getPricesGrid(): Observable<PriceGrid>{
        return this.http.get<PriceGrid>(this.apiUrl + "/prices");
    }
}