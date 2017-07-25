package com.coolweather.android.gson;

/**
 * Created by huang on 2017/7/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
