package com.example.quizprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public String username;
    public List<Player> players;
    public boolean userAlreadyExists=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View view){
        EditText username_editText=findViewById(R.id.username_editText);
        username=username_editText.getText().toString();
        for(Player p : players){
            if(p.username==username)
            {
                userAlreadyExists=true;
            }
        }
        if(!userAlreadyExists){
            Player newPlayer=new Player(username);
            userAlreadyExists=false;
            Intent intent=new Intent(this,Match.class);
            intent.putExtra("username", username);
            startActivity(intent);
        }

    }
}
