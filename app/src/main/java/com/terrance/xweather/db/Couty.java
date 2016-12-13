package com.terrance.xweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by terrance on 2016/12/13.
 */

public class Couty extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private int weatherId;//对应的天气

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }
}
