package com.hotel;

public interface Hotel {
    void chickenBiryani();
    void masalaDosa();
}

class TajHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}

class RoadSideHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");
    }
}