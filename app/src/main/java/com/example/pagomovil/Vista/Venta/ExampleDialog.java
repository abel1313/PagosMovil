package com.example.pagomovil.Vista.Venta;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.movilventa.InterfazVenta.IExampleDialogListener;
import com.example.movilventa.R;

public class ExampleDialog extends DialogFragment
{
    private EditText txtNombre = null, txtNombre2 = null;
    private Button btnIr = null, btnirveta2 = null, btnirveta3 = null;
    private IExampleDialogListener listener;
    private  String msg;



    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogexample,null);


        btnIr = view.findViewById(R.id.btnIrAvENTA);

        btnirveta2 = view.findViewById(R.id.btnIrAVenta3);
        btnirveta3 = view.findViewById(R.id.btnIrAVenta2);


        builder.setView(view)
                .setTitle("Mensaje Nuevo");


        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String us = txtNombre.getText().toString();
                String us2 = txtNombre2.getText().toString();
                listener.applyTexts(us,us2);
                listener.onDialogPositiveClick(com.example.movilventa.Vista.ExampleDialog.this);


            }
        });

        txtNombre = view.findViewById(R.id.textView3);
        txtNombre2 = view.findViewById(R.id.textView4);



        return builder.create();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            listener = (IExampleDialogListener) context;
        }catch(ClassCastException e){
            throw  new ClassCastException(context.toString() + "must implemet ExampleDIalogListener");
        }
    }


}
