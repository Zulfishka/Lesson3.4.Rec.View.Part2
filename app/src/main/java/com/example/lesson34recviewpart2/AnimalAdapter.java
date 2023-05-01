package com.example.lesson34recviewpart2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lesson34recviewpart2.databinding.ItemAnimalBinding;

import java.util.ArrayList;
import java.util.function.LongToIntFunction;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    ArrayList <Animal> animalArrayList;
    AnimalClick animalClick;

    public AnimalAdapter (ArrayList <Animal> arrayList, AnimalClick animalClick) {
        this.animalArrayList = arrayList;
        this.animalClick = animalClick;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(
                ItemAnimalBinding.inflate(
                LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.onBind(animalArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            animalClick.animalClicked(animalArrayList.get(position));

        });

    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder {

       ItemAnimalBinding binding;

        public AnimalViewHolder(@NonNull ItemAnimalBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind (Animal animal){
            Glide.with(binding.imageView).load(animal.getImage()).into(binding.imageView);
            binding.tvFirst.setText(animal.getName());
            binding.tvSecond.setText(animal.getAge());
            binding.tvThird.setText(animal.getColour());
        }
    }
}