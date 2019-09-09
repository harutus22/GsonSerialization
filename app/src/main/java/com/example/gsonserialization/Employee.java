package com.example.gsonserialization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("firstName")
    @Expose(deserialize = false)
    private String mFirstName;
    @SerializedName("age")
    @Expose(serialize = false)
    private int mAge;
    @SerializedName("email")
    @Expose(deserialize = false)
    private String mEmail;
    @SerializedName("address")
    @Expose(serialize = false)
    private Address mAddress;
    @SerializedName("family")
    @Expose(deserialize = false)
    private List<FamilyMember> mFamily;

    private transient String mPassword;

    public Employee(String firstName, int age, String email, Address address, List<FamilyMember> family, String password) {
        mFirstName = firstName;
        mAge = age;
        mEmail = email;
        mAddress = address;
        mFamily = family;
        mPassword = password;
    }
}
