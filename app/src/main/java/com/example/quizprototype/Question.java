package com.example.quizprototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question {

    public int id;
    public String question;


    public Question(int id, String question){
        this.id=id;
        this.question=question;
    }

    public static Question getQuestion(ArrayList<Question> myQuestionList){
        Random random=new Random();
        int i = random.nextInt(myQuestionList.size() - 1) + 1;
        Question q=myQuestionList.get(i);
        return q;
    }

    public static ArrayList<Question> LoadQuestions(){
        ArrayList<Question> myQuestions=new ArrayList<Question>();
        myQuestions.add(new Question(1,""));
        myQuestions.add(new Question(2,""));
        myQuestions.add(new Question(3,""));
        myQuestions.add(new Question(4,""));
        myQuestions.add(new Question(5,""));
        myQuestions.add(new Question(6,""));
        return myQuestions;
    }
}
