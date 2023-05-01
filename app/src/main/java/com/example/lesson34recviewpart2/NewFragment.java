package com.example.lesson34recviewpart2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson34recviewpart2.databinding.FragmentNewBinding;

public class NewFragment extends Fragment {

    FragmentNewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNewBinding.inflate((getLayoutInflater()));
        return binding.getRoot();
    }

    @Override
    public  void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() !=null) {
            Animal animal = (Animal) getArguments().getSerializable("animal");
        }
    }
}