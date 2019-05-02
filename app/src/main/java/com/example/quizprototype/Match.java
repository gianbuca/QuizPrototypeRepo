package com.example.quizprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.quizprototype.Answers.getAnswers;
import static com.example.quizprototype.CorrectAnswer.getCorrectAnswer;
import static com.example.quizprototype.Question.getQuestion;

public class Match extends MainActivity {

    public Player currentPlayer;
    public Question currentQuestion;
    public Answers currentAnswers;
    public int questionNumber=0;
    private CorrectAnswer currentCorrectAnswer;
    public int points=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_layout);

        try{
            Intent intent= getIntent();
            Bundle extras=intent.getExtras();
            currentPlayer=(Player) extras.getSerializable("username");
            questionNumber=extras.getInt("question_number");
            points=extras.getInt("points");

        }
        catch(Exception e)
        {

        }
        //currentPlayer=(Player)getIntent().getSerializableExtra("username");

        TextView q_number=findViewById(R.id.current_question_numb);
        q_number.setText(String.valueOf(questionNumber));

        GameContext myGameContext =  GameContext.getInstance();

        currentQuestion=getQuestion(myGameContext.myQuestionsList);
        TextView textView_Question=findViewById(R.id.question_textView);
            textView_Question.setText(String.valueOf(currentQuestion.question));

        currentAnswers=getAnswers(currentQuestion.id, myGameContext.myAnswersList);
        Button button_1=findViewById(R.id.answer_1_button);
            button_1.setText(currentAnswers.answer_1);
        Button button_2=findViewById(R.id.answer_2_button);
            button_2.setText(currentAnswers.answer_2);
        Button button_3=findViewById(R.id.answer_3_button);
            button_3.setText(currentAnswers.answer_3);
        Button button_4=findViewById(R.id.answer_4_button);
            button_4.setText(currentAnswers.answer_4);

        currentCorrectAnswer=getCorrectAnswer(currentQuestion.id, myGameContext.myCorrectAnswersList);
    }

    public void CheckAnswer(View view){
        Button button=(Button) view;
        String userAnswer = button.getText().toString();
        if(currentCorrectAnswer.correctAnswer==userAnswer){
            this.points++;
            this.questionNumber++;
        }
        if(questionNumber==7){
            Intent myIntent=new Intent(this, Match.class);
            Bundle extras=new Bundle();
            extras.putInt("points",points);
            extras.putInt("question_number",questionNumber);
            extras.putSerializable("player",currentPlayer);
            startActivity(myIntent);

        }
        Intent myIntent=new Intent(this, Match.class);
        Bundle extras=new Bundle();
        extras.putInt("points",points);
        extras.putInt("question_number",questionNumber);
        extras.putSerializable("player",currentPlayer);
        finish();
        //super.onCreate(extras);
        startActivityForResult(myIntent,8);
    }


}
