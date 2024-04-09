package ca.mcgill.cs.swdesign.review.q4;

public class Car {
    private String aLicensePlate;
    private String aModelName;
    private int aSeats;

    public Car(String pLicensePlate, String pModelName, int pSeats){
        assert pLicensePlate != null && pModelName != null && pSeats > 0;
        aLicensePlate = pLicensePlate;
        aModelName = pModelName;
        aSeats = pSeats;
    }

    public String getLicensePlate() {
        return aLicensePlate;
    }

    public String getModelName(){
        return aModelName;
    }

    public int getSeats(){
        return aSeats;
    }

    public String getDetails(){
        return "License: " + aLicensePlate + "Model: " + aModelName + "Seats: " + aSeats;
    }
}
