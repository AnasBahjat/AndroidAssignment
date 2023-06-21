package com.example.myapplication;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

  //  List<ImageView> items=new ArrayList<>();
    int images[];
    String[]coursesNames;

    private static List<String> checkedCourses;
    public  MyAdapter(int []images,String []coursesNames){
        this.images=images;
        this.coursesNames=coursesNames;
        checkedCourses=new ArrayList<>();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView itemView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CardView cardView=holder.cardView;
        ImageView imageView1=(ImageView) cardView.findViewById(R.id.rvImg1);
        TextView txtView=(TextView) cardView.findViewById(R.id.txtView);
        CheckBox checkBox=(CheckBox) cardView.findViewById(R.id.chkBox);
        txtView.setText(coursesNames[position]);
        txtView.setTextColor(Color.parseColor("#FF0000"));
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBox.isChecked()){
                    checkBox.setChecked(true);
                    if(!checkIfExist(txtView.getText().toString()))
                        checkedCourses.add(txtView.getText().toString());
                }
                else {
                    checkBox.setChecked(false);
                    checkedCourses.remove(txtView.getText().toString());
                    //removeCourse(txtView.getText().toString());
                }
            }
        });
        Drawable d= ContextCompat.getDrawable(cardView.getContext(),images[position]);
        imageView1.setImageDrawable(d);


        cardView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //
            }
        });

    }

    public boolean checkIfExist(String str){
        for(String st : checkedCourses){
            if(st.equals(str))
                return true;
        }
        return false ;
    }

    public void removeCourse(String str){
        for(String st : checkedCourses){
            if(st.equals(str))
                checkedCourses.remove(st);
        }
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public List<String> getCheckedCourses(){
        return checkedCourses;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;

        public MyViewHolder(CardView cardView) {
            super(cardView);
            this.cardView= cardView;
        }
    }
}
