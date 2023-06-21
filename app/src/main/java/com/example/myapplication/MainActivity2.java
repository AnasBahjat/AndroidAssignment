package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Button addCourse;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        String data=getIntent().getStringExtra("grade");
        String studentID=getIntent().getStringExtra("StudentID");
        addCourse=findViewById(R.id.addCourse);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        editor=sharedPreferences.edit();
        MyAdapter myAdapter;

        // BASED on data passed from first activity , the pictures to be put in the recycler view will be decided
        ImageView images[];
        String names[];
        int imgID[];
        if(data.equals("1")){
            //images =new ImageView[5];
            imgID=new int[5];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("2")){
           // images =new ImageView[5];
            imgID=new int[5];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("3")){
          //  images =new ImageView[5];
            imgID=new int[5];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("4")){
           // images =new ImageView[5];
            imgID=new int[5];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("5")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("6")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("7")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("8")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";
            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("9")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("10")){
          //  images =new ImageView[8];
            imgID=new int[8];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;
            imgID[6]=R.drawable.physics;
            imgID[7]=R.drawable.chemistry;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";
            names[6]="Physics course";
            names[7]="Chemistry course";

            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("11LET")){
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;


            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }
        else if(data.equals("11SCI")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.physics;
            imgID[5]=R.drawable.chemistry;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="physics course";
            names[5]="chemistry course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else if(data.equals("12LET")){
            //images =new ImageView[6];
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.scince;
            imgID[5]=R.drawable.history;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Science course";
            names[5]="History course";

            myAdapter=new MyAdapter(imgID,names);
        }

        else {
            imgID=new int[6];
            names=new String[imgID.length];

            imgID[0]=R.drawable.religion;
            imgID[1]=R.drawable.math;
            imgID[2]=R.drawable.english;
            imgID[3]=R.drawable.arabic;
            imgID[4]=R.drawable.physics;
            imgID[5]=R.drawable.chemistry;

            names[0]="Religion course";
            names[1]="Math course";
            names[2]="English course";
            names[3]="Arabic course";
            names[4]="Physics course";
            names[5]="Chemistry course";
            myAdapter=new MyAdapter(imgID,names);
        }
        recyclerView.setAdapter(myAdapter);

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> list=myAdapter.getCheckedCourses();
                if(!list.isEmpty()){
                    Gson gson = new Gson();
                    String json = gson.toJson(list);
                    editor.putString("Student ID",studentID);
                    editor.putString("Courses",json);
                    editor.commit();
                    Toast.makeText(MainActivity2.this, "Courses added .. going back to the main screen", Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    Toast.makeText(MainActivity2.this,"Please choose courses to add .. ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
