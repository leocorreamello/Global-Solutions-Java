package main.java.br.com.sentinela.utils;

public class CoordenadaGeografica {
    private double latitude;
    private double longitude;

    public CoordenadaGeografica(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
}
