package com.example.lesson34recviewpart2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalClick {

    RecyclerView recyclerView;
    AnimalAdapter adapter;
   ArrayList<Animal> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fillList();
        initAdapter();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void fillList () {

        arrayList.add (new Animal("Dog", 3, "braun", R.drawable.img));
        arrayList.add (new Animal("Cat", 1, "grey", R.drawable.img_1));
        arrayList.add (new Animal("Hamster", 1, "white", R.drawable.img_2));
        arrayList.add (new Animal("Parrot", 2, "colorful", R.drawable.img_3));
        arrayList.add (new Animal("Rabbit", 2, "black", R.drawable.img_4));

    }
    private void initAdapter() {
        adapter = new AnimalAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void animalClicked(Animal animal){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("animal",animal);
        startActivity(intent);
    }
}
