package com.example.daniel.forecastapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daniel on 29/01/18.
 */

public class HourlyForecast {

    private String summary;

    @SerializedName("icon")
    private String iconString;

    @SerializedName("data")
    private List<HourConditions> hourlyConditionsList;


    public String getSummary() {
        return summary;
    }

    public String getIconString() {
        return iconString;
    }

    public List<HourConditions> getHourlyConditionsList() {
        return hourlyConditionsList;
    }

    @Override
    public String toString() {
        return "{HourlyForecast: [Summary = " + summary + "][IconString = " + iconString +
                "][HourlyConditionsList = " + hourlyConditionsList.toString() + "]}";
    }
}
