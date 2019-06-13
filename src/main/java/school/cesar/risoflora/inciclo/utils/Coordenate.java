package school.cesar.risoflora.inciclo.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordenate {

    @JsonProperty("lat")
    private double latitude;
    @JsonProperty("lng")
    private double longitude;


    public Coordenate(){

    }

    public Coordenate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2){




        x1 = Math.abs(x1);
        y1 = Math.abs(y1);
        x2 = Math.abs(x2);
        y2 = Math.abs(y2);


        double x =  (x1>=x2)?x1-x2:x2-x1;
        double y =  (y1>=y2)?y1-y2:y2-y1;

        return Math.sqrt((x*x) + (y*y));
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
