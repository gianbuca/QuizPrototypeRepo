package com.example.quizprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import static com.example.quizprototype.Answers.LoadAnswers;
import static com.example.quizprototype.Answers.getAnswers;
import static com.example.quizprototype.CorrectAnswer.LoadCorrectAnswer;
import static com.example.quizprototype.CorrectAnswer.getCorrectAnswer;
import static com.example.quizprototype.Question.LoadQuestions;
import static com.example.quizprototype.Question.getQuestion;

public class Match extends AppCompatActivity {

    public Player currentPlayer;
    public Question currentQuestion;
    public Answers currentAnswers;
    private CorrectAnswer currentCorrectAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_layout);
        Intent i=new Intent(this,MainActivity.class);
        //Player currentPlayer=new Player(i.getStringExtra("username"));
        ArrayList<Question> questionList=LoadQuestions();
        ArrayList<Answers> answerList=LoadAnswers();

        currentQuestion=getQuestion(questionList);
        TextView textView_Question=findViewById(R.id.question_textView);
            textView_Question.setText(currentQuestion.question);

        currentAnswers=getAnswers(currentQuestion.id, answerList);
        Button button_1=findViewById(R.id.answer_1_button);
            button_1.setText(currentAnswers.answer_1);
        Button button_2=findViewById(R.id.answer_2_button);
            button_2.setText(currentAnswers.answer_2);
        Button button_3=findViewById(R.id.answer_3_button);
            button_3.setText(currentAnswers.answer_3);
        Button button_4=findViewById(R.id.answer_4_button);
            button_4.setText(currentAnswers.answer_4);

        ArrayList<CorrectAnswer> correctAnswerList=LoadCorrectAnswer();
        currentCorrectAnswer=getCorrectAnswer(currentQuestion.id,correctAnswerList);
    }

    public void CheckAnswer(View view){
        Button button=(Button) view;
        String userAnswer = button.getText().toString();
        if(currentCorrectAnswer.correctAnswer==userAnswer){
            //increment score
        }
    }


}
