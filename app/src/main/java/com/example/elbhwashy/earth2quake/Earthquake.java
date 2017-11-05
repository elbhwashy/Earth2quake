package com.example.elbhwashy.earth2quake;

public class Earthquake {

    private double magnitude;
    private String locationPrimary;
    private String locationOffset;
    private String date;
    private String time;
    private String url;

    public Earthquake(double mmagnitude, String mlocationOffset,String mlocationPrimary, String mdate, String mtime,String murl ) {
        magnitude = mmagnitude;
        locationOffset = mlocationOffset;
        locationPrimary = mlocationPrimary;
        time = mtime;
        date = mdate;
        url = murl;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocationOffset() {
        return locationOffset;
    }
    public String getLocationPrimary() {
        return locationPrimary;
    }

    public String getTime() {
        return time;
    }

    public String getDate(){
        return date;
    }
    public String getUrl(){
        return url;
    }
}