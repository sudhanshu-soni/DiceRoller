package com.sudhanshusoni;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private ImageView imageView1,imageView2;
    private Button rollButton;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView);
        rollButton = findViewById(R.id.button);

        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                rollOurDice(imageView1);
                rollOurDice(imageView2);
            }
        });
    }
    private void rollOurDice(ImageView imgView){
        int myRanNumber = myRandomNumber.nextInt(6)+1;

        switch(myRanNumber){
            case 1: imgView.setImageResource(R.drawable.dice1);
            break;
            case 2: imgView.setImageResource(R.drawable.dice2);
                break;
            case 3: imgView.setImageResource(R.drawable.dice3);
                break;
            case 4: imgView.setImageResource(R.drawable.dice4);
                break;
            case 5: imgView.setImageResource(R.drawable.dice5);
                break;
            case 6: imgView.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
