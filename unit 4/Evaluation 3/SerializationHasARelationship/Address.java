package com.evaluation3.SerializationHasARelationship;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String city;
    private String pincode;

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
