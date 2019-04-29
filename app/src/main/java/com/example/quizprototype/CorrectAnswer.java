package com.example.quizprototype;

import java.util.ArrayList;

public class CorrectAnswer {
    public int id;
    public String correctAnswer;

    public CorrectAnswer(int id,String correctA){
        this.id=id;
        this.correctAnswer=correctA;
    }

    public static CorrectAnswer getCorrectAnswer(int i, ArrayList<CorrectAnswer> myCorrectAnswerList){
        CorrectAnswer ca=myCorrectAnswerList.get(i);
        return ca;
    }

    public static ArrayList<CorrectAnswer> LoadCorrectAnswer(){
        ArrayList<CorrectAnswer> myCorrectAnswers=new ArrayList<CorrectAnswer>();
        myCorrectAnswers.add(new CorrectAnswer(1,""));
        myCorrectAnswers.add(new CorrectAnswer(2,""));
        myCorrectAnswers.add(new CorrectAnswer(3,""));
        myCorrectAnswers.add(new CorrectAnswer(4,""));
        myCorrectAnswers.add(new CorrectAnswer(5,""));
        myCorrectAnswers.add(new CorrectAnswer(6,""));
        return myCorrectAnswers;
    }
}
