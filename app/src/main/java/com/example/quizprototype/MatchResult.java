package com.example.quizprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MatchResult extends AppCompatActivity {

    public String finalString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_result_layout);
        TextView finalMex=findViewById(R.id.final_message_TextView);
        Bundle Extra=getIntent().getExtras();
        Player player=(Player) Extra.getSerializable("username");
        int questionNumber=Extra.getInt("question_number");
        int points=Extra.getInt("points");
        if(points>=4){
            String finalString="You win ";

        }
        else{
            String finalString="You loose ";
        }
        finalMex.setText(String.valueOf(player.username)+" "+finalString+ "\n" +", your score is:"+points);
    }
}
