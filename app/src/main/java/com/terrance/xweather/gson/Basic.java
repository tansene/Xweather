package com.terrance.xweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by terrance on 2016/12/14.
 */

public class Basic {
    @SerializedName("city")//让JSON字段和JAVA间建立映射关系-=
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
