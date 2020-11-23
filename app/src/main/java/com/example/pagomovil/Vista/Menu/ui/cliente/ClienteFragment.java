package com.example.pagomovil.Vista.Menu.ui.cliente;

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


public class ClienteFragment extends Fragment {

    private ClienteViewModel clienteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clienteViewModel =
                new ViewModelProvider(this).get(ClienteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cliente, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        clienteViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}