package com.company;

public class Hotel {
    private String hotelName;
    private int hotelRating;
    private float baseTariff;
    private float extraTariff;
    private double pricePerDay;
    private double excessChargeforfivestar = 0.04;
    private double excessChargeforThreeandFourstar = 0.03;
    private double surgeChargeForMoreThan3Days = 0.05;


    public Hotel(String hotelName, int hotelRating, float baseTariff, float extraTariff) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.baseTariff = baseTariff;
        this.extraTariff = extraTariff;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public float getBaseTariff() {
        return baseTariff;
    }

    public float getExtraTariff() {
        return extraTariff;
    }

    public void setPricePerDay() {
        double totTariff = getBaseTariff() + getExtraTariff();
        if (getHotelRating() == 5) {
            this.pricePerDay = totTariff + (excessChargeforfivestar * totTariff);
        }
        else if (getHotelRating() == 3 || getHotelRating() == 4 )
        {

            this.pricePerDay = totTariff + (excessChargeforThreeandFourstar * totTariff);
        }
        else
        {
            this.pricePerDay = totTariff;
        }
        QuotationCalc qc = new QuotationCalc();
        int days = qc.getNoOfDays();


        if (days > 3) this.pricePerDay = totTariff + (surgeChargeForMoreThan3Days * totTariff);

    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }
}
