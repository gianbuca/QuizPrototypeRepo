package com.example.quizprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Player> players=new ArrayList<>();
    public boolean userAlreadyExists=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View view){
        EditText username_editText=findViewById(R.id.username_editText);
        String username=username_editText.getText().toString();
        try {
            for(Player p : players){
                if(p.username==username)
                {
                    userAlreadyExists=true;
                }
            }
            if(!userAlreadyExists){
                int playerListSize=players.size();
                players.add(playerListSize,new Player(username));
                Player currentPlayer= players.get(playerListSize);
                Intent intent=new Intent(this,Match.class);
                intent.putExtra("username", currentPlayer);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "username already exist", Toast.LENGTH_SHORT).show();
                username_editText.setText("");
                userAlreadyExists=false;
            }
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
