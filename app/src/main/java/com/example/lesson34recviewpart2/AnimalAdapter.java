package com.example.lesson34recviewpart2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
                LayoutInflater.from(
                        parent.getContext())
                        .inflate(R.layout.item_animal,parent,false));
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

        ImageView imageView;
        TextView name, age, color;

        public AnimalViewHolder(View itemView) {
            super(itemView);
        }

        public void onBind (Animal animal){
            imageView = itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.tv_first);
            age = itemView.findViewById(R.id.tv_second);
            color = itemView.findViewById(R.id.tv_third);

            imageView.setImageResource(animal.getImage());
            name.setText(animal.getName());
            age.setText(String.valueOf(animal.getAge()));
            color.setText(animal.getColour());
            }
        }
}
