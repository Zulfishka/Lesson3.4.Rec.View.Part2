package com.example.lesson34recviewpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lesson34recviewpart2.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Animal animal = (Animal) getIntent().getSerializableExtra("animal");

        NewFragment fragment = new NewFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("animal", animal);
        fragment.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view, fragment)
                .commit();
    }
}