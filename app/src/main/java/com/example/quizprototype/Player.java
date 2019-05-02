package com.example.quizprototype;


import java.io.Serializable;

public class Player implements Serializable {
    public String username;

    public Player(String user_name){
        this.username=user_name;
    }
}
