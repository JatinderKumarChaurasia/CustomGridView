package com.example.jatinderkumar.customgridview;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int image[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.iwwmi,R.drawable.js,R.drawable.nvcxr};
    String name[] ={"jsjjs","sjjs","skksk","skkk","sksks","sjsjj"};
    String Description[] ={"SJSJJSJ","SSKSKK","ksjjs","sjjjss","jsjjs","skksk"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        ArrayList<Person> people = new ArrayList<Person>();
        for(int i=0;i<6;i++)
        {
            Person p = new Person();
            p.setName(name[i]);
            p.setImage(image[i]);
            p.setDescription(Description[i]);
            people.add(p);
        }
        GridAdapter adapter = new GridAdapter(people,MainActivity.this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parent.getPositionForView(view);
                view.setBackgroundColor(Color.BLACK);
                view.animate();
                Toast.makeText(MainActivity.this,"Item Clicked   "+position,Toast.LENGTH_LONG).show();
            }
        });
        gridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                return false;
            }
        });

    }
}
