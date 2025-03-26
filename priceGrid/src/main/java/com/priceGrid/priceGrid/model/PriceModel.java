package com.priceGrid.priceGrid.model;

import java.util.List;

public class PriceModel {
    private List<Integer> widths;
    private List<HeightModel> heightModels;

    public PriceModel() {
    }

    public PriceModel(List<Integer> widths, List<HeightModel> heightModels) {
        this.widths = widths;
        this.heightModels = heightModels;
    }

    public List<Integer> getWidths() {
        return widths;
    }

    public void setWidths(List<Integer> widths) {
        this.widths = widths;
    }

    public List<HeightModel> getHeightModels() {
        return heightModels;
    }

    public void setHeightModels(List<HeightModel> heightModels) {
        this.heightModels = heightModels;
    }

    @Override
    public String toString() {
        return "PriceModel{" +
                "widths=" + widths +
                ", heightModels=" + heightModels +
                '}';
    }
}
