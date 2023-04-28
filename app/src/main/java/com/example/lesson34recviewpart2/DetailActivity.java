package com.example.lesson34recviewpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView textOne, textTwo, textThird;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initUI();
        getObject();
    }

    private void initUI() {
        textOne= findViewById(R.id.textd);
        textTwo= findViewById(R.id.tv_secondd);
        textThird= findViewById(R.id.tv_thirdd);
        imageView=findViewById(R.id.imaged);
    }

    private void getObject() {
        Animal animal = (Animal) getIntent().getSerializableExtra("animal");
        if (animal != null) {
            textOne.setText(animal.getName());
            textTwo.setText(animal.getAge());
            textThird.setText(animal.getColour());
            imageView.setImageResource(animal.getImage());
        }
    }
}