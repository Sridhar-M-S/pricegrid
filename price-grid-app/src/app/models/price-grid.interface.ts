
export interface PriceGrid{
    widths: number[];
    heightModels: HeightAndPrices[];
}

interface HeightAndPrices{
    height: number;
    prices: number[];
}