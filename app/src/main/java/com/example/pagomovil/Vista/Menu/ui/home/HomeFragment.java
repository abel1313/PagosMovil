package com.example.pagomovil.Vista.Menu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.pagomovil.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageSlider imageSlider=root.findViewById(R.id.carrusel);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.descarag3, "La salida"));
        slideModels.add(new SlideModel(R.drawable.descarga2, "La salida"));
        slideModels.add(new SlideModel(R.drawable.descarga, "La salida"));
        slideModels.add(new SlideModel(R.drawable.descarga4, "La salida"));



        imageSlider.setImageList (slideModels, true);

        return root;
    }
}