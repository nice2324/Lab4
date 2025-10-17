package com.example.lab4;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity    {
    Button addButton;
    Button BrowseButton;
    ImageView logo;
    ProgressBar progressBar;

    @SuppressLint("MissingInflatedId")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(thiss);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imageView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addButton = findViewById(R.id.button); //Event listener

        addButton.setOnClickListener(new View.OnClickListener() { //Event listener
            @Override
            public void onClick(View v) { //Event listener

                System.out.println("Click!!!");
                Intent addNote2Act = new Intent(getApplicationContext(), addNote2.class);
                startActivity(addNote2Act);
            }
        });
        BrowseButton = findViewById(R.id.button4);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        BrowseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show Progress Bar
                progressBar.setVisibility(View.VISIBLE);

                //Delay 2 seconds
                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    runOnUiThread(() -> {
                        progressBar.setVisibility(View.GONE);
                    });
                    // load date fore DB
                    //back to main thread
                    //go to Browse Note Activity

                    Intent BrowseNoteAct = new Intent(getApplicationContext(), BrowseNoteActivity.class);
                    startActivity(BrowseNoteAct);
                }).start();
            }


//    public static void main(String[] args) {
            //Note Note1 = new Note();
            //Note Note2 = new Note();
//        User User1 = new User();
//        User User2 = new User();

            //Note1.title = "หนังสือ";
            //Note1.content = "Text0";
            //Note1.createdDate = "12/10/2556";

//        TextNote textNote1 = new TextNote();
//        textNote1.title = "";
//        textNote1.createdDate = "";
//        /*           textNote1.textContent = "";*/
//        textNote1.setTextContent(" ");
//        textNote1.createdDate = "";
//        textNote1.getSummary();

//        User1.username = "PASATA01";
//        User1.password = "123456";
//
//        TextUser textUser1 = new TextUser() ;
//        textUser1.username = "" ;
//        textUser1.password = "" ;
//        textUser1.setTextname("");
//        textUser1.getName();
//        textUser1.getPassword();


        });
    }
}