package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    public static String s = "O";
    public int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
    public static boolean b = true;
    boolean cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
            (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
            (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
    boolean cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
            (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
            (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
    boolean cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        textView2.setText(s+" Turn");
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[0][0] == 0){
                    button6.setText(s);
                    s = "X";
                    a[0][0] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[0][0] == 0){
                    button6.setText(s);
                    s = "O";
                    a[0][0] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner! ");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");
                }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[0][1] == 0){
                    button7.setText(s);
                    s = "X";
                    textView2.setText(s+" Turn");
                    a[0][1] = 1;
                }
                if(s.equals("X") && a[0][1] == 0){
                    button7.setText(s);
                    s = "O";
                    textView2.setText(s+" Turn");
                    a[0][1] = 2;
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b) {
                    textView2.setText("It's a Draw!");
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[0][2] == 0){
                    button8.setText(s);
                    s = "X";
                    a[0][2] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[0][2] == 0){
                    button8.setText(s);
                    s = "O";
                    a[0][2] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[1][0] == 0){
                    button9.setText(s);
                    s = "X";
                    a[1][0] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[1][0] == 0){
                    button9.setText(s);
                    s = "O";
                    a[1][0] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[1][1] == 0){
                    button10.setText(s);
                    s = "X";
                    a[1][1] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[1][1] == 0){
                    button10.setText(s);
                    s = "O";
                    a[1][1] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[1][2] == 0){
                    button11.setText(s);
                    s = "X";
                    a[1][2] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[1][2] == 0){
                    button11.setText(s);
                    s = "O";
                    a[1][2] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[2][0] == 0){
                    button12.setText(s);
                    s = "X";
                    a[2][0] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[2][0] == 0){
                    button12.setText(s);
                    s = "O";
                    a[2][0] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[2][1] == 0){
                    button13.setText(s);
                    s = "X";
                    a[2][1] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[2][1] == 0){
                    button13.setText(s);
                    s = "O";
                    a[2][1] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.equals("O") && a[2][2] == 0){
                    button14.setText(s);
                    s = "X";
                    a[2][2] = 1;
                    textView2.setText(s+" Turn");
                }
                if(s.equals("X") && a[2][2] == 0){
                    button14.setText(s);
                    s = "O";
                    a[2][2] = 2;
                    textView2.setText(s+" Turn");
                }
                cond1 = (a[0][0]==1 && a[1][0]==1 && a[2][0]==1) || (a[0][1]==1 && a[1][1]==1 && a[2][1]==1) || (a[0][2]==1 && a[1][2]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[0][1]==1 && a[0][2]==1) || (a[1][0]==1 && a[1][1]==1 && a[1][2]==1) || (a[2][0]==1 && a[2][1]==1 && a[2][2]==1) ||
                        (a[0][0]==1 && a[1][1]==1 && a[2][2]==1) || (a[0][2]==1 && a[1][1]==1 && a[2][0]==1);
                cond2 = (a[0][0]==2 && a[1][0]==2 && a[2][0]==2) || (a[0][1]==2 && a[1][1]==2 && a[2][1]==2) || (a[0][2]==2 && a[1][2]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[0][1]==2 && a[0][2]==2) || (a[1][0]==2 && a[1][1]==2 && a[1][2]==2) || (a[2][0]==2 && a[2][1]==2 && a[2][2]==2) ||
                        (a[0][0]==2 && a[1][1]==2 && a[2][2]==2) || (a[0][2]==2 && a[1][1]==2 && a[2][0]==2);
                cond3 = a[0][0]!=0 && a[0][1]!=0 && a[0][2]!=0 && a[1][0]!=0 && a[1][1]!=0 && a[1][2]!=0 && a[2][0]!=0 && a[2][1]!=0 && a[2][2]!=0;
                if(cond1) {
                    b = false;
                    textView2.setText("O Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond2) {
                    b = false;
                    textView2.setText("X Winner!");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(a[i][j] == 0)
                                a[i][j] = 1;
                        }
                    }
                }
                if(cond3 && b)
                    textView2.setText("It's a Draw!");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        a[i][j] = 0;
                    }
                }
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
                button13.setText("");
                button14.setText("");
                s = "O";
                b = true;
                textView2.setText(s+" Turn");
            }
        });
    }
}