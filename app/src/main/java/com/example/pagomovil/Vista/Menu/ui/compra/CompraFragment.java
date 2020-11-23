package com.example.pagomovil.Vista.Menu.ui.compra;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.pagomovil.R;


public class CompraFragment extends Fragment {

    private CompraViewModel compraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        compraViewModel =
                new ViewModelProvider(this).get(CompraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_compra, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        compraViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}