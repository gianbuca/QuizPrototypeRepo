package com.example.quizprototype;

import java.util.ArrayList;
import java.util.Random;

public class Answers {
    public int id;
    public String answer_1;
    public String answer_2;
    public String answer_3;
    public String answer_4;

    public Answers(int i, String a1, String a2, String a3, String a4)
    {
        this.id=i;
        this.answer_1=a1;
        this.answer_2=a2;
        this.answer_3=a3;
        this.answer_4=a4;
    }

    public Answers(){}

    public static Answers getAnswers(int i, ArrayList<Answers> myAnswerList){
        Answers myRandomAnswers=new Answers();
        for(Answers a: myAnswerList){
            if(a.id==i)
                myRandomAnswers=a;
        }
        return myRandomAnswers;
    }

    public static ArrayList<Answers> LoadAnswers(){
        ArrayList<Answers> myQuestions=new ArrayList<Answers>();
        myQuestions.add(new Answers(1,"C-18", "Edy","Flip","Ken"));
        myQuestions.add(new Answers(2,"mela", "fagiolo magico","strudel","arachide"));
        myQuestions.add(new Answers(3,"Bassano", "Rovigo","Verona","Belluno"));
        myQuestions.add(new Answers(4,"Teseo", "Argo","Minosse","Luigi"));
        myQuestions.add(new Answers(5,"Bellatrix", "Morgana","Amelia","Ursula"));
        myQuestions.add(new Answers(6,"Autolico", "Telemaco","Claudio","Diomede"));
        return myQuestions;
    }
}
