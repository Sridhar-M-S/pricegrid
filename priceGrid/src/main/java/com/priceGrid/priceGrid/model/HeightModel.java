package com.priceGrid.priceGrid.model;

import java.util.List;

public class HeightModel {
    private Integer height;
    private List<Integer> prices;

    public HeightModel(Integer height, List<Integer> prices) {
        this.height = height;
        this.prices = prices;
    }

    public HeightModel() {
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<Integer> getPrices() {
        return prices;
    }

    public void setPrices(List<Integer> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "HeightModel{" +
                "height=" + height +
                ", prices=" + prices +
                '}';
    }
}

