package com.example.daniel.forecastapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by daniel on 28/01/18.
 */

public interface DarkSkyService {
    @GET("forecast/9ea016f00818c5172eeee4bda7c2c691/{latlng}")
    Call<ForecastData> getDataFromForecastAPI(@Path("latlng") String latlng);
}
