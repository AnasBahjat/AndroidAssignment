package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView txtView1;
    private TextView chooseTheBranch;
    private TextView gradeTxt;
    private EditText nameEditTxt;
    private EditText password;
    private Button addBtn;
    private Spinner branchSpn ;
    private Spinner gradeSpn;

    String []branches={"Scientific ","Literary "};
    String []gradesList={"1","2","3","4","5","6","7","8","9","10","11","12"};
    private static String grade;
    private static String branch;
    @SuppressLint({"MissingSuperCall", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chooseTheBranch=findViewById(R.id.chooseTheBranch);
        chooseTheBranch.setTextSize(18);

        txtView1=findViewById(R.id.txtView1);
        txtView1.setTextSize(28);


        gradeTxt=findViewById(R.id.gradeTxt);
        gradeTxt.setTextSize(18);

        nameEditTxt=findViewById(R.id.idEditTxt);
        password=findViewById(R.id.passwordEditTxt);


        addBtn=findViewById(R.id.addBtn);
        branchSpn=findViewById(R.id.branchSpn);


        gradeSpn=findViewById(R.id.gradeSpn);
        ArrayAdapter<String> gradeAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,gradesList);
        gradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gradeSpn.setAdapter(gradeAdapter);



        @SuppressLint("ResourceType")
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,branches);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpn.setAdapter(adapter);

        gradeSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.grade = parent.getItemAtPosition(position).toString();
                if(grade.equals("1") || grade.equals("2") || grade.equals("3") || grade.equals("4") || grade.equals("5") || grade.equals("6") || grade.equals("7") || grade.equals("8") || grade.equals("9") || grade.equals("10")){
                    branchSpn.setVisibility(View.INVISIBLE);
                    chooseTheBranch.setVisibility(View.INVISIBLE);
                }

                if(grade.equals("11") || grade.equals("12")){
                    branchSpn.setVisibility(View.VISIBLE);
                    chooseTheBranch.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        branchSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivity.branch=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameEditTxt.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please fill in the fields above ... ",Toast.LENGTH_LONG).show();
                }
                else {
                    String str=MainActivity.grade;
                    String br=MainActivity.branch;
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                    if(str.equals("1")){
                        intent.putExtra("grade","1");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("2")){
                        intent.putExtra("grade","2");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("3")){
                        intent.putExtra("grade","3");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if( str.equals("4")){
                        intent.putExtra("grade","4");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("5")){
                        intent.putExtra("grade","5");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("6")){
                        intent.putExtra("grade","6");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);

                    }
                    else if(str.equals("7")){
                        intent.putExtra("grade","7");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("8")){
                        intent.putExtra("grade","8");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("9")){
                        intent.putExtra("grade","9");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if( str.equals("10")){
                        intent.putExtra("grade","10");
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                    else if(str.equals("11")){
                        if(branch.equals("Scientific")){
                            intent.putExtra("grade","11SCI");
                        }
                        else{
                            intent.putExtra("grade","11LET");
                        }
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());

                        startActivity(intent);
                    }
                    else if(str.equals("12")){
                        if(branch.equals("Scientific")){
                            intent.putExtra("grade","12SCI");
                        }
                        else{
                            intent.putExtra("grade","12LET");
                        }
                        intent.putExtra("StudentID",nameEditTxt.getText().toString());
                        startActivity(intent);
                    }
                }
            }
        });
    }
}