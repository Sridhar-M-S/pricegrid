package com.priceGrid.priceGrid.controller;

import com.priceGrid.priceGrid.model.PriceModel;
import com.priceGrid.priceGrid.iPriceGridService.IPriceGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PriceGridController {

    @Autowired
    IPriceGridService priceGridService;

    @GetMapping(path = "/prices")
    public ResponseEntity<PriceModel> getPrices(){
        PriceModel model = priceGridService.getPrices();
        return Objects.nonNull(model) ? new ResponseEntity<>(model,HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
