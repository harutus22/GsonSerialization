package com.example.gsonserialization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Address address = new Address("France", "Lyon");
        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(new FamilyMember("Wife", 20));
        familyMembers.add(new FamilyMember("Bother", 25));
        familyMembers.add(new FamilyMember("Son", 1));
        Employee employee = new Employee("John", 22, "John@gmail.com",
                address, familyMembers, "KGggtgtf");

        String json = gson.toJson(employee);

        String json2 = "{\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Lyon\",\n" +
                "    \"country\": \"France\"\n" +
                "  },\n" +
                "  \"age\": 22,\n" +
                "  \"email\": \"John@gmail.com\",\n" +
                "  \"family\": [\n" +
                "    {\n" +
                "      \"age\": 20,\n" +
                "      \"role\": \"Wife\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 25,\n" +
                "      \"role\": \"Bother\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 1,\n" +
                "      \"role\": \"Son\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"firstName\": \"John\"\n" +
                "}";
        Employee employee2 = gson.fromJson(json2, Employee.class);

//        String json2 = "[\n" +
//                "    {\n" +
//                "      \"age\": 20,\n" +
//                "      \"role\": \"Wife\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"age\": 25,\n" +
//                "      \"role\": \"Bother\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"age\": 1,\n" +
//                "      \"role\": \"Son\"\n" +
//                "    }\n" +
//                "  ]";
//
//        Type familyType = new TypeToken<List<FamilyMember>>(){}.getType();
//        ArrayList<FamilyMember> familyMembers1 = gson.fromJson(json2, familyType);

    }
}
