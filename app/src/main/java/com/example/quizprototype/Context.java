package com.example.quizprototype;

import java.util.ArrayList;

import static com.example.quizprototype.Answers.LoadAnswers;
import static com.example.quizprototype.CorrectAnswer.LoadCorrectAnswers;
import static com.example.quizprototype.Question.LoadQuestions;

public class Context {
    public ArrayList<Question> myQuestionsList=LoadQuestions();
    public ArrayList<Answers> myAnswersList=LoadAnswers();
    public ArrayList<CorrectAnswer> myCorrectAnswersList=LoadCorrectAnswers();

    public Context(){

    }

    public static Context getAllLists(){
        Context myContext=new Context();
        return myContext;
    }


}
