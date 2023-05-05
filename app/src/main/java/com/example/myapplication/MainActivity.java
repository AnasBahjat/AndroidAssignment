package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView1;
    private TextView txtView1;
    private TextView chooseTheBranch;
    private TextView programTxt;
    private TextView subjectText;
    private TextView gradeTxt;
    private EditText nameEditTxt;
    private EditText IDeditTxt;
    private Button addBtn;
    private Spinner branchSpn ;
    private Spinner subjectSpn;
    private Spinner gradeSpn;
    private String text ;
    private String textSCI;
    private String textLET;
    private String studentName;
    private String studentID;
    private String studentGrade;
    private String courseName;
    ArrayList<Student> students=new ArrayList<>();
    String []branches={"Scientific ","Literary "};
    String []letSubjects={"Math","History","Geography","English Language","Arabic Language","Technology","Religion"};
    String []sciSubjects={"Math 1","Math 2","Physics","Chemistry","Biology","Arabic Language","English Language","Religion"};
    String [] firstGrade={"Math","Arabic language","English language","Religion","First grade","Arts","Science"};
    String [] secondGrade={"Math","Arabic language","English language","Religion","Second grade","Arts","Science"};
    String [] therdGrade={"Math","Arabic language","English language","Religion","Third grade","Arts","Science"};
    String [] fourthGrade={"Math","Arabic language","English language","Religion","Fourth grade","Arts","Science"};
    String [] fifthGrade={"Math","Arabic language","English language","Religion","Fifth grade","Arts","Science","History","Geography"};
    String [] sixthGrade={"Math","Arabic language","English language","Religion","Sixth grade","Arts","Science","History","Geography"};
    String [] seventhGrade={"Math","Arabic language","English language","Religion","Seventh grade","Arts","Science","History","Geography"};
    String [] eighthGrade={"Math","Arabic language","English language","Religion","eighth grade","Arts","Science","History","Geography"};
    String [] ninthGrade={"Math","Arabic language","English language","Religion","ninth grade","Arts","Science","History","Geography"};
    String [] tenthGrade={"Math","Arabic language","English language","Religion","tenth grade","Arts","Physics","Chemistry","Biology","History","Geography"};
    String []gradesList={"1","2","3","4","5","6","7","8","9","10","11","12"};

    @SuppressLint({"MissingSuperCall", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView1=findViewById(R.id.imgView1);
        chooseTheBranch=findViewById(R.id.chooseTheBranch);
        chooseTheBranch.setTextSize(18);

        txtView1=findViewById(R.id.txtView1);
        txtView1.setTextSize(28);


       // programTxt.setTextColor();
        gradeTxt=findViewById(R.id.gradeTxt);
        gradeTxt.setTextSize(18);

        nameEditTxt=findViewById(R.id.nameEditTxt);
        IDeditTxt=findViewById(R.id.IDeditTxt);


        subjectText=findViewById(R.id.subjectText);
        subjectText.setTextSize(18);
        addBtn=findViewById(R.id.addBtn);
        branchSpn=findViewById(R.id.branchSpn);

        subjectSpn=findViewById(R.id.subjectSpn);

        gradeSpn=findViewById(R.id.gradeSpn);
        ArrayAdapter<String> gradeAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,gradesList);
        gradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gradeSpn.setAdapter(gradeAdapter);




        studentName=nameEditTxt.getText().toString();
        studentID=IDeditTxt.getText().toString();
        gradeSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String grade=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        gradeSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                studentGrade=adapterView.getItemAtPosition(i).toString();
                ArrayAdapter<String> adpt;
                if(studentGrade.equals("11") || studentGrade.equals("12")){
                    branchSpn.setVisibility(View.VISIBLE);
                    chooseTheBranch.setVisibility(View.VISIBLE);
                }
                else if(studentGrade.equals("1")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,firstGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("2")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,secondGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("3")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,therdGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("4")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,fourthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("5")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,fifthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("6")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,sixthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("7")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,seventhGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("8")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,eighthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("9")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,ninthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else if(studentGrade.equals("10")){
                    adpt=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,tenthGrade);
                    subjectSpn.setAdapter(adpt);
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        @SuppressLint("ResourceType")
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,branches);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpn.setAdapter(adapter);
        branchSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text=adapterView.getItemAtPosition(i).toString();
             // Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
                ArrayAdapter<String> adpt;
                if(text.equals(branches[0])){
                    adpt=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,sciSubjects);
                    subjectSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int j, long l) {
                            courseName=adapterView.getItemAtPosition(j).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else {
                    adpt=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,letSubjects);
                    subjectSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int k, long l) {
                            text=adapterView.getItemAtPosition(k).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                subjectSpn.setAdapter(adpt);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                studentName=nameEditTxt.getText().toString();
                studentID=IDeditTxt.getText().toString();
                if(studentName.isEmpty() || studentID.isEmpty() || !studentID.matches("[0-9]+") ){
                    Toast.makeText(MainActivity.this,"Fill in the fields with correct inputs !!",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this," A new course added ..",Toast.LENGTH_LONG).show();
                    students.add(new Student(studentName,Integer.parseInt(studentID),Integer.parseInt(studentGrade),new Course(courseName,3)));
                }
            }
        });


    }
}