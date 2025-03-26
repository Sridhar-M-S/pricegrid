package com.priceGrid.priceGrid.repo;

import com.priceGrid.priceGrid.model.HeightModel;
import com.priceGrid.priceGrid.model.PriceModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class PriceRecords {
    private PriceModel model;

    public PriceRecords(){
        if(Objects.isNull(this.model))
            this.model = getTableData();
    }

    private PriceModel getTableData() {
        List<HeightModel> tableData = new ArrayList<>();
        tableData.add(new HeightModel(36, Arrays.asList(239, 269, 307, 377, 450, 517, 594, 664, 735, 810, 877, 946, 1017, 1121, 1143)));
        tableData.add(new HeightModel(48, Arrays.asList(272, 312, 357, 447, 536, 621, 711, 868, 883, 1055, 1060, 1230, 1236, 1385, 1393)));
        tableData.add(new HeightModel(60, Arrays.asList(310, 359, 415, 514, 621, 732, 840, 1030, 1055, 1260, 1286, 1471, 1478, 1632, 1666)));
        tableData.add(new HeightModel(72, Arrays.asList(344, 406, 467, 584, 701, 846, 967, 1184, 1216, 1451, 1461, 1695, 1703, 1886, 1923)));
        tableData.add(new HeightModel(84, Arrays.asList(381, 450, 516, 662, 795, 954, 1095, 1347, 1388, 1660, 1689, 1948, 1956, 2169, 2219)));
        tableData.add(new HeightModel(96, Arrays.asList(418, 496, 577, 735, 892, 1064, 1227, 1513, 1553, 1867, 1888, 2197, 2211, 2449, 2499)));
        tableData.add(new HeightModel(108, Arrays.asList(455, 542, 626, 808, 987, 1163, 1344, 1658, 1704, 2049, 2070, 2413, 2428, 2694, 2748)));
        tableData.add(new HeightModel(120, Arrays.asList(492, 586, 683, 887, 1083, 1276, 1484, 1830, 1876, 2277, 2288, 2673, 2683, 2981, 3041)));
        tableData.add(new HeightModel(132, Arrays.asList(530, 674, 794, 1035, 1268, 1509, 1745, 1997, 2210, 2486, 2592, 2963, 3167, 3504, 3521)));
        tableData.add(new HeightModel(144, Arrays.asList(562, 675, 795, 1038, 1272, 1513, 1750, 2162, 2218, 2686, 2701, 3163, 3177, 3520, 3526)));
        return new PriceModel(Arrays.asList(24,30,36,48,60,72,84,96,108,120,132,144,156,168,174),tableData);
    }

    public PriceModel getModel() {
        return model;
    }

    public void setModel(PriceModel model) {
        this.model = model;
    }

}
