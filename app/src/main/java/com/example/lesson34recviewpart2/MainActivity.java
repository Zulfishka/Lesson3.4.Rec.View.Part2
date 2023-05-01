package com.example.lesson34recviewpart2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.widget.Toast;

import com.example.lesson34recviewpart2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalClick {

    AnimalAdapter adapter;

    ArrayList<Animal> arrayList = new ArrayList<>();

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillList();
        initAdapter();

    }


    private void fillList () {

        arrayList.add (new Animal("Dog", 3, "braun", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJOWT1at69fd7l9JCJwIahRlA-5KPGttME1A&usqp=CAU"));
        arrayList.add (new Animal("Cat", 1, "grey", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxhWWZdaKHmh0OrzD4RLDlVQGbjetkk2LqQw&usqp=CAU"));
        arrayList.add (new Animal("Hamster", 1, "white","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrrizKGVpBHbam-CB4fhexhtm7Iq938CgRQswQGsIs&s"));
        arrayList.add (new Animal("Parrot", 2, "colorful", "https://galerey-room.ru/images/114636_1390898796.jpeg"));
        arrayList.add (new Animal("Rabbit", 2, "black", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQm7KqV4UA1zulmN3kZxcxGVd65eoYWkVU8LDQu7eM&s"));

    }
    private void initAdapter() {
        adapter = new AnimalAdapter(arrayList, this);
        binding.recyclerView.setAdapter(adapter);
    }


    @Override
    public void animalClicked(Animal animal){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("animal",animal);
        startActivity(intent);
    }
}
