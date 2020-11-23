package com.example.pagomovil.InterfazVenta;

import androidx.fragment.app.DialogFragment;

public interface IExampleDialogListener
{
    void  applyTexts(String us1, String us2);

    public void onDialogPositiveClick(DialogFragment dialog);
    public void onDialogNegativeClick(DialogFragment dialog);



}
