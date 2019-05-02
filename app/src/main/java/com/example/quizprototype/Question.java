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

    public Question(){}

    public static Question getQuestion(ArrayList<Question> myQuestionList){
        Question myRandomQuestion=new Question();
        Random random=new Random();
        int i = random.nextInt(myQuestionList.size() - 1) + 1;
        for(Question q: myQuestionList){
            if(q.id==i)
                myRandomQuestion=q;
        }

        return myRandomQuestion;
    }

    public static ArrayList<Question> LoadQuestions(){
        ArrayList<Question> myQuestions=new ArrayList<Question>();
        myQuestions.add(new Question(1,"Nome del robottino aiutante di Archimede"));
        myQuestions.add(new Question(2,"Cosa mangia Pippo per diventare Superpippo"));
        myQuestions.add(new Question(3,"Città veneta famosa per la grappa"));
        myQuestions.add(new Question(4,"Uccise il Minotauro"));
        myQuestions.add(new Question(5,"Come si chiama la strega in perenne lotta con Paperon De'Paperoni?"));
        myQuestions.add(new Question(6,"Figlio di Ulisse"));
        return myQuestions;
    }
}
