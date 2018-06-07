package com.ym.coolweather.gson;

/**
 * Created by Administrator on 2018-06-07.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
