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
