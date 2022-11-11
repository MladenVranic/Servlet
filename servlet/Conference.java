package com.example.servlet;

import java.util.HashSet;

public class Conference {
    //attributes
    private String name;
    private HashSet<Participant> participants = new HashSet<Participant>();

    public Conference(String name){
        this.name = name;
    }

    //return building name
    public String getName(){
        return name;
    }

    //add new room to building
    public void addParticipant(String name, String country, String company){
        Participant r = new Participant(name, country, company);
        participants.add(r);

    }

    //method for searching room Object
    public Participant searchParticipant(String name){
        for(Participant r: participants){
            if(r == null){
                return null;
            }else if(name.equals(r.getName())){
                return r;
            }
        }
        return null;
    }

    //return set of all room objects
    public HashSet<Participant> getParticipants(){
        return participants;
    }
}
