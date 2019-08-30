package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class QuotationCalc {

    double customerTypeDiscount = 0.15;
    double additionalDiscount = 0.10;
    double surgeCharge = 0.05;
    int dat;
    double price;
    double totPrice;


    Hotel RiverView = new Hotel("RiverView", 3, 110, 0);
    Hotel Lakewood = new Hotel("Lakewood", 3, 110, 15);
    Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 20);
    Hotel Ridgewood = new Hotel("Ridgewood", 5, 220, 25);


    String customerType;
    int noOfDays;
    int hotelRating;
    List<Hotel> hotelList = Arrays.asList(Lakewood, Bridgewood, Ridgewood, RiverView);




    public String quotationprice(String userInput) {
        List<String> l = Arrays.asList(userInput.split(":"));
        customerType = l.get(0).trim();
        noOfDays = Integer.parseInt(l.get(2).trim());
        hotelRating = Integer.parseInt(l.get(1).trim());
        double disc;
        String retst = "";

        List<Hotel> chpHotel = new ArrayList<>();
        Map<Double, String> map = new HashMap<>();

//        for (Hotel hot : hotelList) {
//            if (hotelRating == hot.getHotelRating()) {
//                chpHotel.add(hot);
//            }
//        }
//
//        if (chpHotel.size() > 1) {
//            for (Hotel chpht : chpHotel) {
//                chpht.setPricePerDay();
//                map.put(chpht.getPricePerDay(), chpht.getHotelName());
//
//            }
//            TreeMap<Double, String> sorted = new TreeMap<>();
//            sorted.putAll(map);
//            System.out.println(sorted);
//
//        }
//        else
//        {

        for (Hotel hot : hotelList) {
            HotelPriceDiscount hdobj = new HotelPriceDiscount();
            double totPriceAfterDiscount = 0;
            double discountPrice = 0;
            if (hotelRating == hot.getHotelRating()) {
                hot.setPricePerDay();
                price = hot.getPricePerDay();
                totPrice = price * noOfDays;
                discountPrice = hdobj.calcDiscount(customerType, noOfDays, totPrice);
                totPriceAfterDiscount = totPrice - discountPrice;
                retst = hot.getHotelName() + "  $ " + totPriceAfterDiscount;
            }
        }

//        }


        return retst;
    }
    public int getNoOfDays() {
        return noOfDays;
    }


}

