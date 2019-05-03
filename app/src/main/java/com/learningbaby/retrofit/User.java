package com.learningbaby.retrofit;


import java.util.HashMap;
import java.util.Map;

public class User {

    private String name;
    private String hobey;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobey() {
        return hobey;
    }

    public void setHobey(String hobey) {
        this.hobey = hobey;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
