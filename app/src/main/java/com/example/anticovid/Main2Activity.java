package com.example.anticovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {


    private ImageView imageView1,imageView2,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView1 = findViewById(R.id.imageView1Id);
        imageView2 = findViewById(R.id.imageView2Id);
        imageView3 = findViewById(R.id.imageView3Id);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.imageView1Id){
            Intent loginIntent = new Intent(Main2Activity.this, covid.class);
            startActivity(loginIntent);

        }else if(v.getId() == R.id.imageView2Id){
            Intent loginIntent = new Intent(Main2Activity.this, conq.class);
            startActivity(loginIntent);

        }else if(v.getId() == R.id.imageView3Id){
            Intent loginIntent = new Intent(Main2Activity.this, prevent.class);
            startActivity(loginIntent);

        }

    }
}
