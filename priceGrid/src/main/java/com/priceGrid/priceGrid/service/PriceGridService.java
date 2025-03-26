package com.priceGrid.priceGrid.service;

import com.priceGrid.priceGrid.model.PriceModel;
import com.priceGrid.priceGrid.repo.PriceRecords;
import com.priceGrid.priceGrid.iPriceGridService.IPriceGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceGridService implements IPriceGridService {

    @Autowired
    PriceRecords priceRecords;

    @Override
    public PriceModel getPrices(){
        PriceModel model = null;
        try {
            model = priceRecords.getModel();
        }catch (Exception e){
            System.out.println("Exception occurred in PriceGridService getPrices method, " + e.getMessage());
        }
        return model;
    }


}
