package com.example.quizprototype;

import java.util.ArrayList;

import static com.example.quizprototype.Answers.LoadAnswers;
import static com.example.quizprototype.CorrectAnswer.LoadCorrectAnswers;
import static com.example.quizprototype.Question.LoadQuestions;

public class GameContext {

    private static GameContext single_instance=null;

    public ArrayList<Question> myQuestionsList;
    public ArrayList<Answers> myAnswersList;
    public ArrayList<CorrectAnswer> myCorrectAnswersList;
    

    public static GameContext getInstance(){

        if(single_instance==null)
            single_instance=new GameContext();
        return single_instance;
    }

    public GameContext(){
        myQuestionsList=LoadQuestions();
        myAnswersList=LoadAnswers();
        myCorrectAnswersList=LoadCorrectAnswers();
    }

}
