package com.example.gsonserialization;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int age;

    public FamilyMember(String mRole, int age) {
        this.mRole = mRole;
        this.age = age;
    }
}
