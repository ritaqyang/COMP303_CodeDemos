package ca.mcgill.cs.swdesign.review.q3;

public class WeatherTracker {
    private int aTemperature;
    private int aHumidity;
    private int aPressure;

    public void setMeasurements(int pTemperature, int pHumidity, int pPressure){
        aTemperature = pTemperature;
        aHumidity = pHumidity;
        aPressure = pPressure;
    }

    public int getTemperature(){
        return aTemperature;
    }

    public int getHumidity(){
        return aTemperature;
    }

    public int getPressure(){
        return aTemperature;
    }
}
