package com.example.servlet;

public class Participant {
    //attribuites
    private String name;
    private String country;
    private String company;

    public Participant(String name, String country, String company) {
        this.name = name;
        this.country = country;
        this.company = company;
    }


    //setter and getter
    public String getName(){
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getComany() {
        return company;
    }

    //change size
    public void changeCompany(String company){
        this.company = company;
    }
}
