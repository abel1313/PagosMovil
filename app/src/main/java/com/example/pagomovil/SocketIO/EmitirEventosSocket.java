package com.example.pagomovil.SocketIO;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.nkzawa.emitter.Emitter;

import org.json.JSONException;
import org.json.JSONObject;

public class EmitirEventosSocket extends AppCompatActivity {

    private TextView txtCantidadVenta = null;

    public Emitter.Listener emitirMensaje = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject datos = (JSONObject) args[0];
                    String cantidad = "";

                    try
                    {
                        cantidad = datos.getString("cantidad");
                    }
                    catch (JSONException e)
                    {
                        return;
                    }


                }
            });
        }
    };
}
