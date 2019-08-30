package com.company;

public class HotelPriceDiscount {
    double customerTypeDiscount = 0.15;
    double additionalDiscount = 0.10;
    double tot_discount = 0;

    public double getTot_discount() {
        return tot_discount;
    }


    public double calcDiscount(String customerType,int noOfDays,double totPrice) {

        if (customerType.equals("Rewards")) tot_discount =   totPrice * customerTypeDiscount;
        if (noOfDays > 2) tot_discount = totPrice * additionalDiscount;
        return tot_discount;
    }
}
