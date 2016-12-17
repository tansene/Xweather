package com.terrance.xweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by terrance on 2016/12/16.
 */

public class Now {
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
