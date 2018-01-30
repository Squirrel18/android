package com.example.daniel.forecastapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daniel on 28/01/18.
 */

public class ForecastData {
    private double latitude;
    private double longitude;
    private String timezone;
    @SerializedName("hourly")
    private HourlyForecast hourlyForecast;

    public HourlyForecast getHourlyForecast() {
        return hourlyForecast;
    }

    public Double getLat() {
        return latitude;
    }

    public Double getLng() {
        return longitude;
    }

    public String getTimeZone() {
        return timezone;
    }
}
