package com.example.quizprototype;

import java.util.ArrayList;

public class CorrectAnswer {
    public int id;
    public String correctAnswer;

    public CorrectAnswer(int id,String correctA){
        this.id=id;
        this.correctAnswer=correctA;
    }

    public CorrectAnswer(){}

    public static CorrectAnswer getCorrectAnswer(int i, ArrayList<CorrectAnswer> myCorrectAnswerList){
        CorrectAnswer myCorrectAnswer=new CorrectAnswer();
        for(CorrectAnswer ca:myCorrectAnswerList){
            if(ca.id==i)
                myCorrectAnswer=ca;
        }
        return myCorrectAnswer;
    }

    public static ArrayList<CorrectAnswer> LoadCorrectAnswers(){
        ArrayList<CorrectAnswer> myCorrectAnswers=new ArrayList<CorrectAnswer>();
        myCorrectAnswers.add(new CorrectAnswer(1,"Edy"));
        myCorrectAnswers.add(new CorrectAnswer(2,"arachide"));
        myCorrectAnswers.add(new CorrectAnswer(3,"Bassano"));
        myCorrectAnswers.add(new CorrectAnswer(4,"Teseo"));
        myCorrectAnswers.add(new CorrectAnswer(5,"Amelia"));
        myCorrectAnswers.add(new CorrectAnswer(6,"Telemaco"));
        return myCorrectAnswers;
    }
}
