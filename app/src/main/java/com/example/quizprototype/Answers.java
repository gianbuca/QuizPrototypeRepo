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

    public static Answers getAnswers(int i, ArrayList<Answers> myAnswerList){
        Answers answer=myAnswerList.get(i);
        return answer;
    }

    public static ArrayList<Answers> LoadAnswers(){
        ArrayList<Answers> myQuestions=new ArrayList<Answers>();
        myQuestions.add(new Answers(1,"", "","",""));
        myQuestions.add(new Answers(2,"", "","",""));
        myQuestions.add(new Answers(3,"", "","",""));
        myQuestions.add(new Answers(4,"", "","",""));
        myQuestions.add(new Answers(5,"", "","",""));
        myQuestions.add(new Answers(6,"", "","",""));
        return myQuestions;
    }
}
