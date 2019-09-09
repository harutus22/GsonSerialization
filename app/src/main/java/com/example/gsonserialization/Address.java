package com.example.gsonserialization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("country")
    @Expose(serialize = false)
    private String mCountry;
    @SerializedName("city")
    @Expose(serialize = false)
    private String mCity;

    public Address(String mCountry, String mCity) {
        this.mCountry = mCountry;
        this.mCity = mCity;
    }
}
