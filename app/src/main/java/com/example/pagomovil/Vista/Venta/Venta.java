package com.example.pagomovil.Vista.Venta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.movilventa.InterfazVenta.IExampleDialogListener;
import com.example.movilventa.Modelo.MySingleton;
import com.example.movilventa.R;
import com.example.movilventa.SocketIO.Constants;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class Venta extends AppCompatActivity implements IExampleDialogListener {


    private EditText edtCantidadVenta = null;
    private CardView cardViewVenta = null;
    private Button btnAgregarVenta = null, btnRealizarPagoVenta = null;
    private TextView txtxCardVenta = null, txtProductoCardVenta = null;

    /*
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://192.168.1.68:3000/");
        } catch (URISyntaxException e) {}
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

        edtCantidadVenta = findViewById(R.id.edtCantidadVenta);
        cardViewVenta = findViewById(R.id.cardViewVenta);

        txtxCardVenta = (TextView) findViewById(R.id.txtCantidadCardVenta);
        txtProductoCardVenta = findViewById(R.id.txtProductoCardVenta);

        btnAgregarVenta = findViewById(R.id.btnAgregarVenta);
        btnRealizarPagoVenta = findViewById(R.id.btnRealizarPagoVenta);


mostrarExistenciasProducto();



// d.DisponibilidadProductoVenta(getApplicationContext());
        // txtxCardVenta.setText(d.DisponibilidadProductoVenta(getApplicationContext()).toString() +"");
        //txtProductoCardVenta.setText(p.getNombreProducto());





        // Toast.makeText(getApplicationContext(), "Veamos var  "+ ver, Toast.LENGTH_LONG).show();

        btnAgregarVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(getApplication());


agregarProductoDetalle(edtCantidadVenta.getText().toString().trim());

// Toast.makeText(getApplicationContext(), "Veamos var "+
                //     MySingleton.getInstance(getApplicationContext())., Toast.LENGTH_LONG).show();

            }
        });

        btnRealizarPagoVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog();


            }
        });


    }

    public void openDialog()
    {

        com.example.movilventa.Vista.ExampleDialog exampleDialog = new com.example.movilventa.Vista.ExampleDialog();

        exampleDialog.show(getSupportFragmentManager(),"Example Dialog");


    }

    @Override
    public void applyTexts(String us1, String us2) {
        edtCantidadVenta.setText(us1);
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        Intent i = new Intent(getApplicationContext(), com.example.movilventa.Vista.Ejemplox.class);
        i.putExtra("name","Valorssto");
        startActivity(i);
        dialog.dismiss();

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog){}

    /*
    private void attemptSend()
    {
        String message = edtCantidadVenta.getText().toString().trim();
        if (TextUtils.isEmpty(message)) {
            return;
        }

        edtCantidadVenta.setText("");
        mSocket.emit("new message", message);
    }

    private Emitter.Listener onNewMessage = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {


            Toast.makeText(getApplicationContext(), "Socket id :" +mSocket.id(),Toast.LENGTH_SHORT).show();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject data = (JSONObject) args[0];
                    String username;
                    String message;
                    try {
                        username = data.getString("username");
                        message = data.getString("message");

                    } catch (JSONException e) {
                        return;
                    }

                    // add the message to view

                    txtxCardVenta.setText(username);
                }
            });
        }
    };
    @Override
    public void onDestroy() {
        super.onDestroy();

        mSocket.disconnect();
        mSocket.off("new message", onNewMessage);
    }

     */

    public void mostrarExistenciasProducto ()
    {
           JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                        (Request.Method.GET, Constants.CHAT_SERVER_URL+"venta", null, new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    if(response.getInt("id_Producto") != 0 )
                                    {
                                        txtxCardVenta.setText("Disponibles "+response.getString("existencias_Producto"));
                                        txtProductoCardVenta.setText(response.getString("nombre_Producto") );
                                    }else
                                    {

                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                // TODO: Handle error

                            }
                        });

                // Access the RequestQueue through your singleton class.
                MySingleton.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectRequest);


    }


    public void xD()
    {

    }
    public void agregarProductoDetalle (String cantidad)
    {

        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.calandoMensaje), "Deberas cambiar", Snackbar.LENGTH_SHORT );

     if(!cantidad.equals("") ) {

         if(Integer.parseInt(cantidad) > 0)
         {
         Map<String, String> parametros = new HashMap<>();
         parametros.put("cantidad", cantidad);


         JSONObject jsonParametros = new JSONObject(parametros);


         JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                 (Request.Method.POST, Constants.CHAT_SERVER_URL + "venta", jsonParametros, new Response.Listener<JSONObject>() {

                     @Override
                     public void onResponse(JSONObject response) {

                         txtxCardVenta.setText("Disponibles " + response.toString());


                     }
                 }, new Response.ErrorListener() {

                     @Override
                     public void onErrorResponse(VolleyError error) {
                         // TODO: Handle error

                     }
                 });

         // Access the RequestQueue through your singleton class.
         MySingleton.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectRequest);
     }
     else
         {
             Toast.makeText(getApplicationContext(),"La cantidad debe ser mayo a 0 ", Toast.LENGTH_SHORT).show();
         }

     }else
     {
         // Toast.makeText(getApplicationContext(),"Debe llenar el campo de cantidad ", Toast.LENGTH_SHORT).show();

        mySnackbar.show();
     }
    }



}